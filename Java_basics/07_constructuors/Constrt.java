/* SO there 4 /5 types of constructors

1). first is default means java it self we create orclass it when obj is created
we can provide but no necesary

basicly we delcearing the obj = new Test() here test bascualy is constructor even
if we dont write java will take care or it 


2).parametarised constructor we will define some variables and using this const we 
will initialize then 

Test obj1 = new Tes(1,2);

3).private : it is just we will give private before the constructor so that its obj
can be created beacuse we can access private only in the class not oustide of It

class Test 
{
    private  Test(){}
}

class another {
    public static void main(String[] args) {
        Test obj1 = new Test()  -> like this it is not possible
    }
}

4).constructor overloading  : it is another concept of oops based on the parameters the constructor will be triggered */


public  class  Constrt {
    int a ;
    int b;
    Constrt(){
        System.out.println("This is the default constructor");
    }

    Constrt(int val){
        this.a = val;
        System.out.println("This is the paramet constructor" + this.a);
    }

    Constrt(int a, int b){
        this.a = a ;
        this.b = b;
        System.out.println("This is the  constructor overloading" + (this.a + this.b));
    }

    public static void main(String args[]){
        Constrt obj1 = new Constrt();

        Constrt obj2 = new Constrt(1);

        Constrt obj3 = new Constrt(2,3);
    }
}


