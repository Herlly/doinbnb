import java.util.Calendar;
import java.util.Date;

class Bubble extends Ingredient{
    protected int EXP=7;
    protected String name="Bubble";
    public Bubble(int year,int month,int day){
        super(year, month, day);
    }
    public String toString(){
        return "Ingredient [name=" + name + ",生产日期:"+BD.getTime()+"EXP:"+EXP+"]";
    }
    public Date getdate(){
        BD.add(Calendar.DATE,EXP);
        return BD.getTime();
    }

}