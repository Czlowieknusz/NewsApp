package com.example.android.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOCATION_SEPARATOR = "T";

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView titleView = (TextView) listItemView.findViewById(R.id.title);

        String title = currentNews.getmTitle();

        titleView.setText(title);

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);

        TextView timeView = (TextView) listItemView.findViewById(R.id.time);

        String originalTime = currentNews.getmDate();

        String date;
        String time;

        if (originalTime.contains(LOCATION_SEPARATOR)) {

            String[] parts = originalTime.split(LOCATION_SEPARATOR);

            date = parts[0];

            time = parts[1];
        } else {

            time = getContext().getString(R.string.no_time);

            date = originalTime;
        }
        dateView.setText(date);
        timeView.setText(time);

        TextView sectionView = (TextView) listItemView.findViewById(R.id.section_name);
        sectionView.setText(currentNews.getmSectionName());

        return listItemView;
    }
}
