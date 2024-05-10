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