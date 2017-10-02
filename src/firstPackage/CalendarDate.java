package firstPackage;

import java.text.DateFormatSymbols;
import java.time.LocalTime;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarDate {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		
		System.out.println(Calendar.DATE);
		System.out.println(Calendar.YEAR);
		System.out.println(Calendar.MONTH);
		System.out.println(Calendar.DAY_OF_WEEK);
		System.out.println(Calendar.HOUR);
		System.out.println(Calendar.MINUTE);
		System.out.println(Calendar.SECOND);
		System.out.println(Calendar.getInstance().getTime());
		
		Calendar calNewYork = Calendar.getInstance();
	     calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		    System.out.println(); 
	      System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"
	        + calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
			   System.out.println(); 
			   
			   System.out.println("Current Date Time :"+cal.getTime());
			   System.out.println("Max Year:" + cal.getActualMaximum(cal.YEAR));
			   System.out.println("Max Month:" + cal.getActualMaximum(cal.MONTH));
			   System.out.println("Max WEEK:" + cal.getActualMaximum(cal.WEEK_OF_YEAR));
			   System.out.println("Max DAY:" + cal.getActualMaximum(cal.DAY_OF_WEEK));
			   
			   System.out.println("Min Year:" + cal.getActualMinimum(cal.YEAR));
			   System.out.println("Min Month:" + cal.getActualMinimum(cal.MONTH));
			   System.out.println("Min WEEK:" + cal.getActualMinimum(cal.WEEK_OF_YEAR));
			   System.out.println("Min DAY:" + cal.getActualMinimum(cal.DAY_OF_WEEK));
			   
			   System.out.print("CURRENT FULL Date & Time :"+ (cal.get(Calendar.MONTH)+1)+ "-"
			   + cal.get(Calendar.DATE)+ "-" + cal.get(Calendar.YEAR) + " " + 
					   cal.get(Calendar.HOUR_OF_DAY)+
			   ":" + cal.get(Calendar.MINUTE) + ":" + cal.get(Calendar.SECOND) + ":" 
			   + cal.get(Calendar.MILLISECOND));
			   System.out.println();
			   System.out.println("Last Day of current month:" + cal.getMaximum(Calendar.DATE));
			   System.out.println("Last Day of current month:" + cal.getMaximum(Calendar.DAY_OF_MONTH));
			   System.out.println("First Day of week :"+ cal.getFirstDayOfWeek());
			   System.out.println("Last Day of week : " + cal.getMaximum(Calendar.DAY_OF_WEEK));
			   System.out.println("Name of first day :" + cal.getDisplayName((Calendar.DAY_OF_WEEK), 2 , Locale.UK ));
               
			   YearMonth ym = YearMonth.of(2017, 8);
			   System.out.println("Name of first day of month :"+ ym.atDay(1).getDayOfWeek().name());
			   System.out.println("Name of last day of month :"+ ym.atEndOfMonth().getDayOfWeek().name());
			   System.out.println("Number of days in a month: "+ym.getMonth().maxLength());
			   
			// Localize in German
			   
			   DateFormatSymbols symbols = new DateFormatSymbols(new Locale("de"));
			    // for the current Locale :
			    //   DateFormatSymbols symbols = new DateFormatSymbols(); 
			     String[] dayNames = symbols.getWeekdays();
			     for (String s : dayNames) { 
			     System.out.print(s + "\n");
			 	  System.out.println();
			     }
			     LocalTime time = LocalTime.now();
			        System.out.println();
			        // in hour, minutes, seconds, nano seconds
			        System.out.println("Local time now : " + time);
			        LocalTime newTime = time.plusHours(4);
			        System.out.println();
			        System.out.println("Time after 2 hours : " + newTime);
                    System.out.println(time.of(1, 10));
                    //two weeks
                    int noOfDays = 14; 
                    
                    Date cdate = cal.getTime();
                    cal.add(Calendar.DAY_OF_YEAR, noOfDays);
                    Date date = cal.getTime();
                    System.out.println("\nCurrent Date: " + cdate+"\n");  
                    System.out.println("Day after two weeks: " + date+"\n");  	
                    
                 // get next year
                    cal.add(Calendar.YEAR, 1); 
                    Date nyear = cal.getTime();
                    //get previous year
                    cal.add(Calendar.YEAR, -2); 
                    Date pyear = cal.getTime();
                    System.out.println("\nCurrent Date : " + cdate);
                    System.out.println("\nDate before 1 year : " + pyear);
                    System.out.println("\nDate after 1 year  : " + nyear+"\n");  	
                    System.out.println(ym.isLeapYear());
                    
                    
	}

}
