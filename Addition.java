import java.util.Scanner;
 public class Addition{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        int sum ;
      System.out.println("Enter the value of first number:" );
        int first = input.nextInt();
      System.out.println("Enter the value of Second Number:" );
         int second = input.nextInt();
            sum = first+second;
      System.out.println(" the sum of your given value is:" +sum);

}

}