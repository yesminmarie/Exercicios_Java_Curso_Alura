package NovaAPIDatas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		
		//LocalDate
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2016, Month.JUNE, 5);
		System.out.println(olimpiadasRio);
		
		int anos = hoje.getYear() - olimpiadasRio.getYear();
		System.out.println(anos);
		
		//Period
		Period periodo = Period.between(olimpiadasRio, hoje);
		System.out.println(periodo);

		System.out.println(periodo.getYears() + " anos");
		System.out.println(periodo.getMonths() + " meses");
		System.out.println(periodo.getDays() + " dias");
		
		System.out.println(hoje.minusYears(1));
		System.out.println(hoje.minusMonths(2));
		System.out.println(hoje.minusDays(3));
		
		System.out.println(hoje.plusYears(2));
		System.out.println(hoje.plusMonths(3));
		System.out.println(hoje.plusDays(4));
		
		LocalDate proximasOlimpiadas = olimpiadasRio.plusYears(4);
		System.out.println(proximasOlimpiadas);
		
		//DateTimeFormatter
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatado = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatado);
		
		//LocalDateTime
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		System.out.println(agora.format(formatadorComHoras));
		
		//YearMonth
		YearMonth anoMes = YearMonth.of(2015, Month.APRIL);
		System.out.println(anoMes);
		
		//LocalTime
		LocalTime intervalo = LocalTime.of(12, 30);
		System.out.println(intervalo);
		
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("MM/yyyy");
		System.out.println(anoMes.format(formatador2));
	}

}
