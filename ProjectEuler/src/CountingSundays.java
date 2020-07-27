import java.sql.Date;
import java.util.Calendar;

public class CountingSundays {
	
	public static void main(String[] args) {
		int sunCount = 0;
		Calendar cal = Calendar.getInstance();
		for(int i = 1901; i <= 2000; i++) {
			for(int j = 0; j <= 11; j++) {
				cal.setTime(new Date(i - 1990, j, 1));
				if(cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
					sunCount++;
				}
			}
		}
		System.out.println(sunCount);
	}
	
	public static int addDay(int n) {
		n++;
		if(n > 6) {
			n = 0;
		}
		return n;
	}

}
