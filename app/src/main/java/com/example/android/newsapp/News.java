package com.example.android.newsapp;

public class News {
    private String mTitle;

    private String mUrl;

    private String mDate;

    private String mSectionName;

    public News(String title, String date, String Url, String sectionName) {
        mDate = date;
        mTitle = title;
        mUrl = Url;
        mSectionName = sectionName;
    }

    public String getmUrl() {
        return mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmSectionName() {
        return mSectionName;
    }
}
