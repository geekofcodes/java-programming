public class GroceryMart2 {

        /*
        Program for Constructor
         */
        private String CustName;
        private String CustID;
        private String CustPhnNo;
        private double AccBalance;
        private String CustAddr;

        public GroceryMart2(){
            System.out.println("Default Constructor Called.");
        }

        public GroceryMart2(String CustName, String CustID, String CustPhnNo, double AccBalance, String CustAddr){
            this.CustName = CustName;
            this.CustID = CustID;
            this.CustPhnNo = CustPhnNo;
            this.AccBalance = AccBalance;
            this.CustAddr = CustAddr;
            System.out.println("Parameterised Constructor Called.");
        }

        public static void main(String[] args) {
            GroceryMart2 myAccount = new GroceryMart2();
            GroceryMart2 myAccount2 = new GroceryMart2("G Madhu Sudan Reddy", "12345", "1234567890", 600, "Port Blair");

        }


}


