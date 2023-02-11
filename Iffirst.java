import java.util.Scanner;
   public class Iffirst{
     public static void main(String[] args){
	Scanner input = new Scanner(System.in);
       System.out.println("Enter your integer value:");
		int number = input.nextInt();
            if(number %5 == 0)
			System.out.println("five k table ka hai beta:" +number);
			if(number %5 != 0) 
				System.out.println("tu to mere hi group ka hai:"  +number);

    
   }
}