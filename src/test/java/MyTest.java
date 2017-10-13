import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Test demonstrates issue: it has both @Category and @RunWith annotations. Gradle test task with
 * filter for Category will not run this test. Gradle test task should fail (because testMyMethod
 * should fail), but it does not.
 * <p>
 * Gradle test task with filter for Category will run this test if RunWith annotation is removed.
 * Gradle test task with filter for Category will run this test if PowerMockIgnore annotation is
 * added.
 * <p>
 * See build.gradle file.
 *
 */
// Workaround: @PowerMockIgnore({ "org.junit.experimental.categories.Category", "FastTest" })
@Category(FastTest.class)
@RunWith(PowerMockRunner.class)
public class MyTest {
    @Test
    public void testMyMethod() {
        // Test method should fail
        assertTrue(false);
    }
}
