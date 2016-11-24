package Aula_069_Date_Calendar_get_set_clear_add_e_roll;

import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Datas {

	public static void main(String[] args) {
		/* 01 de Jan 1970 (Hora zero)*/
		System.out.println(System.currentTimeMillis()); // Quantos Milisegundos desde data 01/01/1970
		
		// Data Atual
		Date agora = new Date();
		System.out.println("Data Atual: "+agora);
		
		Date data = new Date(1_000_000_000_000L);
		System.out.println("Data com 1.000.000.000.000ms: "+data);
		
		// METODOS
		data.getTime();
		data.setTime(1_000_000_000_000L);
		System.out.println(data.compareTo(agora)); // -1 para anterior, 0 para igual, +1 para posterior
		
		// GregorianCalendar
		Calendar c = Calendar.getInstance();
		c.set(1980, Calendar.FEBRUARY, 12);
		System.out.println(c.getTime());
		System.out.println(c.get(Calendar.YEAR)); // Ano
		System.out.println(c.get(Calendar.MONTH)); // Mes 0 - 11
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); // Dia do mes
		
		c.set(Calendar.YEAR,2016); // Altera o Ano
		c.set(Calendar.MONTH, 10); // Altera o Mes 0 - 11
		c.set(Calendar.DAY_OF_MONTH, 24); // Altera o Dia do mes
		System.out.println(c.getTime());
		
		c.clear(Calendar.MINUTE); // limpa minutos
		c.clear(Calendar.SECOND); // limpa segundos
		System.out.println(c.getTime());
		
		c.add(Calendar.DAY_OF_MONTH,1); // adiciona dias (avança o mes e ano)
		c.add(Calendar.YEAR,1); // adiciona o ano 
		System.out.println(c.getTime());
		
		c.roll(Calendar.DAY_OF_MONTH,20); // adiciona dias (não avança o mes e ano)
		System.out.println(c.getTime());
		
		// Saudação com Bom dia, Boa arde ou Boa noite
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		System.out.println(hora);
		if(hora <= 12){
			System.out.println("Bom Dia");
		} else if(hora > 12 && hora < 18){
			System.out.println("Boa Tarde");
		} else {
			System.out.println("Boa Noite");
		}
		

	}

}
