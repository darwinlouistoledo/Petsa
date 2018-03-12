package me.darwinlouistoledo.petsa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by darwinlouis on 08/03/2018.
 */

public final class StringDateFormatter {
  private String fromFormat;
  private String toFormat;
  private String givenDate;
  private Locale locale = Locale.getDefault();

  StringDateFormatter() {
  }

  StringDateFormatter date(String date){
    this.givenDate = date;
    return this;
  }

  public StringDateFormatter toFormat(String format){
    this.toFormat = format;
    return this;
  }

  public StringDateFormatter fromFormat(String format){
    this.fromFormat = format;
    return this;
  }

  public StringDateFormatter locale(Locale locale){
    this.locale = locale;
    return this;
  }

  public String format() {
    SimpleDateFormat sdfFrom = new SimpleDateFormat(fromFormat, locale);

    try {
      Date date = sdfFrom.parse(givenDate);
      return new SimpleDateFormat(toFormat, locale).format(date);
    } catch (ParseException e) {
      e.printStackTrace();
    }

    throw new RuntimeException("Problem parsing the date given. Kindly make sure that the given date is same format with fromFormat.");
  }
}
