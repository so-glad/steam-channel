package so.glad.channel.steam.api;

import so.glad.channel.steam.model.DataFormat;
import so.glad.channel.steam.model.Achievement;

import java.util.List;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public interface ISteamUserStats {
    List<Achievement> getGlobalAchievementPercentagesForApp(Long gameId, DataFormat dataFormat);
//TODO not void for GET
    void getGlobalStatsForGame(Long gameId, Integer count, DataFormat dataFormat, Object... names);

    void getPlayerAchievements(Long steamId, Long appId, String lang);

    void getUserStatsForGame(Long steamId, Long appId, String lang);

    void getSchemaForGame(Long appId, DataFormat dataFormat);
}
