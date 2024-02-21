# Project Name

Mobile Automation Framework using Appium to automate 4sale mobile app 

## Table of Contents

1. [Introduction](#introduction)
2. [Features](#features)
3. [Prerequisites](#prerequisites)
4. [Installation](#installation)
5. [Usage](#usage)
6. [TestCase Run Video](#TestcaseRunRecording)


## Introduction

Appium framework designed for automating tests on the 4Sale mobile app. This framework leverages the Appium tool, a widely used open-source mobile automation framework, to perform automated testing on the 4Sale app on Android Devices.


## About 4Sale Mobile App

4Sale is a popular mobile application that facilitates buying and selling various goods and services in the local market. With a user-friendly interface and extensive features, 4Sale provides users with a convenient platform to browse listings, communicate with sellers, and make transactions.

## Features

- Login
- Assert on Error message
- Fill mutilple fields in post an Ad flow

# Getting Started

## Prerequisites

* Java jdk 21
* Appium version v2.5.1
* Android Emulator
* Node.js
* Maven
  


## Installation

1. Clone the repository:
   
   ```bash
   git clone https://github.com/omarzero130/AppiumMobileTask.git

2. Install dependencies:
  
   ```bash
   mvn install

## Usage

1. Run appium server ( use cmd to run the following command OR use appium server GUI ):

   ```bash
   Appium

2. Run the Android emulator and make sure you update the caps.json file with your device name and Android version 

   ```json
   {"appium:automationName": "UIAutomator2",
    "platformName": "Android",
   "appium:platformVersion": "your_platform_version",
   "appium:deviceName": "your_device_name",
    "appium:appPackage": "com.forsale.forsale",
   "appium:appActivity": "com.forsale.app.features.maincontainer.MainContainerActivity"}
    ```

3. Run the Test Suite in the IDE terminal:
   
   ```bash
   mvn test


## Testcase Run Video

  https://github.com/omarzero130/AppiumMobileTask/assets/31737511/d17d4eb8-2dee-4276-bc2d-b598150434fd



