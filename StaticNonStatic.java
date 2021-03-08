public class StaticNonStatic{
  static int staticvalue =10;
  int nonstaticvalue= 20;
  public static void main(String[] args) {
      //we can call this way also
      System.out.println("It will be call without object of the class" +staticvalue);
      //we can call static member with the name of the class
      System.out.println("It will be call without object of the class"+StaticNonStatic.staticvalue);
      //but Non Static member can be call only by the objectof the class
StaticNonStatic obj = new StaticNonStatic();
System.out.println("It will be call with object of the class"+ obj.nonstaticvalue);   
  }
}
    

