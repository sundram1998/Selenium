package seleniumBeginer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JunitDemo2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("inside BeforeAll");	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Inside AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Inside beforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Inside AfterEach");
	}

	@Test
	void test() {
		System.out.println("Inside Test");
	}

}
