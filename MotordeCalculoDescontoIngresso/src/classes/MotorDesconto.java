package classes;

import java.util.Calendar;
import java.util.InputMismatchException;

public class MotorDesconto {
	private Pessoa pessoa;
	
	//Construtores
	public MotorDesconto(Calendar dia, Integer comprador, boolean carteirinha) {
		if (!carteirinha) {
			switch(comprador){
			case 1:
				this.pessoa = new Criança (dia);
				break;
			case 2:
				this.pessoa = new Estudante (dia, carteirinha);
				break;
			case 3:
				this.pessoa = new Idoso (dia);
				break;
			default:
				throw new InputMismatchException("Tipo de Comprador inválido");
				
			}
		}
		//Considerado que com apresentação de Carteirinha, pessoa será tratada como Estudante, independente da Idade.
		else if (comprador >= 1 && comprador <= 3){
			this.pessoa = new Estudante (dia, carteirinha);
		} else
			throw new InputMismatchException("Tipo de Comprador inválido");
	}
	
	public MotorDesconto(Calendar dia, Integer comprador) {
		switch(comprador){
		case 1:
			this.pessoa = new Criança (dia);
			break;
		case 2:
			this.pessoa = new Estudante (dia);
			break;
		case 3:
			this.pessoa = new Idoso (dia);
			break;
		default:
			throw new InputMismatchException("Tipo de Comprador inválido");
		}
	}
	
	//Métodos
	//TODO Não etá tratando feriados.
	public float calculapreco(){
		//Arredonda para 2 casas decimais
		return (float)Math.ceil(pessoa.calculaPreçoFinal() * 100) / 100;
	}
	
	public Pessoa getPessoa(){
		return pessoa;
	}
}
