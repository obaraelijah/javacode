package simpleBankAccount;

public class Main {
    public static void main(String[] args)
    {
        Account samsAccount = new Account("121212",0,"sam","sam@xyz.com","1212121");
        samsAccount.DepositMoney(4500);
        samsAccount.WithdrawMoney(3500);
    }
}
