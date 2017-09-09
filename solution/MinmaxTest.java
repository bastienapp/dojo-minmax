import junit.framework.*;
import org.junit.Test;
import java.util.Arrays;

public class MinmaxTest extends TestCase {
	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test1() throws Exception {
  		int[] tableauEntier = new int[]{0,1};
		assertEquals(Arrays.toString(tableauEntier), Arrays.toString(Minmax.foundMinMax(tableauEntier)));
	}

	@Test
	public void test2() throws Exception {
  		int[] tableauEntier = new int[]{0,1,2,3};
  		int[] tableauMinmax = new int[]{0,3};
		assertEquals(Arrays.toString(tableauMinmax), Arrays.toString(Minmax.foundMinMax(tableauEntier)));
	}

	@Test
	public void test3() throws Exception {
  		int[] tableauEntier = new int[]{-6};
  		int[] tableauMinmax = new int[]{-6,-6};
		assertEquals(Arrays.toString(tableauMinmax), Arrays.toString(Minmax.foundMinMax(tableauEntier)));
	}

	@Test
	public void test4() throws Exception {
  		int[] tableauEntier = new int[]{3,1,-4,23,12,5};
  		int[] tableauMinmax = new int[]{-4,23};
		assertEquals(Arrays.toString(tableauMinmax), Arrays.toString(Minmax.foundMinMax(tableauEntier)));
	}
}
