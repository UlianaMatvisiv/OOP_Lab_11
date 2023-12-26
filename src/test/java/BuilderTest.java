import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ua.ucu.edu.taskone.User;

public class BuilderTest {
    @Test
    public void testIvan() {
        User ivan = User.builder().name("Uliana").age(18).gender("f").weight(60).height(173).build();
        Assertions.assertEquals(ivan.getName(), "Uliana");
        Assertions.assertEquals(ivan.getAge(), 18);
        Assertions.assertEquals(ivan.getGender(), "f");
        Assertions.assertEquals(ivan.getWeight(), 60);
        Assertions.assertEquals(ivan.getHeight(), 173);
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