package classes;

import java.util.Calendar;

public class Pessoa {
	private float ingresso;
	private Calendar dia;
	
	//Construtor
	public Pessoa (float ingresso, Calendar dia){
		this.ingresso = ingresso;
		this.dia = dia;
	}
	
	//M�todos
	public Integer pegaDiaSemana (){
		return dia.get(Calendar.DAY_OF_WEEK);
	}
	
	public float calculaDesconto() {
		return 0F;
	}
	
	public float calculaPre�oFinal (){
		return ingresso*(1F-calculaDesconto());
	}
	
	public float getingresso(){
		return ingresso;
	}
}
