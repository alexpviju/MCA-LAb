from flask import Flask, request, render_template, redirect, url_for
import joblib

app = Flask(__name__)

# Load the model
data = joblib.load('customer_churn_model.pkl')
model = data['model']  # Replace 'model' with the correct key if different

@app.route('/')
def home():
    return render_template('index.html')

@app.route('/predict', methods=['POST'])
def predict():
    # Get the data from the form
    data = request.form.to_dict()

    # Convert the data into a format suitable for the model
    features = [
        float(data['gender']),
        float(data['SeniorCitizen']),
        float(data['Partner']),
        float(data['Dependents']),
        float(data['tenure']),
        float(data['PhoneService']),
        float(data['MultipleLines']),
        float(data['InternetService']),
        float(data['OnlineSecurity']),
        float(data['OnlineBackup']),
        float(data['DeviceProtection']),
        float(data['TechSupport']),
        float(data['StreamingTV']),
        float(data['StreamingMovies']),
        float(data['Contract']),
        float(data['PaperlessBilling']),
        float(data['PaymentMethod']),
        float(data['MonthlyCharges']),
        float(data['TotalCharges'])
    ]

    # Make a prediction
    prediction = model.predict([features])
    if prediction[0] == 0:
    # Prepare the prediction text
     prediction_text = "No Churn"
    else:
     prediction_text="Churn"

    # Redirect to the result page with the prediction text
    return redirect(url_for('result', prediction_text=prediction_text))

@app.route('/result')
def result():
    # Get the prediction text from the query parameters
    prediction_text = request.args.get('prediction_text', 'No prediction available')

    # Render the result page with the prediction text
    return render_template('result.html', prediction_text=prediction_text)

if __name__ == '__main__':
    app.run(debug=True)