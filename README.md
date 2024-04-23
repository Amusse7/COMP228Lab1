# Student Records Java Application

This Java application is designed to manage student records through a console interface. It allows users to create, modify, and display student information. Below are the instructions on how to develop and use the application.

## Instructions

### 1. Class Structure

#### `Student` Class
- This class represents a student and contains the following instance variables:
  - `id`: Student's ID (int)
  - `name`: Student's name (String)
  - `address`: Student's address (String)
  - `dateOfBirth`: Student's date of birth (String or Date object)
  - `department`: Student's department (String)

#### Constructors
- The `Student` class provides several constructors:
  - Default constructor with no arguments
  - Constructors with 1, 2, 3, 4, and 5 arguments to initialize the instance variables.

#### Setters and Getters
- Setters and getters are provided for all instance variables of the `Student` class.
- Setters allow you to set individual values for each instance variable or set all values at once.
- Getters allow you to retrieve the current values of individual instance variables.

### 2. Driver Class

#### `StudentRecordApplication` Class
- The `StudentRecordApplication` class serves as the driver class for the application.
- It creates a `Student` object (`student1`) using the no-argument constructor and displays its default values.
- Then, it sets values for each instance variable using setters and displays the updated values.

## Usage

1. Clone or download the repository.
2. Open the project in your Java IDE.
3. Run the `StudentRecordApplication` class.
4. Follow the on-screen instructions to create, modify, or view student records.

