package aula02_conversãoDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WorkingDates {

	public static void main(String[] args) {
		
		String dataComoString = "14/04/2021";
		Date data = converterStringParaDate(dataComoString);
		System.out.println(data);
		
		String dataParaString = converterDateParaString(data);
		System.out.println(dataParaString);
	}
	
	public static Date converterStringParaDate(String dataStr) {
		
		Date dataConvertida = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataConvertida = sdf.parse(dataStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return dataConvertida;
	}
	
	
	public static String converterDateParaString(Date data) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String dataParaString = sdf.format(data);
		
		return dataParaString;
	}
}
