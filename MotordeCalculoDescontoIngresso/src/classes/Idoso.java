package classes;

import java.util.Calendar;

public class Idoso extends Pessoa {
	
	public Idoso(Calendar dia) {
		super(6.00F,dia);
	}

	//falta implementar desconto quando é feriado.
	//precisa de lista declarando feriados baseado na localidade
	//não será implementado nessa versão.
	public float calculaDesconto() {
		int diasemana = super.pegaDiaSemana();
		float desconto = 0F;
		
		switch (diasemana){
			case 2:
				desconto = 0.10F;
				break;
			case 3:
				desconto = 0.15F;
				break;
			case 4:
				desconto = 0.40F;
				break;
			case 5:
				desconto = 0.30F;
				break;
			case 6:
				break;	
			default:
				desconto = 0.05F;
		}		
		return desconto;
	}
	
}
