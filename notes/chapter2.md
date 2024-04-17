# Java Programs
Java like any high-level programming language is defined for a specific purpose -- write computre programs. So it has grammatical rules that everyone involved in Java, from compiler writer to programmer, must follow. They must have a clear understanding of the rules.

Recall that a program express an algorithm, a procedure of doing something, as a series of steps, or statements, in certain programming language, which in our case is Java. Programmers reuses code and open perform actions repeatedly. There are means to facilitate both needs.

## Java
Java is well known for its platform independence, a.k.a. "write once run anywhere". This feature rooted at the early design criterion. Back to the early 90's, Java was designed for embedded systesm, especially the set-top box for interactive TV. Those systesm undergo change of processor in response to change in market conditon. So platform independence was very reasonable design choice.

Java happend to come along at about the same time as the World Wide Web. Using a plaform independent language HTML, a web-browser can run on any machine and download and display the web pages from server described by the HTML. Soon after, people find that dynamic pages wich which the users can interact are more interesting. There was a call for a programming language that can run in the browser. A special kind of Java program called Applet was the perfect fit for it. It earned Java a lot of interests and hype.

We choose Java not because of interesting web programming or embedded programming. We choose Java because it's a modern language that supports the object-oriented paradigm of programming and its design is simple and safe comparing C++.

In object-oriented programming, we use object to represent real-world entities and design the system to model its real-world counterpart.

### Drawing a Square
Drwaring a Square with the famouse Turtle graphics package oringally for Logo. See code and in `src/lectures/chapter2/Square.java`.

## Turtle Graphics
The turtle graphics package was first intorudced with the language Logo. There are turtles, `Tutle` object, each having a pen and move on the canvas, the `TurtleDisplayer` object. So when the pen was down while a turtle moves, a line was drawn.

Full description of this packe please refer to the library documentation. `Square.java` is a quick demonstration of drawing a squre with one turtle.

## Repetition (Loop)
The for statement, one kind of loop construct, in Java looks like the following:
```java
for (initialization; termination;
     increment) {
    statement(s)
}
```
As we can see, there is the `for` keyword leading a pair of parentheses `()` containing three expresssions splitted by semicolon `;` followed by the loop body embodied by a pair of curly braces `{}`.

Usually, a special variable called loop index is involved in for loops. The loop index was commonly initialized in the `initialization` express, checked in the `termination` expression and modified by the `increment` expression. So the execution of a for loop is as follows:

First, the initialization is executed in the begining of the loop structure, unconditionally.

Second, the termination express was evaluted. If it is `false`, the for loop ends. The program jumps to the statement right after the for statement. Otherwise, the loop body was exectued for at least once.

Third, as long as the program reached the loop body, all `statement(s)` in the loop body will be executed followed by the evaluation `increament` expression.

Fourth, the `termination` expression is evaluated again. So basically, go back to second step.

See `src/lectures/chapter2/Hexagon.java` for an example and compare the code with `Square.java` to see how for loop helps programmer avoid code redundancy.

## Composition (Nesting)
Many complext pattern are composed of repetition of a sub-pattern. A honeycomb, for example, is composed of six hexagons. To produce the honeycomb, we use the code that creates a hexagon repetitively. In other words, we embed an algorithm to create a new algorithm. We call this way of creating new algorithms composition.

The algorithm to create a honeycomb embeds the algorithem to create a hexagon as the inner loop. The other loop is responsible for moving the turtle to the starting point and the inner loop is responsible for drawing the hexagon.

This algorithem is expressed in Java in `src/lectures/chapter2/Honeycomb.java`. Note that at the end of the constructor, there are two lines of code that reset the position of the turtle to its original position. The pen was up in the last iteration of the loop. So this position resetting has no visual effect. Why do we bother? That is because we don't want to lose track of the turtle. Suppose that drawing a honeycomb needs to be embedded into a even more complex patter. Without knowing the position of the turtle, it's very hard if not impossible to continue to the next honeycomb.

## Classes and Objects
Classes are fundamental building blocks of object-oriented programming. Each class represents some kind of real-world entity. A Java program is a collection of classes, writtent by the author or imported from the library.

In Java, we write class declarations, code to be compiled. In other words, all code we write will be contained in some class. A class declaration defines a collection of possible objects. Objects interact with eacho other to perform the task of the program.

An object is also called an instance of the class from which it is created. The object creation expression is in the following form:
```Java
new ClassName(...) //creation expression
```
This expression gives an object of the class `ClassName`. We now have the object but how can we refer to it? It doesn't have a name yet and it's not convenient. So let's give it a name.

A variable identifier, or variable in short, is a name we give to the newly created object to keep track of it. Java has its rules on identifiers. Additionally, there is a list of reserved words that Java compiler recognizes out of the box. They have their specific meanings and programmers cannot use them as identifiers. They are already in use by the JVM.
Any other names must be declared/defined before use.
```Java
private ClassName VariableName; // field declaration
```
To remember something in variables, we use the assignment statements.
```Java
Variable = Expression; // assignment statement
```
Now we can create an object and give the newly created object a name `o` with the following statement
```Java
o = new ClassName(...);
```
As stated before, we use object to perform actions and we achieve that through method call statements as follows:
```Java
Object.MethodName(Arguments); // method call statement
```
Arguments provide additional information required to perform the action.