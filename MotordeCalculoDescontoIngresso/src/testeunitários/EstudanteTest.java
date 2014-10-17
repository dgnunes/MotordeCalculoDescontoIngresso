package testeunitários;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

import classes.Estudante;

public class EstudanteTest {
	Calendar dia = Calendar.getInstance(); 
	Estudante student;
	
	@Test
	public void testCalculaDescontoDomingo() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0.F);
	}
	
	@Test
	public void testCalculaDescontoSegunda() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0.10F);
	}
	
	@Test
	public void testCalculaDescontoTerça() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0.05F);
	}
	
	@Test
	public void testCalculaDescontoQuarta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0.50F);
	}
	
	@Test
	public void testCalculaDescontoQuinta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0.30F);
	}
	
	@Test
	public void testCalculaDescontoSexta() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0F);
	}
	
	@Test
	public void testCalculaDescontoSábado() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		student = new Estudante(dia);
		
		assertTrue(student.calculaDesconto() == 0.F);
	}
	
	@Test
	public void testCalculaDescontoDomingoCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		student = new Estudante(dia,true);
		
		assertTrue(student.calculaDesconto() == 0.F);
	}
	
	@Test
	public void testCalculaDescontoSegundaCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		student = new Estudante(dia,true);
		
		assertTrue(student.calculaDesconto() == 0.35F);
	}
	
	@Test
	public void testCalculaDescontoTerçaCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		student = new Estudante(dia,true);
	
		assertTrue(student.calculaDesconto() == 0.35F);
	}
	
	@Test
	public void testCalculaDescontoQuartaCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		student = new Estudante(dia,true);
		
		assertTrue(student.calculaDesconto() == 0.50F);
	}
	
	@Test
	public void testCalculaDescontoQuintaCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		student = new Estudante(dia,true);
		
		assertTrue(student.calculaDesconto() == 0.35F);
	}
	
	@Test
	public void testCalculaDescontoSextaCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		student = new Estudante(dia,true);
		
		assertTrue(student.calculaDesconto() == 0.35F);
	}
	
	@Test
	public void testCalculaDescontoSábadoCarteirinha() {
		dia.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		student = new Estudante(dia,true);
		
		assertTrue(student.calculaDesconto() == 0.F);
	}
	
	@Test
	public void testingresso(){
		student = new Estudante(dia);
		assertTrue(student.getingresso()==8.00F);
	}
}
