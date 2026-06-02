# Life on Land — Nature Preserve Management System

> A Java OOP console application for managing a nature preserve — tracking animals, plants, habitats, staff roles, tours, donations, and visitors through a role-based authentication system with custom exceptions and file I/O.

**Author:** Ziad Hany Mohamed Salem  
**Department:** Cybersecurity  
**Course:** Object-Oriented Programming  
**Language:** Java  
**Date:** 2025

---

## Overview

The system manages **Sunset Preserve** — a 2,500-acre nature preserve in California. Two user roles are supported: **Staff** (full management access) and **Visitor** (read-only access). The application demonstrates core OOP principles including inheritance, abstraction, interfaces, polymorphism, custom exceptions, and file I/O.

---

## Features

### Staff Menu (17 operations)
- Add / Remove habitats
- Add / Remove animals (with age validation)
- Add / Remove plants
- Add / Remove staff members
- Add / Remove tours
- Display preserve details, all habitats, animals, plants, staff, and tours

### Visitor Menu (6 operations)
- View preserve details
- Browse habitats, animals, plants, and tours (read-only)

### System Features
- Role-based login authentication (staff / visitor)
- Custom exception handling (`InvalidAnimalAgeException`, `InvalidDonationAmountException`)
- File I/O for data persistence (`FileIO.java`)
- Auto-incrementing unique IDs for animals

---

## OOP Design

### Class Hierarchy

```
LivingBeing  (abstract class)
├── Animal   (extends LivingBeing)
│   └── Throws InvalidAnimalAgeException if age < 0
└── Plant    (extends LivingBeing)

Staff        (abstract class)
├── Ranger      (extends Staff)
├── Veterinarian(extends Staff)
├── Botanist    (extends Staff)
└── TourGuide   (extends Staff)
```

### Interfaces

```
Monitorable   ← implemented by Animal, Plant
Caring        ← implemented by Veterinarian, Botanist
Guidable      ← implemented by TourGuide
```

### Key Classes

| Class | Responsibility |
|-------|---------------|
| `LivingBeing` | Abstract base — name, gender, species, habitat, conservation status |
| `Animal` | Extends LivingBeing — age, weight, unique auto-ID, custom exception |
| `Plant` | Extends LivingBeing — growth season |
| `Staff` | Abstract — name, position, salary, abstract `performDuty()` |
| `Ranger` | Extends Staff — patrols and monitors habitats |
| `Veterinarian` | Extends Staff — medical care for animals |
| `Botanist` | Extends Staff — plant care and research |
| `TourGuide` | Extends Staff — leads visitor tours |
| `NaturePreserve` | Core system — manages all lists (habitats, staff, animals, plants, tours, donations, visitors) |
| `Habitat` | Type and climate of a habitat zone |
| `Tour` | Tour name, date, price |
| `Donation` | Donation amount with custom exception validation |
| `Visitor` | Visitor profile |
| `FileIO` | File reading and writing for data persistence |

---

## Custom Exceptions

```java
// Thrown when an animal's age is set to a negative value
class InvalidAnimalAgeException extends Exception {
    InvalidAnimalAgeException(String message) { super(message); }
}

// Thrown when a donation amount is invalid (e.g. negative or zero)
class InvalidDonationAmountException extends Exception {
    InvalidDonationAmountException(String message) { super(message); }
}
```

---

## Project Structure

```
life-on-land-oop/
└── src/
    ├── Main.java                          ← Entry point — login + menu system
    ├── LivingBeing.java                   ← Abstract base class
    ├── Animal.java                        ← Extends LivingBeing
    ├── Plant.java                         ← Extends LivingBeing
    ├── Staff.java                         ← Abstract staff class
    ├── Ranger.java                        ← Extends Staff
    ├── Veterinarian.java                  ← Extends Staff
    ├── Botanist.java                      ← Extends Staff
    ├── TourGuide.java                     ← Extends Staff
    ├── NaturePreserve.java                ← Core management class
    ├── Habitat.java                       ← Habitat model
    ├── Tour.java                          ← Tour model
    ├── Donation.java                      ← Donation with validation
    ├── Visitor.java                       ← Visitor model
    ├── Monitorable.java                   ← Interface
    ├── Caring.java                        ← Interface
    ├── Guidable.java                      ← Interface
    ├── FileIO.java                        ← File persistence
    ├── InvalidAnimalAgeException.java     ← Custom exception
    └── InvalidDonationAmountException.java← Custom exception
```

---

## How to Run

### Requirements
- Java JDK 17+
- Any Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or command line

### Command Line

```bash
# Clone the repository
git clone https://github.com/ZiadHany99/life-on-land-oop.git
cd life-on-land-oop/src

# Compile all Java files
javac *.java

# Run the program
java Main
```

### Login Credentials

| Role | Username | Password |
|------|----------|----------|
| Staff | `staff` | `staff123` |
| Visitor | `visitor` | `visitor123` |

---

## Sample Output

```
Welcome to the Nature Preserve System!
Enter username: staff
Enter password: staff123
Login successful! Welcome, staff!

Welcome to the Nature Preserve Menu!
1.  Add Habitat
2.  Remove Habitat
3.  Add Animal
4.  Remove Animal
5.  Add Plant
6.  Remove Plant
7.  Add Staff
8.  Remove Staff
9.  Add Tour
10. Remove Tour
11. Display Preserve Details
...
Choose an option:
```

---

## OOP Concepts Demonstrated

| Concept | Where Applied |
|---------|--------------|
| Inheritance | `Animal`, `Plant` extend `LivingBeing`; `Ranger`, `Vet`, `Botanist`, `TourGuide` extend `Staff` |
| Abstraction | `LivingBeing` and `Staff` are abstract classes with abstract methods |
| Interfaces | `Monitorable`, `Caring`, `Guidable` |
| Polymorphism | `displayInfo()` overridden in `Animal` and `Plant` |
| Encapsulation | Private fields with getters/setters throughout |
| Custom Exceptions | `InvalidAnimalAgeException`, `InvalidDonationAmountException` |
| Static members | `nextAnimalId` auto-increments across all Animal instances |
| File I/O | `FileIO.java` handles data persistence |
| Collections | `ArrayList` used throughout `NaturePreserve` for all entity lists |

---

## Disclaimer

This project was developed for academic purposes as part of an Object-Oriented Programming course. All data used is fictional.
