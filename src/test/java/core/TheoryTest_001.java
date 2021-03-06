package core;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest_001 {
	@DataPoint
	public static Integer i_01 = 10;
	
	@DataPoint
	public static Integer i_02 = 20;
	
	@DataPoint
	public static Integer i_03 = 30;
	
	@Theory
	public void a(Integer all_data_points) {
		System.out.println(all_data_points);
		Assume.assumeThat(all_data_points, is(30));
	}
}