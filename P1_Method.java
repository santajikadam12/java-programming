public class P1_Method {
    public static void main(String[] args) {
        P1_Method obj = new P1_Method();
        obj.func1(10,15);
        obj.func1(10,12.000);
    }
    public void func1(int x, int y){
        int z= x*y;
        System.out.println("your Multiplication is ="+z);
    }
    public void func1(int x, double f){
        double p = f+x;
        System.out.println(p);
    }
}
    
