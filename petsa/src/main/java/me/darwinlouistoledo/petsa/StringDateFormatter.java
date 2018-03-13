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
package me.darwinlouistoledo.petsa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import me.darwinlouistoledo.petsa.contracts.DateStringBuild;
import me.darwinlouistoledo.petsa.contracts.Format;

/*
 * Created by darwinlouistoledo on 08/03/2018.
 */
final class StringDateFormatter implements DateStringBuild.DateString, DateStringBuild, DateStringBuild.ToPattern, Format {
  private String fromPattern;
  private String toPattern;
  private String givenDate;
  private Locale locale = Locale.getDefault();

  StringDateFormatter() {
  }

  @Override public DateStringBuild date(String date){
    this.givenDate = date;
    return this;
  }


  @Override public ToPattern fromPattern(String pattern) {
    this.fromPattern = pattern;
    return this;
  }

  @Override public Format toPattern(String pattern) {
    this.toPattern = pattern;
    return this;
  }


  @Override public Format locale(Locale locale) {
    this.locale = locale;
    return this;
  }

  @Override public String format() {

    if (this.givenDate ==  null || this.givenDate.isEmpty())
      throw new RuntimeException("Date given cannot be null or empty.");

    if (this.toPattern ==  null || this.toPattern.isEmpty())
      throw new RuntimeException("toPattern cannot be null or empty.");

    if (this.fromPattern == null || this.fromPattern.isEmpty())
      throw new RuntimeException("fromPattern cannot be null or empty.");

    try {
      SimpleDateFormat sdfFrom = new SimpleDateFormat(fromPattern, locale);
      Date date = sdfFrom.parse(givenDate);
      return new SimpleDateFormat(toPattern, locale).format(date);
    } catch (ParseException e) {
      throw new RuntimeException(e.getMessage());
    }
  }
}
