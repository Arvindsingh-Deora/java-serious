import java.util.Scanner;
 public class Test{
    public static void main(String[] args){
        Double  Average;
        
         Scanner input = new Scanner(System.in);

      System.out.println("Enter the value " );
     
      double number1 = input.nextDouble();
      double number2 = input.nextDouble();
      double number3 = input.nextDouble();

        Average = number1+number2+number3/3;

        System.out.println("the average of three number is " +Average);
    }
 }
