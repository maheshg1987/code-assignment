# code-assignment

01.(a)(b) Can you implement the sing() method for the bird?

Initial Bird class does not have sign() method so we can make Animal class abstract and create walk() , fly() and sing() abstracts methods.
Now we can extend Animal class to Bird class and implement abstract methods.

a.) AnimalTest class is using for Unit Test.

How to run : import project as maven and run command "mvn clean install"  (test cases automatically execute or run AnimalTest class as a JUnit Test)


2.(a)(b)

Make AnimalSound interface and create makeNoise() abstract method. Duck class extends Bird and implements AnimalSound. DuckTest is using for Unit test.