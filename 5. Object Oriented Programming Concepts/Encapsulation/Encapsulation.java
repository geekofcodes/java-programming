class ATM {
    private String CustName;
    private double PhnNo;
    private double AccBal;

    public ATM(String CustName, double PhnNo, double AccBal){
        this.CustName = CustName;
        this.PhnNo = PhnNo;
        this.AccBal = AccBal;
        System.out.println("The Customer Name is: " + CustName);
        System.out.println("your Account Balance is: " + AccBal);
    }

    public void withdraw(double amount){
        if(AccBal<amount){
            System.out.println("Insufficient Funds.");
        } else{
            AccBal = AccBal - amount;
            System.out.println("Your remaining balance is: " + AccBal);
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        ATM atm1 = new ATM("G Madhu Sudan Reddy", 9988776655d, 5000);
//        atm1.CustName = "G Madhu Sudan Reddy";
//        atm1.PhnNo = 9988776655d;
//        atm1.AccBal = 5000;
//        System.out.println("The Customer Name is: " + atm1.CustName);
        atm1.withdraw(4000);
    }
}
