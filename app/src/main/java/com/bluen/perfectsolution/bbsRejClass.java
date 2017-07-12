package com.bluen.perfectsolution;

import android.app.Fragment;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by root on 6/8/17.
 */

public class bbsRejClass extends Fragment {
    MediaPlayer mprej1;
    MediaPlayer mprej2;
    MediaPlayer mprej3;
    MediaPlayer mprej4;
    MediaPlayer mprej5;
    MediaPlayer mprej6;
    MediaPlayer mprej7;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.bbs_rej_frag,container,false);
        TextView rej1= (TextView) v.findViewById(R.id.rej1);
        TextView rej2= (TextView) v.findViewById(R.id.rej2);
        TextView rej3= (TextView) v.findViewById(R.id.rej3);
        TextView rej4= (TextView) v.findViewById(R.id.rej4);
        TextView rej5= (TextView) v.findViewById(R.id.rej5);
        TextView rej6= (TextView) v.findViewById(R.id.rej6);
        TextView rej7= (TextView) v.findViewById(R.id.rej7);


        mprej1 = MediaPlayer.create(getActivity(), R.raw.intro1);
        mprej2 = MediaPlayer.create(getActivity(), R.raw.intro1);
        mprej3 = MediaPlayer.create(getActivity(), R.raw.intro1);
        mprej4 = MediaPlayer.create(getActivity(), R.raw.intro1);
        mprej5 = MediaPlayer.create(getActivity(), R.raw.intro1);
        mprej6 = MediaPlayer.create(getActivity(), R.raw.intro1);
        mprej7 = MediaPlayer.create(getActivity(), R.raw.intro1);





        rej1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej1.isPlaying()){

                }else {
                    stopPlayers();
                    mprej1.start();
                }
            }
        });

        rej2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej2.isPlaying()){

                }else {
                    stopPlayers();
                    mprej2.start();
                }
            }
        });

        rej3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej3.isPlaying()){

                }else {
                    stopPlayers();
                    mprej3.start();
                }
            }
        });

        rej4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej4.isPlaying()){

                }else {
                    stopPlayers();
                    mprej4.start();
                }
            }
        });

        rej5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej5.isPlaying()){

                }else {
                    stopPlayers();
                    mprej5.start();
                }
            }
        });

        rej6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej6.isPlaying()){

                }else {
                    stopPlayers();
                    mprej6.start();
                }
            }
        });

        rej7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mprej7.isPlaying()){

                }else {
                    stopPlayers();
                    mprej7.start();
                }
            }
        });
        return v;
    }
    private void stopPlayers() {
        if (mprej1.isPlaying()) ;
        if (mprej2.isPlaying()) mprej2.stop();
        if (mprej3.isPlaying()) mprej3.stop();
        if (mprej4.isPlaying()) mprej4.stop();
        if (mprej5.isPlaying()) mprej5.stop();
        if (mprej6.isPlaying()) mprej6.stop();
        if (mprej7.isPlaying()) mprej7.stop();
    }
}
