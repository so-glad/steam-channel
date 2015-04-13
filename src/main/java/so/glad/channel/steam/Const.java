package so.glad.channel.steam;

/**
 * @author palmtale
 *         on 2015/4/13.
 */
public interface Const {
    String DEFAULT_ENCODING = "UTF-8";

    interface ConfigKey {
        String STEAM_API_URL = "steam.api.url";
        String STEAM_API_NEWS = "steam.api.news";
        String STEAM_API_USER = "steam.api.user";
    }
}
