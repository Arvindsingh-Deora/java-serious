import java.util.Scanner;

public class Celsius
{
 public static void main(String[] args)

 {
   Scanner input = new Scanner(System.in);

    System.out.println("Enter a degree in fahrenheit: ");
    double fahrenheit = input.nextDouble();

    double celsius = (5.0/9)*(fahrenheit - 32);
	System.out.println( " fahrenheit " + fahrenheit+ "is" + celsius+ " in celsius");
       




 }

}