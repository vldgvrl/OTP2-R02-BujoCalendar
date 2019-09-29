package MetropoliaAMKgroup02.BujoCalendar.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeandDates {
	
	private String date;
	private String mon;
	private String sun;
	private int month;
	
	//======= Get date of today =======
	public String getCurrentDate() {
		
		Date d = Calendar.getInstance().getTime();
		DateFormat dayDate = new SimpleDateFormat("yyyy-MM-dd");
		date = dayDate.format(d);
		
		return date;
	}
	
	//======= Get week number of current date =======
	public int getWeekNumber(String date) {
		
		String format = "yyyy-MM-dd";
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date dateParse = new Date();
		try {
			dateParse = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateParse);
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		
		return week;
	}
	
	//======= Get dates of days of week =======
	public String[] getWeekDates(int week) {
		
		String[] dayList = new String[7];
		
		String format = "yyyy-MM-dd";
		SimpleDateFormat df = new SimpleDateFormat(format);
		/*
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date dateParse = new Date();
		try {
			dateParse = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateParse);
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);*/
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.WEEK_OF_YEAR, week);     

		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		mon = df.format(cal.getTime());
		String monDay = mon.substring(mon.length() - 2);
		System.out.println("mon" + mon);
		getNewWeekNumber();
		dayList[0] = monDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		String tue = df.format(cal.getTime());
		String tueDay = tue.substring(tue.length() - 2);
		dayList[1] = tueDay;
		System.out.println("mon" + tueDay);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		String wed = df.format(cal.getTime());
		String wedDay = wed.substring(wed.length() - 2);
		dayList[2] = wedDay;
		System.out.println("mon" + wedDay);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		String thu = df.format(cal.getTime());
		String thuDay = thu.substring(thu.length() - 2);
		dayList[3] = thuDay;
		System.out.println("mon" + thuDay);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		String fri = df.format(cal.getTime());
		String friDay = fri.substring(fri.length() - 2);
		dayList[4] = friDay;
		System.out.println("mon" + friDay);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		String sat = df.format(cal.getTime());
		String satDay = sat.substring(sat.length() - 2);
		dayList[5] = satDay;
		System.out.println("mon" + satDay);
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		sun = df.format(cal.getTime());
		String sunDay = sun.substring(sun.length() - 2);
		dayList[6] = sunDay;
		System.out.println("Sun" + sun);
		
		return dayList;
	}
	
	public String getNewWeekNumber() {
		
		String format = "yyyy-MM-dd";
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date dateParse = new Date();
		try {
			dateParse = df.parse(mon);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateParse);
		
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		String newWeek = Integer.toString(week);
		
		return newWeek;
	}

	//======= Get selected date from datepicker and dates of days of weeks =======
	public String[] selectedDate(String date) { //date = 20190925 = 25.9.2019 Kuukausi ja vkonro vielä

		String[] dayList = new String[7];
		String format = "yyyy-MM-dd";

		SimpleDateFormat df = new SimpleDateFormat(format);
		Date dateParse = new Date();
		try {
			dateParse = df.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar cal = Calendar.getInstance();
		cal.setTime(dateParse);
		int weekInt = cal.get(Calendar.WEEK_OF_YEAR);

		cal.set(Calendar.WEEK_OF_YEAR, weekInt);     

		cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		mon = df.format(cal.getTime());
		System.out.println("Mon" + mon);
		String monDay = mon.substring(mon.length() - 2);
		dayList[0] = monDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
		String tue = df.format(cal.getTime());
		String tueDay = tue.substring(tue.length() - 2);
		dayList[1] = tueDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		String wed = df.format(cal.getTime());
		String wedDay = wed.substring(wed.length() - 2);
		dayList[2] = wedDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
		String thu = df.format(cal.getTime());
		String thuDay = thu.substring(thu.length() - 2);
		dayList[3] = thuDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
		String fri = df.format(cal.getTime());
		String friDay = fri.substring(fri.length() - 2);
		dayList[4] = friDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
		String sat = df.format(cal.getTime());
		String satDay = sat.substring(sat.length() - 2);
		dayList[5] = satDay;
		cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		sun = df.format(cal.getTime());
		String sunDay = sun.substring(sun.length() - 2);
		dayList[6] = sunDay;
		
		return dayList;
	}
	
	//======= Get month =======
	public String getMonth() {
		
		String monthMon = mon.substring(5,7);
		int monthMonInt = Integer.parseInt(monthMon);
		
		String monthSun = sun.substring(5,7);
		int monthSunInt = Integer.parseInt(monthSun);
		
		String monthString = "";
		String monthString2 = "";

		switch (monthMonInt) {
		case 1:
			monthString = "Tammikuu";
			monthString2 = "Tammikuu/Helmikuu";
			break;
		case 2:
			monthString = "Helmikuu";
			monthString2 = "Helmikuu/Maaliskuu";
			break;
		case 3:
			monthString = "Maaliskuu";
			monthString2 = "Maaliskuu/Huhtikuu";
			break;
		case 4:
			monthString = "Huhtikuu";
			monthString2 = "Huhtikuu/Toukokuu";
			break;
		case 5:
			monthString = "Toukokuu";
			monthString2 = "Toukokuu/Kesäkuu";
			break;
		case 6:
			monthString = "Kesäkuu";
			monthString2 = "Kesäkuu/Heinäkuu";
			break;
		case 7:
			monthString = "Heinäkuu";
			monthString2 = "Heinäkuu/Elokuu";
			break;
		case 8:
			monthString = "Elokuu";
			monthString2 = "Elokuu/Syyskuu";
			break;
		case 9:
			monthString = "Syyskuu";
			monthString2 = "Syyskuu/Lokakuu";
			break;
		case 10:
			monthString = "Lokakuu";
			monthString2 = "Lokakuu/Marraskuu";
			break;
		case 11:
			monthString = "Marraskuu";
			monthString2 = "Marraskuu/Joulukuu";
			break;
		case 12:
			monthString = "Joulukuu";
			monthString2 = "Joulukuu/Tammikuu";
			break;
		}
		
		if (monthMonInt == monthSunInt) {
			return monthString;
		}
		
		else {
			return monthString2;
		}
	}
	
	//======= Get year number =======
	public String getYear() {
		
		String yearMon = mon.substring(0,4);
		int yearMonInt = Integer.parseInt(yearMon);
		
		String yearSun = sun.substring(0,4);
		int yearSunInt = Integer.parseInt(yearSun);
		
		if (yearMonInt == yearSunInt) {
			return yearMon;
		}
		else {
			String yearString = yearMon + "/" + yearSun;
			return yearString;
		}
	}
}