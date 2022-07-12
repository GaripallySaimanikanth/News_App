package com.example.newsappproject_6;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class reportloader extends AsyncTaskLoader<List<com.example.newsappproject_6.report>> {

    private static final String LOG_TAG = reportloader.class.getName();
    private String mUrl;
    public reportloader(Context context, String url) {
        super(context);
        mUrl = url;
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }
    @Override
    public List<com.example.newsappproject_6.report> loadInBackground() {
        if (mUrl == null) {
            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<com.example.newsappproject_6.report> news = com.example.newsappproject_6.QueryUtils.fetchNewsData(mUrl);
        return news;
    }
}