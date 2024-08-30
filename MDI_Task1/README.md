# MDI Task 1: API Testing with Rest Assured

This repository contains the code and resources for **MDI Task 1**, which focuses on API testing of the `https://zippopotam.us/` site. This site provides information on ZIP code locations. The task involves using Java, Selenium, and Rest Assured to test the API endpoint.

## Project Overview

The purpose of this project is to develop and automate test cases to verify the functionality of the API endpoint:

https://api.zippopotam.us/country/postal-code/


### Parameters

- **Country**: The country for which we are searching the postal code.
- **Postal Code**: The postal code for the area.

### Tests to Automate

We aim to automate the following test cases to ensure the API works correctly:

1. **Valid Country and Postal Code**: Verify the API returns the correct location information for valid country and postal code combinations.
2. **Invalid Country Code**: Test the API with an invalid country code to check if it returns the appropriate error response.
3. **Invalid Postal Code**: Test the API with an invalid postal code to verify it returns the correct error response.
4. **Boundary Values for Postal Code**: Test the API with boundary values (e.g., shortest and longest possible postal codes) to ensure it handles them correctly.
5. **Nonexistent Country or Postal Code**: Test the API response when the country or postal code does not exist in the database.
6. **Response Time**: Verify that the API responds within an acceptable time frame.
7. **Content Type and Headers**: Ensure the API response has the correct content type (e.g., `application/json`) and headers.

## Technologies Used

- **Java**: Programming language used for writing the test scripts.
- **Selenium**: Used for web browser automation if needed for front-end integration.
- **Rest Assured**: A Java library for testing RESTful APIs, used for making API requests and validating responses.
- **TestNG**: Testing frameworks used for writing and managing test cases.
- **Maven**: Build automation tool used for managing dependencies and building the project.

## Getting Started

To set up and run this project locally, follow these steps:

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/AhmedHassanien34/MDI-TASK.git
   cd MDI-TASK/MDI_Task1

2. **Install Dependencies**:
    Ensure you have Maven installed and run the following command to install project dependencies: mvn clean install 
3. You can run the test cases using Maven: Or run specific tests using your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

## Project Structure
src/test/java: Contains the test cases for API testing.
pom.xml: Maven configuration file for managing dependencies and build settings.


  
