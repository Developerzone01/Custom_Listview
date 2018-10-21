package com.Faisal_Ijaz.customadaptor;

/**
 * Created by Faisal Ijaz on 10/21/2018.
 */
import android.content.Context;
import android.support.v7.view.menu.ListMenuItemView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;


class AndroidFlavorAdaptor extends ArrayAdapter<AndroidFlavor>{
    public AndroidFlavorAdaptor(Context context, ArrayList<AndroidFlavor> androidFlavors) {
        super(context,0,androidFlavors);
    }

    @Override
    public View getView(int position , View convertView , ViewGroup parent){
        View ListItemView = convertView;

        if (ListItemView==null){
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        AndroidFlavor currentAndroidFlavor = getItem(position);
        Log.d("The value of Position",""+position);

        TextView nameTextView = ListItemView.findViewById(R.id.listView_name);
        nameTextView.setText(currentAndroidFlavor.getmVersion_name());

        TextView versionTextView = ListItemView.findViewById(R.id.listView_version);
        versionTextView.setText(Double.toString(currentAndroidFlavor.getmListItemversion()));


        CircleImageView iconView = ListItemView.findViewById(R.id.profile_image);
        iconView.setImageResource(currentAndroidFlavor.getmImageResource());

        return ListItemView;
    }
}
