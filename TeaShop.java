import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

class TeaShop implements shop{
    private ArrayList<Coconut> coconuts=new ArrayList<Coconut>();
    private ArrayList<Bubble> bubbles=new ArrayList<Bubble>();
    Ingredient ingredient=new Ingredient(){};
    Coconut coconut = new Coconut(2019,11,4);
    Bubble bubble =new Bubble(2019,11,4);

    public void addingredient(Ingredient ingredient){
        this.ingredient=ingredient;
        if(ingredient instanceof Bubble){
            addingredient(bubble);
        }
        if(ingredient instanceof Coconut){
            addingredient(coconut);
        }
    }
    @Override
    public void sellmilktea(String milktea_name,String ingredient_name) throws SoldOutException{
        Calendar start=Calendar.getInstance();
        Calendar end=Calendar.getInstance();
        end.getTime();
        if(ingredient_name.equals("Bubble")){
            if(bubbles.size()==0){
                throw new SoldOutException("改配料已经售空");
            }else{
                Date starttime=bubble.getdate();
                start.setTime(starttime);
                if(start.after(end)){

                    throw new SoldOutException("该配料已经过期");
                }
                bubbles.remove(bubble);
            }
        }
        if(ingredient_name.equals("Coconut")){
            if(coconuts.size()==0){
                throw new SoldOutException("改配料已经售空");
            }else {
                Date starttime=coconut.getdate();
                start.setTime(starttime);
                if(start.after(end)){
                    throw new SoldOutException("该配料已经过期");
                }
                coconuts.remove(bubble);
            }
        }
    }
    private void addingredient(Bubble ingredient ){
        bubbles.add(ingredient);
    }
    private void addingredient(Coconut ingredient){
        coconuts.add(ingredient);
    }
    public String toString(){
        return bubbles.toString()
                +coconuts.toString();
    }

}