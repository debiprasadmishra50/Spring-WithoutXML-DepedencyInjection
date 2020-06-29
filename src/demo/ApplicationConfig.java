package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
	// define bean for SadFortuneService
	@Bean
	public FortuneService sadFortuneService() { // method name is the bean_id
		return new SadFortuneService();
	}

	// define bean for BadmintonCoach and inject dependency
	@Bean
	public Coach badmintonCoach() {
//		BadmintonCoach theBadmintonCoach = new BadmintonCoach(sadFortuneService());
//		return theBadmintonCoach;
//		OR
		return new BadmintonCoach(sadFortuneService());
	}

}
