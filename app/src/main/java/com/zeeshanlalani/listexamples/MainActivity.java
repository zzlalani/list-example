package com.zeeshanlalani.listexamples;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] students = getResources().getStringArray(R.array.student_names);

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<>(this, R.layout.list_item, R.id.label, students));

    }
}
