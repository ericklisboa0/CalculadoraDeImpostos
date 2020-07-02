package Object;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Contract {

	private Integer contractNumber;
	private Date contractStart;
	private Date contractfinish;
	private Double Value;
	private List <DadosCredito> lista = new ArrayList<>();
	
	public Contract() {
	}
	
	public Contract(Date contracStart, Double Value) {
		this.contractStart = contracStart;
		this.Value = Value;
	}

	public Contract(Integer contractNumber, Date contractStart, Date contractfinish, Double value) {
		this.contractNumber = contractNumber;
		this.contractStart = contractStart;
		this.contractfinish = contractfinish;
		this.Value = value;
	}

	public Integer getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(Integer contractNumber) {
		this.contractNumber = contractNumber;
	}

	public Date getContractStart() {
		return contractStart;
	}

	public void setContractStart(Date contractDate) {
		this.contractStart = contractDate;
	}
	
	

	public Date getContractfinish() {
		return contractfinish;
	}

	public void setContractfinish(Date contractfinish) {
		this.contractfinish = contractfinish;
	}

	public Double getValue() {
		return Value;
	}

	public void setValue(Double value) {
		Value = value;
	}
	
	public int duraçãoContrato () {
		long t1 = contractStart.getTime();
		long t2 = contractfinish.getTime();
		double contractime = (double)(t2 - t1) / 1000 / 60 / 60 / 24 / 30;
		return (int) contractime;
	}
	
	public Date mesesAdicionais(Date data, int adicional) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(contractStart);
		cal.add(Calendar.MONTH, adicional);
		return cal.getTime();
	}
	
	public void addlista(DadosCredito x) {
		lista.add(x);
	}
	
	@Override
	public String toString(){
		return "Numero do contrato: " 
		+ contractNumber
		
		+ "\nData do inicio do contrato: "
		+ contractStart
		
		+ "\nValor do contrato: " 
		+ Value
		
		+ "\nnumero de parcelas: " 
		+ duraçãoContrato()
		
		+ "\nParcelas:\n---------------------------------------" 
		+  Arrays.toString(lista.toArray()).replace("[", "").replace("]", "");
	
	}

	
	
	
	
}
