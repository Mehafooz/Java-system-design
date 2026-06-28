/* In Java, classes and objects form the foundation of Object-Oriented Programming 
(OOP). They help model real-world entities and organize code in a structured way.

A class is a blueprint used to create objects that share common properties 
and behavior.

An object is an instance of a class. 
It represents a specific entity created from the class template.


For Example, Dog is a class, Tommy is an object of that class.


A class is a blueprint that defines data and behavior for objects. 
It groups related fields and methods in a single unit. 
Memory for instance members is allocated when an object is created, 
while static members are allocated when the class is loaded into memory.

Java Objects
An object is an instance of a class created to access its data and operations. 
Each object holds its own state.


Object Instantiation
Creating an object is known as instantiation. 
All instances of a class share structure and behavior 
while storing different state values.

The new operator allocates memory and invokes the constructor.
 */

public  class Basic{
    // here lets define basic student details
    int rollNumber;
    String name;
    String className;

    Basic(int r, String n, String c){
        this.rollNumber = r;
        this.name=n;
        this.className=c;
    }

    void printDetails(){
        System.out.println("The student name is "+this.name);
        System.out.println("The student roll number is "+this.rollNumber);
        System.out.println("The student class is "+this.className);
    }


}

class Real{
    public static void main(String args[]){
        Basic obj1 = new Basic(1,"Mehafooz","1st class");
        Basic obj2 = new Basic(2,"Mehafooz 2","2nd class");

        obj1.printDetails();
        obj2.printDetails();

    }
}