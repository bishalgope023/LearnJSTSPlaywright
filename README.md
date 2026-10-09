# JavaScript and Test Automation Learning Repository

This repository contains hands-on JavaScript lessons, prompt-engineering notes, and Selenium WebDriver examples using Java, Maven, and TestNG.

## Repository layout

| Path | Contents |
| --- | --- |
| `01_chapter_JS_Basics/` | JavaScript introduction and a Hello World example |
| `02_chapter_JS_Keywords_Identifiers/` | JavaScript engine, declarations, keywords, comments, and identifier examples |
| `03_chapter_JS_Literals/` | Placeholder for JavaScript literals exercises |
| `iq_notes/` | Notes on JavaScript identifier rules |
| `00_chapter_Prompt_Eng/` | RICE-POT prompt-engineering material and Salesforce login automation examples |
| `00_chapter_Prompt_Eng/Selenium_Framework_New/` | Maven Selenium/TestNG project |
| `00_chapter_Prompt_Eng/Selenium_Framework_Test/` | Additional Maven Selenium/TestNG project |

## JavaScript examples

Install [Node.js](https://nodejs.org/) to run the JavaScript examples. From the repository root, for example:

```powershell
node .\01_chapter_JS_Basics\01_HelloWorld.js
node .\02_chapter_JS_Keywords_Identifiers\09_IQ.js
```

The identifier example covers valid and invalid identifier forms, case sensitivity, Unicode identifiers, and common naming conventions. Invalid forms are kept in comments so the script remains executable.

## Salesforce Selenium projects

Both Maven projects use Java 17, Selenium 4, and TestNG to exercise valid and invalid login scenarios at `https://login.salesforce.com/?locale=in`. The projects include a Page Object and TestNG suite configuration.

Prerequisites:

- Java 17 or later
- Apache Maven
- Google Chrome
- Valid Salesforce test account credentials for the valid-login scenario

Run either project from its own directory:

```powershell
Set-Location .\00_chapter_Prompt_Eng\Selenium_Framework_New
mvn test
```

Or:

```powershell
Set-Location .\00_chapter_Prompt_Eng\Selenium_Framework_Test
mvn test
```

The invalid-login scenario uses intentionally invalid credentials. The valid-login scenario reads credentials from Java system properties and is skipped when either value is missing:

```powershell
mvn test "-Dsalesforce.username=your-test-username" "-Dsalesforce.password=your-test-password"
```

Use a dedicated test account. Do not commit credentials or other secrets to the repository.

## Prompt-engineering notes

`00_chapter_Prompt_Eng/00_RICE_POT_FullForm.md` explains the RICE-POT prompt framework. The accompanying prompt and problem-statement files capture the requirements used for the Salesforce automation exercises.
