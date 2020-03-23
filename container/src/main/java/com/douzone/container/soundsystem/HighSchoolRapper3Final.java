package com.douzone.container.soundsystem;

import javax.inject.Named;

import org.springframework.stereotype.Component;

//@Named("highSchoolRapper3Final")
//@Component("HSRapper3Final")
@Component
public class HighSchoolRapper3Final implements CompactDisc {
	private String title = "지구멸망";
	private String artist = "양승호";

	@Override
	public void play() {
		System.out.println("Playing " + title + " by " + artist);

	}

}
