public class Question99{
	
	//Function to find the time difference
	public static int getTimeInSeconds (String str){
		String[] curr_time = str.split(":");
		int t = Integer.parseInt(curr_time[0])*60 + Integer.parseInt(curr_time[1]);
		return t;
	}
	
	//Function to convert seconds back to hh:mm
	public static String convertSecToTime(int t){
		int hours = t/3600;
		String hh = hours<10 ? "0"+Integer.toString(hours) : Integer.toString(hours);
		int min = (t%3600)/60;
		String mm = min<10 ? "0"+Integer.toString(min) : Integer.toString(min);
		
		String ans = hh + ":" + mm ;
		return ans;
	}
	
	//Function to find the time gap
	public static String timeGap (String st, String et){
		int t1 = getTimeInSeconds (st);
		int t2 = getTimeInSeconds (et);
		
		int time_diff = (t1<t2)?t2-t1 : t1-t2;
		
		return convertSecToTime(time_diff);
	}
	
	public static void main (String [] args){
		String st = "01:00";
		String et = "01:10";
		System.out.println(timeGap(st,et));
	}
}