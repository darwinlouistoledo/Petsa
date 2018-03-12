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

import java.util.Date;

/*
 * Created by darwinlouistoledo on 08/03/2018.
 */
public final class Petsa {
  //Prevent from creating this object
  private Petsa() {
  }

  /**
   * Static method that will accept a String date value. (e.g 03/19/1992).
   * Then it will format to a format pattern that provided in method {@link StringDateFormatter#toFormat(String)}.
   *
   * When using this, the {@link StringDateFormatter#fromFormat(String)} method is required as it needs to parse
   * the date string given with its format.
   *
   * @param stringDate A string date representation
   * @return
   */
  public static StringDateFormatter with(String stringDate){
    return FormatterFactory.createStringDateFormatter(stringDate);
  }

  /**
   * Static method that will accept a Date object.
   * Then it will format to a format pattern that provided in method {@link DateFormatter#toFormat(String)}.
   *
   * @param date A Date object representation
   * @return
   */
  public static DateFormatter with(Date date){
    return FormatterFactory.createDateFormatter(date);
  }

  /**
   * Static method that will accept a Long date value in milliseconds.
   * Then it will format to a format pattern that provided in method {@link MillisecondDateFormatter#toFormat(String)}.
   *
   * @param dateInMilliseconds A long value that represents the date in milliseconds
   * @return
   */
  public static MillisecondDateFormatter with(Long dateInMilliseconds){
    return FormatterFactory.createMillisecondDateFormatter(dateInMilliseconds);
  }

}
