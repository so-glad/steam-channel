package so.glad.channel.steam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Properties;

/**
 * @author palmtale
 *         on 2015/4/13.
 */
public class Config {

    private static Logger logger = LoggerFactory.getLogger(Config.class);

    private static Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(Config.class.getResourceAsStream("/application.properties"));
        } catch (IOException e) {
            logger.error("Load config error.", e);
        }
    }

    public static String getValue(String key){
        return properties.getProperty(key);
    }

}
