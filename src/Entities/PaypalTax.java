package Entities;

public class PaypalTax implements Tax {

	public double juros(double installmentsNumber, double valor) {

		if (installmentsNumber >= 1) {
			installmentsNumber = valor + ((installmentsNumber * 0.01) * valor);
			installmentsNumber = installmentsNumber + (installmentsNumber * 0.12);
			return installmentsNumber;
		}
		else {
			installmentsNumber = valor + (0.01* valor);
			return installmentsNumber;
		}
	}
}
