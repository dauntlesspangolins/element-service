package com.cormacx.elementservice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cormacx.elementservice.model.Element;

@SpringBootTest
public class ElementRepositoryTest {

	@Autowired
	ElementRepository elementRepo;
	
	Element hydrogen = new Element();
	
	@Test
	public void save_throwsExceptionIfRepeated() {
		
	}
	
}
