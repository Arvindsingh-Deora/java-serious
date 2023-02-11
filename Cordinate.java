import java.util.Scanner;
   public class Cordinate{
       public static void main(String[] args){
          Scanner input = new Scanner(System.in);
         System.out.println("Enter the value of m1: ");
                   int m1 = input.nextInt();

       System.out.println("Enter the value of m2: ");
                   int m2 = input.nextInt();


         System.out.println("Enter the value of x1: ");
                   int x1 = input.nextInt();



          System.out.println("Enter the value of x2: ");
                   int x2 = input.nextInt();


      System.out.println("Enter the value of y1: ");
                   int y1 = input.nextInt();

      System.out.println("Enter the value of y2: ");
                   int y2 = input.nextInt();

            int  x = (m1*(x2)) +(m2*(x1))/ (m1+m2 );
             int  y = (m1*(y2)) + (m2*(y1))/ (m1+m2);

      System.out.println(" the value of x is " +x + "and the value of y is " +y);



}


}