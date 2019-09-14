# SQLiteExercise

## 概要
http://yonayona.biz/yonayona/android_master_of_sqlite <br>
上記サイトの写経です。

## メモ
### スキーマ（Schema）
  DBの構造のことを指す。<br>
  層構造の場合、概念・論理・物理スキーマに分けられる。

### DAO
  「Data Access Object」の略称。

### DTO
  「Data Transfer Object」の略称。
  
### BaseColumns（インターフェース）
  implementsで実装すると、カラムに自動で_idがつく。

### SQLiteOpenHelper
  SQLiteをAndroidで使うときは、このクラスを継承したクラスを作成する。
  SQLiteデータベースを作成したり、テーブルを開いたりする際に用いるヘルパークラスのこと。
  DBの状態によって呼び出されるメソッドが複数定義されている。

### ヘルパークラス
  ビジネスロジックのうち、データベースアクセスを行なわないロジックを記述するためのクラス
  by http://ymir.seasar.org/docs/1.0.x/ref/standardArchitecture
  「SQLiteOpenHelper」の場合、SQLiteをOpenするためにはこのクラスを継承するといいと明示的にしている。
  by https://teratail.com/questions/29728

### ヘルパークラスを使う手順
  1. SQLiteOpenHelperを継承したクラスをインスタンス化する
  2. SQLiteOpenHelperの #getReadableDatabase か、#getWritableDatabase SQLiteDatabaseのインスタンスを取得する
  3. SQLiteDatabaseインスタンスのメソッドを使ってテーブルにアクセスする
  4. SQLiteOpenHelper #close を使って、DBを閉じる
