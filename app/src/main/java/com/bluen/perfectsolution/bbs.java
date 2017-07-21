package com.bluen.perfectsolution;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by root on 7/5/17.
 */

public class bbs extends Fragment {
    TextView accStates,rejStates,accPPO,ageLimit,bbsRec;
    LinearLayout bbsLayout;
    private MediaPlayer mp;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.bbs_textview,container,false);
        accStates= (TextView)v.findViewById(R.id.accStates);
        rejStates= (TextView)v.findViewById(R.id.rejStates);
        accPPO= (TextView)v.findViewById(R.id.accPPO);
        ageLimit= (TextView)v.findViewById(R.id.ageLimit);
        bbsRec= (TextView)v.findViewById(R.id.bbsRec);

        bbsLayout= (LinearLayout)v.findViewById(R.id.bbsLayout);
        bbsLayout.setVisibility(View.VISIBLE);

        accStates.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
            @Override
            public void onClick(View v) {
                mp = MediaPlayer.create(getActivity(), R.raw.b);
                mp.start();
                Toast.makeText(getActivity(),"FUCK!!!",Toast.LENGTH_LONG).show();

                Fragment videoFragment = new bbsAccClass();
                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                transaction.add(R.id.fragContainerBBS, videoFragment).commit();
            }
        });


        rejStates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        accPPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        ageLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bbsRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return v;
    }
}
