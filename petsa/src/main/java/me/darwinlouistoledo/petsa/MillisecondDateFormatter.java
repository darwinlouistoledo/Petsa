package me.darwinlouistoledo.petsa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by darwinlouis on 08/03/2018.
 */

public final class MillisecondDateFormatter {
  private String toFormat;
  private Long givenDate;
  private Locale locale = Locale.getDefault();

  MillisecondDateFormatter() {
  }

  MillisecondDateFormatter date(Long givenDate){
    this.givenDate = givenDate;
    return this;
  }

  public MillisecondDateFormatter toFormat(String format){
    this.toFormat = format;
    return this;
  }

  public MillisecondDateFormatter locale(Locale locale){
    this.locale = locale;
    return this;
  }

  public String format() {
    Date date = new Date(givenDate);
    return new SimpleDateFormat(toFormat, locale).format(date);
  }
}
