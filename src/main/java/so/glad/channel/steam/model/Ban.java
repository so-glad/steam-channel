package so.glad.channel.steam.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class Ban {
    @JsonProperty("SteamId")
    private Long steamId;
    @JsonProperty("CommunityBanned")
    private Boolean communityBanned;
    @JsonProperty("VACBanned")
    private Boolean vacBanned;
    @JsonProperty("EconomyBan")
    private String economyBan;

    public Long getSteamId() {
        return steamId;
    }

    public void setSteamId(Long steamId) {
        this.steamId = steamId;
    }

    public Boolean isCommunityBanned() {
        return communityBanned;
    }

    public void setCommunityBanned(Boolean communityBanned) {
        this.communityBanned = communityBanned;
    }

    public Boolean isVacBanned() {
        return vacBanned;
    }

    public void setVacBanned(Boolean vacBanned) {
        this.vacBanned = vacBanned;
    }

    public String getEconomyBan() {
        return economyBan;
    }

    public void setEconomyBan(String economyBan) {
        this.economyBan = economyBan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ban)) return false;
        Ban ban = (Ban) o;
        return Objects.equal(steamId, ban.steamId) &&
                Objects.equal(communityBanned, ban.communityBanned) &&
                Objects.equal(vacBanned, ban.vacBanned) &&
                Objects.equal(economyBan, ban.economyBan);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(steamId, communityBanned, vacBanned, economyBan);
    }
}
