package me.darwinlouistoledo.petsa;

import java.util.Date;

/**
 * Created by darwinlouis on 08/03/2018.
 */

public final class Petsa {
  //Prevent from creating this object
  private Petsa() {
  }

  public static StringDateFormatter with(String stringDate){
    return FormatterFactory.createStringDateFormatter(stringDate);
  }

  public static DateFormatter with(Date date){
    return FormatterFactory.createDateFormatter(date);
  }

  public static MillisecondDateFormatter with(Long dateInMilliseconds){
    return FormatterFactory.createMillisecondDateFormatter(dateInMilliseconds);
  }

}
