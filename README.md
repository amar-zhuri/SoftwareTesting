# Automated Software Testing Project  

This project implements automated testing for a selected website using **Gherkin, Cucumber, and Selenium WebDriver**. It demonstrates the creation, execution, and management of test cases for end-to-end functionality.  

## Features  
- **Test Scenarios**: Gherkin feature files for behavior-driven testing.  
- **Scenario Outlines**: Parameterized tests for dynamic inputs.  
- **Web Automation**: Selenium WebDriver for browser interaction.  

## Technology Stack  
- **Java**  
- **Gherkin**  
- **Selenium WebDriver**  
- **Cucumber**  

 
## Project Structure  

automated-testing/  
├── src/test/java/         # Step definitions and test runners  
├── src/test/resources/    # Gherkin feature files  
├── PageObjects/           # Encapsulates web elements and actions  
├── TestReports/           # Generated test execution reports  
├── drivers/               # ChromeDriver and other WebDriver executables  


## Installation and Setup  

1. Clone the repository:  
   ```bash
   git clone https://github.com/username/automated-testing.git  
   cd automated-testing  
mvn install  
mvn test  


## Test Case Examples  

### **Feature: Login Testing**  
#### **Scenario**: Valid user login  
#### **Scenario Outline**: Multiple user login attempts with varying credentials  

### **Feature: Navigation**  
#### **Scenario**: Check navigation through primary menu options  
