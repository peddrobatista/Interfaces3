package services;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	double getInterestRate();

	default double pagamento(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}
 
}
