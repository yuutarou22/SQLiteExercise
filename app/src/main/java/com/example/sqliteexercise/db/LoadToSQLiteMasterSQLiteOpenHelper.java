package com.example.sqliteexercise.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class LoadToSQLiteMasterSQLiteOpenHelper extends SQLiteOpenHelper {

    static final String TAG = "LdToSQLiteMSQLiteOpnHlp";

    public LoadToSQLiteMasterSQLiteOpenHelper(Context context) {
        /**
         * context: コンテキスト
         * name   : DBファイル名
         * factory: Cursorオブジェクトを作成するファクトリークラス。nullならデフォルトのものを使用する。
         * version: DBのバージョン。作成済みDBがある場合は「作成済みバージョン」と「引数バージョン」が比較される。
         * 　　　　　 作成済みバージョン と 引数バージョンの条件
         * 　　　　　　　　==：インスタンス生成
         * 　　　　　　　　＜：SQLiteOpenHelper #onUpgrade
         * 　　　　　　　　＞：SQLiteOpenHelper #onDowngrade
         * erroraHandler:
         */
        super(context, LoadToSQliteMasterContract.DataBase.DATABASE_NAME, null, LoadToSQliteMasterContract.DataBase.DATABASE_VERSION, null);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        /* DB接続設定時に呼び出される */
        Log.d(TAG, "onConfigure: ");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        /* 初回接続時にDBが存在しない場合に呼び出される
        　　基本的にonCreateでDB内のテーブルを作成する */
        Log.d(TAG, "onCreate: ");
        db.execSQL(LoadToSQliteMasterContract.Book.SQL_CREATE_ENTRIES);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        /* DBファイルからアクセス可能になった時、呼び出される */
        Log.d(TAG, "onOpen: ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /* コンストラクタで渡されたバージョンが大きい場合、呼び出される。
        　　バージョンアップに伴うスキーマの変更を行う */
        Log.d(TAG, "onUpgrade: ");
        // Bookテーブルを削除
        db.execSQL(LoadToSQliteMasterContract.Book.SQL_DROP_ENTRIES);
        // 新たにBookテーブルを作成
        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /* コンストラクタで渡されたバージョンが大きい場合、呼び出される。
        　　バージョンアップに伴うスキーマの変更を行う */
        Log.d(TAG, "onDowngrade: ");
    }
}
