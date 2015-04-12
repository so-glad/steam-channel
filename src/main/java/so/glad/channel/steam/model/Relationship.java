package so.glad.channel.steam.model;

import com.google.common.base.Objects;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class Relationship {

    private Long steamId;

    private String relationship;

    private Long friendSince;

    public Long getSteamId() {
        return steamId;
    }

    public void setSteamId(Long steamId) {
        this.steamId = steamId;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public Long getFriendSince() {
        return friendSince;
    }

    public void setFriendSince(Long friendSince) {
        this.friendSince = friendSince;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Relationship)) return false;
        Relationship that = (Relationship) o;
        return Objects.equal(steamId, that.steamId) &&
                Objects.equal(relationship, that.relationship) &&
                Objects.equal(friendSince, that.friendSince);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(steamId, relationship, friendSince);
    }
}
