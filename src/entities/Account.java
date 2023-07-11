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
		/*Como é perguntado se o usuário deseja fazer uma depósito ou não, dessa maneira fica mais correto pro negócio.
		Outro ponto é que se no futuro a regra de depósito mudar, a alteração será somente na operação de depósito e não no construtor
		Como se trata de um depósito inicial e não do saldo inicial da conta, o correto é realziar a ação pela função depósito.*/
		deposit(initialDeposit);
	}

	// O Número da conta não muda, por este motivo tem apenas o método GET.
	public Integer getNumberAccount() {
		return numberAccount;
	}

	public String getOwnerAccount() {
		return ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
	}

	// O saldo só muda quando é feito um depósito ou retirada, por este motivo tem apenas o método GET.
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


