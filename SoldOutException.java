public class SoldOutException extends RuntimeException {
    public SoldOutException(){}
    public SoldOutException(String str){
        super(str);
    }
}
