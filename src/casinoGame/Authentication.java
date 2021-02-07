package casinoGame;

public class Authentication {

    private String Userame;
    private String PassWord;
   private int currency;

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return Userame + ", " + PassWord + ", " + currency ;
    }

   

    public Authentication(String Userame, String PassWord, int currency) {
        this.Userame = Userame;
        this.PassWord = PassWord;
        this.currency = currency;
    }

  

    public String getUserame() {
        return Userame;
    }

    public void setUserame(String Userame) {
        this.Userame = Userame;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String PassWord) {
        this.PassWord = PassWord;
    }

 

  

}
