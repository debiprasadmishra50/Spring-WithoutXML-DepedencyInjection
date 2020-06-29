package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationDemoApp 
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		Coach theCoach = context.getBean("badmintonCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		context.close();
	}
}
