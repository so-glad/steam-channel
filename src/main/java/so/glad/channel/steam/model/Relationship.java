package so.glad.channel.steam.model;

import com.google.common.base.Objects;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class Relationship {

    private Long steamid;

    private String relationship;

    private Long friend_since;

    public Long getSteamid() {
        return steamid;
    }

    public void setSteamid(Long steamid) {
        this.steamid = steamid;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Long getFriend_since() {
        return friend_since;
    }

    public void setFriend_since(Long friend_since) {
        this.friend_since = friend_since;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Relationship)){
            return false;
        }
        Relationship that = (Relationship) o;
        return Objects.equal(steamid, that.steamid) &&
                Objects.equal(relationship, that.relationship) &&
                Objects.equal(friend_since, that.friend_since);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(steamid, relationship, friend_since);
    }
}
