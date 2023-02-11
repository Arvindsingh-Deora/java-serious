5import java.util.Scanner;
  public class Guessnumber{
    public static void main(String[] args){
     int number = (int)(Math.random()*101);
      Scanner input = new Scanner(System.in);
       System.out.println(" Guess a number between 0 to 100 ");
         
       int guess = -1;
        while(guess != number){
		  System.out.println("Enter your guess number:");
               guess = input.nextInt();
 if(guess == number)
      System.out.println(" yes the number is " +number);
 else if(guess > number)
     System.out.println("Your guess is to high");
else 
    System.out.println("Your guess is too low");
   

    }
  
 }
}