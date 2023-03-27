public class Main {
    public static void main(String[] args) {


            Account firstAccount = new Account(1, "3aab3cd", 36900);
         System.out.println(firstAccount.createPassword("323231ada"));
        System.out.println(firstAccount.createPassword("abcd3"));
           // firstAccount.storePassword(firstAccount.createPassword("323231ada"));
            //System.out.println(firstAccount.getStoredPassword(firstAccount.createPassword("323231ada")));
            firstAccount.logIn(1, "3aab3cd".toCharArray());
            GiftCard giftCard = new GiftCard(700);
            firstAccount.topUp(giftCard, 0);
        System.out.println(giftCard.balance);
        System.out.println(firstAccount.getBalance());
        giftCard.pay(300);
        giftCard.pay(400);
        giftCard.printTransactionHistory();
        System.out.println();
        System.out.println("Second giftcard");

        GiftCard giftCard2 = new GiftCard(1000);
        giftCard2.pay(100);
        giftCard2.pay(69);
        giftCard2.pay(300);
        giftCard2.printTransactionHistory();
        System.out.println(giftCard2.balance);

        giftCard2.isBlocked();
        firstAccount.topUp(giftCard2, 100);
        System.out.println(giftCard2.balance);
    }
}