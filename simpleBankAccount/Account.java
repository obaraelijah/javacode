package simpleBankAccount;

public class Account {
    private String Number;
    private double Balance;
    private String Name;
    private String Email;
    private String PhoneNumber;

    public Account(String Number, double Balance , 
    String Name, String Email, String PhoneNumber)
    {
        this.Number = Number;
        this.Balance = Balance;
        this.Name = Name;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    //Deposit 
    public void DepositMoney(double DepositMoney)
    {
        this.Balance += DepositMoney;
        System.out.println("Deposit is successful, new Balance is " + this.Balance);
    }

    //withdraw
    public void WithdrawMoney(double WithdrawMoney)
    {
        if(this.Balance - WithdrawMoney < 0)
        {
            System.out.println("Withdraw Unseccessful only" + this.Balance + "is left");
        }else
        {
            this.Balance -=WithdrawMoney;
            System.out.println("Withdwal successfully, Current Balance is " + this.Balance);
        }
    }

    public String getNumber() {
        return Number;
    }
    public void setNumber(String number) {
        Number = number;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        Balance = balance;
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
    public String getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


}
