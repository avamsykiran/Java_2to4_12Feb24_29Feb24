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
                    A class inside a class is called Inner class. Inner class has access to all the other memebr of the
                    enclosing class.

                    A static class inside a class is called Nested class. Nested lcass is a treated as memeber of the enclosing
                    class.

                static block

                    static {

                    }

                    A class can have any number of static blocks but are all clubbed into one.

                    The code enclsoed in these blocks gets executed just before the class being accessed
                    for the first time.

                    Access a class means:
                        1. Declaring a ref of the class or                              ClassName obj;
                        2. Allocating an object to the class or                         new ClassName();
                        3. Invoking a static method of the class or                     ClassName.staticMethod();
                        4. accessing a static field of the class or                     ClassName.staticField=value;
                        5. doing any of the above on the sub-classes of the class.

                java.lang.Object

                    is the default super class for all java classes.

                    int hashCode();
                    boolean equals(Object);     //obj1.equals(obj2)
                    String toString();

        Inheretence

            Defining a class from another class is called inheretence. The existing class is called
            super class and the newly defined class is called sub class.

            Simple Inhertence       Super <---- Sub
            
            Multi-Level Inhertence  Super <---- Sub1 <------ Sub2

                                                |<---- Sub1 
            Hirarchial Inhertence   Super <-----| 
                                                |<---- Sub2

                                    Super1 <----| 
            Mltiple Inhertence                  |<---- Sub 
                                    Super2 <----|

            Hybrid Inheretence is a combination of the above.

            Java doesnt support multiple inheretence on classes.

            A super class object allocation invokes the super class constructor.
            A sub class object allocation invokes the super class constructor followed by the sub class constructor.

            'super' keyword is sued to invoke super class cnstrucotr from a sub class constructor.

            'final' keyword
                final variable can not be modified after initialzing it with a value.
                final class can not be inherited furthur.

            Employee    (empId, name, basic)
                ↑
                |←----ContractEmployee (empId, name, basic, contractDuration)
                |←----Manager          (empId, name, basic, allowence) 
                        ↑
                        |←----Director  (empId, name, basic, allowence, share)

            //super class refrences can refer to sub class objects.
            Employee e1 = new Employee();
            Employee e2 = new Manager();
            Employee e3 = new Director();
            Employee e4 = new ContractEmployee();

            //Type Casting
            Manager mgr1 = (Manager) e2;
            Manager mgr2 = (Manager) e3;
            Director d = (Director) e3;
            ContractEmployee ce = (ContractEmployee) e4;

        Polymorphisim

            having more than one method with the same name.

            two methods of the same class or from a super and sub class have the same name but differ in the
            paramList, then they are said to be overloaded.

            two methods from a super and sub class have the same signature then they are said to be overridden.

            class Monkey {
                public Energy eat(Apple apple) {
                    Energy e = new Energy();
                    while(!apple.isEmpty()){
                         e.add(biteAndChewAndSwallow(apple));
                    }
                    return e;
                }

                public Energy eat(IceCream iceCream) {
                    Energy e = new Energy();
                    while(!iceCream.isEmpty()){
                         e.add(lickAndSwallow(iceCream));
                    }
                    return e;
                }
            }

            class Civilian extends Monkey {
                public Energy eat(Apple apple) {
                    wash(apple);
                    Piece[] pieces = cut(apple);
                    Energy e = new Energy();
                    for(Piece p : pieces){
                         e.add(chewAndSwallow(p));
                    }
                    return e;
                }
            }

        Abstraction

