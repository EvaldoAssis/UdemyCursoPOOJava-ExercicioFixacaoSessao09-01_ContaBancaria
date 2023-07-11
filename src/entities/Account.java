package entities;

public class Account {

	private int numberAccount;
	private String ownerAccount;
	private double balance;
	
	public Account() {
	}
	
	public Account(int numberAccount, String ownerAccount) {
		this.numberAccount = numberAccount;
		this.ownerAccount = ownerAccount;
	}

	public Account(int numberAccount, String ownerAccount, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.ownerAccount = ownerAccount;
		/*Como � perguntado se o usu�rio deseja fazer uma dep�sito ou n�o, dessa maneira fica mais correto pro neg�cio.
		Outro ponto � que se no futuro a regra de dep�sito mudar, a altera��o ser� somente na opera��o de dep�sito e n�o no construtor
		Como se trata de um dep�sito inicial e n�o do saldo inicial da conta, o correto � realziar a a��o pela fun��o dep�sito.*/
		deposit(initialDeposit);
	}

	// O N�mero da conta n�o muda, por este motivo tem apenas o m�todo GET.
	public Integer getNumberAccount() {
		return numberAccount;
	}

	public String getOwnerAccount() {
		return ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
	}

	// O saldo s� muda quando � feito um dep�sito ou retirada, por este motivo tem apenas o m�todo GET.
	public Double getBalance() {
		return balance;
	}
	
	public double deposit(double amount) {
		return balance += amount;
	}
	
	public double withdraw(double amount) {
		return balance -= (amount+ 5.0);
	}

	@Override
	public String toString() {
		return "Account Number: " + numberAccount + "\n" + "Account Owner: " + ownerAccount + "\n" + "Balance: " + String.format("%.2f", balance);
	}
	
}


