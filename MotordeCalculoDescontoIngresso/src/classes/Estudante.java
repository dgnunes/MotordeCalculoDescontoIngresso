package classes;

import java.util.Calendar;

public class Estudante extends Pessoa {
	private boolean carteirinha;
	
	public Estudante(Calendar dia, boolean carteirinha) {
		super(8.00F, dia);
		this.carteirinha = carteirinha;
	}
	
	public Estudante (Calendar dia){
		super(8.00F,dia);
		this.carteirinha = false;		
	}
	
	public float calculaDesconto() {
		int diasemana = super.pegaDiaSemana();
		float desconto = 0F;
		
		switch (diasemana){
			case 2:
				desconto = 0.10F;
				break;
			case 3:
				desconto = 0.05F;
				break;
			case 4:
				desconto = 0.50F;
				break;
			case 5:
				desconto = 0.30F;
				break;
		}
		
		if (carteirinha && diasemana != 1 && diasemana != 7 && desconto < 0.35F)
			desconto = 0.35F;
		
		return desconto;
	}
	

}
