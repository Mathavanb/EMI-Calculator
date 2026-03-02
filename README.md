## 🧪 Tech Stack
https://img.shields.io/badge/Java-17-orange?logo=java
https://img.shields.io/badge/Selenium-WebDriver-43B02A?logo=selenium
https://img.shields.io/badge/Cucumber-BDD-23D96C?logo=cucumber
https://img.shields.io/badge/JUnit5-Testing-25A162?logo=junit5
https://img.shields.io/badge/Maven-Build-C71A36?logo=apache-maven
https://img.shields.io/badge/Apache%20POI-Excel-blue

# 🚗💰 Loan & EMI Automation Framework
Automated Testing Framework for Car Loan, Home Loan & EMI Calculators
**Author:** Mathavan Babu

## 📘 Project Overview
This automation framework is designed to validate Loan EMI Calculators using:

- Car Loan EMI
- Home Loan EMI
- Loan Amount Calculator
- Loan Tenure Calculator
- EMI Calculator UI validations
- Year‑on‑Year Table Extraction
- Excel Report Generation

All scenarios are automated using Selenium WebDriver, Cucumber BDD, Apache POI, and Fluent Wait utilities, with detailed logging and reporting.

**Application Under Test:**  
🌐 https://emicalculator.net/

## 🎯 Hackathon Problem Statement
### Problem:
Calculate the **Interest Amount** & **Principal Amount** for the **first month** for a car with:

- **Car Price:** ₹15,00,000
- **Interest Rate:** 9.5%
- **Tenure:** 1 year

### Additional Requirements:
- Extract the **Year‑on‑Year Table** from Home Loan EMI Calculator and store it in Excel.
- Validate UI behavior of the Loan Calculator (Sliders, Textboxes, Year/Month toggle).
- Repeat UI validations for:
  - EMI Calculator
  - Loan Amount Calculator
  - Loan Tenure Calculator

## 🛠 Technologies Used
| Technology | Purpose |
|-----------|---------|
| Java | Test scripts & utilities |
| Selenium WebDriver | Browser automation |
| Cucumber (BDD) | Feature‑file driven testing |
| Apache POI | Excel read/write |
| Log4j | Logging |
| AventStack / Extent Reports | HTML reporting |
| Fluent Wait | Handle dynamic elements |

## 📂 Framework Structure
```
src/test/java
│
├── features
│     ├── CarLoan.feature
│     ├── HomeLoan.feature
│     └── LoanCalculator.feature
│
├── stepDefinitions
│     ├── CarLoanSteps.java
│     ├── HomeLoanSteps.java
│     └── LoanCalculatorSteps.java
│
├── pages
│     ├── HomePage.java
│     ├── HomeLoanPage.java
│     └── LoanCalculatorPage.java
│
├── utilities
│     ├── AddFluentWait.java
│     ├── WriteExcel.java
│     ├── Assertions.java
│     └── DataReader.java
│
└── runners
      └── TestRunner.java
```

## ✔ Test Scenarios & Test Cases
### 🟦 Scenario 1 — Car EMI Calculation (Home Page)
- **TestCase_01** — Enter required car loan details
- **TestCase_02** — Display EMI Payment Table & capture first month details

### 🟩 Scenario 2 — Home Loan EMI Table Extraction
- **TestCase_03** — Extract Year‑on‑Year Table & store into Excel

### 🟧 Scenario 3 — EMI Calculator UI Validations
- **TestCase_04** — Validate Loan Amount textbox + slider
- **TestCase_05** — Validate scale change for Loan Amount
- **TestCase_06** — Validate Interest Rate textbox & slider
- **TestCase_07** — Validate Interest Rate scale change
- **TestCase_08** — Validate Loan Tenure textbox & slider
- **TestCase_09** — Validate Loan Tenure scale change
- **TestCase_10** — Validate Fees & Charges textbox & slider
- **TestCase_11** — Validate Year/Month options
- **TestCase_12** — Validate Fees & Charges scale change

### 🟨 Scenario 4 — Loan Amount Calculator UI
- **TestCase_13** — Validate EMI textbox & slider
- **TestCase_14** — Validate Interest Rate textbox & slider
- **TestCase_15** — Validate Interest Rate scale change
- **TestCase_16** — Validate Loan Tenure textbox & slider
- **TestCase_17** — Validate Loan Tenure scale change
- **TestCase_18** — Validate Fees & Charges textbox & slider
- **TestCase_19** — Validate Year/Month options
- **TestCase_20** — Validate Fees & Charges scale change

### 🟫 Scenario 5 — Loan Tenure Calculator UI
- **TestCase_21** — Validate Loan Amount textbox & slider
- **TestCase_22** — Validate Loan Amount scale change
- **TestCase_23** — Validate EMI textbox & slider
- **TestCase_24** — Validate Interest Rate textbox & slider
- **TestCase_25** — Validate Interest Rate scale change
- **TestCase_26** — Validate Fees & Charges textbox & slider
- **TestCase_27** — Validate Fees & Charges scale change

## ✨ Utility Classes Overview
### 🔧 AddFluentWait.java
Reusable fluent wait for dynamic web elements

### 📊 WriteExcel.java
Writes scraped year‑on‑year EMI data to Excel

### 🧪 Assertions.java
Custom assertion methods for validation

### 📁 DataReader.java
Reads input values from Excel

## 🚀 How to Run Tests
### Maven Command
```
mvn clean test
```

### Run via JUnit Runner
Open:
```
TestRunner.java → Run As → JUnit Test
```

### Reports
Generated in:
```
/test-output/ExtentReports/
```

## 📘 Sample Output (For Requirement 1)
| Month | Interest | Principal | Balance |
|--------|-----------|-----------|----------|
| Month 1 | ₹11,875 | ₹1,13,125 | ₹13,86,875 |

## 🎉 Conclusion
This framework demonstrates advanced automation capabilities, including:
- UI Testing
- Slider/Textbox validation
- Excel integration
- EMI & Loan logic validation
- BDD scenario implementation
- Fluent wait handling
- Modular reusable utilities

Perfect for hackathons, automation interviews, and enterprise-level test automation.
