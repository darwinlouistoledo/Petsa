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

import me.darwinlouistoledo.petsa.constants.DateTimePatterns;

/*
 * Created by darwinlouistoledo on 13/03/2018.
 */
public interface DateStringBuild {
  /**
   * A method that accepts a string pattern in which the date
   * given is currently formatted. This is a required method
   * when String date is given.
   *
   * @param pattern A string pattern that you desire.
   * @return Will return an implementation of {@link ToPattern}
   */
  ToPattern fromPattern(String pattern);

  /**
   * A method that accepts a string pattern in which the date
   * given is currently formatted. This is a required method
   * when String date is given.
   *
   * @param pattern {@link DateTimePatterns} A predefine pattern that you can use.
   * @return Will return an implementation of {@link ToPattern}
   */
  ToPattern fromPattern(DateTimePatterns pattern);

  interface DateString {
    /**
     * It will accept a {@link String} object that will going to format.
     *
     * @param date The given date that will be formatted
     * @return Will return an implementation of {@link DateStringBuild}
     */
    DateStringBuild date(String date);
  }

  interface ToPattern{
    /**
     * A method that accepts a string pattern in which the date
     * will be formatted and displayed according to it.
     *
     * @param pattern A string pattern that you desire.
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
  }
}
