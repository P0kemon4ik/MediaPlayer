package com.google.mediaplayer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void GoToMediaPlayer (View view){
        Intent intent = new Intent(getApplicationContext(), MediaPlayerActivity.class);
        startActivity(intent);
    }

    public void GoToSoundPool (View view){
        Intent intent = new Intent(getApplicationContext(), SoundPoolActivity.class);
        startActivity(intent);
    }
}