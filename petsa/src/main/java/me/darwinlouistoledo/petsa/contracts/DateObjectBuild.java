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
package me.darwinlouistoledo.petsa.contracts;

import java.util.Date;
import me.darwinlouistoledo.petsa.constants.DateTimePatterns;

/*
 * Created by darwinlouistoledo on 13/03/2018.
 */
public interface DateObjectBuild {
  /**
   * A method that accepts a string pattern in which the date
   * will be formatted and displayed according to it.
   *
   * @param pattern A string format that you desire.
   * @return Will return an implementation of {@link Format}
   */
  Format toPattern(String pattern);

  /**
   * A method that accepts a string pattern in which the date
   * will be formatted and displayed according to it.
   *
   * @param pattern {@link DateTimePatterns} A predefine pattern that you can use.
   * @return Will return an implementation of {@link Format}
   */
  Format toPattern(DateTimePatterns pattern);

  interface DateObject {
    /**
     * It will accept a {@link Date} object that will going to format.
     *
     * @param date The given date that will be formatted
     * @return Will return an implementation of {@link DateObjectBuild}
     */
    DateObjectBuild date(Date date);
  }
}
