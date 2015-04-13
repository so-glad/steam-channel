package so.glad.channel.steam.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;
import so.glad.channel.steam.Config;
import so.glad.channel.steam.Const;
import so.glad.channel.steam.api.ISteamNews;
import so.glad.channel.steam.model.AppNews;
import so.glad.channel.steam.model.DataFormat;

/**
 * @author Cartoon
 *         on 2015/4/13.
 */
public class SteamNews implements ISteamNews {

    private String apiUrl = Config.getValue(Const.ConfigKey.STEAM_API_URL);

    private String optStub = Config.getValue(Const.ConfigKey.STEAM_API_NEWS);

    private RestTemplate client;

    @Autowired
    public SteamNews(RestTemplate restTemplate){
        this.client = restTemplate;
    }

    @Override
    public AppNews getNewsForApp(Long appid, Integer count, Long maxLength, DataFormat format) {
        AppNewsWrapper appNewsWrapper = client.getForObject(apiUrl + optStub + "/GetNewsForApp/v0002/?appid=" + appid + "&count=" + count + "&maxlength=" + maxLength + "&format=" + format.value(), AppNewsWrapper.class);
        return appNewsWrapper.getAppnews();
    }

    public static class AppNewsWrapper{
        private AppNews appnews;

        public AppNews getAppnews() {
            return appnews;
        }

        public void setAppnews(AppNews appnews) {
            this.appnews = appnews;
        }
    }
}
