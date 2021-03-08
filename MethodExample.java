public class MethodExample {
    public static void main(String[] args) {
        System.out.println("Hi i am Function.");

    }

    public void cheaters() {// no arguments & void returntype
        String Cheater1 = "Deepmita";
        String Cheater2 = "Sachin";
        String Cheater3 = "Kadam";
        System.out.println("Chaeter's are:-" + Cheater1 + " " + Cheater2 + " " + Cheater3);
    }

    /*
     * types of operator 1)Addition 2)Subtraction 3)Multiplication
     * 4)Division
     */
    public void number(int a) {// taking parameter & returning nothing
        a++;// 11
        System.out.println("Function type is :-Takes Something & returns nothing" + a);// 6
    }

    public int sum() {// 
        int a, b;
        a = 2;
        b = 3;
        return a + b;
    }

    public char alphabet(char z) {
        return z;
    }

    public static void main(String[] args) { // method
        // function:- piece of code which is called when we need it.
        // function definition
        // function call
        /*
         * syntax:- returntype function_name(pass arguments){ block of code }
         * function_name();
         */
        method o1 = new method();// ignore this
        fun();
        o1.cheaters();
        o1.cheaters();
        o1.cheaters();
        o1.number(10);
        int result = o1.sum();
        System.out.println("Function type is takes nothing returns something" + result);
        char store = o1.alphabet('a');
        System.out.println(store);

    }
}
    }
    
}

