import java.util.Scanner; 
// import User;
// import PremiumUser;
public class App {
    public static void main(String[] args) {

    
      System.out.println("Do you want to login or register?");
      System.out.println("Type: 'login' or 'L', 'register' or 'R'");
      Scanner ask = new Scanner(System.in);
      String userInput = ask.nextLine();
      
      if(userInput == "r" || userInput == "register" || userInput == "R"){
        // String userName = myObj.nextLine();  // Read user input
        Scanner input = new Scanner(System.in);
        System.out.println("Input your username");
        String userName = input.nextLine();

        System.out.println("Input your first name");
        String firstName = input.nextLine();
        System.out.println("Input your last name");
        String lastName = input.nextLine();
        System.out.println("Input your password (has to be at least 8 characters):");
        String password = input.nextLine();
        User you = new User(userName, password, firstName, lastName);

        System.out.println("Do you want to upgrade your account?");
        System.out.println("Perks include encrypted messages, added security features, and extra bonus content such as games like rock paper scissors.");
        System.out.println("Type 'Yes' or 'No'");
        String upgrade = input.nextLine();

        if(upgrade.equals("Yes")){

        }
        else if(upgrade.equals("No")){}
      }
      else if(userInput == "L" || userInput == "Login" || userInput == "l" || userInput == "login"){

      }
      System.out.println("Type 'help' to see a list of commands you can use.");
      userInput = ask.nextLine();
    }
  }