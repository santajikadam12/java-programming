import java.util.Scanner;

class MyProg{
    public static void main(String[] args){
        double num1;
        double num2;
        double res;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        num1= sc.nextDouble();
        System.out.println("Enter the second number:");
        num2= sc.nextDouble();

        res=num1+num2;
        System.out.println("Summation: "+res);
        res=num1-num2;
        System.out.println("Subtraction: "+res);
        res=num1*num2;
        System.out.println("Multiplication: "+res);
        res=num1/num2;
        System.out.println("Division: "+res);
    }
}
    

