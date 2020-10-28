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

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener {
    private String[] names = {"顽家 -Jony J","演员 -薛之谦","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","顽家 -Jony J","经济舱（live） -Kafe.Hu","会不会（吉他版） -刘大壮","序曲：拾音器","幸存者Drifter -林俊杰","映山红 -仝卓",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ListView listView = findViewById(R.id.lv);
        MyBaseAdapter adapter = new MyBaseAdapter();
        listView.setAdapter(adapter);
    }
    public class MyBaseAdapter extends BaseAdapter {

        @Override
        public int getCount() {  //获取item总数
            return names.length;
        }

        @Override
        public Object getItem(int position) {    //返回item的数据对象
            return names[position];
        }

        @Override
        public long getItemId(int position) {   //返回item的id
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) { //获取item的view视图
            //将list_item.xml文件转换为view对象
            View view = View.inflate(MainActivity6.this,R.layout.activity_list_item2,null);

            //初始化view对象（activity_list_item）的控件
            TextView name = view.findViewById(R.id.tv_name);
            name.setText(names[position]);
            return view;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.arrow:
                Intent intent = new Intent(this, MainActivity3.class);
                startActivity(intent);
                overridePendingTransition(0, 0);
                break;
        }
    }
}