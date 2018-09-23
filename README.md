## Iterator Pattern

Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

Use case of iterator pattern: When you need to iterate over a collection of objects without worrying about how they're stored.

A collection may be stored as an array, an arraylist, a hashmap or even a tree. The client should be agnostic from the type of collections.

Iterator Pattern helps us write polymorphic code where the client relies on an interface and the underlying implementation details of an aggregate object is encapsulated.

### Key principles:

- Caution: While iterating, design for scenarios when the underlying collection might change.

### Understanding the code

- This is a simulation of a Restaurant consisting of multiple menus. 
- A waitress is responsible for reading out differnt types of menus to the customer
- The menu collection details are hidden from the waitress while she iterates over each menu item and reads it. 

### Running the code

```
cd src/
javac WaitressSimulation.java
java WaitressSimulation

```