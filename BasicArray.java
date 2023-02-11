public class BasicArray{
   public static void main(String[] args){
     
   java.util.Scanner input = new java.util.Scanner(System.in);
	System.out.println("Enter the number of input you want:  ");
     int n = input.nextInt();
		int[] age = new int[n];
      System.out.println(" Enter your value :");
             for(int i = 0; i<age.length;i++){
		   age[i] = input.nextInt();
           
}
 System.out.println("your given array is this :");

      for(int e: age){
        System.out.println(e);
   }


  }

}