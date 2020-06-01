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
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> data = new ArrayList<Info>();
        data.add(new Info(R.string.city_palace,R.drawable.city_palace));
        data.add(new Info(R.string.lake_pichola,R.drawable.lake_pichola));
        data.add(new Info(R.string.jagmandir,R.drawable.jagmandir));

        InfoAdapter adapter = new InfoAdapter(getActivity(), data, R.color.category_attractions);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Info infp = data.get(position);
            }
        });
        return rootView;

    }

}
