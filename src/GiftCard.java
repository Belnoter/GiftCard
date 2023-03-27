import java.util.ArrayList;

public class GiftCard {

    public double balance;
    public ArrayList<Double> transactionHistory = new ArrayList<>();
    private boolean blocked = false;



    public GiftCard(double balance){
        this.balance = balance;
    }

    public void pay(double amount){

        if(this.balance <= 0){
            System.out.println("Insufficient funds");
        }

        balance -= amount;
        System.out.println("Succesfully paid " + amount + "!");
        transactionHistory.add(amount);
    }

    public double printTransactionHistory(){

        if(transactionHistory.size() == 0){
            System.out.println("no prior transactions");
        }

        for(Double transaction : transactionHistory){
            System.out.println(transaction);

        }
        return 0;
    }

    public void isBlocked(){
        this.blocked = true;
    }

    public boolean getBlocked(){
        return this.blocked;
    }



}
