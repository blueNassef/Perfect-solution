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
 * Created by root on 6/17/17.
 */

public class rebuttalsClass extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.rebuttals_frag,container,false);
        TextView reb1= (TextView) v.findViewById(R.id.reb1);
        TextView reb2= (TextView) v.findViewById(R.id.reb2);
        TextView reb3= (TextView) v.findViewById(R.id.reb3);
        TextView reb4= (TextView) v.findViewById(R.id.reb4);
        TextView reb5= (TextView) v.findViewById(R.id.reb5);
        TextView reb6= (TextView) v.findViewById(R.id.reb6);

        reb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reb5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reb6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });
        return v;
    }
}
