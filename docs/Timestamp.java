
package timestamp;

public class Timestamp {
    private int year;
    private int day;
    private int month;
    private int hour;
    private int minute;
    private int second;
    
    public Timestamp(){
        year = 1970;
        day = 1;
        month = 1;
        hour = 1;
        minute = 1;
        second = 1;
    }
    public Timestamp(int year,int month,int day, int hour, int minute, int second){
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
        this.hour = hour;
        this.minute = minute;
        this.second = second;      
    }
    
     public Timestamp(int year,int month,int day){
        this(year,month,day,0,0,0);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <1970)
            year=1970;
        
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1){
            if(month%2== 0){
               if(month==2){
                   if(month<=28){
                       
                   }
               } 
            }
        }
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month<=12 && month>=1){
            this.month = month;
        }
        else{
            this.month = 1;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
     

      
    @Override
      public String toString(){
          String s = " anno "+year+" mese "+month+" giorno "+day;
          return s;
      }
      public boolean equals(Timestamp d){
          return(this.toString().equals(d.toString()));
      }
      
     
     
    
}
