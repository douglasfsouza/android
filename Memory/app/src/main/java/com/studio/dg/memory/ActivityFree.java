package com.studio.dg.memory;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class ActivityFree extends AppCompatActivity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    public int inti=0;
    public String mstrClicou;
    public ImageView mobjClicou;
    public String mstrImg1;
    public String mstrImg2;
    public String mstrImg3;
    public String mstrImg4;
    public String mstrImg5;
    public String mstrImg6;
    public String mstrImg7;
    public String mstrImg8;
    public int    mintImg1;
    public int    mintImg2;
    public int    mintImg3;
    public int    mintImg4;
    public int    mintImg5;
    public int    mintImg6;
    public int    mintImg7;
    public int    mintImg8;
    public int    mintClickImg;
    public int    mintClickId;
    public int    mintHit1;
    public int    mintHit2;
    public int    mintHit3;
    public int    mintHit4;
    public int    mintHit5;
    public int    mintHit6;
    public int    mintHit7;
    public int    mintHit8;

    ImageView mobjImg1;
    ImageView mobjImg2;
    ImageView mobjImg3;
    ImageView mobjImg4;
    ImageView mobjImg5;
    ImageView mobjImg6;
    ImageView mobjImg7;
    ImageView mobjImg8;
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * Some older devices needs a small delay between UI widget updates
     * and a change of the status and navigation bar.
     */
    private static final int UI_ANIMATION_DELAY = 300;
    private final Handler mHideHandler = new Handler();
    private View mContentView;
    private final Runnable mHidePart2Runnable = new Runnable() {
        @SuppressLint("InlinedApi")
        @Override
        public void run() {
            // Delayed removal of status and navigation bar

            // Note that some of these constants are new as of API 16 (Jelly Bean)
            // and API 19 (KitKat). It is safe to use them, as they are inlined
            // at compile-time and do nothing on earlier devices.
            mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LOW_PROFILE
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        }
    };
    private View mControlsView;
    private final Runnable mShowPart2Runnable = new Runnable() {
        @Override
        public void run() {
            // Delayed display of UI elements
            ActionBar actionBar = getSupportActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            mControlsView.setVisibility(View.VISIBLE);
        }
    };
    private boolean mVisible;
    private final Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            hide();
        }
    };
    /**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     */
    private final View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_free);

        mVisible = true;
        mControlsView = findViewById(R.id.fullscreen_content_controls);
        mContentView = findViewById(R.id.fullscreen_content);


        // Set up the user interaction to manually show or hide the system UI.
        mContentView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggle();
            }
        });

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);
        mobjImg1 = (ImageView) findViewById(R.id.img1);
        mobjImg2 = (ImageView) findViewById(R.id.img2);
        mobjImg3 = (ImageView) findViewById(R.id.img3);
        mobjImg4 = (ImageView) findViewById(R.id.img4);
        mobjImg5 = (ImageView) findViewById(R.id.img5);
        mobjImg6 = (ImageView) findViewById(R.id.img6);
        mobjImg7 = (ImageView) findViewById(R.id.img7);
        mobjImg8 = (ImageView) findViewById(R.id.img8);


        //1-Flor
        //2-ToyStory
        //3-Nemo
        //4-Spider
        Random objRand1 = new Random();
        Random objRand2 = new Random();
        Random objRand3 = new Random();
        Random objRand4 = new Random();
        Random objRand5 = new Random();
        Random objRand6 = new Random();
        Random objRand7 = new Random();
        Random objRand8 = new Random();


        int intRand1 = objRand1.nextInt(8)+1;
        int intRand2 = objRand2.nextInt(8)+1;
        int intRand3 = objRand3.nextInt(8)+1;
        int intRand4 = objRand4.nextInt(8)+1;
        int intRand5 = objRand5.nextInt(8)+1;
        int intRand6 = objRand6.nextInt(8)+1;
        int intRand7 = objRand7.nextInt(8)+1;
        int intRand8 = objRand8.nextInt(8)+1;

        while(intRand2 == intRand1 || intRand2 == 0){
            intRand2 = objRand2.nextInt(8)+1;
        }

        while(intRand3 == intRand1 || intRand3 == intRand2 || intRand3 == 0){
            intRand3 = objRand3.nextInt(8)+1;
        }

        while(intRand4 == intRand3 || intRand4 == intRand2 || intRand4 == intRand1 || intRand4 == 0){
            intRand4 = objRand4.nextInt(8)+1;
        }

        while(intRand5 == intRand4 || intRand5 == intRand3 || intRand5 == intRand2 || intRand5 == intRand1 || intRand5 == 0){
            intRand5 = objRand5.nextInt(8)+1;
        }

        while(intRand6 == intRand5 || intRand6 == intRand4 || intRand6 == intRand3 || intRand6 == intRand2 || intRand6 == intRand1 || intRand6 == 0){
            intRand6 = objRand6.nextInt(8)+1;
        }

        while( intRand7 == intRand6 ||  intRand7 == intRand5 || intRand7 == intRand4 || intRand7 == intRand3 || intRand7 == intRand2 || intRand7 == intRand1 || intRand7 == 0){
            intRand7 = objRand7.nextInt(8)+1;
        }
        while( intRand8 == intRand7 || intRand8 == intRand6 ||  intRand8 == intRand5 || intRand8 == intRand4 || intRand8 == intRand3 || intRand8 == intRand2 || intRand8 == intRand1 || intRand8 == 0){
            intRand8 = objRand8.nextInt(8)+1;
        }


        switch (intRand1){
            case 1:
                mstrImg1 = "flor";
                mintImg1 = R.drawable.flor;
                break;
            case 2:
                mstrImg1 = "flor";
                mintImg1 = R.drawable.flor;
                break;
            case 3:
                mstrImg1 = "toystory";
                mintImg1 = R.drawable.toystory;
                break;
            case 4:
                mstrImg1 = "toystory";
                mintImg1 = R.drawable.toystory;
                break;
            case 5:
                mstrImg1 = "nemo";
                mintImg1 = R.drawable.nemo;
                break;
            case 6:
                mstrImg1 = "nemo";
                mintImg1 = R.drawable.nemo;
                break;
            case 7:
                mstrImg1 = "spider";
                mintImg1 = R.drawable.spider;
                break;
            case 8:
                mstrImg1 = "spider";
                mintImg1 = R.drawable.spider;
                break;
        }

        switch (intRand2){
            case 1:
                mstrImg2 = "flor";
                mintImg2 = R.drawable.flor;
                break;
            case 2:
                mstrImg2 = "flor";
                mintImg2 = R.drawable.flor;
                break;
            case 3:
                mstrImg2 = "toystory";
                mintImg2 = R.drawable.toystory;
                break;
            case 4:
                mstrImg2 = "toystory";
                mintImg2 = R.drawable.toystory;
                break;
            case 5:
                mstrImg2 = "nemo";
                mintImg2 = R.drawable.nemo;
                break;
            case 6:
                mstrImg2 = "nemo";
                mintImg2 = R.drawable.nemo;
                break;
            case 7:
                mstrImg2 = "spider";
                mintImg2 = R.drawable.spider;
                break;
            case 8:
                mstrImg2 = "spider";
                mintImg2 = R.drawable.spider;
                break;
        }

        switch (intRand3){
            case 1:
                mstrImg3 = "flor";
                mintImg3 = R.drawable.flor;
                break;
            case 2:
                mstrImg3 = "flor";
                mintImg3 = R.drawable.flor;
                break;
            case 3:
                mstrImg3 = "toystory";
                mintImg3 = R.drawable.toystory;
                break;
            case 4:
                mstrImg3 = "toystory";
                mintImg3 = R.drawable.toystory;
                break;
            case 5:
                mstrImg3 = "nemo";
                mintImg3 = R.drawable.nemo;
                break;
            case 6:
                mstrImg3 = "nemo";
                mintImg3 = R.drawable.nemo;
                break;
            case 7:
                mstrImg3 = "spider";
                mintImg3 = R.drawable.spider;
                break;
            case 8:
                mstrImg3 = "spider";
                mintImg3 = R.drawable.spider;
                break;
        }

        switch (intRand4){
            case 1:
                mstrImg4 = "flor";
                mintImg4 = R.drawable.flor;
                break;
            case 2:
                mstrImg4 = "flor";
                mintImg4 = R.drawable.flor;
                break;
            case 3:
                mstrImg4 = "toystory";
                mintImg4 = R.drawable.toystory;
                break;
            case 4:
                mstrImg4 = "toystory";
                mintImg4 = R.drawable.toystory;
                break;
            case 5:
                mstrImg4 = "nemo";
                mintImg4 = R.drawable.nemo;
                break;
            case 6:
                mstrImg4 = "nemo";
                mintImg4 = R.drawable.nemo;
                break;
            case 7:
                mstrImg4 = "spider";
                mintImg4 = R.drawable.spider;
                break;
            case 8:
                mstrImg4 = "spider";
                mintImg4 = R.drawable.spider;
                break;
        }

        switch (intRand5){
            case 1:
                mstrImg5 = "flor";
                mintImg5 = R.drawable.flor;
                break;
            case 2:
                mstrImg5 = "flor";
                mintImg5 = R.drawable.flor;
                break;
            case 3:
                mstrImg5 = "toystory";
                mintImg5 = R.drawable.toystory;
                break;
            case 4:
                mstrImg5 = "toystory";
                mintImg5 = R.drawable.toystory;
                break;
            case 5:
                mstrImg5 = "nemo";
                mintImg5 = R.drawable.nemo;
                break;
            case 6:
                mstrImg5 = "nemo";
                mintImg5 = R.drawable.nemo;
                break;
            case 7:
                mstrImg5 = "spider";
                mintImg5 = R.drawable.spider;
                break;
            case 8:
                mstrImg5 = "spider";
                mintImg5 = R.drawable.spider;
                break;
        }

        switch (intRand6){
            case 1:
                mstrImg6 = "flor";
                mintImg6 = R.drawable.flor;
                break;
            case 2:
                mstrImg6 = "flor";
                mintImg6 = R.drawable.flor;
                break;
            case 3:
                mstrImg6 = "toystory";
                mintImg6 = R.drawable.toystory;
                break;
            case 4:
                mstrImg6 = "toystory";
                mintImg6 = R.drawable.toystory;
                break;
            case 5:
                mstrImg6 = "nemo";
                mintImg6 = R.drawable.nemo;
                break;
            case 6:
                mstrImg6 = "nemo";
                mintImg6 = R.drawable.nemo;
                break;
            case 7:
                mstrImg6 = "spider";
                mintImg6 = R.drawable.spider;
                break;
            case 8:
                mstrImg6 = "spider";
                mintImg6 = R.drawable.spider;
                break;
        }
        switch (intRand7){
            case 1:
                mstrImg7 = "flor";
                mintImg7 = R.drawable.flor;
                break;
            case 2:
                mstrImg7 = "flor";
                mintImg7 = R.drawable.flor;
                break;
            case 3:
                mstrImg7 = "toystory";
                mintImg7 = R.drawable.toystory;
                break;
            case 4:
                mstrImg7 = "toystory";
                mintImg7 = R.drawable.toystory;
                break;
            case 5:
                mstrImg7 = "nemo";
                mintImg7 = R.drawable.nemo;
                break;
            case 6:
                mstrImg7 = "nemo";
                mintImg7 = R.drawable.nemo;
                break;
            case 7:
                mstrImg7 = "spider";
                mintImg7 = R.drawable.spider;
                break;
            case 8:
                mstrImg7 = "spider";
                mintImg7 = R.drawable.spider;
                break;
        }

        switch (intRand8){
            case 1:
                mstrImg8 = "flor";
                mintImg8 = R.drawable.flor;
                break;
            case 2:
                mstrImg8 = "flor";
                mintImg8 = R.drawable.flor;
                break;
            case 3:
                mstrImg8 = "toystory";
                mintImg8 = R.drawable.toystory;
                break;
            case 4:
                mstrImg8 = "toystory";
                mintImg8 = R.drawable.toystory;
                break;
            case 5:
                mstrImg8 = "nemo";
                mintImg8 = R.drawable.nemo;
                break;
            case 6:
                mstrImg8 = "nemo";
                mintImg8 = R.drawable.nemo;
                break;
            case 7:
                mstrImg8 = "spider";
                mintImg8 = R.drawable.spider;
                break;
            case 8:
                mstrImg8 = "spider";
                mintImg8 = R.drawable.spider;
                break;
        }


        mobjImg1.setImageResource(mintImg1);
        mobjImg2.setImageResource(mintImg2);
        mobjImg3.setImageResource(mintImg3);
        mobjImg4.setImageResource(mintImg4);
        mobjImg5.setImageResource(mintImg5);
        mobjImg6.setImageResource(mintImg6);
        mobjImg7.setImageResource(mintImg7);
        mobjImg8.setImageResource(mintImg8);

        int intTim = 0;
        for(int intcont =0;intcont<100000;intcont++){
            intTim = intTim + 8 - 5 -2;
        }

        mobjImg1.setImageResource(R.drawable.imgdefault);
        mobjImg2.setImageResource(R.drawable.imgdefault);
        mobjImg3.setImageResource(R.drawable.imgdefault);
        mobjImg4.setImageResource(R.drawable.imgdefault);
        mobjImg5.setImageResource(R.drawable.imgdefault);
        mobjImg6.setImageResource(R.drawable.imgdefault);
        mobjImg7.setImageResource(R.drawable.imgdefault);
        mobjImg8.setImageResource(R.drawable.imgdefault);

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        delayedHide(100);
    }

    private void toggle() {
        if (mVisible) {
            hide();
        } else {
            show();
        }
    }

    private void hide() {
        // Hide UI first
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        mControlsView.setVisibility(View.GONE);
        mVisible = false;

        // Schedule a runnable to remove the status and navigation bar after a delay
        mHideHandler.removeCallbacks(mShowPart2Runnable);
        mHideHandler.postDelayed(mHidePart2Runnable, UI_ANIMATION_DELAY);
    }

    @SuppressLint("InlinedApi")
    private void show() {
        // Show the system bar
        mContentView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION);
        mVisible = true;

        // Schedule a runnable to display UI elements after a delay
        mHideHandler.removeCallbacks(mHidePart2Runnable);
        mHideHandler.postDelayed(mShowPart2Runnable, UI_ANIMATION_DELAY);
    }

    /**
     * Schedules a call to hide() in delay milliseconds, canceling any
     * previously scheduled calls.
     */
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }
    public void Img1(View v){


/*
        mobjImg1.setImageResource(R.drawable.imgdefault);
        mobjImg2.setImageResource(R.drawable.imgdefault);
        mobjImg3.setImageResource(R.drawable.imgdefault);
        mobjImg4.setImageResource(R.drawable.imgdefault);
        mobjImg5.setImageResource(R.drawable.imgdefault);
        mobjImg6.setImageResource(R.drawable.imgdefault);
        mobjImg7.setImageResource(R.drawable.imgdefault);
        mobjImg8.setImageResource(R.drawable.imgdefault);

*/
        switch (v.getId()){
            case R.id.img1:
                mobjImg1.setImageResource(mintImg1);
                if (mintClickImg != mintImg1)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit1 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg1;
                break;
            case R.id.img2:
                mobjImg2.setImageResource(mintImg2);
                if (mintClickImg != mintImg2)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit2 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg2;
                break;
            case R.id.img3:
                mobjImg3.setImageResource(mintImg3);
                if (mintClickImg != mintImg3)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit3 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg3;
                break;
            case R.id.img4:
                mobjImg4.setImageResource(mintImg4);
                if (mintClickImg != mintImg4)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit4= 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg4;

                break;
            case R.id.img5:
                mobjImg5.setImageResource(mintImg5);
                if (mintClickImg != mintImg5)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit5 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg5;

                break;
            case R.id.img6:
                mobjImg6.setImageResource(mintImg6);
                if (mintClickImg != mintImg6)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit6 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg6;

                break;
            case R.id.img7:
                mobjImg7.setImageResource(mintImg7);
                if (mintClickImg != mintImg7)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit7 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg7;

                break;
            case R.id.img8:
                mobjImg8.setImageResource(mintImg8);
                if (mintClickImg != mintImg8)
                    CloseImgbyId(mintClickId);
                else{
                    mintHit8 = 1;
                    SetHitbyId(mintClickId);
                }

                mintClickImg =  mintImg8;

                break;

        }

        mintClickId = v.getId();





        // ImageView im = (ImageView) findViewById(R.id.img1);
        //im.setVisibility(-1);
        //static int inti = 0;
        //v.getId()
        //  if (inti == 0){
        //      //im.setImageResource(R.drawable.juju);
        //      im.setImageResource(R.drawable.imgdefault);
        //      inti = 1;
        //  }
        //  else
        // {
        //     im.setImageResource(R.drawable.flor);
        //    inti = 0;

        // }

        //im.setImageBitmap(bm);
        //im.setImageDrawable(d);
        //im.setBackground(sr. /drawable/nemo);
        //String strId = getString(v.getId());
        // String strT = "1=" + mstrImg1 + " 2=" + mstrImg2 + " 3=" + mstrImg3 + " 4=" + mstrImg4;
        // Toast.makeText(getApplicationContext(), strT,Toast.LENGTH_LONG).show();

    }
    private void CloseImgbyId(int intId){
        switch (intId){
            case R.id.img1:
                if (mintHit1 == 0)
                    mobjImg1.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img2:
                if (mintHit2 == 0)
                    mobjImg2.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img3:
                if (mintHit3 == 0)
                    mobjImg3.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img4:
                if (mintHit4 == 0)
                    mobjImg4.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img5:
                if (mintHit5 == 0)
                    mobjImg5.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img6:
                if (mintHit6 == 0)
                    mobjImg6.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img7:
                if (mintHit7 == 0)
                    mobjImg7.setImageResource(R.drawable.imgdefault);
                break;
            case R.id.img8:
                if (mintHit8 == 0)
                    mobjImg8.setImageResource(R.drawable.imgdefault);
                break;
        }
    }
    private void SetHitbyId(int intId){
        switch (intId){
            case R.id.img1:
                mintHit1 = 1;
                break;
            case R.id.img2:
                mintHit2 = 1;
                break;
            case R.id.img3:
                mintHit3 = 1;
                break;
            case R.id.img4:
                mintHit4 = 1;
                break;
            case R.id.img5:
                mintHit5 = 1;
                break;
            case R.id.img6:
                mintHit6 = 1;
                break;
            case R.id.img7:
                mintHit7 = 1;
                break;
            case R.id.img8:
                mintHit8 = 1;
                break;
        }
        if (mintHit1 + mintHit2  + mintHit3  + mintHit4  + mintHit5  + mintHit6  + mintHit7  + mintHit8 == 8  )
            Toast.makeText(getApplicationContext(),"Congratulations !",Toast.LENGTH_LONG).show();
    }
}
