package so.glad.channel.steam.model;

import com.google.common.base.Objects;

import java.util.Map;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class NewsItem {

    private Long gid;

    private String title;

    private String url;

    private Boolean is_external_url;

    private String author;

    private String contents;

    private String feedlabel;

    private Long date;

    private String feedname;

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
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

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Boolean isExternalUrl() {
        return is_external_url;
    }

    public void setExternalUrl(Boolean is_external_url) {
        this.is_external_url = is_external_url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedlabel() {
        return feedlabel;
    }

    public void setFeedlabel(String feedlabel) {
        this.feedlabel = feedlabel;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getFeedname() {
        return feedname;
    }

    public void setFeedname(String feedname) {
        this.feedname = feedname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsItem)) return false;
        NewsItem newsItem = (NewsItem) o;
        return Objects.equal(gid, newsItem.gid) &&
                Objects.equal(title, newsItem.title) &&
                Objects.equal(url, newsItem.url) &&
                Objects.equal(is_external_url, newsItem.is_external_url) &&
                Objects.equal(author, newsItem.author) &&
                Objects.equal(contents, newsItem.contents) &&
                Objects.equal(feedlabel, newsItem.feedlabel) &&
                Objects.equal(date, newsItem.date) &&
                Objects.equal(feedname, newsItem.feedname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(gid, title, url, is_external_url, author, contents, feedlabel, date, feedname);
    }

    public static NewsItem fromJsonMap(Map<String, Object> map){
        if(map == null || map.size() == 0){
            return null;
        }
        NewsItem result = new NewsItem();
        result.setGid(Long.valueOf(map.get("gid").toString()));
        result.setTitle(map.get("title").toString());
        result.setUrl(map.get("url").toString());
        result.setExternalUrl(Boolean.valueOf(map.get("is_external_url").toString()));
        result.setAuthor(map.get("author").toString());
        result.setContents(map.get("contents").toString());
        result.setFeedlabel(map.get("feedlabel").toString());
        result.setDate(Long.valueOf(map.get("date").toString()));
        result.setFeedname(map.get("feedname").toString());
        return result;
    }
}
