from flask import Flask, request, render_template, redirect, url_for
import joblib
import smtplib
from email.mime.text import MIMEText
from email.mime.multipart import MIMEMultipart

app = Flask(__name__)

# Load the trained model
data = joblib.load('customer_churn_model.pkl')
model = data['model']  # Ensure the correct key is used

# Email configuration
SENDER_EMAIL = "alexpviju26@gmail.com"
SENDER_PASSWORD = "gjqjxgwaicjofhxt"  # Replace with your app-specific password

def send_email(receiver_email, prediction):
    subject = "New Offers for You!"
    if prediction == 1:
        message = """
        Dear Customer,

        We noticed that you might be considering leaving our service. We value your business and would love to offer you exclusive deals to keep you happy!

        Contact our customer care now to explore the latest offers just for you.

        Best Regards,  
        Your Telecom Provider
        """
        # Save email to file
        with open("churn_emails.txt", "a") as file:
            file.write(receiver_email + "\n")
    else:
        message = """
        Dear Customer,

        Thank you for being a valued customer! We appreciate your loyalty and are here to serve you better.
        If YOU NEED ANY HELP ON NEW OFFERS CONTACT +91XXXXXXXX33

        Best Regards,  
        Your Telecom Provider
        """
    
    # Create the email
    msg = MIMEMultipart()
    msg['From'] = SENDER_EMAIL
    msg['To'] = receiver_email
    msg['Subject'] = subject
    msg.attach(MIMEText(message, 'plain'))

    # Send the email
    try:
        server = smtplib.SMTP('smtp.gmail.com', 587)
        server.starttls()
        server.login(SENDER_EMAIL, SENDER_PASSWORD)
        server.sendmail(SENDER_EMAIL, receiver_email, msg.as_string())
        server.quit()
        print(f"Email sent to {receiver_email}")
    except Exception as e:
        print(f"Failed to send email: {e}")

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/predict', methods=['POST'])
def predict():
    # Get the data from the form
    data = request.form.to_dict()
    email = data['email']  # Get the email address

    # Convert the input values into numerical features for the model
    features = [
        float(data['AccountWeeks']),
        float(data['ContractRenewal']),
        float(data['DataPlan']),
        float(data['DataUsage']),
        float(data['CustServCalls']),
        float(data['DayMins']),
        float(data['DayCalls']),
        float(data['MonthlyCharge']),
        float(data['OverageFee']),
        float(data['RoamMins'])
    ]

    # Make a prediction
    prediction = model.predict([features])

    # Send email and save churn email if applicable
    send_email(email, prediction[0])

    if prediction[0] == 1:
        return redirect(url_for('result_churn'))  # Redirect to result1.html for churn
    else:
        return redirect(url_for('result_no_churn'))  # Redirect to result2.html for no churn

@app.route('/result1')
def result_churn():
    return render_template('result1.html')

@app.route('/result2')
def result_no_churn():
    return render_template('result2.html')

if __name__ == '__main__':
    app.run(debug=True)