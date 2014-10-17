package testeunitários;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import classes.Criança;

public class CriançaTest {
	Calendar dia = Calendar.getInstance(); 
	Criança kid;
	
	@Test
	public void testCalculaDescontoDomingo() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0F);
	}
	
	@Test
	public void testCalculaDescontoSegunda() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0.10F);
	}
	
	@Test
	public void testCalculaDescontoTerça() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0.15F);
	}
	
	@Test
	public void testCalculaDescontoQuarta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0.30F);
	}
	
	@Test
	public void testCalculaDescontoQuinta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0F);
	}
	
	@Test
	public void testCalculaDescontoSexta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0.11F);
	}
	
	@Test
	public void testCalculaDescontoSábado() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		kid = new Criança(dia);
		
		assertTrue(kid.calculaDesconto() == 0F);
	}
	
	@Test
	public void testingresso(){
		kid = new Criança(dia);
		assertTrue(kid.getingresso()==5.50F);
	}
}
