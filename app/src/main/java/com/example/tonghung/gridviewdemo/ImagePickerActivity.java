package com.example.tonghung.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.example.tonghung.gridviewdemo.adapter.PickerAdapter;

public class ImagePickerActivity extends AppCompatActivity {
    private GridView gv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_picker);

        gv = (GridView) findViewById(R.id.gridView);
        gv.setAdapter(new PickerAdapter(this));
    }
}
