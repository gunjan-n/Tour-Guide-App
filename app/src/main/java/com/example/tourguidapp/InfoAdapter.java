package com.example.tourguidapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class InfoAdapter extends ArrayAdapter<Info> {
    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link InfoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param infos is the list of {@link Info}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public InfoAdapter(Context context, ArrayList<Info> infos, int colorResourceId) {
        super(context, 0, infos);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Info} object located at this position in the list
        Info currentInfo = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);

        titleTextView.setText(currentInfo.getHeadingId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this info or not
        if (currentInfo.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentInfo.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
