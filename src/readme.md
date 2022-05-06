# Java Learning

Learning basic concepts of the Java language

Book: Head First Java

## Pros of Java

OOP, Portability (write once, run anywhere) and memory management.

## Fundamentals of Java Language

Java is Strongly typed language.
Multiple open source JDK's are available to run java code that include JVM.
Java Compiler checks the code first and then generates a .class file which is a java byte code that the JVM understands and is able to execute on any platform.
Thus write once use anywhere language
Java apps are a bunch of java class files, which are used to make objects and a main method in anyone of those classes is used as an entry point for the code execution.

## Static Keyword

When we use static keyword with a method in a class, they don't use instance variable or members from the class. Their behavior is entirely dependent upon the the argument passed to them. And thus, they don't need to be instantiated similar to an abstract class.
Usually, static method classes have their constructors marked as private. And thus we cant use new on them to make an instance of the class. For example: Math.round()

Thus keyword static let a method run without an instance of the class.

public static int min (int a, int b{
//returns the lesser of the two parameters, and doesn't use any non static members in the method
})

### Static methods can not use non-static instance variables in their body

The compiler doesn't know which instance variable to provide in a static method, as they are called on the class and not any reference variable aka instance of the class.

### Non static methods

They usually use instance variable state to affect the behavior of the method. Non static method can not be referenced from a static context

### Static Variables

public class Duck {
private static int duckCount =0;
public Duck(){
duckCount++;
}
}
the duckCount variable will be one per class, and shared by all the instances of the duck class. And the instances wont have a copy of the duckCount variable.
Static variables are loaded when class is loaded.
