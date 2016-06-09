package com.example.abvm537.twitter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ABVM537 on 6/7/2016.
 */
public class NoteAdapter extends ArrayAdapter<Note> {
    public NoteAdapter(Context context, ArrayList<Note> notes) {
        super(context, 0, notes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get fata item for this possition
        Note note = getItem(position);
        //Check if existing view is beinf otherwise, other inflate a new view from custom row lay out
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_row, parent, false);
        }
        //Grab references of views so we can populate them with specific data note row
        TextView noteTitle = (TextView) convertView.findViewById(R.id.ListIteemsNoteTitle);
        TextView noteText = (TextView) convertView.findViewById(R.id.ListIteemsNoteBody);
        ImageView noteIcon = (ImageView) convertView.findViewById(R.id.imageItems);
        //fill each new reference with data assoiciated with none its referencing
        noteTitle.setText(note.getTitle());
        noteText.setText(note.getMessage());
        noteIcon.setImageResource(note.getAssociatedDrawable());
        //return
        return  convertView;
    }
}