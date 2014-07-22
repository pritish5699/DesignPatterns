Singleton Pattern:

Category: Creational

Definition:
"Singleton pattern restrict instantiation  of class, and make sure that only one instance of exist in JVM."

Simple to design, however come with lot of implementation concern.

For class, it provide global access point to play with class's methods.

Usage:
1. Logging
2. In-memory File-System
3. Drivers
4. Caching
5. Thread Pool.


Used under folloing patterns:
Abrstract Factory, Builder, Prototype, Facade, etc.

Common Approach for implementation:

1. Constructor of class should be private.
2. Private static instance variable of class.
3. Provide public static method which return the class of the instance. 
