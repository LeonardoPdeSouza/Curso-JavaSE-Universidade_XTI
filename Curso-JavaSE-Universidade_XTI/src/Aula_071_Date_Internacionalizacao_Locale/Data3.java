package Aula_071_Date_Internacionalizacao_Locale;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Data3 {

	public static void main(String[] args) {
			Calendar c = Calendar.getInstance();
			c.set(1994, Calendar.OCTOBER, 10);
			Date date = c.getTime();
			
			Locale padrao = Locale.getDefault(); // Pegua regiao do sistema 
			Locale brasil = new Locale("pt", "BR");
			Locale india = new Locale("hi", "IN");
			Locale usa = Locale.US;
			Locale japao = Locale.JAPAN;
			Locale italia = Locale.ITALIAN;
			
			DateFormat f = DateFormat.getDateInstance(DateFormat.FULL);
			System.out.println(f.format(date)); // pega localização do sistema
			
			f = DateFormat.getDateInstance(DateFormat.FULL, brasil); 
			System.out.println(f.format(date)); // pega localização do Brasil
			
			f = DateFormat.getDateInstance(DateFormat.FULL, india); 
			System.out.println(f.format(date)); // pega localização da India
			
			f = DateFormat.getDateInstance(DateFormat.FULL, usa); 
			System.out.println(f.format(date)); // pega localização do Estados Unidos
			
			f = DateFormat.getDateInstance(DateFormat.FULL, japao); 
			System.out.println(f.format(date)); // pega localização do Japao
			
			f = DateFormat.getDateInstance(DateFormat.FULL, italia); 
			System.out.println(f.format(date)); // pega localização da Italia
			
			

	}

}
