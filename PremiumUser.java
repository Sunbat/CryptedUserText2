class PremiumUser extends User{
    private String key;
    private int gameScore;

    public PremiumUser(user, pass, first, last, keyPass, Score){
        super(user, pass, first, last);
        key = keypass;
        gameScore = Score;
    }

    public int getScore(){
        return gameScore;
    }
}