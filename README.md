
---

## **FizzBuzz - Java Implementation**

### **Overview**
This Java application implements the classic FizzBuzz problem in a scalable and flexible way. The program outputs numbers from 1 to 100, but for numbers divisible by 3, it prints "Fizz", and for numbers divisible by 5, it prints "Buzz". If a number is divisible by both 3 and 5, it prints "FizzBuzz".

The solution uses an object-oriented approach, where the rules for divisibility (e.g., by 3 for "Fizz" or 5 for "Buzz") are stored in a list of `FizzBuzz` objects. This design allows you to easily add or modify rules for different divisors without changing the main logic of the program.

### **Key Features**
- **Scalability**: Easily add new rules (e.g., for divisibility by 7, 11, etc.) by creating new `FizzBuzz` objects.
- **Clean Code**: The program is designed following clean code principles such as encapsulation, single responsibility, and readability.
- **Flexibility**: Supports dynamic addition of rules and works within a range of numbers.

### **Project Structure**
- **Main.java**: The entry point of the program that contains the `main` method.
- **FizzBuzz.java**: A helper class that encapsulates the rule for divisibility (divisor) and the associated output string (e.g., "Fizz" for divisor 3).

### **Classes**
1. **Main**: 
    - Responsible for initializing the program, adding rules, and printing the result.
    - Loops through numbers 1 to 100 and applies the rules to print the appropriate output.

2. **FizzBuzz**:
    - Contains the logic for each divisibility rule.
    - Includes a divisor and the corresponding output string.

### **How to Run**
1. Clone the repository or download the files.
2. Open the `Main.java` file in your preferred Java IDE (e.g., IntelliJ, Eclipse).
3. Compile and run the `Main.java` file.

Alternatively, if you're using the command line:
```bash
javac Main.java
java Main
```

This will execute the program, printing the FizzBuzz results for numbers 1 through 100.

### **Example Output**
For numbers 1 through 15, the output will look like this:
```
1
2
Fizz
4
Buzz
Fizz
8
Buzz
Fizz
11
Fizz
13
14
FizzBuzz
16
...
```

### **How to Customize**
You can easily add new rules to the program by modifying the `fizzbuzzList` in the `Main` class. For example, to add a new rule for numbers divisible by 7:
```java
fizzbuzzList.add(new fizzBuzz(7, "Foo"));
```
This will output "Foo" for numbers divisible by 7.

### **Contributing**
Feel free to fork this repository and create pull requests with improvements or additional features.

1. Fork the repository.
2. Create a new branch for your feature.
3. Commit your changes and push to your fork.
4. Open a pull request with a description of the changes you made.
