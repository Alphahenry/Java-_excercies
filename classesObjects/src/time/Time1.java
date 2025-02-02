package time;

public class Time1 {
    private int hour;
    private int minute;
    private int second;


    public void  setTime(int minute, int hour, int second){
        if (hour < 0 || hour > 24 || minute < 0 || minute > 60 || second < 0 || second >= 60){
            throw new IllegalArgumentException("hour,minute, second out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //convert to string in universal time format.
    public String toUniversaltime(){
        return String.format("%d: %02d: %02d %s", ((hour == 0 || hour == 12)? 12 : hour %12),minute, second, (hour < 12? "Am" : "Pm"));

    }

}
