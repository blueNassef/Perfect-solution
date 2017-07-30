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

public class descClass extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.desc_frag,container,false);
        TextView desc1= (TextView) v.findViewById(R.id.desc1);



        desc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // MediaPlayer mp = MediaPlayer.create(getActivity(), R.raw.intro1);
                //mp.start();
            }
        });
        return v;
    }
}
