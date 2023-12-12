import java.util.ArrayList;
import java.util.Scanner; 
// import User;
// import PremiumUser;
public class App {
    public static void main(String[] args) {
      

    
      System.out.println("Do you want to login or register?");
      System.out.println("Type: 'login' or 'L', 'register' or 'R'");
      Scanner ask = new Scanner(System.in);
      String userInput = ask.nextLine();
      
      if(userInput.equals("r") || userInput.equals("register") || userInput.equals("R")){
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
          String keyPass;
          System.out.println("Input your pin, it will be used to encrypt and decrypt your messages with other users");
          keyPass = input.nextLine();
          PremiumUser yessir = new PremiumUser(userName, password, firstName, lastName, keyPass, 0);

        }
        else if(upgrade.equals("No")){
          System.out.println("Are you sure you don't want to ");
        }
      }
      else if(userInput == "L" || userInput == "Login" || userInput == "l" || userInput == "login"){

      }
      // options after logging in, do you want to add another user
      // cant ask to play without adding another user
      // 1. Type 'Read' to decrypt a message
      // 2. Type 'Send' to send a message (message is encrypted if you're a premium user)
      // 3. Type 'Login' to login another user
      // 4. Type 'Register' to register another user
      // 5. Type 'Play' to play games
      // 6. Type 'Logout' to logout a user
      // 7. Type 'Stop' to end the session
      userInput = ask.nextLine();

      Boolean allGas = true;
      User johnDoe = new User();
      ArrayList<User> allUsers = new ArrayList<>();
      ArrayList<PremiumUser> allPremiumUsers = new ArrayList<>();
      


      while (allGas) {
        System.out.println("All active Premium users: ");
        for(int i = 0; i < allPremiumUsers.size() - 1; i++){
          System.out.println();
        }
        System.out.println("All active basic users");
        for(int i = 0; i < allUsers.size() -1; i++){}
        johnDoe.getMenu();
        
        
        userInput = ask.nextLine();
        if(userInput.equals("Stop") || userInput.equals("stop")){
          allGas = false;
        }
        else if(userInput.equals("r") || userInput.equals("register") || userInput.equals("R")){
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
          allUsers.add(you);

          System.out.println("Do you want to upgrade your account?");
          System.out.println("Perks include encrypted messages, added security features, and extra bonus content such as games like rock paper scissors.");
          System.out.println("Type 'Yes' or 'No'");
          String upgrade = input.nextLine();

          if(upgrade.equals("Yes")){
            String keyPass;
            System.out.println("Input your pin, it will be used to encrypt and decrypt your messages with other users");
            keyPass = input.nextLine();
            PremiumUser yessir = new PremiumUser(userName, password, firstName, lastName, keyPass, 0);
            allPremiumUsers.add(yessir);
            allUsers.remove(allUsers.size() -1);

          }
        }
        else if(userInput.equals("L") || userInput.equals("Login") || userInput.equals("login")){}
        else if(userInput.equals("Read") || userInput.equals("read")){}
        else if(userInput.equals("Logout") || userInput.equals("logout")){
          System.out.println("Are you a premium user. Type 'Yes' or type 'No'");

          String logger = ask.nextLine();

        }
        else if(userInput.equals("Play") || userInput.equals("play")){
          if(allPremiumUsers.size() < 2){
            System.out.println("There aren't enough premium users to play");

          }
        }
        else if(userInput.equals("Send") || userInput.equals("send")){}

        
        
      }
    }
  }