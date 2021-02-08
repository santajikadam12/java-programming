package oops;

public class Exampleconstructoroverloading {
    Exampleconstructoroverloading(int i ,int j){
        int k = i+j;
        System.out.println(k);
    }
    Exampleconstructoroverloading(int p, int q ,String r ){
        int s = p/q;
        System.out.println(r+s);
    }
    public static void main(String[] args) {
        Exampleconstructoroverloading o1 = new  Exampleconstructoverloading(4,5,"addition=");
        Exampleconstructoroverloading o2 = new Exampleconstructoverloading(6,7,"divison=");
    }
}
    
