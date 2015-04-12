package so.glad.channel.steam.model;

import com.google.common.base.Objects;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class Player {

    private Long steamid; //": "76561198189022219",

    private CommunityVisibilityState communityvisibilitystate;

    private Boolean profilestate;

    private String personaName;//BigYelo,

    private Long lastlogoff;// 1428772849,

    private String profileurl;        //http://steamcommunity.com/id/bigyelo/",

    private String avatar; //https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb.jpg",

    private String avatarmedium;//https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb_medium.jpg",

    private String avatarfull; //https://steamcdn-a.akamaihd.net/steamcommunity/public/images/avatars/fe/fef49e7fa7e1997310d705b2a6158ff8dc1cdfeb_full.jpg",

    private PersonState personastate; // 1,

    private Long primaryclanid; //"103582791429521408",

    private Long timecreated;// 1427795997,

    private Integer personastateflags; // 512

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return Objects.equal(steamid, player.steamid) &&
                Objects.equal(communityvisibilitystate, player.communityvisibilitystate) &&
                Objects.equal(profilestate, player.profilestate) &&
                Objects.equal(personaName, player.personaName) &&
                Objects.equal(lastlogoff, player.lastlogoff) &&
                Objects.equal(profileurl, player.profileurl) &&
                Objects.equal(avatar, player.avatar) &&
                Objects.equal(avatarmedium, player.avatarmedium) &&
                Objects.equal(avatarfull, player.avatarfull) &&
                Objects.equal(personastate, player.personastate) &&
                Objects.equal(primaryclanid, player.primaryclanid) &&
                Objects.equal(timecreated, player.timecreated) &&
                Objects.equal(personastateflags, player.personastateflags);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(steamid, communityvisibilitystate, profilestate, personaName, lastlogoff, profileurl, avatar, avatarmedium, avatarfull, personastate, primaryclanid, timecreated, personastateflags);
    }

    public Long getSteamid() {
        return steamid;
    }

    public void setSteamid(Long steamid) {
        this.steamid = steamid;
    }

    public CommunityVisibilityState getCommunityvisibilitystate() {
        return communityvisibilitystate;
    }

    public void setCommunityvisibilitystate(CommunityVisibilityState communityvisibilitystate) {
        this.communityvisibilitystate = communityvisibilitystate;
    }

    public Boolean isProfilestate() {
        return profilestate;
    }

    public void setProfilestate(Boolean profilestate) {
        this.profilestate = profilestate;
    }

    public String getPersonaName() {
        return personaName;
    }

    public void setPersonaName(String personaName) {
        this.personaName = personaName;
    }

    public Long getLastlogoff() {
        return lastlogoff;
    }

    public void setLastlogoff(Long lastlogoff) {
        this.lastlogoff = lastlogoff;
    }

    public String getProfileurl() {
        return profileurl;
    }

    public void setProfileurl(String profileurl) {
        this.profileurl = profileurl;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarmedium() {
        return avatarmedium;
    }

    public void setAvatarmedium(String avatarmedium) {
        this.avatarmedium = avatarmedium;
    }

    public String getAvatarfull() {
        return avatarfull;
    }

    public void setAvatarfull(String avatarfull) {
        this.avatarfull = avatarfull;
    }

    public PersonState getPersonastate() {
        return personastate;
    }

    public void setPersonastate(PersonState personastate) {
        this.personastate = personastate;
    }

    public Long getPrimaryclanid() {
        return primaryclanid;
    }

    public void setPrimaryclanid(Long primaryclanid) {
        this.primaryclanid = primaryclanid;
    }

    public Long getTimecreated() {
        return timecreated;
    }

    public void setTimecreated(Long timecreated) {
        this.timecreated = timecreated;
    }

    public Integer getPersonastateflags() {
        return personastateflags;
    }

    public void setPersonastateflags(Integer personastateflags) {
        this.personastateflags = personastateflags;
    }
}
