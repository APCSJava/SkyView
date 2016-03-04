import static org.junit.Assert.*;

import org.junit.Test;

public class SkyViewTest {

	@Test
	public void testSkyView() {
		double[] scanned = {0.3,0.7,0.8,0.4,1.4,1.1,0.2,0.5,0.1,1.6,0.6,0.9};
		SkyView sky = new SkyView(4, 3, scanned);
		double[][] intended = {
				{0.3, 0.7, 0.8},
				{1.1, 1.4, 0.4},
				{0.2, 0.5, 0.1},
				{0.9, 0.6, 1.6}};
		assertArrayEquals(intended, sky.getView());
		double[] scanned2 = {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
		SkyView sky2 = new SkyView(3, 2, scanned2);
		double[][] intended2 = {
				{0.3, 0.7},
				{0.4, 0.8},
				{1.4, 1.1}
		};
		assertArrayEquals(intended2, sky2.getView());
	}

	@Test
	public void testGetAverage() {
		SkyView sky = new SkyView(0, 0, new double[] {});
		double[][] data = {
				{0.3, 0.7, 0.8},
				{1.1, 1.4, 0.4},
				{0.2, 0.5, 0.1},
				{0.9, 0.6, 1.6}};
		sky.setView(data);
		assertEquals(0.8, sky.getAverage(1, 2, 0, 1), 1E-15);
	}

}
