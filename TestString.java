public class TestString { 
    public static void main(String[] args) {
        TestString t = null;
        t.display();
    }
        public static void display(){
            System.out.println("Inside static method");
        }
        public void show(){
            System.out.println("Inside non-static method");

    }
}