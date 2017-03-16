package com.example.lihaojuan.temp;

/**
 * Created by lihaojuan on 17/3/16.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivityFragment extends Fragment {

    View rootView;
    ArrayAdapter<String> myForecastArrayAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_layout, container, false);

        String[] forecastArray = {
                "Today - Sunny - 55/ 63",
                "Tomorrow - Foggy - 70/46",
                "Saturday - Cloudy - 72 / 63",
                "Sunday - Rainy - 64 / 51",
                "Monday - Foggy - 70 / 46",
                "Tuesday - Sunny - 76 / 68"};

        List<String> weekForecast = new ArrayList<String>(Arrays.asList(forecastArray));
        myForecastArrayAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.layout_each_item,
                R.id.tv_element_list,
                weekForecast);
        ListView myListView = (ListView) rootView.findViewById(R.id.listView_forecast);
        myListView.setAdapter(myForecastArrayAdapter);

        return rootView;


    }
}




















