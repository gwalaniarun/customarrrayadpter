package com.gwalani.arradapt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Members> memberArrayList = new ArrayList<Members>();

        memberArrayList.add(new Members("Arun"));
        memberArrayList.add(new Members("Kalpesh"));
        memberArrayList.add(new Members("Heena"));
        memberArrayList.add(new Members("Chandrakant"));
        memberArrayList.add(new Members("Dharmista"));
        ListView listView = (ListView) findViewById(R.id.list_view);
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1 , arrayList);

        MemberAdapter memberAdapter = new MemberAdapter(this, memberArrayList);
        listView.setAdapter(memberAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Members members = memberArrayList.get(i);
                Toast toast = Toast.makeText(MainActivity.this,"its done",Toast.LENGTH_SHORT);
                toast.show();
            }
        });

    }
}
