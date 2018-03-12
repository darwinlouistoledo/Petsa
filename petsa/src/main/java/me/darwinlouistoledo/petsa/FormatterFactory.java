package me.darwinlouistoledo.petsa;

import java.util.Date;

/**
 * Created by darwinlouis on 09/03/2018.
 */

final class FormatterFactory {
  static DateFormatter createDateFormatter(Date date){
    return new DateFormatter().date(date);
  }

  static StringDateFormatter createStringDateFormatter(String date){
    return new StringDateFormatter().date(date);
  }

  static MillisecondDateFormatter createMillisecondDateFormatter(Long dateInMillis){
    return new MillisecondDateFormatter().date(dateInMillis);
  }
}
