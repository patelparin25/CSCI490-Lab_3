package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.ArrayAdapter;


public class MainActivity extends AppCompatActivity {
    private ListView list;
    private String[] colors = new String[]{"Orange", "Blue", "Grey", "Black", "White", "Red", "Green", "Taupe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.color);
        ArrayAdapter<String> classAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, colors);
        list.setAdapter(classAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), String.valueOf(parent.getItemAtPosition(position)), Toast.LENGTH_LONG).show();
            }
        });
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Long Click" + String.valueOf(parent.getItemAtPosition(position)), Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }
}