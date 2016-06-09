package com.example.abvm537.twitter;

/**
 * Created by ABVM537 on 6/7/2016.
 */
public class Note {

    private String title, message;//my string varieble
    private long noteId, dateCreatedMilli;

    private Category category;



    public enum Category {firstTwet, secondTwet}

    public Note(String title, String message, Category category) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = 0;
        this.dateCreatedMilli = 0;

    }

    public Note(String title, String message, Category category, long noteId, long dateCreatedMilli) {
        this.title = title;
        this.message = message;
        this.category = category;
        this.noteId = noteId;
        this.dateCreatedMilli = dateCreatedMilli;

    }


    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Category getCategory() {
        return category;
    }
    public long getDate(){
        return dateCreatedMilli;
    }
    public long getId(){
        return noteId;
    }
    public String toString(){
        return "ID:"+noteId+ "Title:" + title+ "Message:"+message+ "IconId:"+category.name()+"Date:";
    }
    public int getAssociatedDrawable(){
        return categoryToDrawable(category);
    }
    public static int categoryToDrawable(Category noteCategory){
        switch (noteCategory){
            case firstTwet:
                return R.drawable.dryer;
            case secondTwet:
                return R.drawable.dryer;

        }
        return R.drawable.dryer;
    }
}