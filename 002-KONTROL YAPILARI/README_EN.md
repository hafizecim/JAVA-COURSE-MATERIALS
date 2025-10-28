
---

## 🇬🇧 **README_EN.md**

```markdown
# 🧭 2. CONTROL STRUCTURES (Java Control Structures)

This section covers the core concepts of **decision making**, **repetition**, and **user input** in Java.  
These structures make programs dynamic — allowing them to react based on user input, conditions, or loops.

---

## 🔹 1. CONDITIONS

Conditions determine which block of code runs depending on whether a statement is **true** or **false**.

### 🔸 Structures:
- **if** → Executes code when the condition is true  
- **else if** → Tests multiple conditions sequentially  
- **else** → Runs if no other condition is true  
- **switch-case** → Chooses a block based on a specific value  

### 🧩 Common Uses:
- Decision-making (e.g., age check, grade evaluation)
- Menu selections
- Controlling program flow

---

## 🔹 2. LOOPS

Loops are used to **repeat** actions multiple times.  
They continue running as long as a certain condition is true.

### 🔸 Types of Loops:
- **for** → Repeats a fixed number of times  
- **while** → Repeats while a condition is true  
- **do-while** → Executes once before checking the condition  
- **nested loops** → A loop inside another loop  

### 🔸 Control Statements:
- **break** → Stops the loop immediately  
- **continue** → Skips the current iteration  

### 🧩 Common Uses:
- Generating tables
- Drawing patterns
- Iterating through lists or data

---

## 🔹 3. USER INPUT

To get input from the user, we use the `Scanner` class.

### 🧩 Basic Example:
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = input.nextInt();
System.out.println("You entered: " + number);
