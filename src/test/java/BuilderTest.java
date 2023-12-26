import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.ucu.edu.taskone.User;

public class BuilderTest {
    public static final int AGE = 18;
    public static final int WEIGHT = 60;
    public static final int HEIGHT = 173;
    @Test
    public void testIvan() {
        User ivan = User.builder()
                .name("Uliana")
                .age(AGE).gender("f")
                .weight(WEIGHT)
                .height(HEIGHT)
                .build();
        Assertions.assertEquals(ivan.getName(), "Uliana");
        Assertions.assertEquals(ivan.getAge(), AGE);
        Assertions.assertEquals(ivan.getGender(), "f");
        Assertions.assertEquals(ivan.getWeight(), WEIGHT);
        Assertions.assertEquals(ivan.getHeight(), HEIGHT);
    }

    @Test
    public void testDefault() {
        User defaultUser = User.builder().build();
        Assertions.assertNull(defaultUser.getName());
        Assertions.assertEquals(defaultUser.getAge(), 0);
        Assertions.assertNull(defaultUser.getGender());
        Assertions.assertEquals(defaultUser.getWeight(), 0);
        Assertions.assertEquals(defaultUser.getHeight(), 0);
    }
}