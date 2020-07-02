package Entities;

import Object.Contract;

public class PaymentService {

	private Integer installmentsNumber;
	private Tax juros;
	private Contract contract;
	
	public PaymentService() {
	}
	
	
	public PaymentService(Integer installmentsNumber, Contract contract, Tax juros) {
		this.juros = juros;
		this.installmentsNumber = installmentsNumber;
		this.contract = contract;
	}



	public Integer getInstallmentsNumber() {
		return installmentsNumber;
	}



	public void setInstallmentsNumber(Integer installmentsNumber) {
		this.installmentsNumber = installmentsNumber;
	}



	public Tax getJuros() {
		return juros;
	}



	public void setJuros(Tax juros) {
		this.juros = juros;
	}



	public Contract getContract() {
		return contract;
	}



	public void setContract(Contract contract) {
		this.contract = contract;
	}



	public Double contractTotalValue() {
		double parcelas = contract.getValue() / contract.duraçãoContrato();
		return juros.juros(installmentsNumber, parcelas);
	}


	@Override
	public String toString() {
		return "PaymentService";
	}
	
	
	
}
