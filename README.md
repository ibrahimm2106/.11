# ZipAbout Rental Management System

A Java/JavaFX rental management application developed as an individual university software-development project.

**Project mark: 75%**

## Overview

ZipAbout allows users to rent lightweight transport and equipment through a desktop GUI. The project demonstrates object-oriented design, maintainable Java code, GUI development, design patterns, functional-style operations with Java Streams, validation, localisation, accessibility, and user-focused features.

## Key Features

- JavaFX desktop interface using FXML and CSS
- Rental and release workflow for bookable items
- Availability/status tracking
- User login and Admin/User roles
- Loyalty points and booking history
- Search and availability filtering
- Java Streams for filtering, lookup, and duplicate checking
- Singleton design pattern for centralised booking management
- English/French localisation using `ResourceBundle`
- Light/dark theme switching
- Keyboard-accessible interactions
- Pie-chart visualisation of booking availability
- Input validation and error handling

## Technical Highlights

### Object-Oriented Design
The application separates:
- `BookableItem` — rental item model
- `User` — user information, roles, loyalty points, and booking history
- `BookingManager` — shared booking/business logic
- `HelloController` — JavaFX UI/controller behaviour
- `HelloApplication` — application startup and resource loading

### Design Pattern
`BookingManager` uses the **Singleton pattern** to maintain a single shared booking manager instance across the application.

### Java Streams
Streams are used for duplicate checks, login lookup, availability filtering, and search operations.

## Technologies

Java • JavaFX • FXML • CSS • Java Streams • ResourceBundle • Maven

## Project Structure

```text
src/
  main/
    java/
      com/example/sd3coursework/
      models/
      utils/
    resources/
      com/example/sd3coursework/
```

## Running the Project

Requirements:
- JDK 21+
- Maven 3.9+

```bash
mvn clean javafx:run
```

## Academic Context

This portfolio repository is based on my Software Development 3 coursework at the University of Roehampton. The project achieved **75%** and included advanced functionality beyond the basic GUI requirements, including design-pattern use, Java Streams/functional-style operations, additional user features, localisation, theming, and accessibility considerations.

## Author

Mohamed Ibrahim  
BEng Software Engineering, University of Roehampton
