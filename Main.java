import java.util.Scanner; 
import User;
import PremiumUser;
class Main {
    public static void main(String[] args) {

    
      System.out.println("Do you want to login or register?");
      System.out.println("Type: 'login' or 'L', 'register' or 'R'");
      Scanner userInput = new Scanner(System.in);
      if(userInput.equals('L') || userInput.equals('login') || userInput.equals('Login')){

      }
      else if(userInput.equals('r') || userInput.equals('register') || userInput.equals('R')){
        System.out.println("Input your username");
        Scanner userName = new Scanner(System.in);
        System.out.println("Input your first name");
        Scanner firstName = new Scanner(System.in);
        System.out.println("Input your last name");
        Scanner lastName = new Scanner(System.in);
        System.out.println("Input your password (has to be at least 8 characters):");
        Scanner password = new Scanner(System.in);
        User you = new User(username, password, firstName, lastName);

        System.out.println("Do you want to upgrade your account?");
        System.out.println("Perks include encrypted messages, added security features, and extra bonus content such as games like rock paper scissors.");
        System.out.println("Type 'Yes' or 'No'");
        Scanner upgrade = new Scanner(System.in);

        if(upgrade.equals('Yes')){

        }
        else if(upgrade.equals('No')){}
      }
      System.out.println("Type 'help' to see a list of commands you can use.");
    }
  }