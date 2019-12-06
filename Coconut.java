import java.util.Calendar;
import java.util.Date;

class Coconut extends Ingredient{
    protected int EXP=5;
    protected String name="Coconut";
    public Coconut(int year,int month,int day){
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
