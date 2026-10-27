# JavaScript and Test Automation Learning Repository

This repository contains hands-on JavaScript lessons, prompt-engineering notes, and Selenium WebDriver examples using Java, Maven, and TestNG.

## Repository layout

| Path | Contents |
| --- | --- |
| `01_chapter_JS_Basics/` | JavaScript introduction and a Hello World example |
| `02_chapter_JS_Keywords_Identifiers/` | JavaScript engine, declarations, keywords, comments, and identifier examples |
| `03_chapter_JS_Literals/` | JavaScript string, number, null, undefined, and other literal examples |
| `04_Operators/` | JavaScript assignment, arithmetic, comparison, and logical operator examples |
| `05_JS_Increment_Decrement_Op/` | Prefix and postfix increment/decrement, expression evaluation, and nullish coalescing examples |
| `06_chatper_if_else_statement_Condition/` | `if`, nested `if`, `if/else`, and multiple conditional examples |
| `07_Chapter_Switch.js/` | `switch` statements, grouped cases, API response-code examples, and related practice questions |
| `08_chapter_UserInput/` | Reading and converting user input with Node.js `readline` and `prompt-sync` |
| `09_Chapter_Loops/` | `for` loop fundamentals and loop practice questions |
| `10_chapter_Loops_WHILE/` | `while` loop examples and practice questions |
| `11_chapter_Do_While/` | `do...while` and nested-loop examples with practice questions |
| `12_chapters_Arrays/` | Array creation, updates, sorting, slicing, transformations, and destructuring |
| `13_Functions/` | Function declarations, expressions, arrow functions, return values, spread arguments, template literals, and `let`/`const` examples |
| `Self_Practise_ForLoop/` | Independent `for` loop exercises, including even/odd numbers, multiplication, arrays, and reverse counting |
| `Self_Practise_WhileLoop/` | Independent `while` loop exercises covering counting, odd numbers, sums, and string traversal |
| `self_Practise_DOWhile.js/` | Independent `do...while` loop exercises, plus the `14_chapter_Var_Let_Const/` declaration exercises |
| `Test/` | Numbered standalone JavaScript practice exercises |
| `iq_notes/` | Notes on JavaScript identifier rules |
| `00_chapter_Prompt_Eng/` | RICE-POT prompt-engineering material and Salesforce login automation examples |
| `00_chapter_Prompt_Eng/Selenium_Framework_New/` | Maven Selenium/TestNG project |
| `00_chapter_Prompt_Eng/Selenium_Framework_Test/` | Additional Maven Selenium/TestNG project |

## JavaScript examples

Install [Node.js](https://nodejs.org/) to run the JavaScript examples. From the repository root, for example:

```powershell
node .\01_chapter_JS_Basics\01_HelloWorld.js
node .\02_chapter_JS_Keywords_Identifiers\09_IQ.js
node .\03_chapter_JS_Literals\12_Null_Undefined.js
node .\04_Operators\21_Arithmatic_Op.js
node .\05_JS_Increment_Decrement_Op\38_ID.js
node .\06_chatper_if_else_statement_Condition\46_IF.js
node .\07_Chapter_Switch.js\50_switch.js
node .\08_chapter_UserInput\61_Promt_sync.js
node .\09_Chapter_Loops\64_Loops_For.js
node .\10_chapter_Loops_WHILE\70.js
node .\11_chapter_Do_While\74.js
node .\12_chapters_Arrays\83_Array.js
node .\13_Functions\101_Function.js
node .\13_Functions\120_Const.js
```

The user-input chapter includes a built-in `readline` example that reports whether an entered number is even or odd. The `60_Node_UI.js` example uses the third-party `prompt-sync` package; install that package before running the example.

The identifier example covers valid and invalid identifier forms, case sensitivity, Unicode identifiers, and common naming conventions. Invalid forms are kept in comments so the script remains executable.

The literals examples cover numeric formats, strings, booleans, `null`, and `undefined`. The operators examples demonstrate assignment, arithmetic, equality and comparison, logical operators, and conditional expressions. The increment/decrement examples show how prefix and postfix forms affect both the expression result and the variable's updated value. The conditional examples demonstrate `if`, nested `if`, and `if/else` branching, including an age-based eligibility check, while the switch examples cover matching values, grouped cases, and response-code selection.

The loop chapters introduce `for`, `while`, and `do...while` iteration, including nested loops and related practice questions. The examples can be run individually with Node.js as shown above.

The arrays chapter covers common array operations, sorting, slicing, concatenation, transformations, copying, and destructuring. The functions chapter demonstrates function forms and behavior, including parameters, return values, arrow functions, spread arguments, and template literals. Variable declaration examples for `var`, `let`, and `const` are also included in the functions and do-while practice folders. The `Test/` folder contains additional numbered practice scripts.

### Independent loop practice

The `Self_Practise_ForLoop/`, `Self_Practise_WhileLoop/`, and `self_Practise_DOWhile.js/` folders contain additional standalone exercises. For example, run them from the repository root with Node.js:

```powershell
node ".\Self_Practise_ForLoop\For Loop.js"
node .\Self_Practise_WhileLoop\while_03.js
node .\self_Practise_DOWhile.js\03.js
```

The `for` loop exercises include even/odd number checks, a multiplication table, array traversal, and reverse counting. The `while` loop exercises cover counting, odd numbers, summation, and string traversal. The `do...while` examples demonstrate loop execution before condition checking.

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
