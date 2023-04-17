# CarnivalPortal

Index
Technologies Setup Page Object Model Features and Cucumber Base Page Running the tests Reports Technologies

This project was created with:
Selenium WebDriver: To interact with WebElements on the Webpage. 
Java: As the programming language. 
Cucumber: To write test scenarios as Behaviour Driven Development features and collaborate with Business Analysts. 
Extent Reports: To generate HTML reports. 
Gradle: as building tool. Setup

Instructions to download the project

Install JDK (latest stable version). Download the WebDrivers (chromedriver) to use in the project. If using Windows, specify the path to the driver in BasePage.java 
like System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver")

- Clone the repository project from git@github.com:WillTAE/CarnivalPortal.git

Running the tests To run the tests, you have two options:
Running from a Runner.java , specifying which tag to run (Tags in the feature are @QA1 and @QA2). 
Running from the command line and using*: 
gradle test -Dcucumber.options="--tags @CucumberTag" Observe that the "test" task is created in the build.gradle file.

*Make sure the tag in runner is the same tag you are going to run from command line
