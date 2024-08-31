
# Appium Setup Guide

This guide will walk you through the steps to set up Appium for mobile automation testing on Android.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Installing Appium](#installing-appium)
- [Setting Up Android Environment](#setting-up-android-environment)
- [Configuring Desired Capabilities](#configuring-desired-capabilities)
- [Running Your First Test](#running-your-first-test)
- [Common Issues and Troubleshooting](#common-issues-and-troubleshooting)

## Prerequisites

Before you begin, ensure you have the following installed on your system:

- **Node.js**: Appium requires Node.js to be installed. You can download it from [here](https://nodejs.org/).
- **Java JDK**: Java Development Kit (JDK) is required for Android automation. You can download it from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
- **Android SDK**: Required for Android automation.

## Installing Appium

### Install Appium Doctor

Appium Doctor is a command-line utility that checks whether all the necessary dependencies for Appium are installed.

```bash
npm install -g appium-doctor
```

### Verify Installation

Run the following commands to verify the installations:

```bash
appium -v
appium-doctor
```

## Setting Up Android Environment

### Install Android Studio

Download and install Android Studio from [here](https://developer.android.com/studio).

### Configure Android SDK

1. Open Android Studio.
2. Go to **SDK Manager**.
3. Install the latest Android SDK, SDK Tools, and Android SDK Platform-Tools.

### Set Up Environment Variables

Add the following environment variables to your system:

  - `ANDROID_HOME` = `C:\Users\YourUsername\AppData\Local\Android\Sdk`
  - Add `%ANDROID_HOME%\platform-tools` and `%ANDROID_HOME%\tools` to your PATH.

### Start an Android Emulator

You can start an emulator from Android Studio or using the command line:

```bash
emulator -avd <Your_AVD_Name>
```

## Configuring Desired Capabilities

Desired capabilities are key-value pairs that tell Appium what kind of session to initiate. Below are example configurations for both Android and iOS:

### Android Desired Capabilities

```javascript
{
  "platformName": "Android",
  "platformVersion": "10.0",
  "deviceName": "Android Emulator",
  "app": "/path/to/your/app.apk",
  "automationName": "UiAutomator2"
}
```

## Running Your First Test

### Start the Appium Server

```bash
appium
```

The server should start on `http://localhost:4723/wd/hub`.

### Run Your Test Script

Ensure your test script is pointing to the correct Appium server and uses the desired capabilities you've configured.

## Common Issues and Troubleshooting

### Appium Doctor Issues

- Run `appium-doctor` to identify missing dependencies.
- Follow the suggested steps to resolve any issues.

### App Not Installing on Device

- Ensure the `app` capability points to a valid `.apk` or `.app` file.
- Verify that the device is connected and accessible.

## Conclusion

You have successfully set up Appium for mobile automation testing. For more information, refer to the [Appium Documentation](http://appium.io/docs/en/about-appium/intro/).
