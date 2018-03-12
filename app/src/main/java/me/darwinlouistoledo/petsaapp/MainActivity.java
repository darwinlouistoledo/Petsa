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
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import java.util.Date;
import java.util.Locale;
import me.darwinlouistoledo.petsa.Petsa;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Log.d("PETSA",
        Petsa.with(new Date())
            .toFormat("MM/dd/yyyy").format());

    Log.d("PETSA",
        Petsa.with(System.currentTimeMillis())
            .toFormat("dd/MM/yyyy HH:mm")
            .format());

    Log.d("PETSA",
        Petsa.with("03/09/2018")
            .fromFormat("MM/dd/yyyy")
            .toFormat("MMMM dd, yyyy")
            .format());

    Log.d("PETSA",
        Petsa.with(System.currentTimeMillis())
            .toFormat("hh:mm aa")
            .format());

    Log.d("PETSA",
        Petsa.with(System.currentTimeMillis())
            .toFormat("MMMM dd, yyyy hh:mm aa")
            .locale(Locale.JAPAN)
            .format());

  }
}
