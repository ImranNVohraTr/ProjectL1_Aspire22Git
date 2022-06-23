package projectlvl1;

import java.util.Scanner;

public class ChMS {
	public static void main(String[] args) {
		System.out.println("****************************************");
		System.out.println("**               Welcome              **");
		System.out.println("**                 to                 **");
		System.out.println("**       FSA Charity Organization!    **");
		System.out.println("****************************************");
		System.out.println("\n\n");
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you an existing member? Type y for yes. Type n for no.");
		String ismember=scan.next();
		
		//Direct the user to log in or to register as a member based on the input received
		/*if(ismember=="y") {
			System.out.println("You entered: "+ismember+"\nPlease log in using your username and password.");
			
		}else if(ismember=="n") {
			System.out.println("You entered: "+ismember+"\nPlease register with us to avail our services.");
			
		}else if(ismember=="a"){
			System.out.println("You entered: "+ismember+"\nInvalid entry. Please enter either y or n as applicable.");
			
		}*/
		
		switch (ismember) {
		case "y": {
			System.out.println("You entered: "+ismember+"\nPlease log in using your username and password.");
			
			break;
		}
		case "n": {
			System.out.println("You entered: "+ismember+"\nPlease register with us to avail our services.");
			
			break;
		}
		default:
			System.out.println("You entered: "+ismember+"\nInvalid entry. Please enter either y or n as applicable.");
		}
		
		scan.close();
		
	}
	
	void register() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your first name: ");
		String dfirstname=sc.nextLine();
		System.out.println("First name: "+dfirstname);
		
		System.out.print("Enter your last name: ");
		String dlastname=sc.nextLine();
		System.out.println("First name: "+dlastname);
		
		System.out.print("Enter your email address: ");
		String demailid=sc.nextLine();
		System.out.println("Email id: "+demailid);
		
		System.out.println("Enter your mobile phone number: ");
		String dmobileno=sc.next();
		System.out.println("Mobile number: "+dmobileno);
		
		
		sc.close();
		
	}

}
