package firstPackage;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;

public class DateTime2 {

	public static void main(String[] args) {
		
		Calendar call = Calendar.getInstance();
		LocalDate today = LocalDate.now();
		LocalDate userday = LocalDate.of(2015, 1, 8);
		Period diff = Period.between(userday, today);
		System.out.println("Difference b/w two dates :"+ diff.getYears() + " Year(s) " + diff.getMonths()+" Months" );
		
		Instant timestamp = Instant.now(); 
	    System.out.println("\nCurrent Timestamp: " + timestamp+"\n"); 
	    
	    ZoneId.SHORT_IDS.keySet().
	    stream().forEach( 
	    zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
	    
	     System.out.println("\nCurrent Date: "+today);
	     System.out.println("10 days before today will be "+today.plusDays(-10));
	     System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
	     
	     LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
	     Period period = today.until(lastDayOfYear);
	     System.out.println();
	     System.out.println("Months remaining in the year: "+period.getMonths());	
	     

	}

}
