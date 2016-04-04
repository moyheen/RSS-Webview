package com.moyinoluwa.rsswebview;

/**
 * Created by moyinoluwa on 4/4/16.
 */
public class FeedItem {
    String title;
    String thumbnail;
    String url;

    public FeedItem(String title, String thumbnail, String url) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public String getUrl() {
        return url;
    }
}
