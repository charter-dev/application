package com.backend.dtsrea4b.fin.application.service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LabelHelper {
			
	public static String formatString(String inputString) throws Exception{
		if(inputString == null || ("").equals(inputString.trim())) {
			return null;
		}
		return inputString;
	}
	
	public static String formatString(BigDecimal inputBigDecimal) throws Exception{
		if(inputBigDecimal == null) {
			return null;
		}
		return inputBigDecimal + "";
	}
	
	public static String formatString(Integer inputInteger) throws Exception{
		if(inputInteger == null) {
			return null;
		}
		return inputInteger + "";
	}
	
	public static String formatString(Long inputLong) throws Exception{
		if(inputLong == null) {
			return null;
		}
		return inputLong + "";
	}
	
	public static String formatStringThousandSeparator(BigDecimal inputBigDecimal) throws Exception{
		if(inputBigDecimal == null) {
			return null;
		}
		String pattern = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);

		String format = decimalFormat.format(inputBigDecimal);
		return format;
	}

	public static String formatString(Date DateType) {
		if(DateType == null) {
			return null;
		}
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    String reportDate = df.format(DateType);
	    return reportDate;
	}

	public static String formatString(Boolean inputBoolean) {
		if(inputBoolean == null) {
			return null;
		}
		return inputBoolean==true? "1":"0";
	}
	
	
}
