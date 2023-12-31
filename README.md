<h1 align="center"><b>Money Calculator App 💰 </b></h1>

## Description 📋

Money Calculator is a Java application that simplifies currency conversion efficiently. Using the Model-View-Controller (MVC) design pattern and the Observer pattern, the application provides an intuitive interface for performing currency conversions with ease.

# 👥 Development Team (Ctrl + Click to view profiles)

[![GitHub](https://img.shields.io/badge/GitHub-Alejandro%20David%20Arzola%20Saavedra-blue?style=flat-square&logo=github)](https://github.com/AlejandroDavidArzolaSaavedra)

## Features ✨

- **Currency Conversion:** Allows the user to enter the amount in a source currency and select the destination currency to get the converted amount.

- **Automatic Update:** Implements the Observer pattern to automatically update the interface when conversion data changes.

- **User-Friendly GUI:** Developed with Java Swing, the user interface is easy to understand and use.

## Project Structure 🏗️

The code follows the MVC pattern for clear and modular organization:
<p align="center">
<img width="500px" src="https://github.com/AlejandroDavidArzolaSaavedra/MoneyCalculator/assets/90756437/16fff1ca-668f-4e3b-a089-18696532b4d0"/>
</p>

- **Model:** Contains business logic and manages exchange rates. The `MoneyCalculator` class performs conversion calculations and maintains the history.

- **View:** Represents the user interface. The `MoneyDisplayView, MoneyView, and MoneyEditView` classes handle the presentation and data input for conversions.

- **Controller:** Manages interactions between the user and the application. The `MoneyEditController` class handles user events and updates the model and view accordingly.

The Observer pattern is used to allow the view to update automatically when exchange rates change.

## API Integration 🌐

- An API is used to obtain updated exchange rates.

- Relevant components are located in the WebService package.

##

## Requirements 🛠️

- Java JDK 8 or higher.
- Java-compatible IDE (Eclipse, IntelliJ, etc.).

## Interface Design 🎨

<ul align="center">		
    <img style="width:40rem"  src="interfaz.png">
</ul>

## Model Design 💻

<ul align="center">		
    <img style="width:40rem"  src="model.PNG">
</ul>

## Usage Instructions 🚀

1. Clone the repository: `git clone https://github.com/AlejandroDavidArzolaSaavedra/MoneyCalculator`
2. Open the project in your preferred IDE.
3. Run the `MoneyCalculatorController` class to start the application.

## Contributions 🤝


<img align="left" width="180" height="100" src="https://github.com/AlejandroDavidArzolaSaavedra/Kata-Frequency-Calculator/assets/90756437/6d6a1cd1-4cef-4fef-85fa-170488ab17ba"></a>Contributions are appreciated! If you find bugs or have suggested improvements, create an issue or send a pull request.
