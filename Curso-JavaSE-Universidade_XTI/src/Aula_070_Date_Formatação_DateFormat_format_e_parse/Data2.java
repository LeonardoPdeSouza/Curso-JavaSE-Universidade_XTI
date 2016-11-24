package Aula_070_Date_Formatação_DateFormat_format_e_parse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data2 {

	public static void main(String[] args) throws ParseException {
		Calendar c = Calendar.getInstance();
		c.set(1994, Calendar.OCTOBER, 10);
		Date date = c.getTime();
		System.out.println(date);

		// FORMATAÇÃO DE DATAS
		DateFormat f = DateFormat.getDateInstance();
		System.out.println(f.format(date));

		// FORMATAÇÃO DE TIME
		f = DateFormat.getTimeInstance();
		System.out.println(f.format(date));

		// FORMATAÇÃO DE DATA E TIME
		f = DateFormat.getDateTimeInstance();
		System.out.println(f.format(date));

		// ESTILOS
		f = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(f.format(date)); // Segunda-feira, 10 de Outubro de 1994
		
		f = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(f.format(date)); // 10 de Outubro de 1994
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(f.format(date)); // 10/10/1994
		
		f = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(f.format(date)); // 10/10/94
		
		Date data2 = f.parse("12/02/1980");
		System.out.println(data2); // Tue Feb 12 00:00:00 BRT 1980 (converte String em Date)
		
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(date)); // 10/10/1994 (informa o formato no paremetro do metodo SimpleDateFormat
		System.out.println(sdf.parse("10/10/2010")); // Sun Oct 10 00:00:00 BRT 2010
		

	}

}
