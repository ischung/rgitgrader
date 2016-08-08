package hansung.insang.gitgrader;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTest {
	@Test
	public void test_calculate_grade() {
		Grade g = Grader.calculate_grade(30,30);
		assertEquals(Grade.C, g);
	}
}
