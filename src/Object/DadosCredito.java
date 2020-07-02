package Object;

import java.util.Date;

public class DadosCredito extends Contract{

	public DadosCredito(Date contracStart, Double Value) {
		super(contracStart, Value);
	}

	@Override
	public String toString() {
		StringBuilder variavel = new StringBuilder();
		variavel.append ("\n");
		variavel.append(getContractStart());
		variavel.append("  ||  ");
		variavel.append(getValue());
		return variavel.toString();
	}
	
	
}
