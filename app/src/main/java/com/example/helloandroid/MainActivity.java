package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CountDownTimer countDownTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.motion_test);

//        TextView tv = findViewById(R.id.preference_activity_title_text);
//        tv.setText("New Title");
//        ProgressBar progressBar = findViewById(R.id.progress_circular);

//        //代码创建view，设置属性
//        TextView tv = new TextView(this);
//        tv.setText("hello new textview");
//        tv.setTextColor(Color.argb(255, 255, 0, 0));
//        tv.setTextSize(19);
//        //设置布局参数
//        LinearLayout linearLayout = findViewById(R.id.content_ll);
//        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
//        lp.leftMargin = 100;
//        tv.setLayoutParams(lp);
//        linearLayout.addView(tv);

//        countDownTimer = new CountDownTimer(20000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//            @Override
//            public void onFinish() {
//                //view stub
//                ViewStub viewStub = findViewById(R.id.view_stub);
//                viewStub.inflate();
//                progressBar.setVisibility(View.GONE);
//            }
//        };
//        countDownTimer.start();
//        progressBar.setVisibility(View.VISIBLE);


//        LinearLayout linearLayout = findViewById(R.id.include_1);
//        TextView tv1 = linearLayout.findViewById(R.id.include_tv1);
//        tv1.setText("I am changed");


//        setContentView(R.layout.recyclerview);
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
//        recyclerView.setHasFixedSize(true);
//
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
//        recyclerView.setLayoutManager(layoutManager);
//
//        String[] myDataset = {"Apple", "Pair", "Banana", "Apple", "Pair", "Banana", "Apple", "Pair", "Banana", "Apple", "Pair", "Banana"};
//        RecyclerView.Adapter adapter = new MyAdapter(myDataset);
//        recyclerView.setAdapter(adapter);
//
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                myDataset[0] = "Corntree";
//                adapter.notifyDataSetChanged();
//            }
//        }, 5000);


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (countDownTimer != null) {
            countDownTimer.cancel();
            countDownTimer = null;
        }
    }
}