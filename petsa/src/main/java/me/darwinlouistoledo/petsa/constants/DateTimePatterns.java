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
package me.darwinlouistoledo.petsa.constants;

public enum DateTimePatterns {
  /**
   * Value of this is <b>MMMM dd, yyyy hh:mm aa</b>
   *
   * Example: January 01, 2020 12:00 PM
   */
  COMPLETE_LONG_DATE_1 {
    @Override public String value() {
      return "MMMM dd, yyyy hh:mm aa";
    }
  },

  /**
   * Value of this is <b>MMMM dd, yyyy HH:mm</b>
   *
   * Example: January 01, 2020 23:59
   */
  COMPLETE_LONG_DATE_2 {
    @Override public String value() {
      return "MMMM dd, yyyy HH:mm";
    }
  },

  /**
   * Value of this is <b>MMM dd, yyyy HH:mm</b>
   *
   * Example: Jan 01, 2020 23:59
   */
  COMPLETE_SHORT_DATE_1 {
    @Override public String value() {
      return "MMM dd, yyyy HH:mm";
    }
  },

  /**
   * Value of this is <b>MMM dd, yyyy hh:mm aa</b>
   *
   * Example: Jan 01, 2020 12:00 PM
   */
  COMPLETE_SHORT_DATE_2 {
    @Override public String value() {
      return "MMM dd, yyyy hh:mm aa";
    }
  },

  /**
   * Value of this is <b>dd/MM/yyyy HH:mm</b>
   *
   * Example: 01/01/2020 12:00
   */
  LONG_DATE_1 {
    @Override public String value() {
      return "dd/MM/yyyy HH:mm";
    }
  },

  /**
   * Value of this is <b>MMMM dd, yyyy</b>
   *
   * Example: January 01, 2020
   */
  LONG_DATE_2 {
    @Override public String value() {
      return "MMMM dd, yyyy";
    }
  },

  /**
   * Value of this is <b>dd/MM/yyyy hh:mm aa</b>
   *
   * Example: 01/01/2020 12:00 PM
   */
  LONG_DATE_3 {
    @Override public String value() {
      return "dd/MM/yyyy hh:mm aa";
    }
  },

  /**
   * Value of this is <b>MMM dd, yyyy</b>
   *
   * Example: Jan 01, 2020
   */
  LONG_DATE_4 {
    @Override public String value() {
      return "MMM dd, yyyy";
    }
  },

  /**
   * Value of this is <b>MM/dd/yyyy</b>
   *
   * Example: 01/01/2020
   */
  MEDIUM_DATE_1 {
    @Override public String value() {
      return "MM/dd/yyyy";
    }
  },

  /**
   * Value of this is <b>dd/MM/yyyy</b>
   *
   * Example: 01/01/2020
   */
  MEDIUM_DATE_2 {
    @Override public String value() {
      return "dd/MM/yyyy";
    }
  },

  /**
   * Value of this is <b>dd-MM-yyyy</b>
   *
   * Example: 01/01/2020
   */
  MEDIUM_DATE_3 {
    @Override public String value() {
      return "dd-MM-yyyy";
    }
  },

  /**
   * Value of this is <b>MM-dd-yyyy</b>
   *
   * Example: 01/01/2020
   */
  MEDIUM_DATE_4 {
    @Override public String value() {
      return "MM-dd-yyyy";
    }
  },

  /**
   * Value of this is <b>dd/MM/yy</b>
   *
   * Example: 01/01/20
   */
  SHORT_DATE_1 {
    @Override public String value() {
      return "dd/MM/yy";
    }
  },

  /**
   * Value of this is <b>MM/dd/yy</b>
   *
   * Example: 01/01/20
   */
  SHORT_DATE_2 {
    @Override public String value() {
      return "MM/dd/yy";
    }
  },

  /**
   * Value of this is <b>HH:mm</b>
   *
   * Example: 23:59
   */
  TIME_24H {
    @Override public String value() {
      return "HH:mm";
    }
  },

  /**
   * Value of this is <b>hh:mm aa</b>
   *
   * Example: 12:00 PM
   */
  TIME_12H {
    @Override public String value() {
      return "hh:mm aa";
    }
  };

  abstract public String value();
}
