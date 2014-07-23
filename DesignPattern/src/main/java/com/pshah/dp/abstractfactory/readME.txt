Pattern name: Abstract Factory
Category: Creational
Definition:

It's factory of factories. 

In Factory pattern, we need to use if-else or switch ladder to return corresponding sub-class. 
If sub-class will increase, then we need to modify the ladder as well as ladder will go as well.

Abstract factory will help you to avoid such problem.

Implementation:

1. Create Factory class for superclass and each sub class.
2. Create abstract factory class and which take super class's factory object as one of the argument of method.


Benefits:

1. Abstract Factory pattern provides approach to code for interface rather than implementation.

2. Abstract Factory pattern is “factory of factories” and can be easily extended to accommodate more products. 
For example we can add another sub-class Laptop and a factory LaptopFactory.

3. Abstract Factory pattern is robust and avoid conditional logic of Factory pattern.

Usage:

1. javax.xml.parsers.DocumentBuilderFactory#newInstance()
2. javax.xml.transform.TransformerFactory#newInstance()
3. javax.xml.xpath.XPathFactory#newInstance()
