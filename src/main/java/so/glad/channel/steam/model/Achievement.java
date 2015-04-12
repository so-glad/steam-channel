package so.glad.channel.steam.model;

import com.google.common.base.Objects;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class Achievement {

    private String name;

    private Double percent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Achievement)) return false;
        Achievement that = (Achievement) o;
        return Objects.equal(name, that.name) &&
                Objects.equal(percent, that.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name, percent);
    }
}
