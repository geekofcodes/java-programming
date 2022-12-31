public class GroceryMart {

    private String CustName;
    private String CustID;
    private String CustPhnNo;
    private double AccBalance;
    private String CustAddr;

    public String getCustName() {
        return CustName;
    }

    public void setCustName(String custName) {
        CustName = custName;
    }

    public String getCustID() {
        return CustID;
    }

    public void setCustID(String custID) {
        CustID = custID;
    }

    public String getCustPhnNo() {
        return CustPhnNo;
    }

    public void setCustPhnNo(String custPhnNo) {
        CustPhnNo = custPhnNo;
    }

    public double getAccBalance() {
        return AccBalance;
    }

    public void setAccBalance(double accBalance) {
        AccBalance = accBalance;
    }

    public String getCustAddr() {
        return CustAddr;
    }

    public void setCustAddr(String custAddr) {
        CustAddr = custAddr;
    }

    public void Shop(double amount){
        if(AccBalance>=amount) {
            double remBalance = AccBalance - amount;
            System.out.println("Thanks for Shopping. Your remaining balance is " + remBalance);
            AccBalance = remBalance;
        } else{
            double lowBalance = amount - AccBalance;
            System.out.println("Insufficient Funds. Your current balance is " + lowBalance + ". Please Recharge.");
        }
    }

    public void rechargeAcc(double recharge){
        AccBalance = AccBalance + recharge;
        System.out.println("Thanks for Recharging. Your new balance is " + AccBalance);
    }


    public static void main(String[] args) {
        GroceryMart myAccount = new GroceryMart();
        myAccount.setCustName("G Madhu Sudan Reddy");
        myAccount.setCustID("12345");
        myAccount.setCustPhnNo("1234567890");
        myAccount.setAccBalance(600);
        myAccount.setCustAddr("Port Blair");

        myAccount.Shop(750);
        myAccount.rechargeAcc(200);
    }


}
