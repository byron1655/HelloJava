package first.user;

import java.util.Objects;

/**
 * @author byron
 * @date 2019/12/31 16:09
 */
public class User {

    private String name;

    public void askSelf(){
        System.out.println(Objects.requireNonNull(User.class.getClassLoader().getResource("")).getPath());
    }
}
