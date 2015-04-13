package so.glad.channel.steam.spring;

import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import so.glad.channel.steam.model.DataFormat;
import so.glad.channel.steam.model.Player;

import java.util.List;

/**
 * @author Cartoon
 *         on 2015/4/13.
 */
public class SteamUserTest {

    @Test
    public void test(){
        SteamUser steamUser = new SteamUser("C61605E902B19F97D4653A8053B42E23", new RestTemplate());
        List<Player> players = steamUser.getPlayerSummaries(Lists.newArrayList(76561198189022219l), DataFormat.DEFAULT);
        Assert.assertEquals(players, expectedPlayers());
    }

    public List<Player> expectedPlayers(){
        Player player1 = new Player();
        player1.setSteamid(76561198189022219l);
        player1.setCommunityvisibilitystate(3);
        player1.setProfilestate(true);
        player1.setPersonaname("BigYelo");
        player1.setLastlogoff(1428899882l);
        player1.setProfileurl("http://steamcommunity.com/id/bigyelo/");
        player1.setAvatar("https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb.jpg");
        player1.setAvatarmedium("https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb_medium.jpg");
        player1.setAvatarfull("https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb_full.jpg");
        player1.setPersonastate(0);
        player1.setPrimaryclanid(103582791429521408l);
        player1.setTimecreated(1427795997l);
        player1.setPersonastateflags(0);
        return Lists.newArrayList(player1);
    }
}
