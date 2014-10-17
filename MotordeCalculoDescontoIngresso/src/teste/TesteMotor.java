package teste;

import java.util.Calendar;
import classes.MotorDesconto;

public class TesteMotor {

	public static void main(String[] args) {
		Calendar dia = Calendar.getInstance();
		MotorDesconto motor;
		
		System.out.println("Hoje é " + dia.getTime().toString());
		
		motor = new MotorDesconto(dia,1);
		System.out.println("Ingresso para Criança: R$" + String.format("%.2f",motor.calculapreco()));
		
		motor = new MotorDesconto(dia,2);
		System.out.println("Ingresso para Estudante sem Carteirinha: R$" + String.format("%.2f",motor.calculapreco()));
		
		motor = new MotorDesconto(dia,2,true);
		System.out.println("Ingresso para Estudante com Carteirinha:: R$" + String.format("%.2f",motor.calculapreco()));

		motor = new MotorDesconto(dia,3);
		System.out.println("Ingresso para Idoso: R$" + String.format("%.2f", motor.calculapreco()));
	}

}
