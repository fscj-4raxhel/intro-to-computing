# Computing Fundamentals
Computer science is the study of computer hardware, algorithm and data structure and how these three components work together to provide information systems.

Algorithm is a clearly defined sequence of steps to achieve some goal.

We need a programming language as a medium to discuss these concepts and to build a fundation on top of which the computer science career can be built. In this course we choose Java because its features are deemed good practices and the concepts are transferable.

Computers are general purpose machines that are programmable. General purpose machines can perform many tasks as opposed to single purpose machines like vehicles or coffee machines which can do only one type of task. Computers work on data, (facts, figures and ideas) and synthesize data into information (reports, summaries, and animations).

## Brief history of computing
The notion of computing origined at counting followed by a sequence of innovative concepts and tools such as arithmetic, simple machines like abacus and Napier's bones for logarithmic tables.

The first computer, though it's purely mechanical instead of electronic, was invented by Charles Babbage and called difference engine. It was part of a larger project sponsered by the British Government which was not finished partially due to the personality of Charles. It was deemed to be a computer because it has means to input and output and program. Ada Augusta King was deemed the first programmer because she was very interested in the difference engine after her mom introduced her to Babbage.

In 1940s, German mathematician John Von Neumann defined the stored program concept which is essential to the notion of a computer. A machine is programmable means that it has memory in which instructions are stored and which can be modified.

### The four generation of computers
Each generation was characterized by the technology used for the electronical switches.

1st Gen, 1944--58, uses vaccum tubes.

2nd Gen, 1959--1963, uses a solid state device named transistor.

3rd Gen, 1964--70, uses integrated circuit which is a solid state device on which the entire circuit, the transistor and the connections between them can be created.

4th Gen, 1971--now, VLSI very large scale integration.

## Computer system
A computer system consists of five parts: user(s), software, procedures, hardware, and data.

- The user is the individual that will be using the computer to produce the results. He/She is typically not trained in computer science but liked to be trained to use a computer.
- Software is the program (along with its documentations and websites) that allows the computer to  perform certain tasks. Programs are algorithms expressed in programming languages.
- Procedures are the steps that the user must follow to use the software. This is usually described in documentation either in prints or online.
- Hardware is the physical mahcine where the software runs.
- Data are facts, figures, ideas that an software uses to produce information.

All five parts work together to produce meaningful outcomes.

### Four categories of computer hardware
Although the following categorization is somewhat subjective and overlaps, computers are typically divided into four categories:
- Tables: Very mobile but less powerful
- Laptop: Heavier to carry around but more powerful
- Desktop: Movable but not too often, powerful enough
- Server: Not mobile at all but very powerful

### Five componnets of compter hardware
Despite that computers come in different sizes and powers, they function in the same way and are composed of the same categories of hardwares.
- CUP, the central processing unit, is the heart/brain of the computer that contains the circuits that allows the computer to do the calculations and follow the instructions of the program. It consists of the Control Unit that is responsible for the controlling the components of the computer and follows the instructions of the program and Arithmetic/Logic Unit that performs the calculations and logical comparisons.
- Main memory or RAM(Random Access Memory) stores the data, program instructions, the produced data and results. RAM is volatile meaning it losts the data when the power is off.
- Input device transfers the real-world representation of the data into data that the computer understands. Examples include keyboards, microphones, touch screens, scanners
- Output device transfer the data representation of the computer to the real-world representation. Examples include, monitors, printers, speakers.
- Auxiliary storage device are non-volatile storage devices for long-term memory. For exmaple, disks, CD, DVD, flash drives.

Communication devices are not traditionally included as the five essential components of a computer but nowadays almost every computer has communication devices.

## Data representation
Any data stored in a computer must be binary because the hardware that make up a computer are basically electronic switches. A switch is called a bi-stable device because it has two states: open (no current flowing) or close(current flowing). Since memory is comprised of switches, data stored in memory must be represented in two states which is mathematically a binary (number system).

Positional number system writes a number as a sequence of digits with digits at different positions having different values. Both decimal and binary number systems are positional number systems. To distinguish the two, the name bit (binary digits) is used. So a bit is essentially either 0 or 1.

In general, n bits can represent $2^n$ values. Here are some examples:
$2^4 = 16$, $2^8=256$, $2^{16}=65,536$, $2^{32}=4,294,967,296$.

8 bits is called a byte and it is the basic nuit of storage in computers. One million byte is a megabyte and one thousand megabyte is a gigabyte.

Memory is divided into cells and each cell is labeled by a binary number called address to distinguish different cells. At any point of time, each cell can only hold an unique value which can be read by the program. If the program modifies the value of a memory cell, this is that the program stores data into a memory cell. To store values into computer memory, the data must be digitalized, which means encoded into binary strings in some way.

## Computer Software
Computer software is is often divided into two categories: system software and application software.

### System software
System software is primarily consists of the OS (Operating System) that manages the resources of the computer system. It is responsible for getting things started and presenting the user the UI (User Interface). But the OS is a software in nature, so it does not have the capacity to load itself to the RAM and run. In fact, there is a simple program called boostrapt loader which was loaded, by manufacture, in a special kind of non-volatile memory called ROM(Read-Only Memory). When the computer first starts, the control unit (one major part of CPU) fetches instructions from ROM which in turn fetches the instructions of the OS from hard drive to RAM so that it can run.

The OS then checks out for the system to make sure that all components are functioning correctly and then presents the UI (User Interface) to the user. This UI is so-called Desktop which mimics the office desktop. Like we have different items on our office desktop, we have icons that symbolize the hard disk, file folders and applications on a computer desktop.

The OS supports the application software in many was. For example, if the user clicks the icon for a work processor, e.g. Microsoft Word, it is the OS that loads the program from hard drive to RAM so that its instructions can be fetched into CPU. When s/he opens a file, the OS is responsible for locating the file and loaded into the RAM. Next, the user edits the file, the modification of the data was still in memory, hence not serialized into hard drive until s/he clicks the Save button. Then the application software again asks the OS for help to save the updated data to hard drive.

When the computer is to shut down, the OS makes sure that all data that need to be remembered are stored safely in the hard drive before it actually shuts down. IF an operating system is a person he is a steward.

### Application Software
Application software works with the OS to apply the computer to the specific tasks. We have seen the word processing application that focuses on text editing as an exmaple in the previous section. Also from Microsoft, there are spreadshet application Excel that works on numerical data. There are database software, DBMS database management system, from various companies. The point is that the limiting factors of the kinds of application software are programmers' imagination and market conditions.

The users of application software are not necessarily computer scientists but they need to be very competent with the domain knowledge, the knowledge in the area where the the application is specialized.

## Software Development
Developing software (someitmes called software engineering) is to study a real-world problem and then design and develop a program to apply computer to solve that problem. Remember that a program is an algorithm expressed in programming languages. And an algorithm is a clear set of steps to achieve certain goals so it has to be unambiguous and finite, which means that it states clearly what must be done and it terminates in finite time.

### Software Engineering
Developing large-scale software systems can be extremely complex and often takes teams of progressional software engineers. The approaches to software engineering may vary a lot but there are common phases of software engineering. There are analysis, design, coding, testing, debugging, production and maintenance phases.

- Analysis phase is to develop a requirements specification that clearly indicates what is (and sometimes what is not) required of the system. A fabulous system that does not fulfill the requirement is waste of effort.
- Design phase is the determination of an approach to solve the problem. This often involves breaking the problem into smaller and more manageable pieces by the senior member of the team. This allows the solution to complete in reasonable time.
- Coding phase is to express an algorithm in a certain programming language. This is the fundation without which any other phases can not be carried out.
- Testing phase is to ensure the system upon completion does what is required. This is the most overlooked phase of development. Each part of the system, starting from the individual pieces developed by the programmer, must be tested to see that it functions according to the requirements.
- Debugging phase is to correc the problems with the program when it doesn't perform as expected. Errors may root at not understanding what is actually required, not fulling understanding the details of the programming language, invalid assumption or oversight of the algorithm, etc. As human beings, making mistakes is inevitable. Debugging phase is when we fix our errors and get the system right.
- Production phase is to release the software to its users. We are at least convinced that the program is doing what it is intended to do.
- Maintenance phase is to re-analyze, re-design, re-code the system resulting in new versions. The driving forces include undetected bug, change in requirements, hardware upgrade, etc.