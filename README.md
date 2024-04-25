# LLD Design Patterns
1. Singelton :- It is used when a single instance of a class is required. 
             eg. As TvInstance is shared in whole house

2. Factory :- Here we have to only provide the name of class whose object is required 
             And then its the responsibility of factory to provide us object based on bussiness logics

3. Abstract Factory :- It's basically a factory of factory

4. Prototype :- This design pattern is required when we want clone/copy of an existing document

5. Observer, Proxy , Mediator :- All these three handle similar type of situation like PUB/SUB or bidding app
6. Builder :- It is to create object when a class has many fields and most of them are optional
7. Strategy :- Is is used when two subclass have almost similar type of implementaion logic. To resolve this
we simply inject the logic to parent class using subclass constructor instead of overring. Eg. bike 

logger :- chain of responsibility
vending machine :- state design pattern
atm :- state design pattern + chain of responsibility