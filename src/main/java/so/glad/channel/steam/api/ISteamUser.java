package so.glad.channel.steam.api;

import so.glad.channel.steam.model.Ban;
import so.glad.channel.steam.model.DataFormat;
import so.glad.channel.steam.model.Player;
import so.glad.channel.steam.model.Relationship;

import java.util.List;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public interface ISteamUser {
    Player getPlayerSummaries(Long steamId, DataFormat dataFormat);

    List<Relationship> getFriendList(Long steamId, Boolean onlyFriend, DataFormat dataFormat);

    List<Ban> getPlayerBans(Long... steamId);
}
