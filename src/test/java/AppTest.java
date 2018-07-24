import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest.getGreeting()).isNotNull();
        assertThat(classUnderTest.getGreeting()).hasSize(12);
        assertThat(classUnderTest.getGreeting()).isEqualToIgnoringCase("Hello world.");
    }

    @Test
    void testPrecedence(){
        int c = 25 - 5 * 4 / 2 - 10 + 4;
        int d = (((25 - 5) * 4) / (2 - 10)) + 4;
        assertThat(c).isNotEqualTo(34);
        assertThat(c).isEqualTo(9);

        assertThat(d).isNotEqualTo(9);
        assertThat(d).isEqualTo(-6);
    }
}
