Java 8 SE
--------------------------------------------------------

    Objectives
    --------------------------------------------
        1 Introduction to Java
        2 Classes and Objects
        3 Methods, Encapsulation, and Conditionals
        4 Data Manipulation and Inheritance
        5 Encapsulation, Polymorphism, and Abstraction
        6 Interfaces, Lambda Expressions, Collections, and Generics
        7 Inheritance, Interfaces, Exceptions, and Deployment
        8 Date/Time API, I/O and File I/O (NIO), and Concurrency
        9 Concurrency, Parallelism, The JDBC API, and Localization
        
        JDBC:
            Understand various database drivers.
            Driver interface
            Connection interface
            Statement interface
            PreparedStatement interface
            CallableStatement interface
            ResultSet interface


    Lab Setup
    ----------------------------------------------
        Eclipse (the latest)
        JDK 1.8
        RDBMS - MySQL (Community Server Edition)

    Java Introduction
    ----------------------------------------------

        Java Evolution

            Java 1.1,1.2,.......Java 1.5 (Java 5)
                                Java 1.8 (Java 8)
                                ........................(Java 17)

            Java SE     (Core Java)
            Java ME
            Java EE

        Java Features
            Simple
            Robust
            Distributed
            Multi-Threaded
            Archetecutre Neutral
            Platform Independent
            Secure
            Self Documented

        Java Characteristics
            Hgih Level Partly but strictly Object Oriented
            Case Senstive
            Compiled and Interpreted

        Is JDK Platform Independent?    NO
        Is JVM Platform Independent?    NO
        Is JRE Platform Independent?    NO

        only *.class is platform independent.

        Java Data types
        Java Control Strucutres
        Java Arrays

    Object Oriented Programming
    ------------------------------------------------------------------

        Class & Object

            A class is a user-defiend data type that wraps state and behaviour together.
            the state is handled by variable called fields.
            the behaviour is offered by methods.

            Object is a variable of class-type.

            In java, Objects are references.

            ClassName   obj1 = new ClassName();

            obj1 is a reference that points to a specific memory lcoation where all the fields are allocated.

            ClassName obj2 = obj1;

            a new object is not allocated. the valeu of obj1 (reference) is copied into obj2. That
            means we end up creating two names obj1 and obj2 to the same object.

        Encapsulation

            is otherwise can be termed as data-hiding.

            is a machanisim where the state is given an indirect to protect the validity of the state.

            In java, encapsulation is implemented through access specifiers:

                Default         
                Public              public
                Private             private
                Protected           protected

                Default fields or default methods of a class can be accessed by other classes
                that belong to the smae package.
                
                Public fields or public methods of a class can be accessed by any other classes.
                Protected fields or protected methods of a class can be accessed by sub-classes.
                Private fields or private methods of a class can be accessed by no other class.

            Access ristriction is pplied on field using private access modifier and getter and setter methods.

            To create a read only field,  the field is marked private and a getter alone is defined on it.
            To create a write only field,  the field is marked private and a setter alone is defined on it.
            To create a read-write field,  the field is marked private and bothe setter and  getter are defined on it.


            Constructors
                are special methods that gets invoked immidiately after the allocation of an object.
                
                the constructors take the same name as that of the class to be identifed as a construcotr and
                they do not return anything.

            'this' keyword

                this is a reference to the active object of a method (an object by virtue which a method is invoked).

                'this' can also be used to invoke one constructor from another constructor of a class.

                class Box {
                    private int length;
                    private int width;
                    private int height;

                    public Box(){
                        this(10,10,10);
                    }

                    public Box(int length,int width,int height){
                        this.length=length;
                        this.width=width;
                        this.height=height;
                    }

                    public Box(Box b){
                        this(b.length,b.width,b.height)
                    }

                    //setters and getters
                }

            'static' keyword
            
                static fields
                    non-static fields are called instance variables, each object of a class has its own copy of instance variables
                    static fields are callled class variables, all objects will share the same copy of class variables.

                static methods
                    static mehtods otherwise called class methods can invoke other static methods or static fields only.
                    'this' keyword can not be used in a static method.

                    static methods, if public, are called on the classes but on objects.

                static classes
                static block

        Inheretence
        Polymorphisim
        Abstraction

