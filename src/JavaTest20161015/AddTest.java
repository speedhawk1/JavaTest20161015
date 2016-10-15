package JavaTest20161015;
import com.sun.org.apache.bcel.internal.generic.DDIV;

import static java.lang.System.out;

public class AddTest<T,S> {


    public String met(T a,S b) {
        return (String.valueOf(a) + String.valueOf(b));
    }

    public static void main(String[] args) {
        AddTest<Integer,AddTest> add = new AddTest<>(); //此处泛型要具体化
        int a = 1;
        out.print(add.met(a,add));
    }
}
