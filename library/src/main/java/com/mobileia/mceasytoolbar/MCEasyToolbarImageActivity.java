package com.mobileia.mceasytoolbar;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public abstract class MCEasyToolbarImageActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    private ImageView mImageView;

    private FloatingActionButton mFloatingActionButton;

    private LinearLayout mContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mceasy_toolbar_image);

        init();
        initToolbar(getSupportActionBar());
        initImageView(mImageView);
        initFloatingActionButton(mFloatingActionButton);
        mContainer.addView(initContent());
    }

    protected void init() {
        // Get and set Toolbar
        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        // Get Imageview
        mImageView = (ImageView)findViewById(R.id.image_paralax);

        // get FloatingActionButton
        mFloatingActionButton = (FloatingActionButton)findViewById(R.id.fab);

        // get container
        mContainer = (LinearLayout)findViewById(R.id.container);
    }

    protected void initToolbar(ActionBar toolbar) {}
    protected abstract void initImageView(ImageView imageView);
    protected abstract void initFloatingActionButton(FloatingActionButton button);
    protected abstract View initContent();

    public Toolbar getToolbar() {
        return mToolbar;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_mceasy_toolbar_image, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }else if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
