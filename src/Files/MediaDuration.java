package Files;

public class MediaDuration
{
    private Integer hours;
    private Integer minutes;
    private Integer seconds;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours>=0) {
            this.hours = hours;
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes>=0) {
            while (minutes >= 60) {
                this.hours += 1;
                minutes -= 60;
            }
            this.minutes = minutes;
        }
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        if(seconds>=0) {
            while (seconds >= 60) {
                this.minutes += 1;
                seconds -= 60;
                while (this.minutes >= 60) {
                    this.hours += 1;
                    this.minutes -= 60;
                }
            }
            this.seconds = seconds;
        }
    }

    public MediaDuration(int hours, int minutes, Integer seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    @Override
    public String toString()
    {
        String s="";
        if(hours>0) {
            if(hours<10)
            {
                s=s+"0";
            }
            s=s+hours+":";
        }
        if (hours>0 && minutes==0)
        {
            s=s+"00";
        }
        else if(minutes<10) {
            s=s+"0"+minutes;
        }
        else
        {
            s=s+minutes;
        }
        s=s+":";
        if(seconds<10)
        {
            s=s+"0";
        }
        s=s+seconds;
        return s;
    }

    public static void main(String[] args) {
        MediaDuration dur=new MediaDuration(0,2,6);
        System.out.println(dur);
    }
}