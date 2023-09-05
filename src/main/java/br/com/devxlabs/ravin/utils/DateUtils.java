package br.com.devxlabs.ravin.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

	public static Date stringToDate(String dateString) {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date parsedDate = null;
		try {
			parsedDate = dateFormat.parse(dateString);
		} catch (ParseException e) {

		}
		return parsedDate;
	}

	public static int getAge(Date date) {
		GregorianCalendar hoje = new GregorianCalendar();
		GregorianCalendar nascimento = new GregorianCalendar();
		if (date != null) {
			nascimento.setTime(date);
		}
		int anoHoje = hoje.get(Calendar.YEAR);
		int anoNascimento = nascimento.get(Calendar.YEAR);
		return anoHoje - anoNascimento;
	}

	public static Date tryParseDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date formattedDate = null;
		try {
			formattedDate = dateFormat.parse(date);
		} catch (ParseException e) {
			formattedDate = new Date();
		}
		return formattedDate;
	}
	
	public static String formatDate(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formattedDate = null;
		formattedDate = dateFormat.format(date);
		return formattedDate;
	}

}
