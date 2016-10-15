package JavaTest20161015;

/**
 * Created by Administrator on 2016/10/15.
 */
public class ExceptionTest {
    public static void met(){
        String[] str = new String[2];
        try{
            System.out.println(str[3]);
        }catch (ArrayIndexOutOfBoundsException exc){
            exc.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("1...");
        met();
        System.out.println("2...");
    }
}
