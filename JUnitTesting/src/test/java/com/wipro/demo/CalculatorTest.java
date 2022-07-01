package com.wipro.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTest {
	
	static Calculator cal;
	
	@BeforeAll
	public static void  beforeAll() {
		
		System.out.println("before all executed..");
		cal = new Calculator();
	}
	
	
	@BeforeEach
	public void beforeEach() {
		
		System.out.println("Before each executed..");
		
	}
	
	

	@Test
	@DisplayName("Add Test Case")
	void testAdd() {
		
		int actual =	cal.add(4, 5);
						// 4,5  // -3,-2  // 0,0 // _ , 5 //x ,y 
														
		
		assertEquals(9, actual);
		
	}

	@Test
	@DisplayName("Sub Test Case")
	void testSub() {
		
		
		assertEquals(1, cal.sub(5, 4));
		
	}

	@Test
	@Disabled
	void testMul() {
		
		assertEquals(20, cal.mul(5, 4));
		
	}
	
	@AfterAll
	public static void afterAll() {
		
		System.out.println("after all executed");
	}
	
	@AfterEach
	public void afterEach() {
		
		System.out.println("after each executed..");
		
	}
	
	
	
	
	

}
