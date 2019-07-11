import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StackShould {

    private MyStack stack;

    @Before
    public void setUp() {
        // Given
        stack = new MyStack(3);
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

    //chaque méthode doit être une commande qui effectue une action ou une requête qui renvoie des données
    @Test
    public void after_one_push_and_one_pop_stack_is_empty() {
        //When
        stack.push();
        stack.pop();

        // Then
        assertEquals(stack.size(), 0);
    }

    //Then misheh exception
    @Test(expected= StackSizeOverflowsException.class)
    //Les RuntimeException ne faut pas nécessairement les traiter par le mécanisme de gestion des exceptions
    //Une Error n'est généralement pas rattrapée par le programmeur
    //Donc, Les Error ne sont pas soumises à la règle déclarer-ou-traiter. Les RuntimeException non plus, car le programmeur n'est pas censé savoir les traiter et donc il est inutile pour lui des les rattraper.
    //alors que Exception est un type d'exception contrôlé par le compilateur (« checked »).
    public void when_pushed_passed_limit_then_stack_overflows() {
        //When
        stack.push();
        stack.push();
        stack.push();
        stack.push();
    }

    @Test(expected = StackUnderFlowsException.class)
    public void when_popped_passed_limit_stack_underflows() {
        stack.pop();
    }

    @Test
    public void when_two_values_are_pushed_then_one_is_popped_size_is_one() {
        stack.push();
        stack.push();
        stack.pop();

        int stackSize = stack.size();

        Assert.assertEquals(stackSize, 1);

    }
}
