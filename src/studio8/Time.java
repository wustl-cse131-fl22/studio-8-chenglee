package studio8;

import java.util.Objects;

public class Time {
	
	private int Hour;
	private int Minute;
	
	public Time(int hour, int minute) {
		this.Hour = hour;
		this.Minute = minute;
	}
	
	public int gethour() {
		return Hour;
	}
	
	public int getminute() {
		return Minute;
	}
	
	public String toString() {
		return "Time [Hour = " + Hour + ", Minute = " + Minute + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Hour, Minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return Hour == other.Hour && Minute == other.Minute;
	}

	public static void main(String[] args) {
 
    	Time y = new Time(23, 10);
    	Time x = new Time(23, 10);
    	System.out.println(x.equals(y));
    }

}