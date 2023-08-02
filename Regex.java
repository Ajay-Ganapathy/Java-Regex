import java.util.Scanner;

public class Regex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        int flag2 = 1;
        int flag3 = 1;
        int flag4 = 1;

        // Prompt for username input
        System.out.print("Enter userName: ");
        while(flag == 1){
          if(isValidUsername(scanner.nextLine())){
            System.out.println("User Name is Valid");
            flag = 0;
          }else{
            System.out.println("Invalid UserName : Re enter the Name! User Name must contain only alphanumeric characters and underscore. It must be minimum 6 characters and maximum 12 characters !");
             System.out.println("Enter userName :");
            flag = 1;
          }

        }
        // String username = scanner.nextLine();

        // // Validate username
        // if (isValidUsername(username)) {
        //     System.out.println("Username is valid.");
        // } else {
        //     System.out.println("Username is not valid.");
        // }

      

         System.out.print("Enter Name: ");
        while(flag2 == 1){
          if(isValidName(scanner.nextLine())){
            System.out.println("Name is Valid");
            flag2 = 0;
          }else{
            System.out.println("Invalid Name");
             System.out.println("Enter Name :");
            flag2 = 1;
          }

        }
       

         System.out.print("Enter Email Address : ");
        while(flag3 == 1){
          if(isValidEmail(scanner.nextLine())){
            System.out.println("Email is Valid");
            flag3 = 0;
          }else{
            System.out.println("Invalid Email");
             System.out.println("Enter Email Address :");
            flag3 = 1;
          }

        }

        System.out.print("Enter Phone Number : ");
        while(flag4 == 1){
          if(isValidPhoneNumber(scanner.nextLine())){
            System.out.println("Phone Number is Valid");
            flag4 = 0;
          }else{
            System.out.println("Invalid Phone Number");
             System.out.println("Enter Phone Number :");
            flag4 = 1;
          }

        }

        System.out.println("Thanks for Entering the details ! ");
        

        scanner.close();
    }

    private static boolean isValidUsername(String username) {
        // Username should only contain alphanumeric characters and underscores.
        String regex = "^[a-zA-Z0-9_]{6,12}$";
        return username.matches(regex);
    }
    
    public static boolean isValidName(String name){
        //String regex = "^[a-zA-Z]\\s*[a-z][A-Z]*$";
        String regex = "[a-zA-Z]+\\s*[a-zA-Z\\sa-zA-Z]*$";

        return name.matches(regex);
    }

    private static boolean isValidEmail(String email) {
        // Basic email validation using regular expression.
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regex);
    }

    private static boolean isValidPhoneNumber(String phoneNumber) {
        // Phone number validation (simple pattern for demonstration purposes).
        String regex = "^[0-9]{10}$"; // Assumes 10-digit phone number.
        return phoneNumber.matches(regex);
    }
}
