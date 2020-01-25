package com.example.codelabsroomdb;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//annotate the word class
@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word) {
        this.mWord = word;
    }


    // if i replace it with getmWord then it breaks the code
    // reporting that the getter for the field was not found
    @NonNull
    public String getWord() {
        return mWord;
    }
}
