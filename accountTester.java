public class accountTester {
  public static void main (String[] args) {
    BankAccount myaccount = new BankAccount(123112233, "mypassword");
    BankAccount b1 = new BankAccount(1000001, "abc123");
    BankAccount b2 = new BankAccount(1000231, "abcasdg23");

    System.out.println("Account myaccount:");
    System.out.println(myaccount.getAccountID());
    System.out.println(myaccount.getBalance());
    System.out.println();
    System.out.println("deposit Tests:");
    myaccount.deposit(500.0);
    System.out.println(myaccount.getBalance());
    if (myaccount.deposit(-5.0) == false) {
      System.out.println("Deposit Failed:");
      System.out.println(myaccount.getBalance());
    }
    System.out.println();
    System.out.println("withdraw Tests:");
    myaccount.withdraw(450.0);
    System.out.println(myaccount.getBalance());
    if (myaccount.withdraw(-5.0) == false) {
      System.out.println("Withdrawal Failed:");
      System.out.println(myaccount.getBalance());
    }
    if (myaccount.withdraw(100.0) == false) {
      System.out.println("Withdrawal Failed:");
      System.out.println(myaccount.getBalance());
    }
    System.out.println(myaccount.toString());

    System.out.println();
    System.out.println("toTransfer Tests:");
    b1.deposit(1000.0);
    b2.deposit(500.0);
    System.out.println(b1.toString());
    System.out.println(b2.toString());
    if (b1.transferTo(b2, 100, "wrongpassword") == false) {
      System.out.println("Transfer Failed");
    }
    System.out.println();
    if (b1.transferTo(b2, 100, "abc123") == true) {
      System.out.println(b1.toString());
      System.out.println(b2.toString());
    }
  }
}
