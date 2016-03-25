package pt.santana.xana.xanapp;

import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mySound1;
    MediaPlayer mySound2;
    MediaPlayer mySound3;
    MediaPlayer mySound4;
    MediaPlayer mySound5;
    VideoView botaoPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySound1 = MediaPlayer.create(this, R.raw.desculpah);
        mySound2 = MediaPlayer.create(this, R.raw.paxourrah);
        mySound3 = MediaPlayer.create(this, R.raw.enfeim);
        mySound4 = MediaPlayer.create(this, R.raw.borapoomegle);
        mySound5 = MediaPlayer.create(this, R.raw.cunouje);
        Button buttonPlayVideo2 = (Button)findViewById(R.id.cabrabutton);
        VideoView mVideoView2 = (VideoView)findViewById(R.id.cabraVideoView);

        /**
        got from http://android-coffee.com/tutorial-how-to-play-video-in-android-studio-1-4/
         **/
        getWindow().setFormat(PixelFormat.UNKNOWN);
        //displays a video file
        String uriPath2 = "android.resource://pt.santana.xana.xanapp/"+R.raw.ahahcabra;
        Uri uri2 = Uri.parse(uriPath2);
        mVideoView2.setVideoURI(uri2);
        mVideoView2.requestFocus();
        mVideoView2.start();

        //Play again button
        buttonPlayVideo2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                VideoView mVideoView2 = (VideoView) findViewById(R.id.cabraVideoView);
                String uriPath = "android.resource://pt.santana.xana.xanapp/" + R.raw.ahahcabra;
                Uri uri2 = Uri.parse(uriPath);
                mVideoView2.setVideoURI(uri2);
                mVideoView2.requestFocus();
                mVideoView2.start();
            }
        });
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
