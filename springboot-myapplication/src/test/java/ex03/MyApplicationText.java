package ex03;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ex03.component.MyComponent;

/*
 * SpringBoot Test Integeration
 * 
 * 
 * */

@SpringBootTest
public class MyApplicationText {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
