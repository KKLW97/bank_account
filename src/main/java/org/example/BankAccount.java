package org.example;


public class BankAccount {
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private int accountNumber;
        private double accountBalance;
        private double accountDurationInYears;
        private double simpleInterest;
        private double accountBalanceInterestAdded;


        public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth){
                this.firstName = inputFirstName;
                this.lastName = inputLastName;
                this.dateOfBirth = inputDateOfBirth;
                this.accountNumber = 0;
                this.accountBalance = 0;
                this.accountDurationInYears = 3;
                this.simpleInterest = getSimpleInterest();
                this.accountBalanceInterestAdded = balanceInterestAdded();
        }


        //        getters & setters
        public String getFirstName(){return this.firstName;}

        public String getLastName(){return this.lastName;}
        public String getDateOfBirth(){return this.dateOfBirth;}

        public int getAccountNumber(){return this.accountNumber;}
        public double getAccountBalance(){return this.accountBalance;}

        public void setFirstName(String firstName){
//      run check for authorisation
                this.firstName = firstName;
        }

        public void setLastName(String lastName){
//      run check for authorisation
                this.lastName = lastName;
        }
        public void setDateOfBirth(String dateOfBirth){
                this.dateOfBirth = dateOfBirth;
        }

//        Deposit

        public void deposit(double amount){
                accountBalance += amount;
        }

//        Withdrawal
        public boolean withdrawal(double amount){
                if(this.accountBalance >= amount){
                        this.accountBalance -= amount;
                        System.out.println("Successful withdrawal, remaining balance " + accountBalance);
                        return true;
                } else {
                        System.out.println("Error insufficient balance, available balance " + accountBalance);
                        return false;
                }
        }

//        Simple interest
        public double getSimpleInterest() {
                double rate = 0.5;
                // Calculating the simple interest
                double simpleInterest = (this.accountBalance * rate * this.accountDurationInYears) / 100;
                // Displaying the simple interest
                System.out.println("Simple Interest = " + simpleInterest);
                return simpleInterest;
        }


        public double balanceInterestAdded(){
                accountBalanceInterestAdded = this.accountBalance + this.simpleInterest;
                return accountBalanceInterestAdded;
        }
}
