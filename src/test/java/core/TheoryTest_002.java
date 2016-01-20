package core;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class TheoryTest_002 {
	
	@DataPoints
	public static String[] s_array() {
		return new String[] {"a", "b", "c", "d", "e", "f"};
	}
	
	@Theory
		public void test_002_001(String s_01, String s_02, String s_03, String s_04, String s_05) {	
		System.out.println(s_01 + s_02 + s_03 + s_04 + s_05 + " ");		
		Assume.assumeThat(s_01 + s_02 + s_03 + s_04 + s_05, is("acbad"));
	}
}