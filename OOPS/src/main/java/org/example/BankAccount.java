package org.example;

public class BankAccount {
  private  String accountNumber;

  public String accountHolderName;

  private double balance;

  public String panCardNumber;


  public BankAccount(String accountNumber, String accountHolderName, double balance, String panCardNumber) {
    this.accountNumber = accountNumber;
    this.accountHolderName = accountHolderName;
    this.balance = balance;
    this.panCardNumber = panCardNumber;
  }

  public BankAccount() {
    this.accountNumber = "1234567890";
    this.accountHolderName = "John Doe";
    this.balance = 1000.0;
    this.panCardNumber = "ABCDE1234F";
  }

  public void displayAccountDetails() {
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Account Holder Name: " + accountHolderName);
    System.out.println("Balance: " + balance);
    System.out.println("Pan card number: " + panCardNumber);
  }

  public void setBalance(double userProvidedBalance) {
    if (userProvidedBalance < 0) {
      System.out.println("Invalid balance");
      return;
    }
    this.balance = userProvidedBalance;
  }


}
