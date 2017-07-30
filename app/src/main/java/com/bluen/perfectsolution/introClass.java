package com.bluen.perfectsolution;

import android.app.Fragment;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by root on 6/4/17.
 */

public class introClass extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.intro_frag,container,false);
        TextView intro= (TextView) v.findViewById(R.id.intro);
        TextView intro1= (TextView) v.findViewById(R.id.intro1);

        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro);
        final MediaPlayer mp1 = MediaPlayer.create(getActivity(), R.raw.intro_1);


        intro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp.isPlaying()||mp1.isPlaying()){

                }else {
                    mp.start();
                }
            }
        });
        intro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp1.isPlaying()||mp.isPlaying()){

                }else {
                    mp1.start();
                }
            }
        });

        return v;
    }
}
