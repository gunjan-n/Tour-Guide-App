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
public class PublicPlacesFragment extends Fragment {


    public PublicPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.info_list, container, false);

        final ArrayList<Info> data = new ArrayList<Info>();
        data.add(new Info(R.string.fateh_sagar_lake,R.drawable.fateh_sagar_lake));
        data.add(new Info(R.string.sajjangarh,R.drawable.sajjangarh));
        data.add(new Info(R.string.eklingji,R.drawable.eklingji));

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
