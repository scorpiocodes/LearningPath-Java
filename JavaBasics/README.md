# JAVA BASICS

When we consider a Java program, it can be defined as a collection of objects that communicate via invoking each other's methods. Let us now briefly look into what do class, object, methods, and instance variables mean.

* Object − Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.

* Class − A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.

* Methods − A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.

* Instance Variables − Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.

# BASIC SYNTAX

About Java programs, it is very important to keep in mind the following points.

* Case Sensitivity − Java is case sensitive, which means identifier Hello and hello would have different meaning in Java.

* Class Names − For all class names the first letter should be in Upper Case. If several words are used to form a name of the class, each inner word's first letter should be in Upper Case.

Example: class MyFirstJavaClass

* Method Names − All method names should start with a Lower Case letter. If several words are used to form the name of the method, then each inner word's first letter should be in Upper Case.

Example: public void myMethodName()

* Program File Name − Name of the program file should exactly match the class name.

When saving the file, you should save it using the class name (Remember Java is case sensitive) and append '.java' to the end of the name (if the file name and the class name do not match, your program will not compile).

But please make a note that in case you do not have a public class present in the file then file name can be different than class name. It is also not mandatory to have a public class in the file.

Example: Assume 'MyFirstJavaProgram' is the class name. Then the file should be saved as 'MyFirstJavaProgram.java'

* public static void main(String args[]) − Java program processing starts from the main() method which is a mandatory part of every Java program.
