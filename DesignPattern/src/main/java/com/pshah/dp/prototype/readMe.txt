Pattern name: Prototype
Category: Creational

Definition:

Provide mechanism for Object Creation when it is expensive to create new object where lot of time and resources
being used. This pattern provides mechanism to copy the existing object,  and modify the the new object based
on the needs.

Example:

suppose we have an Object that loads data from database. Now we need to modify this data in our program multiple 
times, so its not a good idea to create the Object using new keyword and load all the data again from database. 
So the better approach is to clone the existing object into a new object and then do the data manipulation.