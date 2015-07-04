package com.mobileia.mceasytoolbarexamples;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by matiascamiletti on 4/7/15.
 */
public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.SimpleViewHolder> {

    private List<String> mItems;

    public SimpleAdapter(List<String> list) {
        mItems = list;
    }

    @Override
    public SimpleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // create a new view
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_simple, viewGroup, false);
        // set the view's size, margins, paddings and layout parameters

        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder simpleViewHolder, int position) {
        simpleViewHolder.textView.setText(mItems.get(position));
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }


    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item
        public TextView textView;

        public SimpleViewHolder(View view) {
            super(view);

            textView = (TextView) view.findViewById(R.id.textView);
        }
    }
}
