package so.glad.channel.steam.spring;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import so.glad.channel.steam.Config;
import so.glad.channel.steam.Const;
import so.glad.channel.steam.api.ISteamUser;
import so.glad.channel.steam.model.Ban;
import so.glad.channel.steam.model.DataFormat;
import so.glad.channel.steam.model.Player;
import so.glad.channel.steam.model.Relationship;

import java.util.List;
import java.util.Map;

/**
 * @author Cartoon
 *         on 2015/4/13.
 */
public class SteamUser implements ISteamUser{

    private Logger logger = LoggerFactory.getLogger(SteamUser.class);

    private String apiUrl = Config.getValue(Const.ConfigKey.STEAM_API_URL);

    private String optStub = Config.getValue(Const.ConfigKey.STEAM_API_USER);

    private String key;

    private RestTemplate restTemplate;

    public SteamUser(String key, RestTemplate restTemplate){
        this.key = key;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Player> getPlayerSummaries(List<Long> steamIds, DataFormat dataFormat) {
        Response response = restTemplate.getForObject(apiUrl + optStub + "/GetPlayerSummaries/v0002/?" +
                "key=" + key + "&steamids=" + StringUtils.join(steamIds, ",") + "&format=" + dataFormat.value(), Response.class);
        return response.getResponse().getPlayers();
    }

    public static class Response{
        private PlayerWrapper response;

        public PlayerWrapper getResponse() {
            return response;
        }

        public void setResponse(PlayerWrapper response) {
            this.response = response;
        }
    }

    public static class PlayerWrapper{
        private List<Player> players;

        public List<Player> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
        }
    }

    @Override
    public List<Relationship> getFriendList(Long steamId, Boolean onlyFriend, DataFormat dataFormat) {
        FriendList friendList = restTemplate.getForObject(apiUrl + optStub + "/GetFriendList/v0001/?" +
                "key=" + key + "&steamid=" + steamId + "&relationship=" + (Boolean.TRUE.equals(onlyFriend) ? "friend" : "all") + "&format=" + dataFormat.value(),
                FriendList.class);
        return friendList.getFriendslist().getFriends();
    }

    public static class FriendList{
        private Friends friendslist;

        public Friends getFriendslist() {
            return friendslist;
        }

        public void setFriendslist(Friends friendslist) {
            this.friendslist = friendslist;
        }
    }

    private static class Friends{
        private List<Relationship> friends;

        public List<Relationship> getFriends() {
            return friends;
        }

        public void setFriends(List<Relationship> friends) {
            this.friends = friends;
        }
    }

    @Override
    public List<Ban> getPlayerBans(Long... steamIds) {
        Bans bans = restTemplate.getForObject(apiUrl + optStub + "/GetPlayerBans/v1/?" +
                        "key=" + key + "&steamids=" + StringUtils.join(steamIds, ",") ,
                Bans.class);
        return bans.getPlayers();
    }

    public static class Bans{
        private List<Ban> players;

        public List<Ban> getPlayers() {
            return players;
        }

        public void setPlayers(List<Ban> players) {
            this.players = players;
        }
    }

}
