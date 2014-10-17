package testeunitários;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import classes.Idoso;

public class IdosoTest {
	Calendar dia = Calendar.getInstance(); 
	Idoso grandpa;
	
	@Test
	public void testCalculaDescontoDomingo() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0.05F);
	}
	
	@Test
	public void testCalculaDescontoSegunda() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0.10F);
	}
	
	@Test
	public void testCalculaDescontoTerça() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0.15F);
	}
	
	@Test
	public void testCalculaDescontoQuarta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0.40F);
	}
	
	@Test
	public void testCalculaDescontoQuinta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0.30F);
	}
	
	@Test
	public void testCalculaDescontoSexta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0F);
	}
	
	@Test
	public void testCalculaDescontoSábado() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		grandpa = new Idoso(dia);
		
		assertTrue(grandpa.calculaDesconto() == 0.05F);
	}
	
	@Test
	public void testingresso(){
		grandpa = new Idoso(dia);
		assertTrue(grandpa.getingresso()==6.00F);
	}
}
