import os
import cv2
import matplotlib.pyplot as plt

# Define the directory containing the dataset
directory = 'dataset/'

# Initialize a list to hold the images and class labels
images = []
labels = []

# Loop through each class folder (0-9 and A-Z)
for label in range(10):  # For classes 0-9
    class_dir = os.path.join(directory, str(label))
    img_files = os.listdir(class_dir)
    if img_files:
        img_path = os.path.join(class_dir, img_files[0])  # Get the first image
        image = cv2.imread(img_path)
        image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)  # Convert BGR to RGB
        images.append(image)
        labels.append(str(label))

for label in range(10, 36):  # For classes A-Z
    class_dir = os.path.join(directory, chr(label + 55))  # Convert 10-35 to A-Z
    img_files = os.listdir(class_dir)
    if img_files:
        img_path = os.path.join(class_dir, img_files[0])  # Get the first image
        image = cv2.imread(img_path)
        image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)  # Convert BGR to RGB
        images.append(image)
        labels.append(chr(label + 55))

# Plotting the images in a grid
plt.figure(figsize=(15, 8))
for i, (img, label) in enumerate(zip(images, labels)):
    plt.subplot(6, 6, i + 1)  # Adjust grid size based on total classes (36)
    plt.imshow(img)
    plt.title(label)
    plt.axis('off')  # Hide the axis

plt.tight_layout()
plt.show()
