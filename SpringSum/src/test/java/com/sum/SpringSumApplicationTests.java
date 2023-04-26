package com.sum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

@SpringBootTest
class SpringSumApplicationTests {

	@Autowired
	SumOfNum ser;
	@Test
	void contextLoads() {
		assertNotNull(ser.sum(20, 20));
	}

}
