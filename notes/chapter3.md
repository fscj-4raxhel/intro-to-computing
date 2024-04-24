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

## Methods with parameters
In the previous section, we imporved code resuability by centering the hexagon at the current position of the turtle, which is great. In this section, we will generalize that code and make it useable for drawing hexagon of different sizes. To achieve this goal, we need help from a parameter. `Turtle.forward(length);` is an exmaple of it. Similar to the `length` parameter specifying the length that the turtle should advance, we can use a `radius` parameter to specify the size of the hexagon to draw.
### Parameter List
A parameterized method declaration takes the following form in Java.
```java
modifiers void methodName (type paramName, ...)
{
body
}
```
Hence we can change the `drawHexagon()` method into:
```java
/**
 * This is a parameterized version of the drawHaxagon method
 * 
 * @param radius radius of hexagon
 */ 
    private void drawHexagon(double radius) {
        double side;    // exterior angle between sides of hexagon
        double angle;   // length of side of the hexagon
        angle = PI / 3;
        side = 2 * radius * sin(PI / 6);
        
        yertle.forward(radius);
        yertle.right(PI / 2 + PI / 6);
        yertle.penDown();
        for (int i = 0; i < 6; i++) {
            yertle.forward(side);
            yertle.right(angle);
        }
        yertle.penUp();
        yertle.left(PI / 2 + PI / 6);
        yertle.backward(radius);
    }// drawHexagon
```
As shown in the code snippet above, the formal parameter `radius` is used in the method body just as a local variable. They are also the same in terms of the lifespan. i.e. formal parameters lost their value after the method terminates just as the local variables. The only difference between thet two is that the value of formal parameters are passed in at method call time. That is why we can use `radius` in the method body without an assignment statement to initialize its value.

- Formal parameters, or simply parameters, are the variables declared in the method header. They are the receiving parameters.
- Actual parameters, or arugments, are the expressions passed in method call.

Java enforces that a method with no (formal) parameters invoked with no arguments (actual parameters); a method with one parameter invoked with one argument and so on. In addition to this one-to-one mapping, the type of corresponding argument must be compatible with the formal parameter.

### Drawing a Beach Umbrella
See code in `src/lectures/chapter3/Umbrella.java`.

### Memory Model
Memory model is a diagram that visualizes what is happening in a particular point in the exectuion of the program. This kind of abstraction helps with analysis of the program.

In those diagrams, an object or active method (begun but not yet terminated) are represented by rounded rectangles labeled by the their names. Within rounded rectangle of an object, there are rectangles representing the instance variables with the variable names as labels. Similarly, within active methods, these labeled rectangles represent the formal parameters and local variables.

When the program referes to a name, it starts the search from the inside out. e.g. If we are looking for the `radius` variable in the `drawHexagon` method, we would search that rounded rectangle box first. If it's not found, we will search the encompassing box in this case is the `Umbrella` box.