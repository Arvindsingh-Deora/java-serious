public class Student{
 public static void main(String[] args){
       
		 Double[] student = new Double[10];
  java.util.Scanner input = new java.util.Scanner(System.in);
     for( int i=0; i<student.length; i++){
         System.out.println("Enter the " +student.length + "values");
           student[i] = input.nextDouble();
			for ( Double e: student){
                    System.out.println(e);
           }

      }


  }

}