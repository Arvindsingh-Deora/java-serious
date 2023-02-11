import java.util.Scanner;
 public class Random{
  public static void main(String[] args){
    int number1 = (int)(Math.random()*20);
    int number2 = (int)(Math.random()*10);
       System.out.println("what is your" +number1+ "+" +number2+ "?");
         Scanner input = new Scanner(System.in);
          int answer = input.nextInt();
 		if(number1 + number2 == answer){
		System.out.println("You are correct");
      }
            else 
			System.out.println("you are not correct");	
  }
}