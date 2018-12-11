/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.Inventory.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.Inventory.data.InventoryContract.InventoryEntry;


public class InventoryDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = InventoryDbHelper.class.getSimpleName();

    /** Name of the database file */
    private static final String DATABASE_NAME = "shelter.db";

    /**
     * Database version. If you change the database schema, you must increment the database version.
     */
    private static final int DATABASE_VERSION = 1;


    public InventoryDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a String that contains the SQL statement to create the pets table
        String SQL_CREATE_GAMES_TABLE =  "CREATE TABLE " + InventoryEntry.TABLE_NAME + " ("
                + InventoryEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + InventoryEntry.COLUMN_GAME_NAME + " TEXT NOT NULL, "
                + InventoryEntry.COLUMN_GAME_CONSOLE + " INTEGER NOT NULL, "
                + InventoryEntry.COLUMN_GAME_YEAR + " TEXT);";

        // Execute the SQL statement
        db.execSQL(SQL_CREATE_GAMES_TABLE);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}