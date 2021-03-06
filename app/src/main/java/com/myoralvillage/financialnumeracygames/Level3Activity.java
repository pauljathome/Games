/*
 * Copyright 2016, 2019 MyOralVillage
 * All Rights Reserved
 */

package com.myoralvillage.financialnumeracygames;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

public class Level3Activity extends GenericActivityGame {
    public UserSettings thisUser = new UserSettings();
    File root = new File(Environment.getExternalStorageDirectory(), "Notes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        /*
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
*/
        Intent intent = getIntent();
        getExtras(intent);
    }

    public void goToLevel3Purchase(View v) {
        Intent intent;
        intent = createIntent(Level3ActivityGamePurchase.class);
        startActivity(intent);
        finish();
    }

    public void goToLevel3Ordering(View v) {
        Intent intent = createIntent(Level3ActivityGameOrdering.class);
        startActivity(intent);
        finish();
    }

    public void goToLevel3ExactChange(View v) {
        Intent intent;
        intent = createIntent(Level3ActivityGameExactChange.class);
        startActivity(intent);
        finish();
    }

    public void setHomeButton(View v) {
        Intent intent = createIntent(GameMenuActivity.class);
        startActivity(intent);
        finish();
    }

    public void onBackPressed() {
        Intent intent = createIntent(GameMenuActivity.class);
        startActivity(intent);
        finish();
    }
}
