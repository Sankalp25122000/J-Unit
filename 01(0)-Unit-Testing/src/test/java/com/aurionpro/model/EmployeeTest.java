package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {
	Employee emp = new Employee(1, "Sankalp", 15000);

	@Test
	void testCalculateAnnualCTC() {
		assertEquals(261000.0, emp.calculateAnnualCTC());
	}

	@Test
	void testGetHra() {
		assertEquals(3000, emp.getHra());
	}

	@Test
	void testGetTa() {
		assertEquals(1500, emp.getTa());
	}

	@Test
	void testGetDa() {
		assertEquals(2250, emp.getDa());
	}

	@Test
	void testCalculateMonthlySalary() {

		assertEquals(15000, emp.getBasic());
	}

}
