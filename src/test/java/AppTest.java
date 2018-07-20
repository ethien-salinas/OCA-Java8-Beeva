import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertThat(classUnderTest.getGreeting()).isNotNull();
        assertThat(classUnderTest.getGreeting()).hasSize(12);
        assertThat(classUnderTest.getGreeting()).isEqualToIgnoringCase("Hello world.");
    }
}
