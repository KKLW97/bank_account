package org.example;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Apple", "Butter", "01/01/1984");
        BankAccount bankAccount2 = new BankAccount("Jim", "Bob", "02/02/1987");

        bankAccount2.setFirstName("Jimmy");
        bankAccount1.deposit(1050);
        System.out.println(bankAccount1.getAccountBalance());
        bankAccount1.withdrawal(100);
        bankAccount1.withdrawal(10000);
        bankAccount1.getSimpleInterest();
        System.out.println(bankAccount1.balanceInterestAdded());
        System.out.println(bankAccount2);

    }
}