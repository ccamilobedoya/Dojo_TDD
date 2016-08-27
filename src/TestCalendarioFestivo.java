import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

public class TestCalendarioFestivo {

	@Test
	public void testCalendario() {
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 26);
		CalendarioFestivo calendario = new CalendarioFestivo();
		boolean festivo = calendario.esFestivo(date);
		assertFalse(festivo);
	}
	
	@Test
	public void testDomingo() {
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 28);
		CalendarioFestivo calendario = new CalendarioFestivo();
		boolean festivo = calendario.esFestivo(date);
		assertTrue(festivo);
	}
	
	@Test
	public void testSabado() {
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 27);
		CalendarioFestivo calendario = new CalendarioFestivo();
		boolean festivo = calendario.esFestivo(date);
		assertTrue(festivo);
	}
	
	@Test
	public void testFestivoNacional() {
		LocalDate date = LocalDate.of(0, Month.JULY, 20);	
		CalendarioFestivo calendario = new CalendarioFestivo();		
		boolean festivo = calendario.esFestivo(date);		
		assertTrue(festivo);
		
		date = LocalDate.of(0, Month.JULY, 4);
		festivo = calendario.esFestivo(date);
		assertTrue(festivo);
		
		date = LocalDate.of(0, Month.DECEMBER, 25);
		festivo = calendario.esFestivo(date);
		assertTrue(festivo);
		
		date = LocalDate.of(0, Month.MAY, 1);
		festivo = calendario.esFestivo(date);
		assertTrue(festivo);
	}
	
	@Test
	public void testFestivosEmpresa() {
		LocalDate date = LocalDate.of(2016, Month.AUGUST, 22);
		CalendarioFestivo calendario = new CalendarioFestivo();
		calendario.AgregarFestivoEmpresa(date);
		boolean festivo = calendario.esFestivo(date);
		assertTrue(festivo);
	}
	
	
}
