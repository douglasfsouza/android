package dg.balls;

import android.content.Context;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;

public class Level1 extends AppCompatActivity {
    ImageView i1, i2, i3, i4, i5, i6, i7, i8,i9,i10,i11,i12,i13,i14,i15;
    ImageView i16, i17, i18, i19, i20, i21, i22, i23,i24,i25,i26,i27,i28,i29,i30;
    ImageView i31, i32, i33, i34, i35, i36, i37, i38,i39,i40,i41,i42,i43,i44,i45;
    ImageView i46, i47, i48, i49, i50, i51, i52, i53,i54,i55,i56,i57,i58,i59,i60;
    ImageView i61, i62, i63, i64, i65, i66, i67, i68,i69,i70,i71,i72,i73,i74,i75;
    ImageView i76, i77, i78, i79, i80, i81, i82, i83,i84,i85,i86,i87,i88,i89,i90;

    ImageView[] imTex = {i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15,
                         i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30,
                         i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, i44, i45,
                         i46, i47, i48, i49, i50, i51, i52, i53, i54, i55, i56, i57, i58, i59, i60,
                         i61, i62, i63, i64, i65, i66, i67, i68, i69, i70, i71, i72, i73, i74, i75,
                         i76, i77, i78, i79, i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i90  };
    ImageView imp;
    boolean mblnPress;
    boolean mblnHang;
    CountDownTimer mcdTimerMain;
    CountDownTimer mcdStep;
    CountDownTimer mcdFall;
    CountDownTimer mcdHide;
    View vLevel1;
    String mstrDirection;
    long mlngMaxY;
    long mlngMaxX;
    long mlngStep;
    int mintWidth;
    int mintHeight;
    int mintSpeed = 30;
    int mintRows = 4;
    int mintCols = 15;
    int mintMinX = 999;

    int tst = 0;
    String strLastMove;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        int intId;
        imp = findViewById(R.id.imgMain);
        //imp.setY(10);
        //imp.setX(10);
        View vLevel1 = findViewById(R.id.vwLevel1);
        //mlngMaxY =  vLevel1.getHeight();




        //mlngMaxX = vLevel1.getMeasuredWidth();

       // imp.setY(imp.getY() - imp.getY());
        //imp.setLeft(0);



        /*ImageView imSave = findViewById(R.id.imTex90);
        imSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(this,"Save",Toast.LENGTH_LONG).show();
              //  Toast.makeText( this,"Save",Toast.LENGTH_LONG).show();
               // Toast.makeText(this,"pass",Toast.LENGTH_LONG).show();
            }
        });*/

        criarObjetos();

        ViewTreeObserver vto = imp.getViewTreeObserver();
        vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                                     @Override
                                     public boolean onPreDraw() {
                                         imp.getViewTreeObserver().removeOnPreDrawListener(this);
                                         mintWidth = imp.getWidth();
                                         mintHeight= imp.getHeight();

                                         return true;
                                     }

        });
        /*if(mintHeight==0)
            mintHeight = 131;

        if (mintWidth==0)
            mintWidth = 131;*/
        //mintWidth = 131;
        //mintHeight =131;//imp.getHeight();
        //mlngMaxY = mintHeight * 4;
        //mlngMaxX = mintWidth * 11;


        int nn=0;

        imTex[0].setVisibility(View.INVISIBLE);

        //chess
        /*
        for (int n = 0 ; n<90; n++){
            if (nn==0){
                nn = 1;
                imTex[n].setVisibility(View.INVISIBLE);
            }
            else{
                nn = 0;
                imTex[n].setVisibility(View.VISIBLE);
            }
        }
        */




       // for (int k = (int)imp.getY() ; k>0; k--){
       //     subir();
       //     Toast.makeText(this,"pass",Toast.LENGTH_LONG).show();
       // }

        //imTex[0].setVisibility(View.INVISIBLE);

//        Toast.makeText(this,String.valueOf(imp.getX()),Toast.LENGTH_LONG).show();
        //Toast.makeText(this,String.valueOf(mintHeight),Toast.LENGTH_LONG).show();
        //Toast.makeText(this,String.valueOf(imp.getWidth()),Toast.LENGTH_LONG).show();

        vLevel1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                mlngMaxY = mintHeight * mintRows;
                mlngMaxX = mintWidth * mintCols;


                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    //Toast.makeText(this,String.valueOf(mintHeight),Toast.LENGTH_LONG).show();
                    mstrDirection = "s";
                    if (event.getY() < imp.getY()
                            && event.getX() >= imp.getX()
                            && event.getX() <= imp.getX() + imp.getWidth())   {
                        mstrDirection = "u";//up
                    }
                    else if (event.getY() > imp.getY()
                            && event.getX() >= imp.getX()
                            && event.getX() <= imp.getX() + imp.getWidth())   {
                        mstrDirection = "d";//down
                    }
                    else if (event.getX() > imp.getX()
                            && event.getY() >= imp.getY()
                            && event.getY() <= imp.getY() + imp.getHeight())   {
                        mstrDirection = "r";//right
                    }
                    else if (event.getX() < imp.getX()
                            && event.getY() >= imp.getY()
                            && event.getY() <= imp.getY() + imp.getHeight())   {
                        mstrDirection = "l";//left
                    }
                    if (mstrDirection != "s"){
                        //mlngStep = 1;
                        moveMain();
                     //   Cair();
                    }
                }
                else if (event.getAction()== MotionEvent.ACTION_UP){
                    if (mstrDirection != "s") {
                        mcdTimerMain.cancel();
                        mcdStep.cancel();
                        enquadrar();

                        mlngStep = 20;
                    }
                }
                return true;
            }
        });
    }
    private void enquadrar(){
        if (mstrDirection == "r"){
            int intGetx =(int) imp.getX();
            for(int r = 1;r < mintCols + 1; r++){
                if(intGetx < mintWidth * r ){
                    imp.setX(mintWidth * r);
                    hideNext();
                    break;
                }
            }
        }
        else if (mstrDirection == "l"){
            int intGetx =(int) imp.getX();
            for(int r = mintCols;r >0; r--){
                if(intGetx > mintWidth * r ){
                    imp.setX(mintWidth * r);
                    hideNext();
                    break;
                }
            }
        }
        else if (mstrDirection == "d"){
            int intGety =(int) imp.getY();
            for(int r = 1;r < mintRows + 1; r++){
                if(intGety < mintHeight * r ){
                    imp.setY(mintHeight * r);
                    hideNext();
                    break;
                }
            }
        }
        else if (mstrDirection == "u"){
            int intGety =(int) imp.getY();
            for(int r = mintRows;r >= 0; r--){
                if(intGety > mintHeight * r ){
                    imp.setY(mintHeight * r);
                    hideNext();
                    break;
                }
            }
        }
    }

    private void moveMain(){
        mcdTimerMain = new CountDownTimer(10000,20) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (mstrDirection == "u"){
                    mlngStep = 1;
                    subir();
                }
                if (mstrDirection == "d"){
                    mlngStep = 1;
                    descer();
                }
                if (mstrDirection == "r"){
                    mlngStep = 1;
                    direita();

                }
                if (mstrDirection == "l"){
                    mlngStep = 1;
                    esquerda();
                }
                if(mstrDirection != "s") {
                    //hideNext();
                    cair();
                }


            }
            @Override
            public void onFinish() {

            }
        }.start();
    }

    private void cair(){
        mcdFall = new CountDownTimer(10000,200) {
            @Override
            public void onTick(long millisUntilFinished) {
                for(int i =0; i<89; i++){
                    if (i==21){//first ball
                        if (imTex[i].getY() < mlngMaxY){
                            if (imTex[i].getY() < limiteCair(i)) {
                                if (imTex[i + mintCols].getVisibility() == View.INVISIBLE) {
                                    imTex[i].setY(imTex[i].getY() + mintSpeed);
                                }
                            }else
                                if (limiteCair(i) != 0)
                                    imTex[i].setY(limiteCair(i));
                        }
                        else
                            imTex[i].setY((float)mlngMaxY);
                    }
                }
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    private void subir(){
       mcdStep = new CountDownTimer(1000,200) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (imp.getY() > 0) {
                    if (mlngStep>11)
                        mlngStep = 11;
                    if (mlngStep++ <= 10) {
                        if (mstrDirection=="u") {
                            imp.setY(imp.getY() - mintSpeed);
                            hideNext();
                        }
                    }
                }
                else
                    imp.setY(0);
            }

            @Override
            public void onFinish () {
                // mlngStep = 0;
            }
        }.start();
    }

    private void descer(){
            String stra = "(" + String.valueOf(imTex[0].getX()) + ")" + "(" + String.valueOf(imTex[1].getX()) + ")"  + "(" + String.valueOf(imTex[2].getX()) + ")";
            stra = String.valueOf(  Math.floorMod(300,150));
            stra = String.valueOf(imp.getY());
            //String strMaxx = String.valueOf(vLevel1.getMeasuredWidth());
            //Toast.makeText(this,strMaxx,Toast.LENGTH_LONG).show();

        if(   imp.getX() == imTex[84].getX()
           && imp.getY() >= imTex[84].getY() - mintHeight ){
            stra = "Open";
            Abrir();
            //Toast.makeText(this,stra,Toast.LENGTH_LONG).show();
            //Toast.makeText(this,String.valueOf(mintHeight),Toast.LENGTH_LONG).show();

        }
        else if(imp.getX() == imTex[85].getX()
             && imp.getY()>=imTex[85].getY()-mintHeight ){
            Salvar();

        }
        else {

            mcdStep = new CountDownTimer(1000, 200) {
                @Override
                public void onTick(long millisUntilFinished) {
                    if (imp.getY() <= mlngMaxY) {
                        if (mlngStep > 11)
                            mlngStep = 11;
                        if (mlngStep++ <= 10) {
                            if (mstrDirection == "d") {
                                imp.setY(imp.getY() + mintSpeed);
                                hideNext();
                            }
                        }
                    }
                    else
                        imp.setY(mlngMaxY);
                }

                @Override
                public void onFinish() {
                    // mlngStep = 0;
                }
            }.start();
        }
    }

    private void direita(){
        mcdStep = new CountDownTimer(1000,200) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (imp.getX() < mlngMaxX) {
                   // imp.setX(imp.getX() + mintWidth);

                    if (mlngStep>11)
                        mlngStep =11;
                    if (mlngStep++ <= 10) {
                        if (mstrDirection=="r") {

                            imp.setX(imp.getX() + mintSpeed);
                            hideNext();
                        }
                    }
                }
                else{
                    imp.setX(mlngMaxX);
                };

            }

            @Override
            public void onFinish () {
               // mlngStep = 0;
            }
        }.start();
    }

    private void esquerda(){
        mcdStep = new CountDownTimer(1000,200) {
            @Override
            public void onTick(long millisUntilFinished) {
                if (imp.getX() > mintMinX) {
                    if (mlngStep>11)
                        mlngStep = 11;
                    if (mlngStep++ <= 10) {
                        if (mstrDirection=="l") {

                            imp.setX(imp.getX() - mintSpeed);
                            hideNext();
                        }
                    }
                }
                else{
                    imp.setX(mintMinX);
                }
            }

            @Override
            public void onFinish () {
                // mlngStep = 0;
            }
        }.start();
    }


    private void hideNext(){
        for(int i =0;i<90;i++){
            if (mstrDirection == "r" ){
                if(imTex[i].getY() == imp.getY()){
                    if(imp.getX()>=imTex[i].getX() && imp.getX()<=imTex[i].getX()+ mintWidth){
                        if(imTex[i].getX()<=(float)mlngMaxX ) {
                            if (i!=21) {
                                imTex[i].setVisibility(View.INVISIBLE);
                            }
                        }
                    }
                }
            }
            else if(mstrDirection =="l"){
                if(imTex[i].getY() == imp.getY()){
                    //if(imTex[i].getX()<=imp.getX() && imTex[i].getX()>= imp.getX()-imp.getWidth()){
                    if(imp.getX() >= imTex[i].getX()-mintWidth && imp.getX() <= imTex[i].getX() ){
                        if(i!=21) {
                            imTex[i].setVisibility(View.INVISIBLE);
                        }
                    }
                }
            }
            else if (mstrDirection == "u"){
                if(imTex[i].getX() >= imp.getX()-2 && imTex[i].getX()<= imp.getX()+2){
                     if(imp.getY() >= imTex[i].getY() - mintHeight && imp.getY() <= imTex[i].getY() ) {
                        if(i!=21) {
                            imTex[i].setVisibility(View.INVISIBLE);
                        }
                    }
                }
            }
            else if(mstrDirection=="d"){
                if(imTex[i].getX() == imp.getX()){
                    if (imp.getY() >= imTex[i].getY() && imp.getY() <= imTex[i].getY() + mintHeight){
                        if(imTex[i].getY() <= mlngMaxY) {
                            if(i!=21) {
                                imTex[i].setVisibility(View.INVISIBLE);
                            }
                            //Mensagens
                            //Toast.makeText(this,String.valueOf(  mlngMaxY * 5),Toast.LENGTH_LONG).show();
                            Toast.makeText(this,"wid:" + String.valueOf( imp.getY()),Toast.LENGTH_LONG).show();
                            //Toast.makeText(this,"hei:" + String.valueOf(mintHeight),Toast.LENGTH_LONG).show();
                        }
                    }
                }
            }
        }
    }

    private long limiteCair(int i){

        long lngRet = 0;

        if (imp.getX() >= imTex[i].getX() && imp.getX()<= imTex[i].getX()+ imTex[i].getWidth()
                                          && imp.getY() >= imTex[i].getY() - mintHeight
                                          && imp.getY() <= imTex[i].getY() + mintHeight)
            lngRet = 0;

        else {
            if (imTex[i + mintCols].getVisibility() == View.INVISIBLE) {
                //lngRet = mintHeight * 2;
                lngRet =(long) imTex[i + mintCols].getY();

                if (imTex[i + mintCols * 2].getVisibility() == View.INVISIBLE) {
                    //lngRet = mintHeight * 3;
                    lngRet =(long) imTex[i + mintCols * 2].getY();
                    if (imTex[i + mintCols * 3].getVisibility() == View.INVISIBLE) {
                        //lngRet = (long) imTex[i].getY() + mintHeight * 2;
                        //lngRet = mintHeight * 4;
                        lngRet =(long) imTex[i + mintCols * 3].getY();
                        if (imTex[i + mintCols * 4].getVisibility() == View.INVISIBLE) {
                            //lngRet =  mintHeight * 5;
                            lngRet =(long) imTex[i + mintCols * 4].getY();
                        }
                    }
                }
            }
        }
        return lngRet;
    }

    private void criarObjetos(){
        imTex[0] = findViewById(R.id.imTex1);
        int intId = imTex[0].getId();

        imTex[1] = findViewById(R.id.imTex2);
        imTex[2] = findViewById(R.id.imTex3);
        imTex[3] = findViewById(R.id.imTex4);
        imTex[4] = findViewById(R.id.imTex5);
        imTex[5] = findViewById(R.id.imTex6);
        imTex[6] = findViewById(R.id.imTex7);
        imTex[7] = findViewById(R.id.imTex8);
        imTex[8] = findViewById(R.id.imTex9);
        imTex[9] = findViewById(R.id.imTex10);

        imTex[10] = findViewById(R.id.imTex11);
        imTex[11] = findViewById(R.id.imTex12);
        imTex[12] = findViewById(R.id.imTex13);
        imTex[13] = findViewById(R.id.imTex14);
        imTex[14] = findViewById(R.id.imTex15);
        imTex[15] = findViewById(R.id.imTex16);
        imTex[16] = findViewById(R.id.imTex17);
        imTex[17] = findViewById(R.id.imTex18);
        imTex[18] = findViewById(R.id.imTex19);
        imTex[19] = findViewById(R.id.imTex20);

        imTex[20] = findViewById(R.id.imTex21);
        imTex[21] = findViewById(R.id.imTex22);
        imTex[22] = findViewById(R.id.imTex23);
        imTex[23] = findViewById(R.id.imTex24);
        imTex[24] = findViewById(R.id.imTex25);
        imTex[25] = findViewById(R.id.imTex26);
        imTex[26] = findViewById(R.id.imTex27);
        imTex[27] = findViewById(R.id.imTex28);
        imTex[28] = findViewById(R.id.imTex29);
        imTex[29] = findViewById(R.id.imTex30);

        imTex[30] = findViewById(R.id.imTex31);
        imTex[31] = findViewById(R.id.imTex32);
        imTex[32] = findViewById(R.id.imTex33);
        imTex[33] = findViewById(R.id.imTex34);
        imTex[34] = findViewById(R.id.imTex35);
        imTex[35] = findViewById(R.id.imTex36);
        imTex[36] = findViewById(R.id.imTex37);
        imTex[37] = findViewById(R.id.imTex38);
        imTex[38] = findViewById(R.id.imTex39);
        imTex[39] = findViewById(R.id.imTex40);

        imTex[40] = findViewById(R.id.imTex41);
        imTex[41] = findViewById(R.id.imTex42);
        imTex[42] = findViewById(R.id.imTex43);
        imTex[43] = findViewById(R.id.imTex44);
        imTex[44] = findViewById(R.id.imTex45);
        imTex[45] = findViewById(R.id.imTex46);
        imTex[46] = findViewById(R.id.imTex47);
        imTex[47] = findViewById(R.id.imTex48);
        imTex[48] = findViewById(R.id.imTex49);
        imTex[49] = findViewById(R.id.imTex50);

        imTex[50] = findViewById(R.id.imTex51);
        imTex[51] = findViewById(R.id.imTex52);
        imTex[52] = findViewById(R.id.imTex53);
        imTex[53] = findViewById(R.id.imTex54);
        imTex[54] = findViewById(R.id.imTex55);
        imTex[55] = findViewById(R.id.imTex56);
        imTex[56] = findViewById(R.id.imTex57);
        imTex[57] = findViewById(R.id.imTex58);
        imTex[58] = findViewById(R.id.imTex59);
        imTex[59] = findViewById(R.id.imTex60);

        imTex[60] = findViewById(R.id.imTex61);
        imTex[61] = findViewById(R.id.imTex62);
        imTex[62] = findViewById(R.id.imTex63);
        imTex[63] = findViewById(R.id.imTex64);
        imTex[64] = findViewById(R.id.imTex65);
        imTex[65] = findViewById(R.id.imTex66);
        imTex[66] = findViewById(R.id.imTex67);
        imTex[67] = findViewById(R.id.imTex68);
        imTex[68] = findViewById(R.id.imTex69);
        imTex[69] = findViewById(R.id.imTex70);

        imTex[70] = findViewById(R.id.imTex71);
        imTex[71] = findViewById(R.id.imTex72);
        imTex[72] = findViewById(R.id.imTex73);
        imTex[73] = findViewById(R.id.imTex74);
        imTex[74] = findViewById(R.id.imTex75);
        imTex[75] = findViewById(R.id.imTex76);
        imTex[76] = findViewById(R.id.imTex77);
        imTex[77] = findViewById(R.id.imTex78);
        imTex[78] = findViewById(R.id.imTex79);
        imTex[79] = findViewById(R.id.imTex80);
        imTex[80] = findViewById(R.id.imTex81);

        imTex[81] = findViewById(R.id.imTex82);
        imTex[82] = findViewById(R.id.imTex83);
        imTex[83] = findViewById(R.id.imTex84);
        imTex[84] = findViewById(R.id.imTex85);
        imTex[85] = findViewById(R.id.imTex86);
        imTex[86] = findViewById(R.id.imTex87);
        imTex[87] = findViewById(R.id.imTex88);
        imTex[88] = findViewById(R.id.imTex89);
        imTex[89] = findViewById(R.id.imTex90);

       for(int i = 1;i<89;i++){
            if (imTex[i].getX()< mintMinX)
                mintMinX =(int) imTex[i].getX();
        }
    }
    private void Salvar() {
        FileOutputStream fos;


        String FILENAME = "L1";
        String strVis;
        strVis = "";

        for(int i =0 ;i<89; i++){
            if(imTex[i].getVisibility()== View.VISIBLE)
                strVis += "1;";
            else
                strVis += "0;";
        }

        try {
            fos = openFileOutput(FILENAME, Context.MODE_PRIVATE);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            fos.write(strVis.getBytes());
            fos.close();
        }
        catch (IOException e){
            throw  new RuntimeException( e);
        }
        Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show();
    }
    private void Abrir() {
        FileInputStream fis;
        String strVis;
        int intTamanho;

        File f = getFileStreamPath("L1");

        if(f.exists()) {

            try {
                fis = openFileInput("L1");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            try {
                intTamanho = fis.available();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            byte bytes[] = new byte[intTamanho];

            try {
                fis.read(bytes);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            strVis = new String(bytes);
            int intT = strVis.length();
            //Toast.makeText(this,strVis,Toast.LENGTH_LONG).show();
            //Toast.makeText(this, String.valueOf(intT),Toast.LENGTH_LONG).show();

            int b = 0;
/*
        for (int i = 0; i < strVis.length()-1; i++) {
            if (b==0 )
                Toast.makeText(this,strVis.substring(i,i+1),Toast.LENGTH_LONG).show();

        }
*/
       /* int i =0;
        while(b < 10){
            if (strVis.substring(i, i+1) == ";")
                b++;
            else {
                if (strVis.substring(i, i + 1) == "0")
                    imTex[b].setVisibility(View.INVISIBLE);
                else
                    imTex[b].setVisibility(View.VISIBLE);
            }
            i++;
        }
        */

            for (int i = 0; i < intT; i++) {
                if (strVis.substring(i, i + 1).compareTo(";") == 0)
                    b++;
                else {
                    if (strVis.substring(i, i + 1).compareTo("0") == 0)
                        imTex[b].setVisibility(View.INVISIBLE);
                    else
                        imTex[b].setVisibility(View.VISIBLE);
                }
            }
            Toast.makeText(this, String.valueOf(b), Toast.LENGTH_LONG).show();


        }
        else
            Toast.makeText(this,"Not saved yet",Toast.LENGTH_LONG).show();
    }

}
