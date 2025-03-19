# Amazon Navigation Automation Testing

## Project Overview
This project automates the testing of Amazon's website navigation and shopping process using Selenium WebDriver with Java. The script performs the following actions:
- Searches for products (iPhone and AirPods)
- Selects and adds products to the cart
- Navigates between windows
- Logs in to the Amazon account
- Handles OTP verification (simulated for testing purposes)

## Features
- Automated search and selection of products
- Handling multiple browser windows and switching between them
- Adding products to the shopping cart
- Navigating to the login page and entering credentials
- Performing OTP verification

## Technologies Used
- **Java** (Selenium WebDriver for test automation)
- **Selenium WebDriver** (For interacting with the browser)
- **TestNG** (For test case execution)
- **WebDriverManager** (For managing browser drivers)

## Installation and Setup
1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/amazon-test-automation.git
   cd amazon-test-automation
   ```
2. **Set up dependencies**
   Ensure the following dependencies are present in `pom.xml` (if using Maven):
   ```xml
   <dependencies>
       <dependency>
           <groupId>org.seleniumhq.selenium</groupId>
           <artifactId>selenium-java</artifactId>
           <version>4.1.2</version>
       </dependency>
       <dependency>
           <groupId>io.github.bonigarcia</groupId>
           <artifactId>webdrivermanager</artifactId>
           <version>5.1.1</version>
       </dependency>
       <dependency>
           <groupId>org.testng</groupId>
           <artifactId>testng</artifactId>
           <version>7.4.0</version>
           <scope>test</scope>
       </dependency>
   </dependencies>
   ```
3. **Run the script**
   Open the project in an IDE like IntelliJ or Eclipse and execute the test file:
   ```bash
   mvn test
   ```
   or manually run the `AmazonTestAutomation.java` file.

## Test Cases
Detailed test cases are included in the `test-cases.xlsx` file in this repository. These test cases cover:
- Navigation testing for the Amazon menu
- Product search and selection
- Cart operations
- Login and authentication verification

## Result Analysis
- **Pass Criteria:** If the test successfully navigates Amazon, adds items to the cart, and completes login.
- **Fail Criteria:** If any step fails due to incorrect navigation, element selection, or authentication failure.
- **Error Handling:** Logs and screenshots are generated for debugging in case of test failure.

