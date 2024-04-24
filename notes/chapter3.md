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

### Method Execution
When a method is invoked within some code, the code was suspended and the execution of the method body starts (pushed into the call stack). Once the last statement of the method body is exectuted (popped out of the call stack) the exectution of the code containing the method invocation resumes. The statements of the method are executed by the object on teh call method.

Method declarations do not stand along. They are always part of a class. In fact, a class declaration is a collection of other declarations include constructor declarations, instance variable delcarations, and method declarations.

### Centering the Hexagon
To write easy to (re-)use code we need to think out of the box. That means we need to think about how the caller code would use the method we are about to write. For example, previously, the code we write to draw a hexagon starts drawing from the postion where the turtle currently resides. There is no complaint if the task is to draw one hexagon and one only.

Issues arise, however, when the acutal task is to tiling a space with hexagons. It would be the caller's responsibility to figure out how wo move the turtle to the next starting point. The problem is that if the drawHexagon was implemented this way, it complicated the math on the caller side. It would be much better if our code draw a hexagon centered at the turtle's current location.

See `src/lectures/chapter3/Hexagon2.java` for how to center it.

Note the use of some local variables, `radius`, `angle`, `side`. They exist only when the method is exectuing and they help with avoid repeatedly compute the same value over and over again. Instead, the program computes the values once and store them in to variables. Later down the road, when the values are needed, the program simply retrieves the values.