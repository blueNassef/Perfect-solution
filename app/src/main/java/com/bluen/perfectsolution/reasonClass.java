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

/**
 * Created by root on 6/5/17.
 */

public class reasonClass extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.reason_frag,container,false);
        TextView reason1= (TextView) v.findViewById(R.id.reason1);
        TextView reason2= (TextView) v.findViewById(R.id.reason2);
        TextView reason3= (TextView) v.findViewById(R.id.reason3);
        TextView reason4= (TextView) v.findViewById(R.id.reason4);




        reason1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reason2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reason3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });

        reason4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });
        return v;
    }
}
