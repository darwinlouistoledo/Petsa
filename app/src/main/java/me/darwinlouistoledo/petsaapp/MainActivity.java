/*
 * MIT License
 *
 * Copyright (c) 2018 Darwin Louis Toledo
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package me.darwinlouistoledo.petsaapp;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Date;
import java.util.Locale;
import me.darwinlouistoledo.petsa.Petsa;
import me.darwinlouistoledo.petsa.constants.DateTimePatterns;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern("MM/dd/yyyy")
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.COMPLETE_LONG_DATE_1)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.COMPLETE_LONG_DATE_2)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.COMPLETE_SHORT_DATE_1)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.COMPLETE_SHORT_DATE_2)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.LONG_DATE_1)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.LONG_DATE_2)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.LONG_DATE_3)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.LONG_DATE_4)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.MEDIUM_DATE_1)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.MEDIUM_DATE_2)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.MEDIUM_DATE_3)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.MEDIUM_DATE_4)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.SHORT_DATE_1)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.SHORT_DATE_2)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.TIME_12H)
            .format());

    Log.d("PETSA: Object",
        Petsa.with(new Date())
            .toPattern(DateTimePatterns.TIME_24H)
            .format());

    Log.d("PETSA: Millis",
        Petsa.with(System.currentTimeMillis())
            .toPattern("dd/MM/yyyy HH:mm")
            .format());

    Log.d("PETSA: Millis",
        Petsa.with(System.currentTimeMillis())
            .toPattern(DateTimePatterns.LONG_DATE_1)
            .format());

    Log.d("PETSA: String",
        Petsa.with("03/09/2020")
            .fromPattern("MM/dd/yyyy")
            .toPattern("MMMM dd, yyyy")
            .format());

    Log.d("PETSA: String",
        Petsa.with("03/09/2020")
            .fromPattern(DateTimePatterns.MEDIUM_DATE_1)
            .toPattern(DateTimePatterns.LONG_DATE_2)
            .format());

    Log.d("PETSA: Millis",
        Petsa.with(System.currentTimeMillis())
            .toPattern("hh:mm aa")
            .format());

    Log.d("PETSA: Millis",
        Petsa.with(System.currentTimeMillis())
            .toPattern("MMMM dd, yyyy hh:mm aa")
            .locale(Locale.JAPAN)
            .format());

  }
}
