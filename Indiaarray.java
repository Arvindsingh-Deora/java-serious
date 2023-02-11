public class Indiaarray{
  public static void main(String[] args){
    java.util.Scanner input = new java.util.Scanner(System.in);
      
        System.out.println("enter how many values you want to sum: ");
            int n = input.nextInt();
			   int[] sum = new int[n];
                 int   total = 0;
              for( int i=0; i<sum.length; i++){
				  
                 

                     System.out.println("Enter the value of sum: ");
                       
                       int[] values = input.nextInt(n);
			  
                   total += values ;
                     System.out.println(" so your desire no of total is this:" + total + " ");

        }
    }
 }