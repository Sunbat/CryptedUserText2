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
}