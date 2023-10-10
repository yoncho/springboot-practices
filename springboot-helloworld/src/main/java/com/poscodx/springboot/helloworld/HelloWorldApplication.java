package com.poscodx.springboot.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * 1. BootStraping Class : spring application`s bootstrap 
 * 2. Configuration Class 
 * */
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		/*
		 * SpringApplication.run(TARGETCLASS.class, PARAMETER) : 안에서 일어나는 일
		 * 
		 * 1. application context (spring container) 생성
		 * 2. annotation scan (Component scan) + Configuration Class를 통한
		 * 	  빈 생성 및 등록 작업
		 * 3. if, web app. (spring mvc) ==> web app. type을 결정 (Spring MVC, React)
		 * 4. if, web app. 이고 type == SpringMVC 이면 
		 * 	  - 내장(embedded) 서버(TomcatEmbeddedServiceServletContainer) 인스턴스 생성
		 * 	  - 서버 인스턴스 wep app. 배포 (mvc, aop, security, jpa, ... auto configuration)
		 * 	  - 서버 인스턴스 start
		 * 5. ApplicationRunner interface를 구현한 빈을 application context에서 찾아서 실행!! 
		 * */
		
//		ConfigurableApplicationContext ac = null;
//		try {
//			ac = SpringApplication.run(HelloWorldApplication.class, args);	
//		} catch (Throwable ex) {
//			ex.printStackTrace();
//		} finally {
//			if(ac != null) {
//				ac.close();
//			}
//		}
		
		// try ~ with ~ resources 구문 - 자동 close 기능..!
		try(ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class, args)) {}
		
		//web application인 경우
		// SpringApplication.run(HelloWorldApplication.class, args)
		
		System.out.println("some code ....");
		System.out.println("some code ....");
		System.out.println("some code ....");
		System.out.println("some code ....");
	}
}