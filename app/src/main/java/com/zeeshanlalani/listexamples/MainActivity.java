package com.zeeshanlalani.listexamples;

import android.app.ListActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] students = getResources().getStringArray(R.array.student_names);

        final String[] numbers = {"0","0","0","0","0","0","0","0","0","0"};

        // Binding resources Array to ListAdapter
        this.setListAdapter(new ArrayAdapter<>(this, R.layout.list_item, R.id.label, numbers));

        lv = getListView();
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
//                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//                builder.setMessage( students[position] );
//                builder.show();

                String num = ((TextView)view).getText().toString();
                int numVal = Integer.parseInt(num);
                ((TextView)view).setText( String.valueOf(++numVal) );
            }
        });
    }
}
