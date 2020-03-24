package VideoSystemConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.douzone.container.videosystem.DVDPlayer;

import config.videosystem.mixing.DVDConfig;

/**
 * 
 * Explicity Configuration : Java Configuration
 * 
 * 			 <-------- {JavaConfig1}
 * 				import
 * 
 * JavaConfig1 + JavaConfig2
 * 
 * */

@Configuration
@Import({DVDConfig.class, DVDPlayer.class})
public class VideoSystemConfig {

}
