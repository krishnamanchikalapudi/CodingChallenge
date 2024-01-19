package solutions.hackerrank.prepkit1week;

/**
 * Problem: https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/
 * 
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 * 
 * Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock. 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 * 
 * Example 1
 * Input: 12:01:00PM
 * Output: 12:01:00
 * 
 * Example 2
 * Input: 07:05:45PM
 * Output: 19:05:45
 */
public class TimeConversion {
	/**
	 * PSEUDO CODE video:
	 * 
	 * @param s
	 * @return
	 */
	public String solution(String s) {

		String[] timeSplit = s.split(":");
		int hour = Integer.parseInt(timeSplit[0]);
		int minute = Integer.parseInt(timeSplit[1]);
		String secondAndAmPm = timeSplit[2];

		// Extract AM or PM
		String amPm = secondAndAmPm.substring(2);
		String second = secondAndAmPm.substring(0, 2);

		// Handle special cases for 12AM and 12PM
		if (hour == 12 && amPm.equalsIgnoreCase("AM")) {
			hour = 0; // 12AM becomes 00:00:00
		} else if (hour == 12 && amPm.equalsIgnoreCase("PM")) {
			hour = 12; // 12PM remains 12:00:00
		} else if (amPm.equalsIgnoreCase("PM")) {
			hour += 12; // Add 12 to the hour for PM times (except 12PM)
		} // IF

		return String.format("%02d:%02d:%s", hour, minute, second);
	}
}
