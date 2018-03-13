import junit.framework.*;
import org.junit.Test;
import org.junit.Assert;

public class MinmaxTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
		int[] arrayWithValues = new int[]{0, 1};
		Assert.assertArrayEquals(arrayWithValues, Minmax.foundMinMax(arrayWithValues));
	}

	@Test
	public void test2() throws Exception {
		int[] arrayWithValues = new int[]{0, 1, 2, 3};
  		int[] tableauMinmax = new int[]{0, 3};
		Assert.assertArrayEquals(tableauMinmax, Minmax.foundMinMax(arrayWithValues));
	}

	@Test
	public void test3() throws Exception {
		int[] arrayWithValues = new int[]{-6};
  		int[] tableauMinmax = new int[]{-6, -6};
		Assert.assertArrayEquals(tableauMinmax, Minmax.foundMinMax(arrayWithValues));
	}

	@Test
	public void test4() throws Exception {
		int[] arrayWithValues = new int[]{3, 1, -4, 23, 12, 5};
  		int[] tableauMinmax = new int[]{-4, 23};
		Assert.assertArrayEquals(tableauMinmax, Minmax.foundMinMax(arrayWithValues));
	}
}
