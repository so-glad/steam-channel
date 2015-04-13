package so.glad.channel.steam.spring;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import so.glad.channel.steam.model.AppNews;
import so.glad.channel.steam.model.DataFormat;

/**
 * @author Cartoon
 *         on 2015/4/13.
 */
public class SteamNewsTest {
    @Test
    public void test(){

        RestTemplate restClient = new RestTemplate();
        SteamNews steamNews = new SteamNews(restClient);
        AppNews appNews = steamNews.getNewsForApp(440l, 3, 300l, DataFormat.DEFAULT);
        Assert.assertEquals(appNews, null);
    }
}
