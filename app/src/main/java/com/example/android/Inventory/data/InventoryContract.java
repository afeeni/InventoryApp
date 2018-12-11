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

import android.provider.BaseColumns;


public final class InventoryContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private InventoryContract() {}


    public static final class InventoryEntry implements BaseColumns {

       public final static String TABLE_NAME = "games";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_GAME_NAME ="name";
        public final static String COLUMN_GAME_CONSOLE = "console";
        public final static String COLUMN_GAME_YEAR = "year";


        public static final int CONSOLE_UNKNOWN = 0;
        public static final int PLAYSTATION = 1;
        public static final int XBOX = 2;
        public static final int PC = 3;
    }

}

