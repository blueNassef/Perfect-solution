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
        TextView intro1= (TextView) v.findViewById(R.id.intro1);
        TextView intro2= (TextView) v.findViewById(R.id.intro2);
        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);


        intro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mp.isPlaying()){

                }else {
                    mp.start();
                }
            }
        });
        intro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }
}
