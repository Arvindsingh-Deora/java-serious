import java.util.Scanner;
public class Radius {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
      System.out.println("Enter the Radius ");
      Double radius = input. nextDouble();
         Double area;
      area = radius*radius*3.14;
       System.out.println(" the area of given radius is  " +radius+  "is " +area );
    }
    
}
