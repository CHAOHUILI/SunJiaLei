package com.sudichina.study.grendao;

import android.app.Application;

public class MyApplication extends Application {

//    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();

        //配置数据库
        setupDatabase();
    }

    /**
     * 配置数据库
     */
    private void setupDatabase() {
        //创建数据库shop.db
//        MyHelper helper = new MyHelper(this, "shop.db", null);
//        //获取可写数据库
//        SQLiteDatabase db = helper.getWritableDatabase();
//        //获取数据库对象
//        DaoMaster daoMaster = new DaoMaster(db);
//        //获取dao对象管理者
//        daoSession = daoMaster.newSession();
    }
//
//    public static DaoSession getDaoInstant() {
//        return daoSession;
//    }


}
