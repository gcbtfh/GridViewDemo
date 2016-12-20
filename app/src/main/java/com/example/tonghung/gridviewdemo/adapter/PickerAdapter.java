package com.example.tonghung.gridviewdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.tonghung.gridviewdemo.R;

/**
 * Created by tonghung on 20/12/2016.
 */

public class PickerAdapter extends BaseAdapter {
    Context context;
    Integer[] images = new Integer[]{
            R.drawable.angel, R.drawable.bauble, R.drawable.bear, R.drawable
            .bird, R.drawable.bow, R.drawable.boy, R.drawable.cake, R.drawable.candle,
            R.drawable.candy, R.drawable.champagne, R.drawable.christmas
    };

    public PickerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new GridView.LayoutParams(200,200));

        return imageView;
    }
}
