import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


public class MavenJenkinsTest {
    @Test
    public void testDemo(){
        Logger logger = Logger.getLogger(MavenJenkins.class.getName());
        logger.info("testing...");
        assertTrue(false);
    }

}
