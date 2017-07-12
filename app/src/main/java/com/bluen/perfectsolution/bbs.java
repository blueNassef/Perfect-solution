package com.bluen.perfectsolution;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by root on 7/5/17.
 */

public class bbs extends Fragment {
    TextView accStates,rejStates,accPPO,ageLimit,bbsRec;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.bbs_textview,container,false);
        accStates= (TextView)v.findViewById(R.id.accStates);
        rejStates= (TextView)v.findViewById(R.id.rejStates);
        accPPO= (TextView)v.findViewById(R.id.accPPO);
        ageLimit= (TextView)v.findViewById(R.id.ageLimit);
        bbsRec= (TextView)v.findViewById(R.id.bbsRec);

        accStates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Accepted states",Toast.LENGTH_LONG).show();
            }
        });

        accStates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Accepted states",Toast.LENGTH_LONG).show();
            }
        });

        rejStates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Rejected states",Toast.LENGTH_LONG).show();
            }
        });

        accPPO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Accepted PPO",Toast.LENGTH_LONG).show();
            }
        });

        ageLimit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Age limit",Toast.LENGTH_LONG).show();
            }
        });

        bbsRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"rec",Toast.LENGTH_LONG).show();
            }
        });

        return v;
    }
}
