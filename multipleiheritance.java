package Oops;

public class multipleiheritance {
    public static void main(String[] args) {
        uses obj = new uses();
        obj.add();
        obj.div();

    }
    
}

class uses implements sums, division {
    public void add()
    {
        int a, b, c;
        a = 5;
        b = 4;
        c = a + b;
        System.out.println("Sum Result is = " + c);
    }

    public void div()
    {
        int a, b, c;
        a = 5;
        b = 4;
        c = a / b;
        System.out.println("Division result is = " + c);
    }
}
interface sums {
    void add();//declaring function
}
interface division {
    void div();// declaring function
}