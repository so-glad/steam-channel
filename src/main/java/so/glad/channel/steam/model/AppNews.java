package so.glad.channel.steam.model;

import com.google.common.base.Objects;

import java.util.List;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class AppNews {

    private Long appId;

    private List<NewsItem> newsitems;

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public List<NewsItem> getNewsitems() {
        return newsitems;
    }

    public void setNewsitems(List<NewsItem> newsitems) {
        this.newsitems = newsitems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AppNews)) return false;
        AppNews appNews = (AppNews) o;
        return Objects.equal(appId, appNews.appId) &&
                Objects.equal(newsitems, appNews.newsitems);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(appId, newsitems);
    }
}
