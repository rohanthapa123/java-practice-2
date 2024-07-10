class Time{
    private int hour,minute,seconds;
    public Time(int h,int m,int s){
        hour = h;
        minute = m;
        seconds = s;
    }
    public String displayTime(){
        return (hour+":"+minute+":"+seconds);
    }
    public void addTime(Time other){
        seconds+=other.seconds;
        if(seconds >=60){
            seconds-=60;
            minute++;
        }        
        minute+=other.minute;
        if(minute >=60){
            minute-=60;
            hour++;
        }
        hour+=other.hour;
    }
}
public class ChangeTime {
    public static void main(String[]args){
        Time t1 = new Time(2,34,54);
        Time t2 = new Time(6,54,24);
        System.out.println("The time t1 is " + t1.displayTime());
        System.out.println("The time t2 is " + t2.displayTime());
        t1.addTime(t2);
        System.out.println("The time of t1 after adding t2 is " + t1.displayTime());
    }
}
