package com.intercorp.retail.util;

import java.util.Calendar;
import java.util.Date;

public class Util {

	
	public static Date calculateDeathDate(Date fecha){
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(fecha); 
	      calendar.add(Calendar.YEAR, 74); 
	      calendar.add(Calendar.MONTH, 6);
	      return calendar.getTime(); 
	}
}
