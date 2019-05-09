import happy.number.Solution;
import org.junit.jupiter.api.*;

import java.io.File;

import static happy.number.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

public class ATest {

    @Nested
    public class OrderTest {
        @BeforeEach
        public void setup() {
            System.out.println("setup");
        }

        @Test
        public void a_test_1() {
            System.out.println("a_test1");
        }

        @Test
        public void b_test_2() {
            System.out.println("b_test_2");
        }

        @Test
        public void c_test_3() {
            System.out.println("c_test_3");
        }
    }

    @Nested
    public class HappyNumberTest {
        @Test
        @DisplayName("19はハッピー")
        public void _19_is_happy() {
            assertEquals(true, isHappy(19));
        }

        @Test
        public void test_7() {
            assertEquals(true, isHappy(7));
        }
        @Test
        public void test_8() {
            assertEquals(false, isHappy(8));
        }
        @Test
        public void test_9() {
            assertEquals(false, isHappy(9));
        }
    }


    @Nested
    public class FileTest {
        @Test
        public void test() {
            // Arrange 事前準備
            File file = new File("test");
            if (file.exists()) {
                file.delete();
            }
            assertEquals(false, file.exists());

            // Action テスト対象実行
            file.mkdir();

            // Assert 検証
            assertEquals(true, file.exists());
        }
    }
}