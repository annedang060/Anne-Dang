

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void setHour(int hour){
        if(0 <= hour && hour < 24){
            this.hour = hour;
        }

        else{
            hour = 0;
        }
    }

    public void setMinute(int minute){
        if(0 <= minute && minute<60){
            this.minute = minute;

        }

        else{
            minute = 0;
        }

    }

    public void setSecond(int second) {

        if (0 <= second && second < 60) {
            this.second = second;
        } else {
            second = 0;
        }
    }

    public void setTime(int hour, int minute,int second){
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public String toString(){

        return String.format("%02d:%02d:%02d", hour, minute, second);

    }

    public void nextSecond(){
        second++;

        if(second==60) {
            second = 0;
            minute++;

            if (minute == 60) {
                minute = 0;
                hour++;
            }

            if (hour > 12) {
                hour = 1;
            }


        }
    }

    public void previousSecond(){

        second--;

        if(second<0){
            second = 59;
            minute --;

            if(minute<0){
                minute = 59;
                hour--;
            }

            if(hour<1){
                hour = 12;

            }



        }





    }

}