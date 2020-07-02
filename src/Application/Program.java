package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entities.PaymentService;
import Entities.PaypalTax;
import Object.Contract;
import Object.DadosCredito;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("valor da parcela:");
		Double valor = sc.nextDouble();
		System.out.println("data começo parcelamento:");
		Date y = sdf.parse(sc.next());
		System.out.println("data final parcelamento:");
		Date x = sdf.parse(sc.next());
	
		Contract contrato = new Contract(11443, y, x, valor);
		
		PaymentService servico = new PaymentService(contrato.duraçãoContrato(), contrato, new PaypalTax());
		
		for (int i = 0; i < contrato.duraçãoContrato()+1; i++) {
			if(i > 0) {
				servico.setInstallmentsNumber(i);
				/*System.out.println(contrato.mesesAdicionais(y, i));
				System.out.println(servico.contractTotalValue());*/
				
				DadosCredito elementoLista = new DadosCredito(contrato.mesesAdicionais(y,  i), servico.contractTotalValue());
				contrato.addlista(elementoLista);
			}
		}
		
		System.out.println(contrato);
		
		sc.close();
	}

}
