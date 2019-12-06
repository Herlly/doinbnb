import java.util.Calendar;
import java.util.Date;

abstract class Ingredient {
    protected int EXP;
    protected String name;
    protected Calendar BD=Calendar.getInstance();
    public Ingredient(){};
    public Ingredient(int year,int month,int day){
        BD.set(year,month,day);
    }
    public String toString(){
        return "Ingredient [name=" + name + ",生产日期:"+BD.getTime()+"EXP:"+EXP+"]";
    }
    public Date getdate(){
        BD.add(Calendar.DATE,EXP);
        return BD.getTime();
    }
}




