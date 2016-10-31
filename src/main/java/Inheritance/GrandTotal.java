package Inheritance;

/**
 * Created by User on 2016/10/25.
 */
public class GrandTotal {

    public static void main(String[] args) {

        AddSubstitute test = new AddSubstitute();
        test.one=16;
        test.two=78;
        test.sum();
        System.out.println(test.total);

        test.sub();;
        System.out.println(test.total);

    }
}
