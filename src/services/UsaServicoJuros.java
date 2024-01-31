package services;

public class UsaServicoJuros implements ServicoJuros {
	
	private double interestRate;

	public UsaServicoJuros(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}
}
