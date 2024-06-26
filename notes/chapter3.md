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

## Function methods
Function methods or functions in Java are methods that are like functions in mathematics. They are used to abstract computations or as accessor methods for classes.

`sin(angle)` is an example of function methods that we have seen.

To perform a procedure method, we write a method call statement while to perform a function method, we write a function call as (part of) an expression.

A function method declaration takes the following form:
```java
modifier type methodName(type paramName,...)
{
body    //function body
}
```
The `void` keyword in procedure method declaration was replaced by `type` which is the kind of value the function is computing. Also, since the purpose of a function is to produce some value, there must be a way from within the body to indicate the value. This is done through returen statements as follows:
```java
return expression; // return statement
```
A return statement consists of three parts, the `return` keyword and the expression that gives the return value followed by semicolon`;`. It does three things as well. It computes the value of `expression`; set it as the return value; and terminates the method. So the return statement is usually the last statement in function body.

### Patter of Method Call
Method or function, the pattern of steps exectuion is the following:
1. Arguments (expressions) are computed L --> R
2. Calling method is suspended
3. Values of arguments are assigned to parameters L --> R
4. Body of method is executed
5. Return value provided to calling method
6. Calling method resumes after point of call

## Testing and debugging with methods
Programs or even classes do not need to be written at once. Incremental implementation of code is recommended because it's easier to write and easier to debug.

We don't even have to write a method at once. Instead, we can write a method stub which is a substitution of a method with the required heard and a body consists of output strings that reflect that the method is called and display its parameters(arguments).

An example method stub for the `drawHexagon` method is the following:
```java
private void drawHexagon(double radius) {
    System.out.println("drawHexagon called with parameters:");
    System.out.println("radius: " + radius);
}// drawHexagon
```
The `System` class is a standard class like `Math` that provides access to system properties for example the system display console called `out`. In the method stub, we called a method of `out` called `println()` to display its argument on the console in one line. Note the `+` operator connecting two strings are concatenation instead of "adding" when it was used between two numerical values.

## Methods, Scope and Visibility
Having seen examples of mixed use of names, we need to understand the rules that Java imposes on resoluting a name.

The rules that sort out the (unique) meaning of a variable, method or class name are called scope rules. The converse of scope rules is the visibility rules which specifies where a variable can be used.

### Java Scope Rules
To determine which declaration of a name is being referenced within a piece of code, we follow the following steps:
1. Look for a declaration of the name in the for loop, method, or constructor in which the code resides. If one exists, this is the defining declaration. This rule applies to both formal parameter declarations and local declarations.
2. If no such defining declaration exists, apply step 1 again, looking in the immediately enclosing code unit which could be a for loop (with nested loops), method, constructor or the class itself. Continue until there is no enclosing unit. Usually in Java, there is only the for loop, method/constructor level and the class level to consider.
3. If no such declaration exists, check the public declarations of public classes from imported packages. This is how the names such as Turtle, forward, and PI that are imported from the Media or java.lang.Math packages are resolved.
4. If no such declaration exists, the name is undeclared and the reference is in error.

In an overly simplified version, find the closest `{}` that encloses a declaration of the refered variable. And that declaration is the meaning.

### Java Visibility Rules
The visibility rules are derived from the scope rules and, for Java, are:

1. A loop index declared in a for loop is visible only within the loop body and any nested for loops.
2. A local variable or formal parameter is visible only within the method in which it is declared.
3. An instance variable or method declared private within a class is visible within any constructor or method of that class, unless it is hidden by a local variable declared with the same name.
4. An instance variable, method or constructor declared public within a class is visible as in rule 3 but is also visible within any method or constructor of any class to which the declaring class is visible.

We want to keep the visibility of a variable as small as possible because that leads the code easier to manage.

### Declaring Names, Rule of Thumb
1. A for loop index should be declared in the for statement header.
2. A variable should be declared as a local variable if its value concerns only the single method or constructor.
3. A variable should be declared as a formal parameter if the behavior of the method depends on the value of variable.
4. A variable should be declared as a private instance variable if it is part of the state of the object and/or serves to coordinate the activity of two or more methods or constructors.
5. A method should be declared as private unless it is to be used by code in other classes.
6. A constructor is usually declared as public since objects of the class will be created by code in other classes.

Of course these are just guidlines. As we learn more about programming, we will break some of the "rules". For example, there is a design pattern called singleton where we want to make sure there is only one instance of a class ever been created during the program runs. We can achieve this by making the constructor private and provide the object before it's needed.