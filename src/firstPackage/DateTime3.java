package firstPackage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class DateTime3 {

	public static void main(String[] args) {
		//Format examples
				LocalDate date = LocalDate.now();
				//default format
				System.out.println("\nDefault format of LocalDate="+date);
				//specific format
				System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

				LocalDateTime dateTime = LocalDateTime.now();
				//default format
				System.out.println("Default format of LocalDateTime="+dateTime);
				//specific format
				System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
		   		Instant timestamp = Instant.now();
				//default format
				System.out.println("Default format of Instant="+timestamp);
				
				//Parse examples
				LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
						DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
				System.out.println("Default format after parsing = "+dt+"\n");
				
				YearMonth ym = YearMonth.now();
				Calendar cal = Calendar.getInstance();
				Month mn = ym.getMonth();
				LocalTime tm = LocalTime.now();
				String dtt = "08-08-2017";
				cal.getTime();
				Month firstMonthOfQuarter = mn.firstMonthOfQuarter();
				String yr = ym.format(DateTimeFormatter.ofPattern("uuuu"));
				System.out.println(yr);
				System.out.println(ym.isLeapYear());
				System.out.println(ym.lengthOfYear());
				
				System.out.println("Integer value of the current month:"+ym.getMonthValue());
				System.out.println("Length of the month: "+ ym.lengthOfMonth());
				System.out.println("Actual maximum:"+cal.getActualMaximum(Calendar.DATE));
				System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n"); 
				
				System.out.println("Hour :"+tm.getHour());
				System.out.println("Minute :"+tm.getMinute());
				System.out.println("second :"+tm.getSecond());
				System.out.println("Hours before 2: "+tm.minusHours(2).getHour());
				System.out.println("Minutes before 30: "+tm.minusMinutes(30).getMinute());
				System.out.println("Seconds before 4 : "+tm.minusSeconds(4).getSecond());
				
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.ENGLISH);
				   LocalDate dates = LocalDate.parse(dtt, formatter);
				   System.out.println();
				   System.out.println(dates);

	}

}
