package com.chhota.materialdesigndemo.view.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.chhota.materialdesigndemo.R;
import com.chhota.materialdesigndemo.model.DrawerItem;

import java.util.List;

/**
 * Created by chhota89 on 14/8/16.
 */

public class DrawerAdapter extends RecyclerView.Adapter<DrawerAdapter.DrawerViewHolder> {

    private List<DrawerItem> list;
    private Context context;
    LayoutInflater inflater;

    public DrawerAdapter(List<DrawerItem> list, Context context) {
        this.list = list;
        this.context = context;
        inflater=LayoutInflater.from(context);

    }

    @Override
    public DrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.adapter_drawer_item, parent,false);
        return  new DrawerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DrawerViewHolder holder, int position) {
        holder.label.setText(list.get(position).getLabel());
        holder.image.setImageResource(list.get(position).getDrawerIcon());
        //holder.lastName.setText(list.get(position).getLastName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class DrawerViewHolder extends RecyclerView.ViewHolder{
        TextView label;
        ImageView image;
        public DrawerViewHolder(View itemView) {
            super(itemView);
            label =(TextView)itemView.findViewById(R.id.drawerItemName);
            image=(ImageView)itemView.findViewById(R.id.imageView4);
        }
    }
}
