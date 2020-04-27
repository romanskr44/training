package oop;

public class BankAccountApp {
    public static void main(String[] args){

    BankAccount acc1 = new BankAccount();

      //  acc1.name = "Roger Hue";
      // With Encapsulation : public API methods
    acc1.setName("Roger Hue");
    System.out.println(acc1.getName());
    acc1.setSin("4353452");
    System.out.println("SIN: " + acc1.getSin());

    acc1.accountNumber = "0134234";
    acc1.balance = 10000;
    acc1.setRate();
    acc1.increaseRate();

    acc1.deposit(1500);



    //Polymorphism through overriding
    System.out.println(acc1.toString());


    //Polymorphism through overloading
    BankAccount acc2 = new BankAccount("Checking account");
    acc2.accountNumber = "0134234";
    //acc2.routingNumber = "34564";

    BankAccount acc3 = new BankAccount("Savings account",5000);
    acc3.accountNumber = "0134234";

    /*
    acc3.checkBalance();

     //Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.interestRate = "4.5";
        cd1.name = "Juan";
        cd1.acoountType = "CD Account ";
        System.out.println(cd1.toString());
        cd1.compount();
    */
    }

}
