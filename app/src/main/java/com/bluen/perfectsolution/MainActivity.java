package com.bluen.perfectsolution;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher_round);


        ImageView logo= (ImageView) findViewById(R.id.logo);
        final AlphaAnimation anim= new AlphaAnimation(5f, 0f);
        anim.setDuration(5000);
        logo.startAnimation(anim);

        final String [] Tuts= getResources().getStringArray(R.array.tuts);
        final ArrayAdapter<String> adap=
                new ArrayAdapter<>(this, R.layout.custom_listview,Tuts);
        lv= (ListView) findViewById(R.id.listView);
        lv.setAdapter(adap);



        anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}
            @Override
            public void onAnimationEnd(Animation animation) {
                lv.setVisibility(View.VISIBLE);}
            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String itemValue= (String) lv.getItemAtPosition(position);
                MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.b);

                android.app.FragmentManager fm= getFragmentManager();
                android.app.FragmentTransaction ft= fm.beginTransaction();

                switch (position){
                    case 0:
                        mp.start();
                        ft.add(R.id.fragContainer,new introClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 1:
                        mp.start();
                        ft.add(R.id.fragContainer,new reasonClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 2:
                        mp.start();
                        ft.add(R.id.fragContainer,new threeYesesClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 3:
                        mp.start();
                        ft.add(R.id.fragContainer,new painClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 4:
                        mp.start();
                        ft.add(R.id.fragContainer,new offerClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 5:
                        mp.start();
                        ft.add(R.id.fragContainer,new descClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 6:
                        mp.start();
                        ft.add(R.id.fragContainer,new eligibilityClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 7:
                        mp.start();
                        ft.add(R.id.fragContainer,new rebuttalsClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 8:
                        mp.start();
                        ft.add(R.id.fragContainer,new beforeRecClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 9:
                        mp.start();
                        ft.add(R.id.fragContainer,new bbs());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 10:
                        mp.start();
                        Toast.makeText(getApplicationContext(),itemValue,
                                Toast.LENGTH_SHORT).show();
                        //ft.add(R.id.fragContainer,new DMERec());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 11:
                        mp.start();
                        Toast.makeText(getApplicationContext(),itemValue,
                                Toast.LENGTH_SHORT).show();
                        //ft.add(R.id.fragContainer,new npRec());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 12:
                        mp.start();
                        ft.add(R.id.fragContainer,new bbsAccClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 13:
                        mp.start();
                        ft.add(R.id.fragContainer,new bbsRejClass());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 14:
                        mp.start();
                        Toast.makeText(getApplicationContext(),itemValue,
                                Toast.LENGTH_SHORT).show();
                        //ft.add(R.id.fragContainer,new insuranceCards());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                    case 15:
                        mp.start();
                        Toast.makeText(getApplicationContext(),itemValue,
                                Toast.LENGTH_SHORT).show();
                        //ft.add(R.id.fragContainer,new notes());
                        ft.addToBackStack("");
                        ft.commit();
                        break;
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.about :
                android.app.FragmentManager fm= getFragmentManager();
                android.app.FragmentTransaction ft= fm.beginTransaction();
                ft.add(R.id.fragContainer,new aboutFrag());
                ft.addToBackStack("");
                ft.commit();
                return true;
            case R.id.contact:
                Intent mail= new Intent(Intent.ACTION_SEND);
                mail.setType("text/plain");
                mail.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@perfectsolution.co"});
                mail.putExtra(Intent.EXTRA_SUBJECT, "junit tutorial");
                mail.putExtra(Intent.EXTRA_TEXT,"body of email");
                try{
                    startActivity(Intent.createChooser(mail,"Send mail..."));
                }catch(android.content.ActivityNotFoundException e){
                    Toast.makeText(this,"Error...\ntry again later",
                            Toast.LENGTH_SHORT).show();
                }
                return true;
            case R.id.exit :
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
