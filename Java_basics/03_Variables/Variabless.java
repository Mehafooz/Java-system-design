/* Here im just playing by checking can we have the main outside of the class 
no main should be inside the class so i created a public test class but 
the problem is if we have public then it should be the filename as class name
so i removed the public for test, this is correct

then i did the javac Variabless.java and then java Variabless i thrown error because
java Variabless will run the program and it doesnt find the main method in the variabless class 
so after compilaction we need tio run the test class as it has the main
so javac variabless.java and then java Test */

public class Variabless{
    int instVar=10; // instance var copy for each obj
    // System.out.println("hello");

    static int fg = 20; // this is static varaible shared copy for all objects
    
    public void printVariables(){
        int locVar = 20; // local var only acc inside the method
        // int instVar=20;

        System.out.println("hello. "+ instVar +" "+ locVar);


    }
}
class Test{
public static void main(String args[]){
    Variabless obj1 = new Variabless();
    Learn obj2 = new Learn(10,20);
    System.out.println("summ iss" + obj2.add());
    obj1.printVariables();

}
}

class Learn{
    int a =3;
    int b =4;

    Learn(int x,int y){
        this.a=x;
        this.b=y;
    }

    public int add(){
        if((a+b)/2==0){
            System.out.println("The sum is even");
        }else{
            System.out.println("Sum is odd");
        }

        int x =5;
        for(int i=0; i<=x; i++){
            System.out.println("Heloooo world !!!!!");
        }
        return a+b;

    }


}


// we know methods loops no need of spl understanding

