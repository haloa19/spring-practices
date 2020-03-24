package com.douzone.container.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/videosystem/DVDPlayerConfig.xml"})
public class DVDPlayerXmlConfigTest {
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	//@Autowired
	//@Qualifier("avengers")
	// 예외발생
	// XML Bean 설정 시 id는 자동부여 되지 않는다
	private DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	private DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengersInfinityWar")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengersEndgame")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengersAgeOfUltron")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd5;
	
	@Autowired
	@Qualifier("captainAmerica")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengersDirectorEdition")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd7;
	
	@Autowired
	@Qualifier("avengersExpansionPack1")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd8;
	
	@Autowired
	@Qualifier("avengersExpansionPack2")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengersExpansionPack3")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("avengersTriplePack")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DVDPack dvdPack;
	
	@Autowired
	@Qualifier("dvdPlayer2")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DVDPlayer player2;
	
	@Autowired
	@Qualifier("dvdPlayer3")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DVDPlayer player3;
	
	@Autowired
	@Qualifier("dvdPlayer4")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DVDPlayer player4;
	
	@Autowired
	@Qualifier("dvdPlayer5")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DVDPlayer player5;
	
	@Autowired
	@Qualifier("dvdPlayer6")  // DVDPlayer가 1개만 있을 경우 qualifier필요 없음
	private DVDPlayer player6;
	
		
	@Test
	public void testDVD2NotNull() {
		assertNotNull(dvd2);
	}	
	
	@Test
	public void testDVD3() {
		assertNotNull(dvd3);
	}	
	
	@Test
	public void testDVD4() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDVD5() {
		assertNotNull(dvd5);
	}
	
	@Test
	public void testDVD6() {
		assertNotNull(dvd6);
		System.out.println(dvd6);
	}
	
	@Test
	public void testDVD7() {
		assertNotNull(dvd7);
		System.out.println(dvd7);
		assertEquals("BlankDisc [title=Avengers Director's Editor, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD8() {
		assertNotNull(dvd8);
		System.out.println(dvd8);
		assertEquals("BlankDisc [title=Avengers Expansion Pack1, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD9() {
		assertNotNull(dvd9);
		System.out.println(dvd9);
		assertEquals("BlankDisc [title=Avengers Expansion Pack2, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVD10() {
		assertNotNull(dvd10);
		System.out.println(dvd10);
		assertEquals("BlankDisc [title=Avengers Expansion Pack3, studio=MARVEL, actors=[Robert Downey Jr., Scarlett, Chris Evans]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
		System.out.println(dvdPack);
		assertEquals("DVDPack [title=Avengers Triplepack, dvds=[BlankDisc [title=Avengers Infinity War, studio=MARVEL, actors=null], BlankDisc [title=Avengers Endgame, studio=MARVEL, actors=null], BlankDisc [title=Avengers Age Of Ultron, studio=MARVEL, actors=null]]]", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

	@Test
	public void testPlay2() {
		player2.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay3() {
		player3.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay4() {
		player4.play();
		assertEquals("Playing Movie MARVEL's IronMan", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay5() {
		player5.play();
		assertEquals("Playing Movie MARVEL's Avengers Director's Editor", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}
	
	@Test
	public void testPlay6() {
		player6.play();
		assertEquals("Playing Movie MARVEL's Avengers Captain America", systemOutRule.getLog().replace("\r\n", "").replace("\n", ""));
	}

}
