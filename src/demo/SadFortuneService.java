package demo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is such a bad day";
	}

}
