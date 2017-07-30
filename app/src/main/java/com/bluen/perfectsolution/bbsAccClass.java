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

public class bbsAccClass extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.bbs_acc_frag,container,false);

        TextView acc1= (TextView) v.findViewById(R.id.acc1);
        TextView acc2= (TextView) v.findViewById(R.id.acc2);
        TextView acc3= (TextView) v.findViewById(R.id.acc3);
        TextView acc4= (TextView) v.findViewById(R.id.acc4);
        TextView acc5= (TextView) v.findViewById(R.id.acc5);
        TextView acc6= (TextView) v.findViewById(R.id.acc6);
        TextView acc7= (TextView) v.findViewById(R.id.acc7);
        TextView acc8= (TextView) v.findViewById(R.id.acc8);
        TextView acc9= (TextView) v.findViewById(R.id.acc9);
        TextView acc10= (TextView) v.findViewById(R.id.acc10);
        TextView acc11= (TextView) v.findViewById(R.id.acc11);
        TextView acc12= (TextView) v.findViewById(R.id.acc12);
        TextView acc13= (TextView) v.findViewById(R.id.acc13);
        TextView acc14= (TextView) v.findViewById(R.id.acc14);
        TextView acc15= (TextView) v.findViewById(R.id.acc15);
        TextView acc16= (TextView) v.findViewById(R.id.acc16);
        TextView acc17= (TextView) v.findViewById(R.id.acc17);
        TextView acc18= (TextView) v.findViewById(R.id.acc18);
        TextView acc19= (TextView) v.findViewById(R.id.acc19);
        TextView acc20= (TextView) v.findViewById(R.id.acc20);
        TextView acc21= (TextView) v.findViewById(R.id.acc21);
        TextView acc22= (TextView) v.findViewById(R.id.acc22);
        TextView acc23= (TextView) v.findViewById(R.id.acc23);
        TextView acc24= (TextView) v.findViewById(R.id.acc24);
        TextView acc25= (TextView) v.findViewById(R.id.acc25);
        TextView acc26= (TextView) v.findViewById(R.id.acc26);
        TextView acc27= (TextView) v.findViewById(R.id.acc27);
        TextView acc28= (TextView) v.findViewById(R.id.acc28);
        TextView acc29= (TextView) v.findViewById(R.id.acc29);
        TextView acc30= (TextView) v.findViewById(R.id.acc30);
        TextView acc31= (TextView) v.findViewById(R.id.acc31);
        TextView acc32= (TextView) v.findViewById(R.id.acc32);
        TextView acc33= (TextView) v.findViewById(R.id.acc33);
        TextView acc34= (TextView) v.findViewById(R.id.acc34);
        TextView acc35= (TextView) v.findViewById(R.id.acc35);
        TextView acc36= (TextView) v.findViewById(R.id.acc36);
        TextView acc37= (TextView) v.findViewById(R.id.acc37);
        TextView acc38= (TextView) v.findViewById(R.id.acc38);
        TextView acc39= (TextView) v.findViewById(R.id.acc39);
        TextView acc40= (TextView) v.findViewById(R.id.acc40);
        TextView acc41= (TextView) v.findViewById(R.id.acc41);
        TextView acc42= (TextView) v.findViewById(R.id.acc42);
        TextView acc43= (TextView) v.findViewById(R.id.acc43);
/*
        final MediaPlayer mpAcc1 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc2 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc3 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc4 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc5 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc6 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc7 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc8 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc9 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc10 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc11 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc12 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc13 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc14 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc15 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc16 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc17 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc18 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc19 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc20 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc21 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc22 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc23 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc24 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc25 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc26 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc27 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc28 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc29 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc30 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc31 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc32 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc33 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc34 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc35 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc36 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc37 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc38 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc39 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc40 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc41 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc42 = MediaPlayer.create(getActivity(), R.raw.intro1);
        final MediaPlayer mpAcc43 = MediaPlayer.create(getActivity(), R.raw.intro1);




        acc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc1.isPlaying()){

                }else {
                    mpAcc1.start();
                }
            }
        });

        acc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc2.isPlaying()){

                }else {
                    mpAcc2.start();
                }
            }
        });

        acc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc3.isPlaying()){

                }else {
                    mpAcc3.start();
                }
            }
        });

        acc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc4.isPlaying()){

                }else {
                    mpAcc4.start();
                }
            }
        });

        acc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc5.isPlaying()){

                }else {
                    mpAcc5.start();
                }
            }
        });

        acc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc6.isPlaying()){

                }else {
                    mpAcc6.start();
                }
            }
        });

        acc7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc7.isPlaying()){

                }else {
                    mpAcc7.start();
                }
            }
        });

        acc8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc8.isPlaying()){

                }else {
                    mpAcc8.start();
                }
            }
        });

        acc9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc9.isPlaying()){

                }else {
                    mpAcc9.start();
                }
            }
        });

        acc10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc10.isPlaying()){

                }else {
                    mpAcc10.start();
                }
            }
        });

        acc11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc11.isPlaying()){

                }else {
                    mpAcc11.start();
                }
            }
        });

        acc12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc12.isPlaying()){

                }else {
                    mpAcc12.start();
                }
            }
        });

        acc13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc13.isPlaying()){

                }else {
                    mpAcc13.start();
                }
            }
        });

        acc14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc14.isPlaying()){

                }else {
                    mpAcc14.start();
                }
            }
        });

        acc15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc15.isPlaying()){

                }else {
                    mpAcc15.start();
                }
            }
        });

        acc16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc16.isPlaying()){

                }else {
                    mpAcc16.start();
                }
            }
        });

        acc17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc17.isPlaying()){

                }else {
                    mpAcc17.start();
                }
            }
        });

        acc18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc18.isPlaying()){

                }else {
                    mpAcc18.start();
                }
            }
        });

        acc19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc19.isPlaying()){

                }else {
                    mpAcc19.start();
                }
            }
        });

        acc20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc20.isPlaying()){

                }else {
                    mpAcc20.start();
                }
            }
        });

        acc21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc21.isPlaying()){

                }else {
                    mpAcc21.start();
                }
            }
        });

        acc22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc22.isPlaying()){

                }else {
                    mpAcc22.start();
                }
            }
        });

        acc23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc23.isPlaying()){

                }else {
                    mpAcc23.start();
                }
            }
        });

        acc24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc24.isPlaying()){

                }else {
                    mpAcc24.start();
                }
            }
        });

        acc25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc25.isPlaying()){

                }else {
                    mpAcc25.start();
                }
            }
        });

        acc26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc26.isPlaying()){

                }else {
                    mpAcc26.start();
                }
            }
        });

        acc27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc27.isPlaying()){

                }else {
                    mpAcc27.start();
                }
            }
        });

        acc28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc28.isPlaying()){

                }else {
                    mpAcc28.start();
                }
            }
        });

        acc29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc29.isPlaying()){

                }else {
                    mpAcc29.start();
                }
            }
        });

        acc30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc30.isPlaying()){

                }else {
                    mpAcc30.start();
                }
            }
        });

        acc31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc31.isPlaying()){

                }else {
                    mpAcc31.start();
                }
            }
        });

        acc32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc32.isPlaying()){

                }else {
                    mpAcc32.start();
                }
            }
        });

        acc33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc33.isPlaying()){

                }else {
                    mpAcc33.start();
                }
            }
        });

        acc34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc34.isPlaying()){

                }else {
                    mpAcc34.start();
                }
            }
        });

        acc35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc35.isPlaying()){

                }else {
                    mpAcc35.start();
                }
            }
        });

        acc36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc36.isPlaying()){

                }else {
                    mpAcc36.start();
                }
            }
        });

        acc37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc37.isPlaying()){

                }else {
                    mpAcc37.start();
                }
            }
        });

        acc38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc38.isPlaying()){

                }else {
                    mpAcc38.start();
                }
            }
        });

        acc39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc39.isPlaying()){

                }else {
                    mpAcc39.start();
                }
            }
        });

        acc40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc40.isPlaying()){

                }else {
                    mpAcc40.start();
                }
            }
        });

        acc41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc41.isPlaying()){

                }else {
                    mpAcc41.start();
                }
            }
        });

        acc42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc42.isPlaying()){

                }else {
                    mpAcc42.start();
                }
            }
        });

        acc43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mpAcc43.isPlaying()){

                }else {
                    mpAcc43.start();
                }
            }
        });

*/
        return v;
    }
}
