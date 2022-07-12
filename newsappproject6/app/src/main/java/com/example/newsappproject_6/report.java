package com.example.newsappproject_6;
public class report {
    private String mName;
    private String mSectionName;
    private String mAuthorName;
    private String mTitle;
    private String mUrl;
    private String mUrlToImage;
    private String mPublishedAt;

    public report(String name, String sectionName, String title, String AuthorName, String url, String urlToImage, String publishAt){
        mName = name;
        mAuthorName = AuthorName;
        mSectionName = sectionName;
        mTitle = title;
        mUrl = url;
        mUrlToImage = urlToImage;
        mPublishedAt = publishAt;
    }

    public String getName(){
        return mName;
    }

    public String getAuthor(){
        return mSectionName;
    }
    public String getAuthorName(){
        return mAuthorName;
    }
    public String getTitle(){
        return mTitle;
    }

    public String getUrl(){
        return mUrl;
    }

    public String getUrlToImage(){
        return mUrlToImage;
    }

    public String getPublishedAt(){
        return mPublishedAt;
    }
}
