public class BankAccount {
  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int accountID, String password){
    this.accountID = accountID;
    this.password = password;
    this.balance = 0;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String newPass){
    this.password = newPass;
  }

  public boolean deposit(double amount){
    if (amount >= 0) {
      this.balance += amount;
      return true;
    }
    else {
      return false;
    }
  }

  public boolean withdraw(double amount){
    if (amount < 0) {
      return false;
    }
    if ((this.balance - amount) >= 0) {
      this.balance -= amount;
      return true;
    }
    else {
      return false;
    }
  }

  public String toString(){
    return this.accountID + "\t" + this.balance;
  }
}
