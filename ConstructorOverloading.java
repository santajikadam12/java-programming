package Oops;

public class ConstructorOverloading {
    //overloading:-Constructor name is but different parameter
    ConstructorOverloading(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    ConstructorOverloading(int i,int j, String f){
        int k = i*j;
        System.out.println(f+k);

    }
    
    
public static void main(String[] args) {
    ConstructorOverloading o1 = new ConstructorOverloading(2,3, "addition=");
    ConstructorOverloading o2= new ConstructorOverloading(5,6, "multipication=");
}
}