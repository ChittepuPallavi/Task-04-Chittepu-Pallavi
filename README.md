# Currency Converter

## Overview

Currency Converter is a Java-based desktop application developed using Java Swing. The application allows users to convert an amount from one currency to another using predefined exchange rates. It provides a simple, user-friendly graphical interface with country names, currency codes, and currency symbols displayed in dropdown menus.

---

## Features

- Convert currencies between multiple countries
- User-friendly Swing GUI
- Country name, currency code, and symbol displayed together
- Input validation for amount fields
- Exception handling for invalid inputs
- Accurate calculations using BigDecimal
- Read-only result field
- Clear button to reset inputs
- Supports multiple international currencies
- Fast and lightweight desktop application

---

## Supported Currencies

- 🇮🇳 India - INR (₹)
- 🇺🇸 United States - USD ($)
- 🇬🇧 United Kingdom - GBP (£)
- 🇪🇺 Eurozone - EUR (€)
- 🇯🇵 Japan - JPY (¥)
- 🇨🇦 Canada - CAD (C$)
- 🇦🇺 Australia - AUD (A$)
- 🇨🇳 China - CNY (¥)
- 🇸🇬 Singapore - SGD (S$)
- 🇦🇪 United Arab Emirates - AED (د.إ)

---

## Technologies Used

- Java
- Java Swing
- BigDecimal
- VS Code
- Git & GitHub

---

## Project Structure

```text
CurrencyConverter
│
├── src
│   ├── Currency.java
│   ├── CurrencyConverter.java
│   ├── CurrencyGUI.java
│   ├── CurrencyService.java
│   ├── Main.java
│   └── Validator.java
│
├── .gitignore
└── README.md
```

---

## Application Workflow

### Input

- Select Source Currency
- Select Target Currency
- Enter Amount

### Process

- Validate Input
- Fetch Exchange Rates
- Perform Conversion
- Format Output

### Output

- Display Converted Currency Amount

---

## Rules and Validation

### Currency Selection

- Source currency must be selected.
- Target currency must be selected.

### Amount Validation

- Amount cannot be empty.
- Amount must be numeric.
- Amount must be greater than zero.
- Negative values are not allowed.

### Error Handling

- Invalid amount shows an error message.
- Empty fields show validation messages.
- Application prevents crashes using exception handling.

---

## How to Run

### Compile

```bash
javac *.java
```

### Run Console Version

```bash
java Main
```

### Run GUI Version

```bash
java CurrencyGUI
```

---

## Future Enhancements

- Live exchange rate API integration
- Dark mode theme
- Searchable currency dropdown
- Currency conversion history
- Export conversion reports
- Support for 100+ currencies
- Real-time exchange rate updates

---

## Learning Outcomes

This project demonstrates:

- Object-Oriented Programming (OOP)
- Java Swing GUI Development
- Exception Handling
- Data Validation
- BigDecimal Usage
- Java Collections (HashMap)
- Git and GitHub Version Control

---

## Author

**Pallavi**

Developed as part of the Decode Labs Java Project Program.
