package com.mahmoudmagdioffecial.fasttodo;

import android.provider.BaseColumns;

class TaskContract {
    static final String DB_NAME = "toDotDataBase";
    static final int DB_VERSION = 1;

    class TaskEntry implements BaseColumns {
        static final String TABLE = "tasks";

        static final String TASK_TITLE = "title";
    }
}
