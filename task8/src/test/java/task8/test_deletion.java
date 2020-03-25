package task8;

import static org.junit.Assert.*;

import org.junit.Test;


public class test_deletion {

	/* TO-DO
	 * “ABCD” => “BCD” 
	 * “AACD” => “CD”  
	 * “BACD” => “BCD” 
	 * “BBAA” => “BBAA”        
	 * “AABAA” => “BAA”
	 * "" =>""
	 * "A"=>"" 
	 */
	@Test
	public void test1() {
		assertEquals("BCD",deletion_of_A.delete("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",deletion_of_A.delete("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",deletion_of_A.delete("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",deletion_of_A.delete("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",deletion_of_A.delete("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",deletion_of_A.delete(""));
	}
	@Test
	public void test7() {
		assertEquals("",deletion_of_A.delete("A"));
	}

}

