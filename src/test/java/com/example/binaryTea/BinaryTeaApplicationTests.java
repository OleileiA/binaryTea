package com.example.binaryTea;

import com.example.binaryTea.properties.BinaryTeaProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = BinaryTeaApplication.class, properties = {
		"binarytea.ready=true",
		"binarytea.open-hours=8:30-22:00"
})
class BinaryTeaApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void testPropertiesBeanAvailable() {
		assertNotNull(applicationContext.getBean(BinaryTeaProperties.class));
		assertTrue(applicationContext.containsBean("binarytea-com.example.binaryTea.properties.BinaryTeaProperties"));
	}

	@Test
	void testPropertyValues() {
		BinaryTeaProperties properties = applicationContext.getBean(BinaryTeaProperties.class);
		assertTrue(properties.isReady());
		assertEquals("8:30-22:00", properties.getOpenHours());
	}

	@Test
	void contextLoads() {
	}

}
