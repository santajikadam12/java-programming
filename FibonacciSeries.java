public class FibonacciSeries {
    public static void main(String[] args) {
        String name;
        int age;
        String designation;
        int salary;
        int n = 0, a=0, b=1;
        int fact =1;
        System.out.println("write your name");
        
        name = obj.next();
        System.out.println("Enter your age");
        age = obj.nextInt();
        if(age >=25){
            while(n<age){
                System.out.println(a +"");
                a = b;
                b= a+b;
                n++;

            }
        }
    System.out.println("Enter Your Designsation");
    designation = obj.next();
    if(designation.equals("Professor")){
        System.out.println("welcome to ADYPU");
    }
    System.out.println("Enter your salary");
    if(salary >=10000){
        for(int i = age; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("Factorial of" +age+"is"+fact);
    }

        }
    }
    