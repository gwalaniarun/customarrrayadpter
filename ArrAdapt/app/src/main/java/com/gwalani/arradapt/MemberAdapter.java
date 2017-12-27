package com.gwalani.arradapt;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arun on 27/12/2017.
 */

public class MemberAdapter extends ArrayAdapter<Members> {

    public MemberAdapter(Context context, ArrayList<Members> members) {

        super(context, 0, members);

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
    Members members = getItem(position);

        TextView textView = (TextView) listItemView.findViewById(R.id.textView);
        textView.setText(members.getName());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.one_image);

        return listItemView;
    }
}
