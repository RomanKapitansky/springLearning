package soundsystem;

import com.soundsystem.config.CDPlayersConfig;
import com.soundsystem.interfaces.CompactDisc;
import com.soundsystem.interfaces.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by rkapitansky on 12/7/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayersConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNullTest() {
        assertNotNull(cd);
    }

    @Test
    public void mediaPlayerPlayTest() {
        assertNotNull(mediaPlayer);
        mediaPlayer.play();
        assertTrue(log.getLog().contains("Sgt. Pepper's Lonely Hearts Club Band"));
        assertTrue(log.getLog().contains("The Beatles"));
    }
}