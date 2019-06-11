package ru.ogorodnik.homework411v1;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private ListView myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myList = findViewById(R.id.myList_view);

        final List<Map<String, String>> content = new ArrayList<>();

        Map<String, String> firstRowMap = new HashMap<>();
        firstRowMap.put("upper_text", getString(R.string.text1));
        //int text =  (getString(R.string.text1)).length(); Оставил эту строку для себя в качетсве напоминания
        firstRowMap.put("down_text", String.valueOf((getString(R.string.text1)).length()));
        content.add(firstRowMap);

        Map<String, String> secondRowMap = new HashMap<>();
        secondRowMap.put("upper_text", getString(R.string.text2));
        secondRowMap.put("down_text", String.valueOf((getString(R.string.text2)).length()));
        content.add(secondRowMap);

        final SimpleAdapter adapter = new SimpleAdapter(this, content, R.layout.activity_main,
                new String[]{ "upper_text", "down_text" }, new int[]{ R.id.upper_text, R.id.down_text });
        myList.setAdapter(adapter);
    }

}
