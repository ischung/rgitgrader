package hansung.insang.gitgrader;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {
	
	@Test
	public void test_calculate_grade1() {
		Grade g = Grader.calculate_grade(30,30);
		assertEquals(Grade.C, g);
	}
	@Test
	public void test_calculate_grade3() {
		Grade g = Grader.calculate_grade(10,30);
		assertEquals(Grade.F, g);
	}
	@Test
	public void test_calculate_grade2() {
		Grade g = Grader.calculate_grade(40,40);
		assertEquals(Grade.A, g);
	}
	
	@Test
	public void test_calculate_grade4() {
		Grade g = Grader.calculate_grade(40,35);
		assertEquals(Grade.B, g);
	}

	@Test(expected=InvalidInputException.class)	
	public void test_calculate_grade5() {		
		Grade g = Grader.calculate_grade(20,-10);
	}

	
	@Test(expected=InvalidInputException.class)
	public void test_calculate_grade6() {
		Grade g = Grader.calculate_grade(-20,35);
	}

	@Test(expected=InvalidInputException.class)
	public void test_calculate_grade7() {
		Grade g = Grader.calculate_grade(-20,-35);
	}

}
