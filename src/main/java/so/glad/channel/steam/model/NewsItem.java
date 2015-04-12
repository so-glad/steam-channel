package so.glad.channel.steam.model;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class NewsItem {

    private Long id;

    private String title;

    private String url;

    private String content;

    private List<String> labels = Lists.newArrayList();

    private Long timestamp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsItem)) return false;
        NewsItem newsItem = (NewsItem) o;
        return Objects.equal(id, newsItem.id) &&
                Objects.equal(title, newsItem.title) &&
                Objects.equal(url, newsItem.url) &&
                Objects.equal(content, newsItem.content) &&
                Objects.equal(labels, newsItem.labels) &&
                Objects.equal(timestamp, newsItem.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, title, url, content, labels, timestamp);
    }
}
