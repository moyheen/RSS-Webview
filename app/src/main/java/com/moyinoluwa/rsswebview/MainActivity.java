package com.moyinoluwa.rsswebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyRecyclerAdapter adapter;
    List<FeedItem> feedItemList = new ArrayList<FeedItem>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        feedItemList.add(new FeedItem("Reuters: Arts", "http://www.reuters.com/resources_v2/images/reuters125.png", "http://feeds.reuters.com/news/artsculture"));
        feedItemList.add(new FeedItem("Reuters: Business", "http://www.reuters.com/resources_v2/images/reuters125.png", "http://feeds.reuters.com/reuters/businessNews"));
        feedItemList.add(new FeedItem("Reuters: Company News", "http://www.reuters.com/resources_v2/images/reuters125.png", "http://feeds.reuters.com/reuters/companyNews"));

        assert recyclerView != null;
        adapter = new MyRecyclerAdapter(this, feedItemList);
        recyclerView.setAdapter(adapter);
    }
}
