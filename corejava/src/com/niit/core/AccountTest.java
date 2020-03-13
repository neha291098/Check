package com.niit.core;

class Account{
	String name;
	protected double balance;
	
	Account(String str,double amt){
		name=str;
		balance=amt;
	}
	String getName() {
		return name;
	}
	double getBalance() {
		return balance;
	}
	void deposit(double amt) {
		balance+=amt;
		System.out.println("depositing: "+amt);
	}
	void withdraw(double amt) {
		balance-=amt;
		System.out.println("withdrawing: "+amt);
	}
}
class SavingsAccount extends Account{
	double interestRate;
	SavingsAccount(String str,double amt,double rate){
		super(str,amt);
		interestRate=rate;
	}
}
class CheckingAccount extends Account{
	double overDraft;
	CheckingAccount(String str,double amt){
		super(str,amt);
	}
	CheckingAccount(String str,double amt,double draft){
		super(str,amt);
		overDraft=draft;
	}
	void withdraw(double amt) {
		System.out.println("overdraft amount: "+overDraft);
		if(amt<=balance) {
			balance-=amt;
			System.out.println("withdraw: "+amt);
		}
		else if((amt>balance)&&(amt>(balance+overDraft))) {
			System.out.println("sorry! you cannot withdraw");
		}
		else {
			double result=amt-balance;
			overDraft-=result;
			balance=0;
			System.out.println("withdrawing: "+amt);
			System.out.println("current overdraft amount: "+overDraft);
		}
	}
}
public class AccountTest {
	public static void main(String[] args) {
		SavingsAccount saObj=new SavingsAccount("john",500,4);
		System.out.println("savings account details");
		System.out.println("--------------");
		System.out.println(""+saObj.getName()+" has an initial balance of: "+saObj.getBalance());
		saObj.deposit(200);
		System.out.println(saObj.getBalance());
		saObj.withdraw(200);
		System.out.println("-------------");
		CheckingAccount caObj=new CheckingAccount("stephen",200,200);
		caObj.deposit(200);
		System.out.println(caObj.getBalance());
		caObj.withdraw(500);
		System.out.println(caObj.getName()+ " at the end of transaction has a balance of: "+caObj.getBalance());
		
		
	}
}
