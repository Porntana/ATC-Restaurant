package appewtc.masterung.ungrestaurant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by com1test on 22/3/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String databast_name = "Atc.db";
    private static final int databast_version = 1;
    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text," +
            "Password taxt" +
            "Namt text);";

    private static final String create_food_table = "create table foodTABLE (" +
            "_id integer primary key, " +
            "Foood text," +
            "Price taxt" +
            "Sourec text);";





    public MyOpenHelper(Context context) {
        super(context,databast_name, null, databast_version);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_food_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   //main Class
