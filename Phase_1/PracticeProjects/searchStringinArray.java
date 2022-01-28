package phase1;
import java.util.Scanner;

public class searchStringinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			    String[] emailID = {"siva29@gmail.com", "murugan@gmail.com", "guruvishnu2000@gmail.com", "vijay22@gmail.com", "srini3001@gmail.com"};
			    Scanner in=new Scanner(System.in);
			    System.out.println("Enter the email id:");
			    String toSearch=in.nextLine();
			    boolean found=false;

			    for (String n : emailID) {
			      if (n.equals(toSearch)){
			            found=true;
			            break;
			      }
			      }
			 
			    if(found) {
			    	System.out.println(toSearch + " is found");
			    }
			 else {
			    	System.out.println(toSearch + " is not found");
			    }
	}
}