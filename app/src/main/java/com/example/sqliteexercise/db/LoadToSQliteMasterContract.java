package com.example.sqliteexercise.db;

import android.provider.BaseColumns;

/**
 * DBのスキーマを定義するクラス
 */
public final class LoadToSQliteMasterContract {
    /* TEXT型　*/
    public static final String TYPE_TEXT = " TEXT ";
    /* INTEGER型 */
    public static final String TYPE_INTEGER = " INTEGER ";
    /* プライマリーキー */
    public static final String PRIMARY_KEY = "  PRIMARY KEY ";
    /* カンマ */
    public static final String COMMA_SEP = " , ";

    /**
     * LoadToSQliteMasterContractクラスはインスタンス化することは目的ではないので、
     * privateコンストラクタを定義
     */
    private LoadToSQliteMasterContract(){}

    /**
     * DB定義クラス
     */
    public static class DataBase {
        // DBファイル内のDBバージョン番号を表す
        public static final int DATABASE_VERSION = 1;
        // DB名（そのままSQLiteのDBファイル名になる）
        public static final String DATABASE_NAME = "LoadToSQLiteMaster.db";
    }

    /**
     * Bookテーブル定義クラス
     */
    public static class Book implements BaseColumns {
        /* Bookクラスはインスタンス化することは目的ではないので、privateコンストラクタを定義 */
        private Book(){}

        /* テーブル名 */
        public static final String TABLE_NAME = "book";
        /* カラム名（タイトル） */
        public static final String COLUMN_NAME_TITLE = "title";
        /* カラム名（サブタイトル） */
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";

        /* CREATE文 */
        public static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + TABLE_NAME + " (" +
                        _ID + TYPE_INTEGER + PRIMARY_KEY + COMMA_SEP +
                        COLUMN_NAME_TITLE + TYPE_TEXT + COMMA_SEP +
                        COLUMN_NAME_SUBTITLE + TYPE_TEXT +
                        " )";

        /* DROP文 */
        public static final String SQL_DROP_ENTRIES = "DROP TABLE IF EXISTS " + TABLE_NAME;

    }
}
