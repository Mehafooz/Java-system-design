// FileName : "Practice.java".
// java is an obj oriented langua, which is based on the implementation of classs and objects
// four mainn pillers of java are 1))abstraction 2).encapsulatin 3)).inheritance 4).polymorphism

//The class name shoould be the file name with .java as extemsion like Class Practice and file name is Practice.java 
// how to execute is first run javac practice.java ; it will create the byte code ; ; then run java Practice to execute it
//here the byte code place a imp role it is ntg but a file cretaed after the compiling the code like Practice.class with will be running on
// any env if we provide the java runtime , so that why java is platform independent

// public class Practice {
  
//     // Program begins with a call to main() method
//     public static void main(String args[])
//     {
      
//           // Prints "Hello World" 
//         System.out.println("Hello World");
//     }
// }

// class is like an blue print and object is an instance  for eg animal is class and cat is an objcet there can be many object for a class 

// The method main() is the main entry point into a Java program; 
// this is where the processing starts. 
// Also allowed is the signature public static void main(String… args) .

// public class Practice {
  
    
//     public static void main(String args[])
//     {
//        int x = 4;
//           // Prints "Hello World" 
//         if(x%2 == 0){
//             System.out.println("even");
//         }else{
//             System.out.println("odd");
//         } 
//         for(int y =0;y<3;y++){
//             System.out.println(y);
//         } 
//         System.out.println("Hello World : " + x);
//     }
// }

// naming variable , if, else, for are comman like we do in other languages, but imp thing is after completion of every line 
// we should add the semicolon at the end

// now next imp thing is how to take the input from user
// for that we can use the utils and scanner 

import java.util.*; // for scanner which is present in utils

public class Practice {
  
    
    public static void main(String args[])
    {  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an number : ");

        int x = sc.nextInt();
         
        System.out.println("The number is : "+x);
       
    }
}

// for taking the inputs we will use the Scanner 
// and for taking word we use sc.next(), for line sc.nextLine(), for num sc.nextInt()

// Scanner sc = new Scanner(System.in); 
// lets see what is this line 
// if we want to create a object of Scanner1 class 
// then we need to write Scanner1 sc1 = new Scanner1()
// this is howw we creat a object from the class

// howw arrs are created

// int[] arr; or int arr[]
// and define the size to the array
// arr = new int[20]