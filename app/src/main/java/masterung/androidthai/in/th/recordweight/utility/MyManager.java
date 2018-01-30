package masterung.androidthai.in.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterung on 30/1/2018 AD.
 */

public class MyManager {

    private Context context;
    private MyOpenHelperSQLite myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelperSQLite(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();


    }   // Constructor

}   // Main Class
