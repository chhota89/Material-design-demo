package com.chhota.materialdesigndemo.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.chhota.materialdesigndemo.R;
import com.chhota.materialdesigndemo.model.DrawerItem;
import com.chhota.materialdesigndemo.model.MenuItem;

import java.util.List;

/**
 * Created by chhota89 on 27/5/17.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<MenuItem> list;
    private LayoutInflater inflater;

    public MenuAdapter(List<MenuItem> list, Context context) {
        this.list = list;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.adapter_home_menu, parent,false);
        return  new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        holder.setMenuViewHolder(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder{
        TextView label;
        ImageView image;
        public MenuViewHolder(View itemView) {
            super(itemView);
            label =(TextView)itemView.findViewById(R.id.title);
            image=(ImageView)itemView.findViewById(R.id.imageName);
        }

        void setMenuViewHolder(MenuItem menuItem){
            label.setText(menuItem.getTextDescription());
            image.setImageResource(menuItem.getImageIcon());
        }
    }
}
