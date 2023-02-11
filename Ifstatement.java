import java.util.Scanner;
 public class Ifstatement{
   public static void main(String[] args){
     Scanner input = new Scanner(System.in);
	 System.out.println("Enter an integer:");
        int integer = input.nextInt();
		if(integer>12){
   			System.out.println(" number has a great scope:" +integer+ " than 12");
              }
           else if(integer == 12){
			   			System.out.println("number has a greatest of all time:" +integer);
           }
 			else if(integer < 12){
				System.out.println(" number is less than 12:");
			}
        else 
              System.out.println(" get out of the room");
     

  }
}