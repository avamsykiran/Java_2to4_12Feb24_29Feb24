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
                |
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

            "super" keyword cn be used to call an overriden method.

            "final" keyword when applied on a method, the method can not be overriden.

            Assignemnt

                Loan    (principal,timePeriod,roi)
                    ↑
                -----------------------------------------
                ↑                   ↑                   ↑
                PersonalLoan        EducationalLoan     HousingLoan
                    purposeOfLoan           subcidyPercent      builtArea

                LoanService
                    public double getRepayalbeamount(Loan loan) {
                        //...
                    }

                    public double getEMI(Loan loan){
                        //...
                    }
            

        Abstraction

            is also termed as behaviour-hiding.

            abstraction in java can be achived through

            1. abstract class without abstract method           
                the abstract class can not have objects allocated.

                In a SchoolAutoamtionSystem

                abstract Person (name,dateOfBirth,contactNo,mailId,address)
                            ↑
                            |←-Student                 clazz,section
                            |←-Teacher                 sal,subject
                            |←-Parent
                            |←-NonTeachiingStaff       sal

            2. abstract class with abstract method  

                abstract class Item{
                    private int iCode;
                    private String name;
                    private double costingPrice;

                    //constructrs, getters, setters ...et.,;

                    abstract double getSellingPrice();  //as we dont have the formulea for computing sellingPrice.
                }


                any sub-class of an abstract class must override all the abstract methods .


            3. interface

                are user defined data types that can accomidate
                    1. normal methods
                    2. static methods
                    3. abstract methods
                but can not accomidate fields.

            
            abstract classes can accomidate fields and do not support multiple inheretence
            whereas
            an interface can not accomidate fields but supports multiple inheretence.


                if we have choose between interface and abstract method...
                    check if we have fields or not
                                        }|
                                ------------------------------
                                |                           |
                            we have fields                  we dont have fields
                                |- go for abstract class            |- go for interfaces

        'final' and 'abstract' keywords are contradictory and can not be used at a time.

    built-in Packages

        java.lang
        java.time
        java.util
        java.util.function
        java.util.stream
        java.util.regex
        java.util.concurrency
        java.io
        java.nio
        java.sql

    java.lang

        implict package as it is imported by default into all java source files.

        Object      implicit super class for all java classes.
        Class       each .class in java is an object of Class.
        System      
                    in
                    out
                    err

                    gc()
                    exit(int)

        String
        StringBuilder       is Thread safe as all of its methods are synchronized. (suits best in multi-=threaded context)
        StringBuffer        is not thread safe but has better performence (suits best in uni-threaded context)

        Math
    
        Wrapper Classes
            Integer
            Float
            Double
            Short
            Long
            Boolean
            Void
            ...etc;

            boxing      wrapping a primitive variable into its respective wrapper class object
            unboxing    unwrapping a wrapper class object into its primitive variable

                int i=45;
                Integer iObj = new Integer(i);  //boxing
                i = iObj.getValue(); //unboxing


            auto - boxing or auto unboxing refers to direct assignment across the wrapper class object and
            primitive varialbw with out any additional methods
    
                int i=45;
                Integer iObj = i; //auto-boxing
                i = iObj; //auto-unboxing

    Exception Handling

        java.lang.Throwable (i)
                    ↑
                    |
                ----------------------------
                ↑                           ↑
                Exception                   Error
                    ↑
                ----------------------------------
                ↑                               ↑
                RuntimeException                (any other sub classes) CHECKED EXCEPTIONS
                ↑
                (any other sub classes) UNCHECKED EXCEPTIONS
                
        an exception is a specific senario where the application breaks down for a unexpected operation
        from the user side or from external dependencies.

        Reacting to an exception is called exception handling.

        All sub classes of RuntimeException class including RuntimeException class are called UnChecked Exception as the
        compiler ignores them. UnChecked Exceptions are those that can be avoided through defensive programming and
        should not be handled (in any other manner).

        All sub classes of Exception class including Exception class are called Checked Exception as the
        compiler will force to handle these exceptions. Generally exceptions that can not be avopided by the
        developer are called checked exceptions and these exceptions must be handled using try..catch statement.

        general try..catch statement
            try{
                //code that may raise a Checked Exception
            }catch(CheckedException1 exp){
                //alternate exception handling code..
            }catch(CheckedException2 exp){
                //alternate exception handling code..
            } ... 
            finally {
                //accomidates code that has to execute at any cost
                //even if the 'return' is encountered.
            }

        multi-catch syntax

            try{
                //code that may raise a Checked Exception
            } catch(CheckedException1 | CheckedException2 exp){
                //alternate exception handling code..
            } finally {
                //accomidates code that has to execute at any cost
                //even if the 'return' is encountered.
            }
        
        try-with-resources syntax

            try (/* decalre closable objects */) {
              //code that may raise a Checked Exception
            } catch(CheckedException1 | CheckedException2 exp){
                //alternate exception handling code..
            } 

        'throw'     is used to raise an exception.

                    throw new ExceptionClass();

        'throws'    is used to transfer a checked exception from one function to another

        User Defiend Exceptions are those sub classes that inherit either Exception or RuntimeException.

    Date & Time api

        java.time
            LocalDate           .now(),.of(year,month,day)
            LocalTime           .now(),.of(h,min,sec)
            LocalDateTime       .now(),.of(year,month,day,hr,min,sec)
            ZonedDateTime       .now(ZoneId)

            DateTimeFormatter   .ofPattern(dateTiemPattern)
        
            Dureation   .between(start,end)
            Period      .between(start,end)

    Generics

        generics represent Abstract Data Types (ADTs).

        ADT means an unrecognized dataType.

        Let say we need to swap 'a' with 'b'.

            t = b;
            b = a;
            a = t;

        The above algorith works for any data type and Generics are sued to indicate 'any data type'.

        public class Swapper<T> {   //here T is a generic or a ADT

            public void swap(T a,T b){
                    T t;
                    t = b;
                    b = a;
                    a = t;
            }

        }

    Collections

        Collectiosn is java approch to data-structures.

        java.util.Collection (i)                add(ele),remove(ele),contians(ele),size(),isEmpty(),stream()
                    ↑
                    |← List (i)                 represents linear data structures 
                    |                           supports index and thus random access is possible
                    |                           duplicate eles are allowed
                    |                           first(),last(),get(index),removeAt(index),add(index,ele)
                    |
                    |← Set  (i)                 repressents a non-linear data strucutre (like trees ..etc.,)
                        ↑                       no support fro index or randome access.
                        |                       it does not allow duplicate elements
                        |
                        |← SortedSet (i)

        java.util.Map (i)                       represents a key-value pair collection
                    ↑                           put(key,value),containesKey(key),get(key),set(key,value),remove(key),size(),keySet()
                    |                           key can not be duplicate
                    |← SortedMap (i)

        List Implementation
            Vector              is a synchronized growable array, hence thread safe.
            ArrayList           is a growable array
            LinkedList          is a doubly linked list implementation
                   
        Set Implementation
            HashSet             the data retrival follows no pridictable order
            LinkedHashSet       the data retrival follows entry order 
            TreeSet             the data retrival follows sorted order
        
        Map Implementation
            HashMap             the data retrival follows no pridictable order
            LinkedHashMap       the data retrival follows entry order 
            TreeMap             the data retrival follows sorted order on keys

        java.lang.Comparable (i)        int compareTo(object)           default comparision mechanisim

                                        all Wrapper classes and String already implement Comparable interface.
                                        it is implemented by the model class itself whose objects has to be compared.

                                        obj1.compareTo(obj2);
                                                must return 0, if both objects are equsl
                                                must return +ve, if obj1>obj2
                                                must return -ve, if obj1<obj2

        java.util.Comparator (i)        int compare(obj1,obj2)          custom comparision mechanisim

                                        it is implemeted by any other class that wnats compare a model.
        
        java.util.Collections (class)   that offer a variety of utility mehtods to be used acress all the collections.

    Assingnment:

        1. Define a model called Transaction (txnId,amount,header,txnDate,txnType)
        2. Create a list of Transactions where each trasaction must be accepted from the user
        
         for example:

                txnId,amount,header,txnDate,txnType
                1      2000  SALARY 2024-02-01 CREDIT
                2       100  Rent   2024-02-01 DEBIT
                3       150  Fuel   2024-02-01 DEBIT
                ....etc

        3. totalCredit,totalDebit and sub-totals of each header has to be computed and displayed.

    FunctionalInterface?
        is any interface that has only one abstract method.

        if that abstract method doest not return anythign but accepts params then that interface is called CONSUMER
        if that abstract method doest not accept any params but return soem value then that interface is called SUPPLIER
        if that abstract method irrepective of params, always returns a boolean value then that interface is called PREDICATE
        otherwise it is called an operator/functional .

        What is special about functional interface?

            Unlike other interfaces, functional interfaces can be implimented without a class but through
            lambda expressions.

    Lambda Expression

        the paramsList and a returnValue joined by '->' arrow operator.

        (paramsList)    ->    (returnValue)

        (a,b) -> a+b            a fucntion that accepts two values and returns their sum
        () -> "Hello"           a function that has no params but always returns a string "Hello"
        x -> x*x                a function that accepts a value and returns its square
        
        (params) -> {
            //some logic here..
            return "";
        }

    Functional Interface and Lambda Expression :

        @FunctionalInterface
        interface Greeting {
            String doGreet(String userName);
        }

        Greeting g1 = unm -> "Hello " + unm;
        System.out.println(g1.doGreet("Vamsy"));
        
        Greeting g2 = unm -> {
            let h = LocalTime.now().getHours();
            String greeting= "";

            if(h<=11) greeting="Good Morning ";
            else greeting = "Good Evening ";)

            return greeting + " " + unm;
        };
        System.out.println(g2.doGreet("Vamsy"));

    Functional Interface and Method References :

        MyFuctionalInerface1 obj = ClassName::MethodName;

        System.out::println can be assigned to any consumer.

    Streams API

        Stream is a flow of data. Streams in java are introduced to provide a scope of
        a new programing paradigm called Functional Programming.

        DataSource
                ↑---STREAM--↓
                            Operation1 (represented by a function )
                                ↑---STREAM--↓
                                        Operation2 (represented by a function )
                                            ↑---STREAM--↓
                                                    Operation3 (represented by a function )
                                                        ↑---STREAM--↓
                                                                DataCollector

        In Java, DataSource can be a list/set/map/array ...etc.,
                 DataCollectore can also be another list/set/map/array ..etc.,

                 ↑---STREAM--↓   is represented by java.util.stream.Stream

                 Operations are represented by FunctionalInterfaces.

        java.util.stream.Stream

            Stream s1 = Stream.of(val1,val2,val3...);
            Stream s2 = list.stream();
            Stream s3 = set.stream();
            Stream s4 = Arrays.stream(array);

            Stream Class Methods

                forEach(consumer)           execute the consumer on each and every element of the stream
                                            it returns notheing 
                                            called a terminal operator as no furthur operators can be chained

                map(operator)               executes the operator on each ele of the stream and a new stream of
                                            the results is returned.
                                            called a intermidate operator as another operation can be chained on it.

                filter(predicate)           return a new stream of those values that satisfy the predicate from the oldStream.
                                            called a intermidate operator as another operation can be chained on it.

                reduce(binaryOperator)      it applies the binaryOperator on the first two eles of the stream,
                                            and the result is paired wih the next ele and again operators is applied
                                            and son on.. untilt he entire stream is reduced to one single ele.

                                            called a terminal operator as no furthur operators can be chained

                collect(Collector)          Collectors.toList(), Collectors.toSet()

    Assingnment:

        1. Define a model called Transaction (txnId,amount,header,txnDate,txnType)
        2. Create a list of Transactions where each trasaction must be accepted from the user
        
        for example:

                txnId,amount,header,txnDate,txnType
                1      2000  SALARY 2024-02-01 CREDIT
                2       100  Rent   2024-02-01 DEBIT
                3       150  Fuel   2024-02-01 DEBIT
                ....etc

        3. totalCredit,totalDebit, and balance

    IO Streams

        Input Output Streams to Read and Write data from a input stream or into an output stream.

        java.io

            Binary Stream that allow reading and writing in binary form of (byte).

            InputStream
                |- FileInputStream
                |- DataInputStream
                |- ObjectInputStream ..etc.,

            OutputStream
                |- FileOutputStream
                |- DataOutputStream
                |- ObjectOutputStream ..etc.,

            Character Stream that allow reading and writing in text form of (Strings).

            Reader
                |-InputStreamReader
                |-BuffredReader
                |-FileReader

            Writer
                |- PrintWriter
                |- FileWriter

            File

            IOException
            FileNotFoundException

        java.nio

            Non Blocking Streams

            Buffers
            Channels

            Files
            Directories
            Paths
    
    Assignment:

        a menu driven console application to Add/DELETE/SEARCH/LIST operations on a list of emplopyees.

        Use multi-layer archetecture.

            interface EmployeeDAO
            class EmployeeDAOImpl       //use a java.util.List to stroe data and java.io to persistant serialize or deserialse

            interface EmployeeService
            class EmployeeServiceImpl   //validate the mployee beforfe adding or updating.

            EmployeeCRUDApplication     //to perform operation as driven by a menu.
            
    Multi-Threading

        
    JDBC



