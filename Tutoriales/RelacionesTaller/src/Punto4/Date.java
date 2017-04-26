package punto4;


public class Date {
private int day;
private int month;
private int year;
private String namesDay;
private String namesMonth;

    public Date(int day, int month, int year, String namesDay, String namesMonth) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.namesDay = namesDay;
        this.namesMonth = namesMonth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNamesDay() {
        return namesDay;
    }

    public void setNamesDay(String namesDay) {
        this.namesDay = namesDay;
    }

    public String getNamesMonth() {
        return namesMonth;
    }

    public void setNamesMonth(String namesMonth) {
        this.namesMonth = namesMonth;
    }
public boolean isLeapyear(){
    
if (this.year%4!=0){
    return false;
}
if((this.year%100==0)){
    return false;
    }
if (this.year%400==0){
return false; 
}
   return true;
}
public void Bisiesto(){
if(isLeapyear()==true){
    System.out.println("Es año bisiesto");
}
}
    @Override
    public String toString() {
        return day + "/" + month + "/" + year + ", namesDay=" + namesDay + ", namesMonth=" + namesMonth;
    }
    
}
