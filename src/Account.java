public class Account {
    private static int id;
    private String password;

    private double balance;

    public Account(int id, String password, double balance) {
        this.id++;
        this.password = password;
        this.balance= balance;
    }

    public String createPassword(String password){
        String newPassword = "";
        for(int i = 0; i < password.length();i++){
            char c = (char) password.charAt(i);
                newPassword += (char)(c + Math.random()*10);
            }

        /*char[] newPassword = password.toCharArray();
        for(int i = 0; i < newPassword.length;i++){
            newPassword[i]= (char) (password.charAt(i)+1);
*/
        return newPassword;
    }

    public void storePassword(char[] password){
        char[] storedPassword = password;

    }

    public void logIn(int id, char[]password){

        if(this.id == id && this.password.equalsIgnoreCase(String.valueOf(password))){
            System.out.println( "Succesfully logged in!");
            System.out.println("Id:" + this.id);
            System.out.println("Balance:" + this.balance);

                    }else if(this.id == id && !this.password.equalsIgnoreCase(String.valueOf(password))){
            System.out.println("Wrong Password, try again!");
        }else if(this.id != id && !this.password.equalsIgnoreCase(String.valueOf(password))){
            System.out.println("Wrong Id and password!");
        }else if(this.id != id && this.password.equalsIgnoreCase(String.valueOf(password))){
            System.out.println("Wrong id, try again!");
        }

    }

    public char[] getStoredPassword(char[] storedPassword){
        return storedPassword;

    }

    public void topUp(GiftCard giftcard, double amount){

        if(giftcard.getBlocked()){
            System.out.println("Card is blocked, sorry!");
            
        }else {
            giftcard.balance += amount;
            this.balance -= amount;
        }

    }

    public double getBalance(){
        return balance;



    }
}
