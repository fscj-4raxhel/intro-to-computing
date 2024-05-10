# Controle Structures

## While Loop
A `while` loop is also called an indefinite loop or conditional loop because we cannot predict the number of time it repeats. In Java, a `while` loop is represented by the `while` statement as shown before.

The `boolean operation` that the ALU is good at performing is named after English Mathmetician George Boole.

The semantics of a `while` loop is very close to the code read in English. i.e. repeat the loop body while the `expression` is true.

## The For Loop
The previous examples of `for` loops are called the iterative for loop, provides a definite loop on for which the number of loop iteratons is known. But the `for` statement in Java is more generalized as follows:

```java
for (forInit_opt, forCondition_opt, forUpdate_opt){
    statements
}
```
The equivalent `while` loop is the following:
```java
forInit_opt;
while ( forCondition_opt ){
    statements
    forUpdate_opt;
}
```

And since the equivalence of `for` loop and `while` loop, many programmers, especially who raised on C, use `for` loop as a shorthand of `while` and in many other cases avoid this practice.

## The If Statement
The execution of a program often branches based on some decisions make out side of the program such as user input. This decision structure is represented in Java as `if` statement which takes two forms, namely `if-then` and `if-then-else`.

The form of `if-then` is this:
```java
if (expression){
    statements
}
```
If the `expression` is `true` the `then-part`, which is the statements in braces, are exectued otherwise the statement follows the closing `}` is exectued.

The form of `if-then-else` is this:
```java
if (expresssion){
    statements_1
}
else{
    statements_2
}
```
If the condition is `true` the `then-part` which is `statements_1` is exectued. Otherwise, the `else-part` which is `statements_2` is executed.

## Other Control Structures
There are two additional loop structure in Java, `do` statement and `for-each` loop. A `do` statement performs a post-test loop where the loop condition is checked after the loop body. Thus the loop body is executed at least once. The `for-each` loop will be discussed in Chapter 8.

The for of `do` statement is this:
```java
do{
    statements
}while(expression)
```

As a comparison, the `while` statement performs a pre-test where the loop condition is checked before the loop body so the loop body is executed zero or more times. There is another type of loop called in-test loop where the loop condition is checked in the loop body. Java does not support in-test loop out of the box but we can emulate by combining the `break` statement and `if` statement in a for loop. For example in the following form:
```java
for(Loop_init){
    statements
    if(!Loop_condition){
        break;
    }
    statements
}
```
Java also supports multi-branching statement called `switch-case`. In languages does not suuport multi-branching statement, for example Python, it has to be emulated with the cascading if-else-then statements.

The form of `switch-case` is this:
```java
switch expression {
    case value1: {
        statements_1
        break;
    }
    case value2: {
        statements_2
        break;
    }
    ...
    default: {
        statements_i
        break;
    }
}
```