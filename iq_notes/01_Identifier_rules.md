# JavaScript Identifier Rules

An identifier is the name we give to variables, functions, classes, and other symbols in JavaScript.

## Basic rules

1. An identifier must start with:
   - a letter (`A-Z` or `a-z`)
   - an underscore (`_`)
   - a dollar sign (`$`)

2. After the first character, it can include:
   - letters
   - digits (`0-9`)
   - underscores (`_`)
   - dollar signs (`$`)

3. It cannot contain spaces or special characters like `-`, `+`, `*`, `@`, etc.

4. It cannot be a JavaScript reserved keyword.
   Examples: `var`, `let`, `const`, `function`, `class`, `if`, `else`, `return`, `new`

5. JavaScript identifiers are case-sensitive.
   - `name` and `Name` are different identifiers.

6. They cannot begin with a digit.
   - `123abc` is invalid
   - `abc123` is valid

## Examples

### Valid identifiers
```javascript
let name = "Alice";
let _count = 10;
let $price = 250;
let user1 = true;
let firstName = "John";
```

### Invalid identifiers
```javascript
let 123abc = 5;      // starts with a digit
let my-name = "A";  // hyphen is not allowed
let var = 10;        // reserved keyword
let hello world = 1; // spaces not allowed
```

## Unicode and modern JavaScript

Modern JavaScript allows identifiers to include Unicode letters and many Unicode characters, so names like `naïve`, `Δelta`, or `π` may be valid in some cases.

## Best practices

- Use meaningful names: `totalPrice`, `studentName`
- Use camelCase for most variables and functions
- Use PascalCase for classes
- Avoid single-letter names except in loops (`i`, `j`, `k`)
- Do not use reserved words or built-in names like `window`, `document`, or `Array` as variables unless necessary

## Summary

A valid JavaScript identifier must:
- start with a letter, `_`, or `$`
- continue with letters, digits, `_`, or `$`
- not use spaces or invalid punctuation
- not use reserved keywords
- be case-sensitive

This makes identifiers readable, safe, and consistent in JavaScript code.
