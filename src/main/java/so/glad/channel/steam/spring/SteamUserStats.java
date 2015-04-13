package so.glad.channel.steam.spring;

import so.glad.channel.steam.api.ISteamUserStats;
import so.glad.channel.steam.model.Achievement;
import so.glad.channel.steam.model.DataFormat;

import java.util.List;

/**
 * @author Cartoon
 *         on 2015/4/13.
 */
public class SteamUserStats implements ISteamUserStats {
    @Override
    public List<Achievement> getGlobalAchievementPercentagesForApp(Long gameId, DataFormat dataFormat) {
        return null;
    }

    @Override
    public void getGlobalStatsForGame(Long gameId, Integer count, DataFormat dataFormat, Object... names) {

    }

    @Override
    public void getPlayerAchievements(Long steamId, Long appId, String lang) {

    }

    @Override
    public void getUserStatsForGame(Long steamId, Long appId, String lang) {

    }

    @Override
    public void getSchemaForGame(Long appId, DataFormat dataFormat) {

    }
}
