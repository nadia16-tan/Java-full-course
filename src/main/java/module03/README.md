# 📘 Module 03: Loops (`while`, `do-while`, `for`)

---

## Learning Outcomes Assessed

* Iteration Logic
* Loop Structures (`for`, `while`, `do-while`)
* Flow Control (`break`, `continue`)
* Array Traversal
* Stopping Conditions
* Sequential Processing
* Problem Decomposition
* Algorithmic Thinking

---

## Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java
LoopExercises.java
```

---

## Your Task

For this module, you must:

* Understand when to use each loop type
* Choose the correct loop structure per problem
* Handle stopping conditions correctly
* Avoid infinite loops
* Process arrays accurately
* Apply `break` and `continue` where required
* Return exact expected outputs
* Pass all unit tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Select appropriate loop type (`for`, `while`, `do-while`)
* Implement correct stopping logic
* Handle edge cases carefully
* Maintain correct counting logic
* Format outputs exactly as required
* Ensure all tests pass

---

## How to Run Your Tests

### Run all tests:

```bash
mvn test
```

### Run module tests:

```bash
mvn test -Dtest=LoopExercisesTest
```

---

# 🧠 Core Loop Concepts

---

## `while` Loop

Used when repetition depends on a condition that is checked before execution.

```java
while (condition) {
    // repeated execution
}
```

---

## `do-while` Loop

Ensures the loop executes at least once before checking the condition.

```java
do {
    // executes first
} while (condition);
```

---

## `for` Loop

Used when the number of iterations is known in advance.

```java
for (int i = 0; i < n; i++) {
    // repeated execution
}
```

---

## `break`

Immediately stops loop execution.

---

## `continue`

Skips the current iteration and moves to the next loop cycle.

---

# 🧪 Exercises

---

# Question 1 - Guessing Game

## Function:

```java
exercise1_guessingGame(int[] guesses, int secret)
```

---

### Objective:

Simulate repeated guesses until the correct value is found in a sequence of attempts.

---

### Rules:

* Iterate through the `guesses` array
* Count each attempt
* Stop immediately when the guess equals the secret number
* Return total number of attempts needed to reach the correct guess

---

### Inputs:

* `int[] guesses`
* `int secret`

---

### Output:

* Integer representing number of attempts

---

### Examples:

| Input                 | Output |
| --------------------- | ------ |
| [5, 7], secret = 7    | 2      |
| [3, 4, 9], secret = 9 | 3      |
| [8], secret = 8       | 1      |

---

### Edge Cases:

* Secret may appear at first position
* Secret is guaranteed to exist in input
* Only count up to first correct match

---

# Question 2 - PIN Validator

## Function:

```java
exercise2_pinValidator(int[] pins)
```

---

### Objective:

Validate a sequence of PIN attempts until the correct PIN (`1234`) is entered.

---

### Rules:

* Iterate through all PIN attempts
* Correct PIN is `1234`
* Count attempts until correct PIN is found
* Stop immediately when correct PIN is encountered
* Return number of attempts used

---

### Input:

* `int[] pins`

---

### Output:

* Integer attempt count

---

### Examples:

| Input              | Output |
| ------------------ | ------ |
| [1111, 1234]       | 2      |
| [1234]             | 1      |
| [0000, 9999, 1234] | 3      |

---

### Edge Cases:

* Correct PIN may appear first
* Multiple invalid attempts before success
* PIN is guaranteed to appear in input

---

# Question 3 - Sum Until Zero

## Function:

```java
exercise3_sumUntilZero(int[] numbers)
```

---

### Objective:

Compute the sum of numbers until a stopping value (`0`) is encountered.

---

### Rules:

* Iterate through array sequentially
* Add values to total sum
* Stop processing when `0` is encountered
* Do NOT include `0` in the sum

---

### Input:

* `int[] numbers`

---

### Output:

* Integer sum of values before zero

---

### Examples:

| Input        | Output |
| ------------ | ------ |
| [5, 3, 2, 0] | 10     |
| [1, 2, 3, 0] | 6      |
| [0]          | 0      |

---

### Edge Cases:

* Zero may appear first
* Negative numbers are valid before zero
* Always stop at first zero occurrence

---

# Question 4 - Number Printer

## Function:

```java
exercise4_numberPrinter(int n)
```

---

### Objective:

Print numbers from `1` to `n`, excluding multiples of 5.

---

### Rules:

* Use a `for` loop
* Iterate from 1 to n inclusive
* Skip numbers divisible by 5
* Return values as comma-separated string

---

### Input:

* Integer `n`

---

### Output:

* Comma-separated string of valid numbers

---

### Examples:

| Input | Output                   |
| ----- | ------------------------ |
| 10    | "1, 2, 3, 4, 6, 7, 8, 9" |
| 5     | "1, 2, 3, 4"             |
| 3     | "1, 2, 3"                |

---

### Edge Cases:

* n less than 5
* Exact multiples of 5 excluded
* Proper comma formatting required

---

# Question 5 - Password Checker

## Function:

```java
exercise5_passwordChecker(String[] attempts)
```

---

### Objective:

Validate password attempts with a maximum limit of 3 tries.

---

### Rules:

* Maximum allowed attempts: 3
* Correct password is `"secret"`
* Stop immediately when correct password is found
* Return `"Access granted!"` if successful
* Otherwise return `"Access denied"`

---

### Input:

* `String[] attempts`

---

### Output:

* Access result string

---

### Examples:

| Input                          | Output            |
| ------------------------------ | ----------------- |
| ["wrong", "secret"]            | "Access granted!" |
| ["wrong1", "wrong2", "wrong3"] | "Access denied"   |
| ["secret"]                     | "Access granted!" |

---

### Edge Cases:

* Success on first attempt
* More than 3 inputs provided (only first 3 count)
* No correct password found

---

# Question 6 - Even Numbers

## Function:

```java
exercise6_evenNumbers(int n)
```

---

### Objective:

Extract all even numbers from 1 to n.

---

### Rules:

* Use a loop from 1 to n
* Use `continue` to skip odd numbers
* Collect only even numbers
* Return comma-separated string

---

### Input:

* Integer `n`

---

### Output:

* Comma-separated even numbers

---

### Examples:

| Input | Output       |
| ----- | ------------ |
| 8     | "2, 4, 6, 8" |
| 5     | "2, 4"       |
| 2     | "2"          |

---

### Edge Cases:

* n less than 2
* No even numbers available
* Correct formatting required

---

# 💡 Key Developer Tips

* Always define loop stopping conditions clearly
* Avoid infinite loops at all costs
* Track counters carefully
* Use `break` only when necessary
* Use `continue` to skip unwanted values
* Handle arrays safely
* Pay attention to formatting rules
* Test edge cases manually

---

# 🚀 End Goal

By completing this module, you should:

* Understand all loop types deeply
* Control program flow effectively
* Process arrays confidently
* Build correct iteration logic
* Handle real-world sequential problems
* Strengthen algorithmic thinking
* Prepare for data structure complexity

---

# 🏆 Success Mindset

Loops are one of the core building blocks of programming.

They power:

* Data processing systems
* Backend APIs
* Game loops
* Automation scripts
* AI training pipelines

Master loops thoroughly — everything else in programming builds on them.
