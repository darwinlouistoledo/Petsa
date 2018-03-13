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

import java.util.Locale;

/*
 * Created by darwinlouistoledo on 13/03/2018.
 */
public interface Format {
  /**
   * A method that accepts a {@link Locale} in which the date will be
   * formatted and displayed according to it.
   *
   * If not set, the default {@link Locale#getDefault()} will be use.
   *
   * @param locale The locale of the date to be formatted and displayed
   * @return Will return an implementation of {@link Format}
   */
  Format locale(Locale locale);

  /**
   * You need to call this at the end in order to get the
   * result of the formatted date.
   *
   * @return A string formatted date.
   */
  String format();
}
