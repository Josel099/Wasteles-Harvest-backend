<h1 align="center">WastelessHarvest Backend ✨</h1>

![GitHub contributors](https://img.shields.io/github/contributors/Josel099/WastelessHarvest-backend)
![GitHub forks](https://img.shields.io/github/forks/Josel099/WastelessHarvest-backend)
[![License: MIT](https://img.shields.io/badge/License-MIT-orange.svg)](https://opensource.org/licenses/MIT)
![GitHub Repo stars](https://img.shields.io/github/stars/Josel099/WastelessHarvest-backend)



Welcome to the WastelessHarvest backend repository 🌱 !   WastelessHarvest is a powerful food waste management system aimed at addressing the global issue of food wastage.This repository contains the backend codebase for our application.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Getting Started](#getting-started)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)
- [Contact](#contact)

## Overview 🌎

WastelessHarvest is a revolutionary platform dedicated to reducing food waste by connecting food suppliers (e.g., restaurants, supermarkets, caterers) with individuals or organizations in need of food assistance. The food waste management system connects food suppliers with nearby individuals or organizations in need of food. Food suppliers create listings for their excess food on the platform, describing the type and quantity of food available, as well as the pickup location and time. Recipients search for available listings on the platform and contact the food supplier directly to arrange for pickup. The system provides contact details for the supplier. 🤝

This project is built using the following technologies:
- **Frontend**: React ⚛️
- **Backend**: Spring Boot 🍃
- **Database**: MySQL 🦈

This repository contains the back-end of our application, which is built using spring boot . To fully utilize the application, you need to set up the frond end of the project. You can find instructions for setting up the frondend by visiting the [frond-end repository](https://github.com/Josel099/WastelessHarvest-frontend.git). 🚀

## Features 🌟

### User Authentication 🔐

- **Sign In:** Users can sign in using their registered email and password.
- **Update Account Info:** Registered users can update their account details. ✏️

### Donation Management 🥫

- **Donating:** Food suppliers can easily list their excess food inventory on our platform, specifying details such as quantity, expiry date, location, and contact information.
- **View Listed Food:** Users can browse through the listed surplus food to discover available food items.
- **Recipient Actions:** Recipients search for available listings on the platform and contact the food supplier directly to arrange for pickup using the contact details provided in the platform. 

### Supplier-Specific Features 🛒

- **Supplier Dashboard:** Suppliers can view and manage the food items they have listed on the platform.
- **Delete Listed Food Items:** Suppliers have the option to remove food items they have listed if needed. 🗑️

## Getting Started 🚀

To set up the WastelessHarvest Backend on your local machine, follow these steps:

### System Requirements 🖥️

Before you begin, ensure your system meets the following requirements:

- **Java:** Ensure you have Java installed. The project requires Java 8 or later.
- **Maven:** Verify that you have Maven installed. Maven is used for project build and dependencies. You can download Maven from [maven.apache.org](https://maven.apache.org/).
- **MySQL:** Ensure you have a MySQL database set up. You'll need to configure the database connection in the application properties.

1. Clone this repository to your local environment.
2. Configure your MySQL database connection in `src/main/resources/application.properties`.
3. Navigate to the project directory.
4. Run `mvn clean install` to build the project and install dependencies.
5. Launch the backend server by running `mvn spring-boot:run`.  🌐


## Technologies Used 🛠️

This project is built with the following key technologies:

- **Spring Boot:** A Java-based framework for building web and enterprise applications.
- **MySQL:** A relational database for storing application data.

## Project Structure 📂

The project's structure is organized as follows:

- `src/`: Contains the source code for the backend application.
- `pom.xml`: Maven project configuration file.

## Contributing 🤝

We welcome contributions to the WastelessHarvest backend project. By contributing, you can play a crucial role in reducing food waste and making a positive impact on our community. There are various ways to get involved and contribute:

- **Bug Reports:** If you come across any issues, bugs, or unexpected behavior, please create an issue in our repository to report the problem. Be sure to provide detailed information and steps to reproduce the issue. 🐛

- **Feature Requests:** If you have ideas for new features or improvements, feel free to create a feature request issue. We value your suggestions for enhancing the platform. 🚀

- **Pull Requests:** We encourage developers to submit pull requests to address issues or contribute new features. Fork our repository, make your changes, and create a pull request for review. 🛠️

- **Documentation:** If you have expertise in documentation, you can help improve our project's documentation for users and contributors. 📚

We appreciate your contributions and value your input. Thank you for considering contributing to WastelessHarvest. Together, we can create a more sustainable and equitable future. 🌍

## License 📜 

This project is open-source and is licensed under the MIT License. 📃

## Contact 📧

If you have any questions or require assistance, please feel free to reach out to us at josel.xavier2017@gmail.com. We welcome your involvement in our mission to reduce food waste and combat hunger. Together, we can make a significant difference! 💌
