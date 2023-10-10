package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * SpringBoot Test Integeration
 * 
 * Error:
 * SpringBoot Test Integration(SpringBootTest)에서는 
 * @Configuration 을 달고 있는 설정 클래스는 자동으로 스캔하지 못 한다...
 * 
 * */

@SpringBootTest
public class MyApplicationText02 {
	
	@Autowired
	private MyComponent myComponent;
	
	@Test
	public void myComponentNotNull() {
		assertNotNull(myComponent);
	}
}
