# 📘 Module 11: Wrapper Classes, Collections & Enums

---

## Learning Outcomes Assessed

* Wrapper Classes
* Null Safety
* Autoboxing / Unboxing
* ArrayList
* HashMap
* Data Filtering
* Frequency Counting
* Enum Usage
* Type Safety
* Structured Data Management

---

## Module Structure

This module contains:

### Coding Practice:

Complete all functions inside:

```java id="r8m4qv"
CollectionsExercises.java
```

You will also work with:

```java id="x3v7pk"
Day.java
Grade.java
```

---

## Your Task

For this module, you must:

* Understand primitive wrapper classes
* Handle `null` values safely
* Work with dynamic lists
* Store structured key-value data
* Use enums professionally
* Build cleaner modern Java logic
* Return exact required outputs
* Pass all tests successfully

---

## Your Goal

For each function:

* Use valid Java syntax
* Apply proper collection logic
* Handle edge cases
* Avoid runtime errors
* Follow exact return formats
* Use appropriate data structures
* Ensure all unit tests pass

---

## How to Run Your Tests

### Run all tests:

```bash id="k4v9tx"
mvn test
```

### Run module tests:

```bash id="n7m2qw"
mvn test -Dtest=CollectionsExercisesTest
```

---

# 🧠 Core Java Data Concepts

---

# 🔹 Wrapper Classes

Java primitives are basic data types:

* int
* double
* boolean

Wrapper classes convert them into objects:

* Integer
* Double
* Boolean

---

### Example:

```java id="p5x8vr"
Integer x = 5;
```

---

### Why They Matter:

Wrappers allow:

* Null values
* Collection storage
* Object-based APIs
* Utility methods

---

### Important:

Wrappers can be `null`, unlike primitives.

---

# 🔹 ArrayList

`ArrayList` is a dynamic array that can grow or shrink.

---

### Example:

```java id="m3v7zp"
ArrayList<Integer> numbers = new ArrayList<>();
```

---

### Benefits:

* Flexible size
* Easy iteration
* Built-in methods
* Better for dynamic datasets

---

# 🔹 HashMap

Stores data as key-value pairs.

---

### Example:

```java id="q8m4xt"
HashMap<String, Integer> scores = new HashMap<>();
```

---

### Benefits:

* Fast lookups
* Organized structured data
* Frequency counting
* Real-world mapping systems

---

# 🔹 Enums

Enums represent fixed known values.

---

### Example:

```java id="t2v9pk"
MONDAY
TUESDAY
```

---

### Benefits:

* Safer than strings
* Prevent invalid values
* Cleaner code
* Better readability

---

# 🧪 Project Structure

```plaintext id="y7x4mq"
module11/
├── CollectionsExercises.java
├── Day.java
├── Grade.java
├── tests/
│   └── CollectionsExercisesTest.java
└── README.md
```

---

# Question 1 - Wrapper Sum

## Function:

```java id="c8m3vq"
exercise1_sumWrapper(Integer a, Integer b)
```

---

### Detailed Objective:

Create a method that safely adds two `Integer` objects together.

This exercise teaches:

* Wrapper handling
* Null safety
* Defensive coding

---

### Rules:

* If either value is `null`, treat it as `0`
* Return total sum

---

### Examples:

| Input        | Output |
| ------------ | ------ |
| (5, 10)      | 15     |
| (null, 7)    | 7      |
| (null, null) | 0      |

---

### Edge Cases:

* Both null
* One null
* Negative values

---

# Question 2 - ArrayList Filter

## Function:

```java id="w5v8pk"
exercise2_filterEven(ArrayList<Integer> list)
```

---

### Detailed Objective:

Filter a list of integers and return only even numbers.

---

### Rules:

* Preserve original order
* Include numbers divisible by 2 only

---

### Examples:

| Input     | Output  |
| --------- | ------- |
| [1,2,3,4] | [2,4]   |
| [5,7]     | []      |
| [2,4,6]   | [2,4,6] |

---

### Why This Matters:

Filtering data is foundational in software systems.

---

# Question 3 - ArrayList to String

## Function:

```java id="z4m7qx"
exercise3_listToString(ArrayList<Integer> list)
```

---

### Detailed Objective:

Convert an integer list into a comma-separated string.

---

### Rules:

* Format cleanly
* Preserve order
* No extra commas

---

### Examples:

| Input   | Output  |
| ------- | ------- |
| [1,2,3] | "1,2,3" |
| [5]     | "5"     |
| []      | ""      |

---

### Developer Focus:

String formatting is essential for:

* Reports
* Logging
* APIs
* User interfaces

---

# Question 4 - HashMap Lookup

## Function:

```java id="f9v3tr"
exercise4_mapLookup(HashMap<String, Integer> map, String key)
```

---

### Detailed Objective:

Safely retrieve a value from a map.

---

### Rules:

* Return matching value
* If key missing → return `-1`

---

### Examples:

| Input        | Output |
| ------------ | ------ |
| {"A":1}, "A" | 1      |
| {"A":1}, "B" | -1     |

---

### Why:

This simulates real-world data retrieval systems.

---

# Question 5 - Count Frequencies

## Function:

```java id="j6m8qp"
exercise5_countFrequencies(ArrayList<String> words)
```

---

### Detailed Objective:

Count how many times each word appears.

---

### Rules:

* Return `HashMap<String, Integer>`
* Each word = key
* Frequency = value

---

### Example:

| Input                      | Output                 |
| -------------------------- | ---------------------- |
| ["apple","banana","apple"] | {"apple":2,"banana":1} |

---

### Real-World Applications:

* Search analytics
* Word frequency
* Logs
* Data science preprocessing

---

# Question 6 - Enum Day Type

## Function:

```java id="h4v7zx"
exercise6_dayType(Day day)
```

---

### Detailed Objective:

Determine whether an enum day is a weekday or weekend.

---

### Rules:

* MONDAY–FRIDAY → `"Weekday"`
* SATURDAY–SUNDAY → `"Weekend"`

---

### Examples:

| Input    | Output    |
| -------- | --------- |
| MONDAY   | "Weekday" |
| SATURDAY | "Weekend" |

---

### Why:

Enums improve reliability compared to raw strings.

---

# Question 7 - Enum Grade Description

## Function:

```java id="n3m9qc"
exercise7_gradeDescription(Grade grade)
```

---

### Detailed Objective:

Convert academic grades into readable performance descriptions.

---

### Rules:

* A → Excellent
* B → Good
* C → Average
* D → Poor
* F → Fail

---

### Examples:

| Input | Output      |
| ----- | ----------- |
| A     | "Excellent" |
| C     | "Average"   |
| F     | "Fail"      |

---

### Real-World Use:

* School systems
* Reports
* Performance dashboards

---

# 💡 Key Developer Tips

* Always check for null wrappers
* Collections are object-based
* ArrayLists preserve order
* HashMaps provide fast lookup
* Enums reduce invalid inputs
* Use loops carefully
* Think about scalability
* Build reusable logic

---

# 🚀 End Goal

By completing this module, you should:

* Work with wrapper classes confidently
* Handle null safely
* Manipulate ArrayLists effectively
* Use HashMaps for structured data
* Build frequency counters
* Use enums professionally
* Strengthen enterprise Java foundations

---

# 🏆 Success Mindset

Modern software development depends heavily on collections, structured data, and safe design.

Mastering this module prepares you for:

* Backend systems
* APIs
* Enterprise Java
* Data processing
* Automation
* Real-world application development

This module is a major step toward practical software engineering.
