import java.util.Scanner;
public class Selection {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value ");
        double value = input.nextDouble();
        if(value < 0){
            System.out.println("invalid value");
        }
       else
         System.out.println("the given value is postive");



    }
}
