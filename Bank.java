
class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        // setPassword(randomPass);
        return this.password;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Vinay kumar shivakoti";
        account1.email= "skvk3888@gmail.com";
        account1.setPassword("tirunalveli");
        System.out.println(account1.getPassword());
    }
    
}
