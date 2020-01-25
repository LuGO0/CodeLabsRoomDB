package com.example.codelabsroomdb;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private WordRepository mRepository;

    private LiveData<List<Word>> mAllWords;

    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }

    //get all the words
    LiveData<List<Word>> getAllWords() { return mAllWords; }

    // creting a wrapper insert method which calls the repositories insert method
    // thus hiding the insert logic from the UI
    // ie from the UI we'll just use the data cached in the ViewModel
    // and not care about the logic at the end of it
    public void insert(Word word) { mRepository.insert(word); }

    //delAll
    public void deleteAll() {mRepository.deleteAll();}

    //del a single word
    public void deleteWord(Word word) {mRepository.deleteWord(word);}

}
