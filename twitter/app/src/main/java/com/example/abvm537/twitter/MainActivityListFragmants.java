package com.example.abvm537.twitter;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ABVM537 on 6/6/2016.
 */

public class MainActivityListFragmants extends ListFragment{
    private ArrayList<Note>notes;
    private NoteAdapter noteAdapter;
    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);

//
        notes = new ArrayList<Note>();//displaying the notes aray
        notes.add(new Note("@alldryer","am watching a nature documentary",Note.Category.firstTwet));//
        notes.add(new Note("@alldryer","Caching up with@thoughtbrain is the best",Note.Category.firstTwet));
        noteAdapter = new NoteAdapter(getActivity(),notes);
        setListAdapter(noteAdapter);

    }
    @Override
    public void onListItemClick(ListView i, View v, int position, long id){
        super.onListItemClick(i, v , position, id);
    }
}
