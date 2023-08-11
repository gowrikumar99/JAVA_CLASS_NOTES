public class Account {
    private int Number;
    private double Balence;
    private String Name;
    private String Email;
    private int PhoneNumber;

   public Account(int Number,double Balence,String Name,String Email,int PhoneNumber){
    this.Number=Number;
    this.Balence=Balence;
    this.Name=Name;
    this.Email=Email;
    this.PhoneNumber=PhoneNumber;
   }

    public int getNumber() {
        return Number;
    }
    public void setNumber(int number) {
        Number = number;
    }
    public double getBalence() {
        return Balence;
    }
    public void setBalence(double balence) {
        Balence = balence;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public int getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

// lets create deposit method
   public void DepositMoney(double DepositedMoney){  // deposit method
      this.Balence+=DepositedMoney;
      System.out.println("Deposit is Successfully, Present Balence is " +this.Balence);
   }

   // lets create withdraw money
   public void withdrawMoney(double WithdrawalMoney){  // withdrawal method
      if(this.Balence-WithdrawalMoney<0){
        System.out.println("WithDraw unsusccessfully only : " +this.Balence+" Not suffcient Balence");
     }else{
        this.Balence-=WithdrawalMoney;
        System.out.println("WithDraw successfully,  current Balence is : " +this.Balence);
     }
   }

}
