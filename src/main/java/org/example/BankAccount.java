package org.example;

public class BankAccount {
        private String firstName;
        private String lastName;
        private String dateOfBirth;
        private int accountNumber;
        private int accountBalance;

        public BankAccount(String inputFirstName, String inputLastName, String inputDateOfBirth){
                this.firstName = inputFirstName;
                this.lastName = inputLastName;
                this.dateOfBirth = inputDateOfBirth;
                this.accountNumber = 0;
                this.accountBalance = 0;
        }


        //        getters & setters
        public String getFirstName(){return this.firstName;}

        public String getLastName(){return this.lastName;}
        public String getDateOfBirth(){return this.dateOfBirth;}

        public int getAccountNumber(){return this.accountNumber;}
        public int getAccountBalance(){return this.accountBalance;}

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

        public int deposit(int amount){
                int newBalance = this.accountBalance + amount;
                return newBalance;
        }

//        Withdrawal
        public boolean withdrawal(int amount){
                if(this.accountBalance >= amount){
                        this.accountBalance -= amount;
                        System.out.println("Successful withdrawal, remaining balance " + accountBalance);
                        return true;
                } else {
                        System.out.println("Error insufficient balance, available balance " + accountBalance);
                        return false;
                }
        }
}
