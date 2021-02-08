package oops;

public class ExampleIheritance { 
        public static void main(String[] args) {
        carclass o1 = new carclass();
        o1.fun();
        o1.fun2();
        }
    }
        class vechiclecalss{
            public void fun(){
                System.out.println("Iam vechicle class");
            }
        }
        class carclass extends vechiclecalss{
            public void fun2(){
                System.out.println("Iam car class");

            }
        }
            // Multileveliheritance
           class a{   
               public void b(){
                   System.out.println("class a having class b");
               }
            }
            class b{
                public void c(){
                    System.out.println("class b having  class c");
                }

            }
                
            
            class c{
                public void b(){
                    System.out.println("class c having properties of class b");
                }
            }
    

    