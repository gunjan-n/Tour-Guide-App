package com.example.tourguidapp;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> data = new ArrayList<Info>();
        data.add(new Info(R.string.mewar_festival,R.drawable.mewar_festival));
        data.add(new Info(R.string.shilpgram_crafts_fair,R.drawable.shilpgram_crafts_fair));

        InfoAdapter adapter = new InfoAdapter(getActivity(), data, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Info info = data.get(position);
            }
        });
        return rootView;
    }

}
