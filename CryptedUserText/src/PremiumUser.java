class PremiumUser extends User{
    private String key;
    private int gameScore;
    String newline = System.lineSeparator();

    public PremiumUser(String user, String pass, String first,String last, String keyPass, int Score){
        super(user, keyPass, first, last);
        key = keyPass;
        gameScore = Score;
    }

    // 1. Type 'Read' to decrypt a message
      // 2. Type 'Send' to send a message (message is encrypted if you're a premium user)
      // 3. Type 'Login' to login another user
      // 4. Type 'Register' to register another user
      // 5. Type 'Play' to play games
      // 6. Stop to end

    public String menu(){
        return "1. Type 'Read' to decrypt a message%n2.Type 'Send' to send a message (message is encrypted if you're a premium user)%n3Type 'Login' to login another user%n4.Type 'Register' to register another user%n5.Type 'Play' to play games%n6. Type 'Stop' to end the session";
    }

    public int getScore(){
        return gameScore;
    }
}