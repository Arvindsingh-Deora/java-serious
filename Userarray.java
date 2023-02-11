import java.util.Scanner;
  public class Userarray{
   public static void main(String[] args){
     
     Scanner input = new Scanner(System.in);
      int mylist[] = new int[2];
      System.out.println(" Enter your array:" +mylist.length + "values");
        for(int i = 0; i<mylist.length; i++){
           mylist[i] = input.nextInt();
             
 			System.out.println(mylist[i]);

        
             
     }
  }
}



 