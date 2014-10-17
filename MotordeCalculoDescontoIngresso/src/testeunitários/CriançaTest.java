package testeunit�rios;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import classes.Crian�a;

public class Crian�aTest {
	Calendar dia = Calendar.getInstance(); 
	Crian�a kid;
	
	@Test
	public void testCalculaDescontoDomingo() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0F);
	}
	
	@Test
	public void testCalculaDescontoSegunda() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0.10F);
	}
	
	@Test
	public void testCalculaDescontoTer�a() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0.15F);
	}
	
	@Test
	public void testCalculaDescontoQuarta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0.30F);
	}
	
	@Test
	public void testCalculaDescontoQuinta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0F);
	}
	
	@Test
	public void testCalculaDescontoSexta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0.11F);
	}
	
	@Test
	public void testCalculaDescontoS�bado() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		kid = new Crian�a(dia);
		
		assertTrue(kid.calculaDesconto() == 0F);
	}
	
	@Test
	public void testingresso(){
		kid = new Crian�a(dia);
		assertTrue(kid.getingresso()==5.50F);
	}
}
