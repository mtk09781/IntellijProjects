import org.testng.Assert;
import org.testng.annotations.Test;

public class SlidingWindowMeanTest {

    @Test
    public void testMedianSlidingWindow() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        double[] expected = {1, -1, -1, 3, 5, 6};
        double[] result = NoOFmetricHavingSomeTarget.medianSlidingWindow(nums, k);
        Assert.assertEquals(result, expected);
    }
}
