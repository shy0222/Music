package com.example.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener{
    private String[] names = {"顽家 -Jony J","动物世界 -薛之谦","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","映山红 -仝卓",};
    private String[] prices = {"positions -Ariana Grande","positions -Ariana Grande","青花瓷 -周杰伦","摩天大楼 -薛之谦","你还要我怎样 -薛之谦","黑色幽默 -周杰伦",};
    private String[] titles = {"经济舱（live） -Kafe.Hu","经济舱（live） -Kafe.Hu","经济舱（live） -Kafe.Hu","经济舱（live） -Kafe.Hu","经济舱（live） -Kafe.Hu","经济舱（live） -Kafe.Hu",};
    private int[] icons = {R.drawable.d1,R.drawable.d1,R.drawable.d1,R.drawable.d1,R.drawable.d1,R.drawable.d1,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ListView listView = findViewById(R.id.lv);
        MyBaseAdapter adapter = new MyBaseAdapter();
        listView.setAdapter(adapter);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
    }
    public class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {  //获取item总数
            return prices.length;
        }

        @Override
        public Object getItem(int position) {    //返回item的数据对象
            return prices[position];
        }

        @Override
        public long getItemId(int position) {   //返回item的id
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) { //获取item的view视图
            //将list_item.xml文件转换为view对象
            View view = View.inflate(MainActivity3.this,R.layout.activity_list_item,null);

            //初始化view对象（activity_list_item）的控件
            TextView name = view.findViewById(R.id.tv_name);
            TextView title = view.findViewById(R.id.tv_title);
            TextView price = view.findViewById(R.id.tv_price);
            ImageView iv = view.findViewById(R.id.iv_pic);

            name.setText(names[position]);
            title.setText(prices[position]);
            price.setText(titles[position]);
            iv.setImageResource(icons[position]);
            return view;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_2:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_3:
                intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_4:
                intent = new Intent(this, MainActivity6.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_5:
                intent = new Intent(this, MainActivity6.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
            case R.id.btn_6:
                intent = new Intent(this, MainActivity6.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;

        }
    }
}