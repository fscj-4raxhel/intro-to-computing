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