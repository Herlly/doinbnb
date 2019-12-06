import java.util.Scanner;
import java.util.Calendar;
class leading_end{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Calendar newtime = Calendar.getInstance();
        newtime.getTime();
        TeaShop teaShop = new TeaShop();
        MilkTea milkTea = new MilkTea();
        Bubble bubble=new Bubble(2019,11,4);
        Coconut coconut=new Coconut(2019,11,4);
        teaShop.addingredient(coconut);
        try{
            String milkname=scanner.nextLine();
            String ingredientname=scanner.nextLine();
            teaShop.sellmilktea(milkname,ingredientname);
        }catch (SoldOutException e){
            System.out.println(e);
        }
        /*System.out.println("欢迎来到西二奶茶店");
        System.out.println("我们现在在售的奶茶有：");
        System.out.println(milkTea.toString());
        System.out.println("请输入想要的奶茶和配料");
        String milkname=scanner.nextLine();
        String ingredientname=scanner.nextLine();
        try {
            if(ingredientname.equals("Bubble")&&teaShop.num_bubble()==0){
                throw new SoldOutException("该配料已经售空");
            }
            else if(ingredientname.equals("Coconut")&&teaShop.num_coconut()==0){
                throw new SoldOutException("该配料已经售空");
            }
            else {
                teaShop.sellmilktea(milkname, ingredientname);
                System.out.println(teaShop.toString());
            }
        }catch (SoldOutException e) {
            System.out.println(e);
            if(ingredientname.equals("Bubble")){//向奶茶中加配料
                teaShop.addingredient(bubble);
            }else if(ingredientname.equals("Coconut")){
                teaShop.addingredient(coconut);
            }
        }*/
    }


}