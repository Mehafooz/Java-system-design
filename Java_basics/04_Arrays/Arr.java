

public  class Arr{
    int rollNo;
    String name;

    Arr(int rl, String n){
        this.rollNo = rl;
        this.name=n;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int arrLen = arr.length;

        Arr ArObj[]= new Arr[3];

        ArObj[0]=new Arr(1,"meh");
        ArObj[1]=new Arr(2,"vik");
        ArObj[2]=new Arr(3,"thre");

        for (int i = 0; i < ArObj.length; i++) {
            System.out.println("Roll No : "+ ArObj[i].rollNo + " is "+ArObj[i].name);
            
        }



        for(int i=0; i <arrLen; i++){
            System.out.println("Hello world");

        }

        int arr2[]=new int[9];

        for(int i =0;i<9;i++){
            arr2[i]=i;
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println("arr2[i] isss"+arr2[i]);
        }
    }
    

     
    

}