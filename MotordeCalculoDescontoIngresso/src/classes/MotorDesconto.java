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
				this.pessoa = new Crian�a (dia);
				break;
			case 2:
				this.pessoa = new Estudante (dia, carteirinha);
				break;
			case 3:
				this.pessoa = new Idoso (dia);
				break;
			default:
				throw new InputMismatchException("Tipo de Comprador inv�lido");
				
			}
		}
		//Considerado que com apresenta��o de Carteirinha, pessoa ser� tratada como Estudante, independente da Idade.
		else if (comprador >= 1 && comprador <= 3){
			this.pessoa = new Estudante (dia, carteirinha);
		} else
			throw new InputMismatchException("Tipo de Comprador inv�lido");
	}
	
	public MotorDesconto(Calendar dia, Integer comprador) {
		switch(comprador){
		case 1:
			this.pessoa = new Crian�a (dia);
			break;
		case 2:
			this.pessoa = new Estudante (dia);
			break;
		case 3:
			this.pessoa = new Idoso (dia);
			break;
		default:
			throw new InputMismatchException("Tipo de Comprador inv�lido");
		}
	}
	
	//M�todos
	//TODO N�o et� tratando feriados.
	public float calculapreco(){
		//Arredonda para 2 casas decimais
		return (float)Math.ceil(pessoa.calculaPre�oFinal() * 100) / 100;
	}
	
	public Pessoa getPessoa(){
		return pessoa;
	}
}
