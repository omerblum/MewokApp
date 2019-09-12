package com.example.android.miwok;

import android.widget.ImageView;

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private static  final int NO_IMAGE = -1;
    private int mImage = NO_IMAGE;
    private int mAudio;

    public Word(String defaultTranslaion, String miwokTranslation, int Image, int Audio){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslaion;
        mImage = Image;
        mAudio = Audio;
    }

    public Word(String defaultTranslaion, String miwokTranslation, int Audio){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslaion;
        mAudio = Audio;
    }
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getmImage(){ return mImage;}

    public boolean hasImage(){
        return mImage != NO_IMAGE;
    }

    public int getmAudio() {
        return mAudio;
    }

}
