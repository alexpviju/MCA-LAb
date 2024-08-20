import os
import random
import shutil

# Define the source directory and destination directories
source_dir = 'new_one/Gesture Image Pre-Processed Data'  # Directory containing subfolders with images
train_dir = 'RealTimeObjectDetection/Tensorflow/workspace/images/train'  # Directory for training images
test_dir = 'RealTimeObjectDetection/Tensorflow/workspace/images/test'    # Directory for testing images

# Create train and test directories if they don't exist
os.makedirs(train_dir, exist_ok=True)
os.makedirs(test_dir, exist_ok=True)

# Process each subfolder in the source directory
for folder_name in os.listdir(source_dir):
    folder_path = os.path.join(source_dir, folder_name)
    
    if os.path.isdir(folder_path):
        # Create corresponding train and test subdirectories
        train_subfolder = os.path.join(train_dir, folder_name)
        test_subfolder = os.path.join(test_dir, folder_name)
        os.makedirs(train_subfolder, exist_ok=True)
        os.makedirs(test_subfolder, exist_ok=True)
        
        # Collect all image files in the current subfolder
        images = [f for f in os.listdir(folder_path) if os.path.isfile(os.path.join(folder_path, f))]
        
        # Shuffle the images to randomize the selection
        random.shuffle(images)
        
        # Split the images into test and train sets
        test_images = images[:200]  # Select the first 200 images for the test set
        train_images = images[200:]  # The rest will be used for training
        
        # Move test images to the test directory
        for image in test_images:
            shutil.move(os.path.join(folder_path, image), os.path.join(test_subfolder, image))
        
        # Move train images to the train directory
        for image in train_images:
            shutil.move(os.path.join(folder_path, image), os.path.join(train_subfolder, image))
        
        print(f"Processed folder '{folder_name}':")
        print(f"  {len(test_images)} images moved to test directory.")
        print(f"  {len(train_images)} images moved to train directory.")

print("Data split completed.")
