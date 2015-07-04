package com.mobileia.mceasytoolbarexamples;

import android.support.v7.widget.LinearLayoutManager;

import com.mobileia.mceasytoolbar.MCEasyToolbarActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends MCEasyToolbarActivity {

    @Override
    protected void init() {
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        getRecyclerView().setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        getRecyclerView().setLayoutManager(layoutManager);

        // specify an adapter (see also next example)
        SimpleAdapter adapter = new SimpleAdapter(getItems());
        getRecyclerView().setAdapter(adapter);
    }

    private List<String> getItems() {
        List<String> items = new ArrayList<String>();
        items.add("Item 1");
        items.add("Item 2");
        items.add("Item 3");
        items.add("Item 4");
        items.add("Item 5");
        items.add("Item 6");
        items.add("Item 7");
        items.add("Item 8");
        items.add("Item 9");
        items.add("Item 10");
        items.add("Item 11");
        items.add("Item 12");
        items.add("Item 13");
        items.add("Item 14");
        items.add("Item 14");
        items.add("Item 15");
        return items;
    }
}
