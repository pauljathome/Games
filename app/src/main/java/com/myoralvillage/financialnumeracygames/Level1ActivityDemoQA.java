/*
 * Copyright 2016, 2019 MyOralVillage
 * All Rights Reserved
 */

package com.myoralvillage.financialnumeracygames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Level1ActivityDemoQA extends AppCompatActivity {

    private ImageButton mTrueButton;
    private ImageButton mFalseButton;
    private ImageView hImageViewPic;
    private ImageButton mFinish;

    private int currentImage = 0;
    int[] images = {R.drawable.owl0, R.drawable.owl1, R.drawable.owl2, R.drawable.owl3, R.drawable.owl4, R.drawable.owl5, R.drawable.owl6, R.drawable.owl7, R.drawable.owl8, R.drawable.owl9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_demoqa);
        startDemo();
    }


    public void startDemo() {
        hImageViewPic =  findViewById(R.id.imageView);
        mFalseButton =  findViewById(R.id.false_button);
        mTrueButton =  findViewById(R.id.true_button);
        mFinish = findViewById(R.id.finish_button);

        if (currentImage == 0) {
            mTrueButton.setVisibility(View.GONE);
        }

        mTrueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImage--;
                mFalseButton.setVisibility(View.VISIBLE);
                mTrueButton.setVisibility(View.VISIBLE);
                mFinish.setVisibility(View.VISIBLE);
                currentImage = currentImage % images.length;

                if (currentImage == 0) {
                    mTrueButton.setVisibility(View.GONE);
                }

                if (currentImage == 9) {
                    mFalseButton.setVisibility(View.GONE);
                }
                hImageViewPic.setImageResource(images[currentImage]);
            }
        });

        mFalseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentImage++;
                mTrueButton.setVisibility(View.VISIBLE);
                mFalseButton.setVisibility(View.VISIBLE);
                currentImage = currentImage % images.length;

                if (currentImage == 0) {
                    mTrueButton.setVisibility(View.GONE);
                }

                if (currentImage == 9) {
                    mFalseButton.setVisibility(View.GONE);
                }
                hImageViewPic.setImageResource(images[currentImage]);
            }
        });

        mFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void exitDemo(View v) {
        finish();
    }

}

