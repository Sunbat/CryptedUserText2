class PremiumUser extends User{
    private String key;
    private int gameScore;

    public PremiumUser(String user, String pass, String first,String last, String keyPass, int Score){
        super(user, keyPass, first, last);
        key = keyPass;
        gameScore = Score;
    }

    public int getScore(){
        return gameScore;
    }
}