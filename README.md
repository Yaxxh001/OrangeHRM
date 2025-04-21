OrangeHRM Login Page - Page Object Model
This repository contains a Page Object Model (POM) class for the OrangeHRM Login Page using Selenium WebDriver in Java. The class helps automate the login functionality for the OrangeHRM web application.

📁 File Structure
Copy
Edit
ProjectPage/
└── OrangeHRM_LoginPage.java
📄 Description
The OrangeHRM_LoginPage class is a part of the Page Object Model (POM) framework. It is used to represent the login page of the OrangeHRM application. This class encapsulates all the elements and actions related to the login page, making the test scripts more readable and maintainable.

🔧 Tools & Technologies
Java

Selenium WebDriver

PageFactory (Selenium)

TestNG or JUnit (for integration in test cases)

🧩 Class Overview
📌 Constructor
java
Copy
Edit
public OrangeHRM_LoginPage(WebDriver driver)
Initializes WebElements using Selenium's PageFactory.

🔍 WebElements (Locators)
txt_username: Username input field

txt_password: Password input field

btn_click: Login button

🧪 Action Methods
setUsername(String user) – Enters the username.

setPassword(String pwd) – Enters the password.

click() – Clicks the login button.

✅ Example Usage
java
Copy
Edit
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

OrangeHRM_LoginPage login = new OrangeHRM_LoginPage(driver);

login.setUsername("Admin");
login.setPassword("admin123");
login.click();
📌 Best Practices Followed
Follows the Page Object Model (POM) design pattern.

Uses @FindBy annotation for locating web elements.

Makes test scripts more readable and reusable.

📎 Notes
You can integrate this class with your test framework such as TestNG or JUnit.

Make sure to add proper waits (like WebDriverWait) in test scripts if needed.
