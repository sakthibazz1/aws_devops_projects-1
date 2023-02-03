package test.java.com.calculator.application;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.com.calculator.application.calci;

class testcalci {

	@Test
	void testadd() {
		assertEquals(10, calci.add(5,5));
	}

	@Test
	void testdiv() {
		assertEquals(5, calci.div(10, 2));
	}

	@Test
	void testmult() {
		assertEquals(9, calci.mult(4, 3));
	}

	@Test
	void testsub() {
		assertEquals(15,calci.sub(20,5));
	}
	@Test
	void testmodl() {
		assertEquals(0,calci.modl(20,2));
	}

}
