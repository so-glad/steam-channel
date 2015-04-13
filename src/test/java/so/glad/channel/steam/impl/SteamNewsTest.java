package so.glad.channel.steam.impl;

import org.junit.Assert;
import org.junit.Test;
import so.glad.channel.steam.model.AppNews;
import so.glad.channel.steam.model.DataFormat;
import so.glad.client.RestClientImpl;
import so.glad.serializer.JSONStreamSerializer;

/**
 * @author palmtale
 *         on 2015/4/13.
 */
public class SteamNewsTest {

    @Test
    public void test(){
        SteamNews steamNews = new SteamNews();
        RestClientImpl restClient = new RestClientImpl();
        restClient.setStreamSerializer(new JSONStreamSerializer());
        steamNews.setClient(restClient);

        AppNews appNews = steamNews.getNewsForApp(440l, 3, 300l, DataFormat.DEFAULT);
        Assert.assertEquals(appNews, null);
    }
}
