import java.util.Scanner;

public class FirstLast {

	public static void main(String[] args) {
		
        String firstName;
        String lastName;
        String firstIni;
        String lastIni;
        String initials;
        int firstNameNum;
        int lastNameNum;

        System.out.println("Please enter your first and last name, separated by a space: ");

        Scanner sc = new Scanner (System.in);
        firstName  = sc.next();
        lastName = sc.next();

        firstNameNum = firstName.length();
        lastNameNum = lastName.length();

        firstIni = firstName.substring(0, 1);
        lastIni = lastName.substring(0, 1);
        initials = firstIni + "" + lastIni;

        System.out.println("Hello there " + firstName + " I have your first name as " + firstName + ", which has " + firstNameNum + " characters.");
        System.out.println("Hello again " + firstName + " I have your last name as " + lastName + ", which has " + lastNameNum + " characters.");
        System.out.println("Did you know that your initials are " + initials);
        
        sc.close();
	}

}
