# 🌿 Java Variables, Data Types, and Arithmetic Operations

## 1. Introduction

Java programming language is built on a strong foundation of **variables and data types**.  
In this section, we will cover the basics of **what variables are in Java, data types, arithmetic operations, type casting, and string manipulation**.

---

## 2. Variables

- A **variable** is a named memory location used to store data during program execution.
- In Java, every variable must have a **data type**.
- Common data types:
  - `int` → For whole numbers (e.g., 25)
  - `double` → For decimal numbers (e.g., 3.14)
  - `char` → For a single character (e.g., 'A')
  - `boolean` → Logical values: true/false
  - `String` → For text (e.g., "Hafize Şenyıl")

**Key Points:**
- Variables store data in memory.
- Values can change during program execution.
- Use `final` for constants (values that cannot change).

---

## 3. Arithmetic Operations

Java allows you to perform basic arithmetic operations on variables:

- Addition: `+`
- Subtraction: `-`
- Multiplication: `*`
- Division: `/`
- Modulus: `%`

**Example:**
- `int sum = x + y;`
- `double division = (double)x / y;` → Type casting may be required for division.

---

## 4. Type Casting

Java allows conversions between different data types:

- **Widening (automatic):** Smaller type → Larger type  
  Example: `int → double`
- **Narrowing (manual):** Larger type → Smaller type  
  Example: `(int) 3.14 → 3`

---

## 5. String Operations and Concatenation

- Text is stored using the `String` type.
- The `+` operator can concatenate strings and numbers.
- Escape characters allow formatting:
  - `\n` → New line
  - `\t` → Tab space
  - `\\` → Backslash
  - `\"` → Double quotes

---

## 6. Boolean and Logical Values

- The `boolean` type holds only **true** or **false**.
- Used in condition checking and logical operations.

**Logical operators:**
- `&&` → AND
- `||` → OR
- `!` → NOT

---

## 7. ASCII and Character Operations

- `char` type represents a single character.
- Characters can be converted to their ASCII numeric value:
  ```java
  char ch = 'A';
  int ascii = ch; // ascii = 65
