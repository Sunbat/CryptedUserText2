public class User{
    String username;
    String firstName;
    String lastName;
    String password;
    
    public User( String user, String pass, String first, String last){
        username = user;
        password = pass;
        firstName = first;
        lastName = last;

    }

    public User(){
        username = "JohnDoer";
        password = "password";
        firstName = "John";
        lastName = "Doe";
    }
    
    public String[] getUser(){
        String[] userInfo = {username, firstName, lastName};
        return userInfo;
    }

    public String getUserName(){
        return username;
    }

    public String getNames(){
        return firstName + " " + lastName;
    }

    public String getMenu(){
        String everything = "1. Type 'Read' to decrypt a message%n2.Type 'Send' to send a message (message is encrypted if you're a premium user)%n3Type 'Login' to login another user%n4.Type 'Register' to register another user%n5.Type 'Play' to play games%n6. Type 'Stop' to end the session";
        return everything;
    }
}