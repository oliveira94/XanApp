package pt.santana.xana.xanapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound1;
    MediaPlayer mySound2;
    MediaPlayer mySound3;
    MediaPlayer mySound4;
    MediaPlayer mySound5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound1 = MediaPlayer.create(this, R.raw.Desculpah);
        mySound2 = MediaPlayer.create(this, R.raw.Paxourrah);
        mySound3 = MediaPlayer.create(this, R.raw.Enfeim);
        mySound4 = MediaPlayer.create(this, R.raw.Bora_po_omegle);
        mySound5 = MediaPlayer.create(this, R.raw.Cunouje);
    }

    public void PlayMusicDesculpah(View view) {
        mySound1.start();
    }

    public void PlayMusicPaxourah(View view) {
        mySound2.start();
    }

    public void PlayMusicEnfeim(View view) {
        mySound3.start();
    }

    public void PlayMusicBora(View view) {
        mySound4.start();
    }

    public void PlayMusicCuNouje(View view) {
        mySound5.start();
    }
}
