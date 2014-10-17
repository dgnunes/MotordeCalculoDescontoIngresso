package classes;

import java.util.Calendar;

public class Criança extends Pessoa {
	
	public Criança(Calendar dia) {
		super(5.50F,dia);
	}
	
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
				desconto = 0.30F;
				break;
			case 6:
				desconto = 0.11F;
				break;	
		}		
		return desconto;
	}


}
