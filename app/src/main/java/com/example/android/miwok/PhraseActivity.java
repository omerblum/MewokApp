package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhraseActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word(  "Where are you going?" + "\n", "minto wuksus" + "\n", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?" + "\n", "tinnә oyaase'nә" + "\n", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is..." + "\n","oyaaset..." + "\n", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?" + "\n","michәksәs?" + "\n", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good." + "\n", "kuchi achit" + "\n", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?" + "\n","әәnәs'aa?" + "\n", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming." + "\n", "hәә’ әәnәm" + "\n", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming" + "\n", "әәnәm" + "\n", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go" + "\n", "yoowutis" + "\n", R.raw.phrase_lets_go));
        words.add(new Word("Come here" + "\n", "әnni'nem" + "\n", R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.phrases_list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Word word = words.get(position);
                mMediaPlayer = MediaPlayer.create(PhraseActivity.this, word.getmAudio());
                mMediaPlayer.start();
            }
        });
    }
}
