public class Main{
    public static void main(String[] args) {
        // simple banking app
        // customer name,customer Account number
        //customer Email,Balance,Phone number
        //user can deposit money and withdraw money
        
        Account Gowri = new Account(12345,0.0,"kumar",
                            "Gowri@123gmail.com",123456);
        Gowri.DepositMoney(100);
        //Gowri.DepositMoney(150);
        Gowri.withdrawMoney(200);
    
    
    }
}