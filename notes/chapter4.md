# Types and Expressions
Computers are very good at performing computations. Every thing a computer can do relies on digitalization which is the process to representing information in binary form.

## Numbers
Thanks to compilers, we human beings can work directly with decimals (10 based numbers), something that we are used to leaving the tedius work of dealing with binary number to the ALU.

In general, there are two tyeps of numbers, fixed-point and floating-point. Fixed-point numbers are exact values and roughly correspond to Integers in Mathematics. Floating-point numbers are approximations and correspond roughly to rational numbers.

### Numeric Types
In Java, there are four versions of fixed-point numbers, `byte`, `short`, `int`, `long` which takes 1,2,4, and 8 bytes respectively. The range of numbers each type can represent is then limited by the number of bytes, which is essentially the number of digits. We use the `int` tyep most frequently. `byte` and `short` are used when we need to process a large amount of numbers that are small in value. And `long` tyep is commonly used when the value is too large to fit in an `int` value. For example, the number of milliseconds needs to be stored in a `long` number.

`float` and `double` are approximations, `float` has 8 digits of precision while `double` has about 18. The precision limits comes from the fact that the actual number like a third 1/3 in math is indeed infinite. It has repeating digits infinitely. However, computers have finite memory. This difference is the root of accumulated round-off error where the sum of three 1/3 doesn't equal 1.0.

In some cases, exact arithmetic is required or very sensitive to precision, for example in finance or scientific programming. We need to use other libraries to address those needs. Keep in mind of that.

### Numeric Literals
Numeric Literals are explicity numeric values in a programm, such as `10`.

In Java, fixed-point numeric literals are sequence of decimal digits optionally preceded by a sign. If the value is within the range of `int` it is considered type `int` unless followed by letter `l` or `L` which makes it `long`. A value that is out of the range of `int` is considered `long`. There is no numeric literal for `short` or `byte`.

Floating-point literals are written as a sequence of decimal digits, optionally preceded by a sign and followed by either a decimal point and a number of additional decimal digits or an exponent (in e-notation) or both. Unless followed by letter `f` or `F`, the floating-point literal is considered as `double`.

## Expressions
Expressions are used in programming languages to represent numeric computations. The notations are similar to algebra.
- Identifiers are used as variables
- Numeric literals represent constant values
- operators represent operations

### Basic Java Operators
The basic arithmetic operators in Java are summerized as follows:

| Operator | Meaning       |
| -------- | -------       |
| `+`      | addition      |
| `-`      | substraction  |
| `*`      | mutiplication |
| `/`      | division      |
| `%`      | reminder      |

Note that the default division of two fixed-point numbers are integer division. For example, `5/2` results `2` with the reminder ignored.

### Order of Operations
When given an expression like `a - b / c`, what would be the right interpretation of this expression. As in algebra, there are rules of operator precedence that make the meaning clear. So does in Java. Each operation has a precedence level. Higher-level operators bind to the operands more tightly than lower-level operators. The same level ones bind the operand left to right.

Parentheses are used to group the operators and their operands.

### Modes of Arithmetic and Conversion
The ALU of the computer can only perform operations on values of the same type. The type involved in expressions is called the mode of the expression. When the types of the operands are not the same, the expression is called the mixed-mode expression and conversion is used to change the types of the values involved.

A widening conversion occurs when a value is converted into a "larger" type so there is no information loss. This can happen automatically as necessary following the order of operation. The widening conversion rules are summarized in the following table:

| From | To       | Method |
| -------- | ------- | ---- |
| `byte`     | `int`    | add high-order 0 digits
| `short`    | `int`    | add high-order 0 digits
| `int`      | `long`   | add high-order 0 digits
| `int`      | `float`  | add a 0 fraction part
| `int`      | `double` | add a 0 fraction part
| `long`     | `float`  | add a 0 fraction part
| `long`     | `double` | add a 0 fraction part
| `float`    | `double` | add low-order 0 digits to fraction

Note that `byte` and `short` are always converted into `int` before any calculation.

We can also explicityly direct the compiler to change the type. This process is called `cast`. Using `cast` we can do a "narrowing" conversion which may cause information loss for example, casting a `double` value into `int` loses the fraction part.

## Variables
Variables or variable identifiers are named storage of certain type. They are abstractions of the hardware level memory cells at the programming language level.

For each programming language, there are identifier rules and conventions. For example in Java, an identifier is the sequence of letters, numbers and `$` or `_`, starting with letters. There are also conventions of naming things. Fore example camelCase where the first word starting with all lower case while each subsequent word has a captial letter.

## Assignment Statement
The assignment statement is used to commit something to memory. There are two parts involed, the left-hand side, lhs and the right-hand side, rhs connected by the assignment operator `=`. The lhs is usually a variable which represents a memory location while the rhs is usualy numeric expression involves variables and literals and represents the computation.

### Assignment Compatibility
An assignemnt statement is said to be valid if the type of the rhs is assignment-compatible with the type of the lhs variable. The rhs is assignment-compatible with the lhs if:
- It is the same type
- It is the subtype of lhs (Inheritance in OOO. Will be discussed later)
- If it can be converted to the type of lhs using a widening conversion
If the type of the rhs is not assignment compatible the compiler raises an error message.

### Parameter Compatibility
The rule is the same as assignment statement with parameter being the lhs and arguments being the rhs. If their type are compatible parameters are passed. Otherwise, compiler indicates an error.