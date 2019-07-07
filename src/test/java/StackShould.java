import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StackShould {

    private MyStack stack;

    @Before
    public void setUp() {
        // Given
        stack = new MyStack();
    }

    @Test
    public void newlyCreatedStackShouldBeEmpty() {
        // When
        boolean result = stack.isEmpty();
        // Then
        assertTrue(result);
    }

    @Test
    public void afterOnePushThenStackSizeIsOne() {
        // When
        stack.push();

        // Then
        assertEquals(stack.size(), 1);
    }

    @Test
    public void after_one_push_and_one_pop_stack_is_empty() {
        //When
        stack.push();
        stack.pop();

        // Then
        assertEquals(stack.size(), 0);
    }
}
