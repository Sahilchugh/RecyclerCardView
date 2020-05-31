package com.example.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Adapter_12 adapter_12;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView Dataset = findViewById(R.id.Dataset_1);
        Dataset.setLayoutManager(new LinearLayoutManager(this));
        adapter_12 = new Adapter_12(this, getMylist());
        Dataset.setAdapter(adapter_12);

    }
    private ArrayList<Tests> getMylist()

    {
        ArrayList<Tests> tests = new ArrayList<>();
        Tests t = new Tests();
        t.setText("Cloud Computing Concepts");
        t.setImg(R.drawable.ccc);
        tests.add(t);

        t = new Tests();
        t.setText("Android");
        t.setImg(R.drawable.android);
        tests.add(t);

        t = new Tests();
        t.setText("HTML");
        t.setImg(R.drawable.html);
        tests.add(t);

        t = new Tests();
        t.setText("C-C++");
        t.setImg(R.drawable.ccpp);
        tests.add(t);

        t = new Tests();
        t.setText("Python");
        t.setImg(R.drawable.python);
        tests.add(t);

        t = new Tests();
        t.setText("Cloud Computing Concepts");
        t.setImg(R.drawable.ccc);
        tests.add(t);

        t = new Tests();
        t.setText("Android");
        t.setImg(R.drawable.android);
        tests.add(t);

        t = new Tests();
        t.setText("HTML");
        t.setImg(R.drawable.html);
        tests.add(t);

        t = new Tests();
        t.setText("C-C++");
        t.setImg(R.drawable.ccpp);
        tests.add(t);

        t = new Tests();
        t.setText("Python");
        t.setImg(R.drawable.python);
        tests.add(t);
        return tests;




    }

}
