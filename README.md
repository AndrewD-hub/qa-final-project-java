![CI](https://github.com/AndrewD-hub/qa-final-project-java/actions/workflows/ci.yml/badge.svg)

# qa-final-project-java

This project represents the first stage of a QA Automation final project built for a Java/Maven setup.

It includes:

- project folder structure
- YAML configuration
- API test pseudocode
- Docker support
- GitHub Actions CI/CD pipeline
- Java Username validation
- Java Browser configuration
## Project Structure

```text
qa-final-project-java/
├── .github/
│   └── workflows/
│       └── ci.yml
├── config/
│   └── app.yaml
├── data/
│   └── .gitkeep
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── andrewd/
│   │               └── homework/
│   │                   ├── UsernameValidator.java
│   │                   ├── BrowserType.java
│   │                   ├── BrowserConfig.java
│   │                   └── TestConfigRunner.java
│   └── test/
│       └── java/
│           └── com/
│               └── andrewd/
│                   └── tests/
│                       └── ApiTest.txt
├── .gitignore
├── Dockerfile
├── pom.xml
└── README.md
```
## Session 6 Homework - Username Validator

Added source file:
- `src/main/java/com/andrewd/homework/UsernameValidator.java`

Validation rules:
- length between 6 and 12 characters
- no spaces allowed
- must contain at least one digit

Used:
- `do-while` loop
- `for` loop

## Session 8 Homework - Browser Configuration

Added source files:

- `src/main/java/com/andrewd/homework/BrowserType.java`
- `src/main/java/com/andrewd/homework/BrowserConfig.java`
- `src/main/java/com/andrewd/homework/TestConfigRunner.java`

Implemented concepts:

- `enum` for browser types
- overloaded constructors
- constructor chaining with `this()`
- static factory method
- console output for configuration display

Available browser types:

- CHROME
- FIREFOX
- EDGE

BrowserConfig supports:

- browser type
- browser version
- headless mode

Factory method included:

`createDefaultChromeConfig()`

Runner class:

`TestConfigRunner` demonstrates all constructors and the factory method
