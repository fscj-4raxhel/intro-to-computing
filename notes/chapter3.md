# Methods
In this chapter we will learn: method declarations, method invovation, parameterized methods, and functions.

## Methods and abstractions
As the problem gets larger and larger, composition by nesting gets harder and harder to manage. We need a mechanism to address code reuse issues much better than nesting loops.

Abstraction, is an important and common way to deal with complexity in programming. The first and simplist form of abstraction in computer science is the use of procedural abstraction -- ignoring details and differences and focusing on similarities.

A method, a.k.a. procedure in other programming languages, is a named sequence of instructions that can be referenced in other places in the program through method invovation statements.

### Drawing Two Squares
The method declaration consists of two parts: the method header, the abstraction about what the method does; and the method body, the details about the sequence of instructions.

```java
private void methodName() //method header
{
// method body
}
```

A method looks alike a constructor unsurprisingly because a constructor is a special kind of method to be used at object creation time.

See `src/lectures/chapter3/TwoSquare.java` for a demonstration of using method as an abstraction of drawing a square.

Note the method calls in line `24` and `26` do not include an "caller" `Object`. In other words, unlike in `yertle.forward();` the caller object is missing. This is because this is a call to a method of the object itself. In Java, `this` keyword refers to the object that is executing the statement and is implicit whenever the `Object` is omitted in a method call. In explicit form line `24` is `this.drawSquare();`