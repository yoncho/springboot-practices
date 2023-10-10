package ex05;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
 * ApplicationContext가 bean 생성/ wiring을 마친 후,
 * 실행할 코드(ApplicationContext 환경에 의존적인 경우)가 있는 경우
 * ApplicationRunner Interface를 구현한 클래스 빈(HelloWorldRunner) 사용하기 
 * */
@SpringBootApplication
public class MyApplication {
	
	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(MyApplication.class, args);
//		MyComponent myComponent = ac.getBean(MyComponent.class);
//		myComponent.printHelloWorld();
		// 위 코드 대신 application runner interface 사용..!
	}

}
