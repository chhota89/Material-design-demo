package com.chhota.materialdesigndemo.data;

import com.chhota.materialdesigndemo.R;
import com.chhota.materialdesigndemo.model.MenuItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chhota89 on 27/5/17.
 */

public class MenuItemProvider {


    public static List<MenuItem> getMenuItem(){
        List<MenuItem> menuItemList=new ArrayList<>();
        menuItemList.add(new MenuItem("Language", R.drawable.ic_language));
        menuItemList.add(new MenuItem("History", R.drawable.ic_history));
        menuItemList.add(new MenuItem("Service", R.drawable.ic_services));
        menuItemList.add(new MenuItem("Gallery", R.drawable.ic_gallery));
        menuItemList.add(new MenuItem("Health Insurance", R.drawable.ic_insurance));
        menuItemList.add(new MenuItem("Health Tips", R.drawable.ic_health_tips));
        return menuItemList;

    }

}
