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
 * Created by root on 6/5/17.
 */

public class painClass extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.pain_frag,container,false);
        TextView pain= (TextView) v.findViewById(R.id.pain);
        TextView pain1= (TextView) v.findViewById(R.id.pain1);

        final MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.pain);
        final MediaPlayer mp1 = MediaPlayer.create(getActivity(), R.raw.pain_1);

        pain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()||mp1.isPlaying()){

                }else {
                    mp.start();
                }
            }
        });

        pain1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp.isPlaying()||mp1.isPlaying()){

                }else {
                    mp1.start();
                }
            }
        });
        return v;
    }
}
