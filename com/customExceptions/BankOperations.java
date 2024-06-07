package com.customExceptions;

public class BankOperations {

	public static void withdrawAmount(double withdrawAmount) throws InSuffientFundsException {

		double currentBalance = 60000.09;

		if (currentBalance >= withdrawAmount) {
			System.out.println("amount withdrawn successfully...!");
		} else {
			throw new InSuffientFundsException("InSuffient Funds, kindly check your ac balance...!");
		}

	}

}
