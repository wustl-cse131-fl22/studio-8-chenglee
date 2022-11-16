package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int Month;
	private int Day;
	private int Year;
	private boolean Holiday;
	
	/**
	 * Constructor
	 * @param month
	 * @param day
	 * @param year
	 * @param holiday
	 */
	
	public Date(int month, int day, int year, boolean holiday) {
		this.Month = month;
		this.Day = day;
		this.Year = year;
		this.Holiday = holiday;
	}
	
	/**
	 * Getter
	 * @return each instance variable
	 */
	
	public int getmonth() {
		return Month;
	}
	
	public int getday() {
		return Day;
	}
	
	public int getyear() {
		return Year;
	}
	
	public boolean getholiday() {
		return Holiday;
	}
	
	/**
	 * toSting method
	 * it returns a string
	 */
    @Override
	public String toString() {
		return "Date [Month=" + Month + ", Day=" + Day + ", Year=" + Year + ", Holiday=" + Holiday + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(Day, Holiday, Month, Year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return Day == other.Day && Holiday == other.Holiday && Month == other.Month && Year == other.Year;
	}

	public static void main(String[] args) {
		Date x = new Date(3, 21, 2019, true);
    	Date y = new Date(3, 21, 2019, true);
    	System.out.println(x.equals(y));
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(x);
		list.add(y);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(x);
		set.add(y);
		System.out.println(set);
    	
    	
    }

}
