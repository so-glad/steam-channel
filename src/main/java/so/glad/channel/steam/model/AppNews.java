package so.glad.channel.steam.model;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Map;

/**
 * @author Cartoon
 *         on 2015/4/12.
 */
public class AppNews {

    private Long appid;

    private List<NewsItem> newsitems = Lists.newArrayList();

    public Long getAppid() {
        return appid;
    }

    public void setAppid(Long appid) {
        this.appid = appid;
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
        return Objects.equal(appid, appNews.appid) &&
                Objects.equal(newsitems, appNews.newsitems);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(appid, newsitems);
    }

    public static AppNews fromJsonMap(Map<String, Object> map){
        if(map == null || map.size()==0){
            return null;
        }
        Map<String, Object> inMap = (Map<String, Object>)map.get("appnews");
        if(inMap == null) {
            inMap = map;
        }
        AppNews result = new AppNews();
        result.appid = Long.valueOf(inMap.get("appid").toString());
        List list = (List)inMap.get("newsitems");

        for(Object object: list){
            if(object instanceof Map){
                result.newsitems.add(NewsItem.fromJsonMap((Map) object));
            }
        }
        return result;
    }
}
