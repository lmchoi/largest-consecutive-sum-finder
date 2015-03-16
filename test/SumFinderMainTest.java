import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class SumFinderMainTest {
    private final ConsecutiveSumFinder consecutiveSumFinder = new ConsecutiveSumFinder();

    @Test
    public void shouldReturnSumOfOneNumber() {
        assertThat(consecutiveSumFinder.find(new int[]{3}), is(3));
    }

    @Test
    public void shouldReturnSumOfPositiveNumber() {
        assertThat(consecutiveSumFinder.find(new int[]{-2, 3}), is(3));
    }

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        assertThat(consecutiveSumFinder.find(new int[]{2, 4}), is(6));
    }

    @Test
    public void shouldReturnZeroWhenNumbersAreNegative() {
        assertThat(consecutiveSumFinder.find(new int[]{-1, -2}), is(0));
    }

    @Test
    public void shouldReturnSumStartingAfterANegative() {
        assertThat(consecutiveSumFinder.find(new int[]{1, -5, 3}), is(3));
    }

    @Test
    public void paulosTest() {
        assertThat(consecutiveSumFinder.find(new int[]{1, 0, -2, 3, 2, 2, -10}), is(7));
    }
}