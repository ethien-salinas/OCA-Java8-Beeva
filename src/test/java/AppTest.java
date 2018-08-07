import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.function.ToIntBiFunction;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest.getGreeting()).isNotNull();
        assertThat(classUnderTest.getGreeting()).hasSize(12);
        assertThat(classUnderTest.getGreeting()).isEqualToIgnoringCase("Hello world.");
    }

    @Test
    void testPrecedence() {
        int c = 25 - 5 * 4 / 2 - 10 + 4;
        int d = (((25 - 5) * 4) / (2 - 10)) + 4;
        assertThat(c).isNotEqualTo(34);
        assertThat(c).isEqualTo(9);

        assertThat(d).isNotEqualTo(9);
        assertThat(d).isEqualTo(-6);
    }

    @Test
    void testTernary() {
        // old school way
        int x0 = 4, y0 = 9;
        if (y0 / x0 < 3) {
            x0 += y0;
        } else {
            x0 *= y0;
        }
        assertThat(x0).isEqualTo(13);

        // with ternary operator
        int x1 = 4, y1 = 9;
        x1 = (y1 / x1 < 3) ? x1 + y1 : x1 * y1;
        assertThat(x1).isEqualTo(13);

        ToIntBiFunction<Integer, Integer> elvisLambda = (x, y) -> (y / x < 3) ? x + y : x * y;
        assertThat(elvisLambda.applyAsInt(4, 9)).isEqualTo(13);

    }
}
