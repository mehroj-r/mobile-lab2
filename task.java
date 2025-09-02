// 1. Main Function

1. Answered.
2. The main function is the entry-point for the whole program. When it is executed the main function is invoked. It is static since it needs be called without creating instance by JVM.
3. `String[] args` is the parameters list in Java and `int argc, char* argv[]` in C++ . public, private, protected modifiers exist in Java but none in C++. Return type specified before the name of the function and method in both languages. Java supports void methods as well where method doesn’t return anything, but in C++ zero is returned to indicate successful run.
4. Return integer 0 signifies success and 1 fail in C++. In java the same is achieved through `System.exit(int status)`.

// 2. Variables

1. Answered.
2. Primitive types are usually stored in a stack. Other objects, classes allocate memory from heap but their pointers (a.k.a references) are stored in stack just like primitives.
3. Variable declared within methods are called local variables. The ones defined within classes are global or static depending on their declaration.
4. Statically typed languages enforce strict variable declaration using proper types at compile type. But dynamic languages allow creating variables without even specifying its type (compilers handle this for us). Also dynamic languages allow changing variable’s data type during runtime where static languages forbid this practice.

// 3. Control Flow

1. Answered.
2. while loop checks the condition and depending on it the loop might not even execute once. But do-while loop executes at least once regardless of the condition. This is purely are design choice depending on the requirements of the problem.
3. Switch is the glorified version of if-else where the certain action is taken depending on the input value. ‘case’ keyword declares the possible value for the input and the proper action to be taken when it matches. ‘break’ is used to terminate switch-case block (specifically after validating any case). ‘default’ is the action taken if non-handled input is passed.
4. ‘Short circuit’ happens when we use multiple condition with AND / OR operators. When there are n conditions with AND operator and as soon as we encounter any false condition short-circuit happens since there is no point of validating the rest of the conditions. The same applies for OR operator but as soon as we encounter true condition.

// 4. Functions / Methods

1. Answered.
2. Pass-by-value: When we pass the argument as it is and changing the passed argument doesn’t affect original one.
Pass-by-pointer: When we pass the argument as pointer we can access and change the original one with star (*) symbol.
Pass-by-reference: When we use & with variable in function signature any changes made to the passed argument also apply to the original one as well.
3. Method overloading is done through different signatures for the methods with the same name. According to the passed arguments the corresponding method is invoked,
4. Recursion is the act of invoking the method from the same method. Base case the condition for recursion to stop from going further and start returning values.

// 5. Comments

1. Answered.
2. Coding style is highly dependent on the person who is writing it and it is not very clear or easy for other people to follow the logic if not human readable comments are declared alongside. Something that is perfectly reasonable and understandable to one person (probably the one who wrote the code) might not even make sense for other developers.
3. It is a centralized system for all developers to make docs that is familiar for everyone. It helps organize docs in unified and general part of the file. This is also beneficial when working with IDE/AI tools since this docs can be used as context for the code giving other developers much more insight to that piece of the code without ever seeing that documentation.
4. This term is mostly used among developers to imply that if you code well enough there is no need for docs. But this term loses its integrity when the project or that specific part of the code gets overly complicated meaning that there is always need for docs regardless of how well the code is written.

// 6. Classes

1. Answered.
2. ‘Class’ is the piece of code that represents the object, its properties and methods. The ‘object’ is created when class is initiated as an instance. 
3. ‘public‘, ‘private‘, and ‘protected‘ access specifiers are used to specify what can access the methods and properties. 
1. Public means everyone can access it. 
2. Private means no one expect same class can access it. 
3. Protected means no one expect from the same package can access it.
4. Constructor is the method used to initiate/create instance of the class. Default constructor is provided with no arguments, but it can be overridden to support other cases.

// 7. Enums

1. Answered.
2. Enums are used to specify constants or set of related constants consistently over the entire codebase. Simple string or custom identifiers can be used but their consistency is not guaranteed for all members of the project since it is not centralized.
3. The obvious example would be prevention from typos or non-existing values since they are declared and enforced on the code level. Raises exception at compile when used improperly.
4. In the latest versions both Java and C++ equally functional and type safe enums. But, Java offers much flexible properties and methods, but C++ enums are limited to builtin one like `toString()`, etc.

// 8. Inheritance

1. Answered.
2. “is-a” relationship (inheritance) refers to the act of inhering a subclass from a superclass. In this case the methods and properties from parent is also available to use/override in that subclass. “has-a” relationship (composition) refers to the act of using another class as component. This is also a good practice if we want to make reusable/modular components that are loosely coupled.
    
    “is-a” → Car inherits from Vehicle with startEngine() method. car.startEngine()
    “has-a” → Car uses Engine as component instead of inheriting it. car.engine.startEngine()
    
3. When we are inheriting from a superclass it is sometimes the case that we want to alter how that certain methods operate. So in this case we can override superclass methods as we like. Keyword override is used to explicitly specify that we are overriding a method from parent class (both in C++ and Java). But abstract or virtual classes are meant to be overridden when inherited from a class that has these type of methods.
4. Inhering from multiple classes can be very tricky if we are inhering from multiple classes that share different implementation of the same method making it ambiguous for the compiler. C++ allows multiple inheritance using virtual inheritance where java forbids it but allows multiple interfaces to effectively do the same thing.

// 9. Mixins

1. Answered.
2. Using interfaces/mixins are the way of forming protocols for all the classes that are using it. The main purpose of these kind of things are to allow more flexible for pick-n-use approach instead of multi-layer deep inheritance that mostly involve methods that are not needed breaking multiple principles of SOLID.
3. From later version of Java interfaces allow using default methods with bodies allowing much better alternative to inheritance.
4. Inheritance → when there’s a clear parent-child relation. But can also make it ambiguous for multi-inheritance.
Composition → when you want flexible and modular features without tight coupling.
Mixins → when the functionality is meant to be mixed into other classes.

// 10. Polymorphism

1. Answered.
2. Method overloading happens on compile time depending on the signature of the method. There is no need for runtime analysis everything is clear during compilation. Method overriding happens during runtime depending on the type of the object. When instances are created from inherited classes with overridden methods it is identified depending on the class.
3. Abstract class is a class that can be made instance of. It may contain abstract methods meant to be implemented by inherited subclasses and some concrete methods with implementation.
4. Interfaces in java are protocol with method signatures or default/static methods in newer versions. Class implementing an interface must fulfill all methods provided by that interface.
C++ doesn’t have interfaces but the same can technically be achieved using a class with only virtual methods, making it one-to-one replacement for java interfaces.

// 11. Async Operations

1. Answered.
2. Asynchronous programming helps prevent the program from blocking while waiting for slow I/O operations (like network request or file access), allowing other work to continue.
3. Parallel execution means tasks run literally at the same time on multiple processors, while concurrent execution means tasks make progress independently, possibly on a single processor.
4. A *Future* is an object that holds the result of an asynchronous operation; in Java (`Future`/`CompletableFuture`) and C++ (`std::future`), it lets the program check, wait for, or retrieve the result once the task finishes.

// 12. Exceptions

1. Answered.
2. The `try` block encloses code that may throw exceptions, `catch` handles those exceptions, and in languages with `finally`, it always runs for cleanup. In C++, the same effect as `finally` is achieved using RAII, where destructors automatically release resources when objects go out of scope.
3. In Java, *checked exceptions* must be declared and handled at compile time, while *unchecked exceptions* (runtime errors) do not. C++ does not distinguish between checked and unchecked exceptions—all exceptions are unchecked.
4. Exceptions separate error-handling code from regular logic, making code cleaner and reducing missed error checks. However, they can hurt performance, complicate control flow, and be misused if exceptions are thrown for normal conditions.
