package first;

import first.user.User;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author byron
 * @date 2019/12/31 15:25
 */
public class First {
    public static void main(String[] args){
        System.out.println(Objects.requireNonNull(First.class.getClassLoader().getResource("")).getPath());
        System.out.println("Hello Java!");
        System.out.println(Arrays.toString(args));
        User user = new User();
        user.askSelf();
    }
}