package com.pallefire.palle_online_studyplan;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listView;
    ArrayList<Videos> myVideos;
    MyAdapter myAdapter;

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return myVideos.size();
        }

        @Override
        public Object getItem(int position) {
            return myVideos.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            Videos temp = myVideos.get(position);
            View view = getLayoutInflater().inflate(R.layout.row,null);
            TextView textView1 = (TextView) view.findViewById(R.id.textview1);
            TextView textView2 = (TextView) view.findViewById(R.id.textview2);
            TextView textView3 = (TextView) view.findViewById(R.id.textview3);
            Button button1 = (Button) view.findViewById(R.id.button1);
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = listView.getPositionForView(v);
                    Toast.makeText(MainActivity.this, ""+pos, Toast.LENGTH_SHORT).show();
                }
            });

            textView1.setText(temp.getSno());
            textView2.setText(temp.getVname());
            textView3.setText(temp.getVduration());

            return view;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      listView = (ListView) findViewById(R.id.listview);
        myVideos = new ArrayList<Videos>();
        Videos v1 = new Videos("1","Java DataTypes","18.30");
        Videos v2 = new Videos("2","Android course","15.40");
        Videos v3  = new Videos("3",".Net Course","20.40");
        Videos v4 = new Videos("4","C#","25.50");

        myVideos.add(v1);
        myVideos.add(v2);
        myVideos.add(v3);
        myVideos.add(v4);

        myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);
    }
}
