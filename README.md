# MDI Task: API Automation and Android Weather App Testing

## Overview

This project consists of two main sections:

1. **API Automation**: Develop automation scripts to test a given API that provides information on zip code locations.
2. **Android Weather App Testing**: Create automated tests for the Android Mobile App for Weather, specifically targeting the home screen.

## Section 1: API Automation

### Objective

The goal of this section is to develop automation scripts and a basic framework to test the API provided by [Zipopotam](https://zipopotam.us/) which offers location data based on zip codes.

### Prerequisites

- **Language/Tools**: Java, Rest Assured
- **IDE Setup**: Ensure that your development environment is set up in IntelliJ with the necessary libraries and tools.


**Note**: **Do not use Postman.** This is strictly a coding exercise.

### API Details

- **Endpoint**: `https://api.zippopotam.us/country/postal-code/`
- **Parameters**:
  - `Country`: The country for which we are searching for the postal code.
  - `Postal Code`: The postal code for the area.

### Tests to Automate

Assume this API is part of an application under development. You should write test cases to verify that the API is working as expected. Focus on testing one end-point at a time.

### Test Scenarios

- Validate the response structure for a valid country and postal code.
- Test with an invalid country code and ensure the proper error message is returned.
- Test with an invalid postal code and verify the response.
- Check for edge cases such as missing parameters or null values.
- Validate the response time and performance of the API under load.

### How to Execute

1. Clone this repository to your local machine.
2. Install the necessary dependencies as outlined in the `pom.xml` file.
3. Run the test suite using your preferred test runner (e.g., JUnit, TestNG).
4. Review the results and logs for any failures or issues.

## Section 2: Android Weather App Testing

### Objective

This section focuses on writing automated tests for the Android Weather App's home screen.

### Test Scenarios

1. **Temperature Unit Conversion**: 
   - Test the conversion of temperature from Celsius to Fahrenheit and vice versa.
   - Include proper assertions on the main Weather screen.
   
2. **Time Format Conversion**:
   - Test the conversion of time format from 24-hour to 12-hour format.
   - Validate the assertions on the Weather screen.

3. **Rain Chance and Humidity Assertion**:
   - Assert that the chance of rain (rain icon) and humidity (waterdrop icon) values are displayed for each hour in the next 6 hours.

### Test Execution

1. Download the APK provided [here](https://play.google.com/store/apps/details?id=com.info.weather.forecast).
2. Install the APK on your Android emulator.
3. Run the automated tests using Appium.

## How to Contribute

1. Fork this repository.
2. Create a new branch (`git checkout -b feature-branch`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature-branch`).
5. Create a new Pull Request.


