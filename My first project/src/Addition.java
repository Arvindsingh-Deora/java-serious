import java.util.Scanner;
public class Addition {
    public static void main(String[] args){
        Double answer;
        
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the both the number");
       Double number1 = input.nextDouble();
       Double number2 = input.nextDouble();

       answer = number1+number2;
       if(answer = number1+number2){
             System.out.println("true");
       }
    else
    System.out.println("false");

    }
}
