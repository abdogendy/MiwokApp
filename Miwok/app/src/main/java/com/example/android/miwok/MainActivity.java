/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.miwok;

import android.content.Intent;
import android.content.IntentSender;
import android.media.MediaParser;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends

        AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the numbers category
        TextView numbers = findViewById(R.id.numbers);

        // Find the View that shows the family  category
        TextView family = findViewById(R.id.family);

        // Find the View that shows the colors category
        TextView colors = findViewById(R.id.colors);

        // Find the View that shows the phrases category
        TextView phrases = findViewById(R.id.phrases);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View v) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });
        // Set a click listener on that View

        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.

            @Override
            public void onClick(View v) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
            }
        });
        // Set a click listener on that View

        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.

            @Override
            public void onClick(View v) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Set a click listener on that View

        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.

            @Override
            public void onClick(View v) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });
    }


    /**

     public void openNumbersList(View view) {
     Intent numbersIntent = new Intent(this, NumbersActivity.class);
     startActivity(numbersIntent);
     }

     public void openFamilyList(View view) {
     Intent familyIntent = new Intent(this, FamilyActivity.class);
     startActivity(familyIntent);

     }

     public void openColorsList(View view) {
     Intent colorsIntent = new Intent(this, ColorsActivity.class);
     startActivity(colorsIntent);

     }

     public void openPhrasesList(View view) {
     Intent phrasesIntent = new Intent(this, PhrasesActivity.class);
     startActivity(phrasesIntent);
     }
     **/
}
