package com.example.hp.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Album> content_of_singer = new ArrayList<Album>();
        content_of_singer.add(new Album("Kenny G", "Simple Music", R.drawable.ic_album_black_24dp));
        content_of_singer.add(new Album("Amr Diab", "Awl Kol haga", R.drawable.ic_album_black_24dp));
        content_of_singer.add(new Album("Adele", "Hello It's Me", R.drawable.ic_album_black_24dp));
        CustomAdapter contentofalbum = new CustomAdapter(content_of_singer);
        ListView list = (ListView) findViewById(R.id.simpleListView);
        list.setAdapter(contentofalbum);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView Adapter, View view, int position, long paramter) {
                Intent intent;
                if (position == 0) {
                    Toast.makeText(MainActivity.this, "Welcome to kenny G Page!", Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this, Kennyg.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Toast.makeText(MainActivity.this, "Welcome to Amr Diab Page!", Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this, Amrdiab.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Toast.makeText(MainActivity.this, "Welcome to Adele Page!", Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this, Adele.class);
                    startActivity(intent);
                }
            }
        });
    }

    class CustomAdapter extends BaseAdapter {
        ArrayList<Album> items = new ArrayList<Album>();

        CustomAdapter(ArrayList<Album> Items) {
            this.items = Items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public String getItem(int i) {
            return items.get(i).name;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.activity_main2, null);
            TextView textView1 = (TextView) view1.findViewById(R.id.name);
            TextView textView2 = (TextView) view1.findViewById(R.id.description);
            textView1.setText(items.get(i).name);
            textView2.setText(items.get(i).description);
            return view1;
        }
    }
}
