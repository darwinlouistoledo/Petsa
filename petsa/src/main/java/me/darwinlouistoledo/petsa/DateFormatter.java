package me.darwinlouistoledo.petsa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by darwinlouis on 08/03/2018.
 */

public final class DateFormatter {
  private String toFormat;
  private Date givenDate;
  private Locale locale = Locale.getDefault();

  DateFormatter() {
  }

  DateFormatter date(Date givenDate){
    this.givenDate = givenDate;
    return this;
  }

  public DateFormatter toFormat(String format){
    this.toFormat = format;
    return this;
  }

  public DateFormatter locale(Locale locale){
    this.locale = locale;
    return this;
  }

  public String format() {
    return new SimpleDateFormat(toFormat, locale).format(givenDate);
  }
}
