//There are 4 types of access modifiers
/* public accessible any where in the Programm 

private accesible only in the class 

protected accesible in same packge  and by subclass

like it is class vechile in p1 then if car extends the vechile from p1 
then only the protected varaibels are accessible

default if we dont give any thing then they are defauylt

they are accesible in same packge  */

 class Amsd{
  private String a= "hello";
   String b ="hello world";

  void prnt(){
    System.out.println(a);
  }

}

public  class Ams{
    public static void main(String[] args) {
        Amsd obj1 = new Amsd();
        obj1.prnt();

        System.out.println("Obj1." + obj1.b); // this is bcz of b is default

        // we cant do like this sibce it is pvt System.out.println("obj1 "+obj1.a);
    }
}

