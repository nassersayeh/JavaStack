import java.util.Random;
public class BankAccount {
String accountNumber;
double checkingBalance;
double savingBalance;
static int  numberOfaccount;
static double totalAmountofMony;
public BankAccount() {
	generateNewAccountNumber();
	numberOfaccount+=1;
}
public void depositChecking(double checkingBalance) {
	this.setcheckingBalance(checkingBalance);
	totalAmountofMony+=checkingBalance;
}

public void depositSaving(double savingBalance) {
	this.setsavingBalance(savingBalance);
	totalAmountofMony+=savingBalance;
}
public void withdrawalChecking(int amount){
    if (getcheckingBalance() < Double.valueOf(amount)){
        System.out.println("You don't have enought money to take out more money.");
    } 
    else{
    	setcheckingBalance(getcheckingBalance() - Double.valueOf(amount));

    }
}
public void withdrawalSavings(int amount){
    if (getsavingBalance() < Double.valueOf(amount)){
        System.out.println("You don't have enought money to take out more money.");
    } 
    else{
        this.setsavingBalance(this.getsavingBalance() - Double.valueOf(amount));
    }

}
public double getsavingBalance() {
	return savingBalance;
}
public void setsavingBalance(double savingBalance) {
	this.savingBalance = savingBalance;
	
}
public double getcheckingBalance() {
	return this.checkingBalance;
}
public void setcheckingBalance(double checkingBalance) {
	this.checkingBalance = checkingBalance;
}
public static double memberNumberaccount() {
	return numberOfaccount;
}
public static double totalamountmember() {
	return totalAmountofMony;
}
private String generateNewAccountNumber(){
    String numbers = "1234564434";
    String newAccountNumber = "";

    Random rand = new Random();

    for (int i = 0; i < 5; i++){
        int num = numbers.charAt(rand.nextInt(10));
        newAccountNumber += num; 
    }
    
    accountNumber = newAccountNumber; 

    return newAccountNumber;
}

}
