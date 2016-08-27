import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CalendarioFestivo {

	List<LocalDate> festivos = new ArrayList<LocalDate>();	
		
	
	public boolean esFestivo(LocalDate date) {
		
		LlenarFestivos();
		
		for (LocalDate d : festivos) {
			if (date.getMonth().equals(d.getMonth()) && date.getDayOfMonth() == d.getDayOfMonth())
				return true;
		}
		
		return date.getDayOfWeek().equals(DayOfWeek.SUNDAY) || date.getDayOfWeek().equals(DayOfWeek.SATURDAY);
	}
	
	
	public void LlenarFestivos () {
		festivos.add(LocalDate.of(0, Month.JULY, 20));
		festivos.add(LocalDate.of(0, Month.JULY, 4));
		festivos.add(LocalDate.of(0, Month.DECEMBER, 25));
		festivos.add(LocalDate.of(0, Month.MAY, 1));
	}
	
	public void AgregarFestivoEmpresa (LocalDate date) {
		festivos.add(date);
	}
	
	

}
