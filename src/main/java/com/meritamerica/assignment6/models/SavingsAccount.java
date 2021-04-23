package com.meritamerica.assignment6.models;

import javax.persistence.*;

@Entity
@Table(name = "savings_accounts")
public class SavingsAccount extends BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountNumber;
	@Column(name = "interest_rate",
			columnDefinition = "DOUBLE"
			)
    double interestRate = 0.01;
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

/*	
    SavingsAccount() {
        super(0, INTEREST_RATE);
    }
    
    SavingsAccount(double balance) {
        super(MeritBank.getNextAccountNumber(), balance, INTEREST_RATE, new Date());
    }

    SavingsAccount(long accountNumber, double balance, double interestRate, Date accountOpenedOn) {
        super(accountNumber, balance, interestRate, accountOpenedOn);
    }

    public static SavingsAccount readFromString(String accountData) throws ParseException, NumberFormatException {
        String[] tempArr = accountData.split(",");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        long tempAcctNum = Long.parseLong(tempArr[0]);
        double tempBal = Double.parseDouble(tempArr[1]), tempIntRate = Double.parseDouble(tempArr[2]);
        Date tempOpenDate = dateFormat.parse((tempArr[3]));

        return new SavingsAccount(tempAcctNum, tempBal, tempIntRate, tempOpenDate);
    }
*/
}