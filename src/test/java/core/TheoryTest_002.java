package core;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assume;
import org.junit.Test;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest_002 {
	int count = 0;
	
	@DataPoints
	public static String[] s_array() {
		return new String[] {"a", "b", "c", "d", "e", "f", "g"};
	}
	
	@Theory
	//public void test_002_001(String s_01, String s_02, String s_03, String s_04, String s_05, String s_06, String s_07, String s_08, String s_09, String s_10) {
	
	public void test_002_001(String s_01, String s_02, String s_03, String s_04, String s_05, String s_06) {
		
		System.out.print(s_01 + s_02 + s_03 + s_04 + s_05 + s_06 + " ");
		Assume.assumeThat(s_01 + s_02 + s_03 + s_04 + s_05 + s_06, is("acbz"));
		count++;
	}
	
	@Test
	public void counting() {
		System.out.println("combinations:" + count);
	}
}