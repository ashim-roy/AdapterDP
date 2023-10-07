import YesBankAPI;
public class YesBankAPIAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        yesBankAPI.getBalance(accountNumber);
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}