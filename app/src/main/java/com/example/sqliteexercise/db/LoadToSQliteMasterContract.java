package com.example.sqliteexercise.db;

/**
 * DBのスキーマを定義するクラス
 */
public final class LoadToSQliteMasterContract {

    /**
     * インスタンス化することは目的ではないので、privateコンストラクタを定義
     */
    private LoadToSQliteMasterContract(){}

    public static class DataBase {
        // DBファイル内のDBバージョン番号を表す
        public static final int DATABASE_VERSION = 1;
        // DB名（そのままSQLiteのDBファイル名になる）
        public static final String DATABASE_NAME = "LoadToSQLiteMaster.db";
    }
}
