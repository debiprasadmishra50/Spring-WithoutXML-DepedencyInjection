package demo;

public class BadmintonCoach implements Coach {

	private FortuneService fortuneService;
	
	public BadmintonCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "In Badminton : Practice Badminton smash 2 hours a day";
	}

	@Override
	public String getDailyFortune() {
		return "In BadmintonCoach : "+fortuneService.getFortune();
	}
	
	
}
