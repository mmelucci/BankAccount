public class accountTester {
  public static void main (String[] args) {
    BankAccount myaccount = new BankAccount(123112233, "mypassword");

    System.out.println("Account myaccount:");
    System.out.println(myaccount.getAccountID());
    System.out.println(myaccount.getBalance());
    myaccount.deposit(500.0);
    System.out.println(myaccount.getBalance());
    if (myaccount.deposit(-5.0) == false) {
      System.out.println("Deposit Failed");
      System.out.println(myaccount.getBalance());

    }
  }
}
