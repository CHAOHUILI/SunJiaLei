package com.sudichina.study.grendao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


import com.sudichina.study.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);

        //获取dao对象管理者
        UserInfoDao daoSession = MyHelper.getDaoSession(this).getUserInfoDao();
//      daoSession.insert(new UserInfo("li会超"));
//        List<UserInfo> list = daoSession.queryBuilder().where(UserInfoDao.Properties.NickName.eq("li会超")).list();
//        if (list != null && list.size() > 0) {
//            UserInfo userInfo = list.get(0);
////            userInfo.setCeshi("hahaha");
////            daoSession.update(userInfo);
////            text.setText(userInfo.getNickName());
//        }

        List<UserInfo> list = daoSession.loadAll();
        if (list != null && list.size() > 0) {
//            text.setText(list.get(0).getNickName());
        }

    }
}
