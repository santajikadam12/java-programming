
//Find big number using method
public class P_Method {
public static void main(String[] args) {
    P_Method obj = new P_Method();
    obj.bigNumber();
}
public void  bigNumber() {
    int x,y,z;
    x = 40;
    y =  25;
    z = 50;
    if(x >= y){
        if(x>=z){
        System.out.println("Big Number is ="+x);
     } else{
         System.out.println("Big Number is ="+z);
     }

     } else{
        if (y >= z){

           System.out.println("Big Number is= " +y);
        
} else{
             System.out.println("Big Number is= " +z);
    }
}
    }
}




