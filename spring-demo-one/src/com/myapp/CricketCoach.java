package com.myapp;

public class CricketCoach implements Coach {

	private FortuneService FortuneService;
	
	private String  emailaddress;
	
	private String team;
	
	

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public CricketCoach() {
		System.out.println("Cricket Coach Constructor Loaded");
	}

	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("Cricket Coach setter mmethod");
		this.FortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practies Fast Balling";
	}

	@Override
	public String getDailyFortune() {
		return FortuneService.getFortune();
	}

}
