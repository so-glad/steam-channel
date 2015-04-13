package so.glad.channel.steam.impl;

import so.glad.channel.steam.Config;
import so.glad.channel.steam.Const;
import so.glad.channel.steam.api.ISteamNews;
import so.glad.channel.steam.model.AppNews;
import so.glad.channel.steam.model.DataFormat;
import so.glad.client.RestClient;

import java.util.Map;

/**
 * @author palmtale
 *         on 2015/4/13.
 */
public class SteamNews implements ISteamNews {

    private String apiUrl = Config.getValue(Const.ConfigKey.STEAM_API_URL);
    private String optStub = Config.getValue(Const.ConfigKey.STEAM_API_NEWS);

    private RestClient client;

    @Override
    public AppNews getNewsForApp(Long appid, Integer count, Long maxLength, DataFormat format) {
        Map map = (Map)client.get(apiUrl + optStub + "/GetNewsForApp/v0002/?appid=" + appid + "&count=" + count + "&maxlength=" + maxLength + "&format=" + format.value() , "");
        return AppNews.fromJsonMap(map);
    }

    public void setClient(RestClient client) {
        this.client = client;
    }
}
