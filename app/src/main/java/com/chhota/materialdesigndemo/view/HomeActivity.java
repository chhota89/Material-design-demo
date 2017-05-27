package com.chhota.materialdesigndemo.view;

import android.graphics.Color;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.chhota.materialdesigndemo.R;
import com.chhota.materialdesigndemo.data.MenuItemProvider;
import com.chhota.materialdesigndemo.utility.RecyclerTouchListner;
import com.chhota.materialdesigndemo.view.adapter.MenuAdapter;
import com.chhota.materialdesigndemo.view.fragment.FragmentDrawer;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setSubtitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);

        FragmentDrawer mDrawerFragment = (FragmentDrawer)
                getSupportFragmentManager().findFragmentById(R.id.framelayout);

        mDrawerFragment.setUp(R.id.framelayout, (DrawerLayout) findViewById(R.id.drawer_layout), toolbar);


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.homeRecycleView);
        MenuAdapter menuAdapter =new MenuAdapter(MenuItemProvider.getMenuItem(),HomeActivity.this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        recyclerView.addOnItemTouchListener(new RecyclerTouchListner(HomeActivity.this, recyclerView, new RecyclerTouchListner.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                homeMenuSelected(position,view);
            }

            @Override
            public void onLongClick(View view, int position) {
                homeMenuSelected(position,view);
            }
        }));
        recyclerView.setAdapter(menuAdapter);

    }

    private void homeMenuSelected(int position, View view) {

    }

    public void onDrawerItemClicked(int position) {

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
}
