package com.example.sqliteexercise.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BookDAO {
    /**
     * SQLiteDatabaseインスタンスを取得する
     * @param context コンテキスト
     * @param isWritable 書き込み可能
     * @return SQLiteDatabaseインスタンス
     */
    public static SQLiteDatabase getSqLiteDatabase(Context context, boolean isWritable) {
        LoadToSQLiteMasterSQLiteOpenHelper loadToSQLiteMasterSQLiteOpenHelper = new LoadToSQLiteMasterSQLiteOpenHelper(context);
        SQLiteDatabase sqLiteDatabase = null;

        if (isWritable) {
            sqLiteDatabase = loadToSQLiteMasterSQLiteOpenHelper.getWritableDatabase();
        } else {
            sqLiteDatabase = loadToSQLiteMasterSQLiteOpenHelper.getReadableDatabase();
        }

        return sqLiteDatabase;
    }
}
