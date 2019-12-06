class MilkTea{
    String milktea1="波霸奶茶";
    String milktea2="珍珠奶茶";
    String milktea3="椰果奶茶";
    Ingredient ingredient=new Ingredient(){};
    public void add_ingredient(Ingredient ingredient){
        this.ingredient=ingredient;
    }
    public String toString(){
        return "1:"+milktea1+ingredient+",2:"+milktea2+ingredient+",3:"+milktea3+ingredient+";";
    }

}