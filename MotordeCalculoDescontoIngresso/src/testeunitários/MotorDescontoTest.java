package testeunitários;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import classes.MotorDesconto;

public class MotorDescontoTest {
	MotorDesconto motor;
	Calendar dia = Calendar.getInstance();
	
	@Test
	public void testaCriança(){
		motor = new MotorDesconto(dia, 1);

		assertTrue(motor.getPessoa().getClass().getName() == "classes.Criança");
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
	public void testaCompradorInválido(){
		boolean erro = false;
		try{
			motor = new MotorDesconto(dia, 4, true);	
			
		}catch (Exception e){
			erro = true;
		}
		assertTrue(erro);
	}
	
	
}
