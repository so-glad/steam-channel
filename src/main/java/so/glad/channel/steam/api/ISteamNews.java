package so.glad.channel.steam.api;

import so.glad.channel.steam.model.AppNews;
import so.glad.channel.steam.model.DataFormat;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public interface ISteamNews {

    AppNews getNewsForApp(Long appid, Integer count, Long maxLength, DataFormat format);

}
