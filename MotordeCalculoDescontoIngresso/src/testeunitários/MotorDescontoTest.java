package testeunit�rios;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import classes.MotorDesconto;

public class MotorDescontoTest {
	MotorDesconto motor;
	Calendar dia = Calendar.getInstance();
	
	@Test
	public void testaCrian�a(){
		motor = new MotorDesconto(dia, 1);

		assertTrue(motor.getPessoa().getClass().getName() == "classes.Crian�a");
	}

	@Test
	public void testaEstudante(){
		motor = new MotorDesconto(dia, 2);

		assertTrue(motor.getPessoa().getClass().getName() == "classes.Estudante");
	}		
	
	@Test
	public void testaEstudanteComCarteirinha(){
		motor = new MotorDesconto(dia, 2, true);

		assertTrue(motor.getPessoa().getClass().getName() == "classes.Estudante");	
	}

	@Test
	public void testaEstudanteComCarteirinhaoutroComprador(){
		motor = new MotorDesconto(dia, 1, true);

		assertTrue(motor.getPessoa().getClass().getName() == "classes.Estudante");	
	}
	
	@Test
	public void testaIdoso(){
		motor = new MotorDesconto(dia, 3);
		
		assertTrue(motor.getPessoa().getClass().getName() == "classes.Idoso");			
	}

	@Test
	public void testaCompradorInv�lido(){
		boolean erro = false;
		try{
			motor = new MotorDesconto(dia, 4, true);	
			
		}catch (Exception e){
			erro = true;
		}
		assertTrue(erro);
	}
	
	
}
