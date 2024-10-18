package com.studio.dg.memory;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class Level1Activity extends AppCompatActivity {
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

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
