package zoeque.convertutil.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * The convert class for {@link LocalDateTime}.
 */
public class LocalDateTimeConvertService {
  /**
   * The method provides the conversion process from String date time to LocalDateTime instance.
   *
   * @param date   The date with String value.
   * @param format The format of given date, for example, yyyy/MM/dd.
   * @return The converted LocalDateTime instance.
   * @throws ParseException
   */
  public static LocalDateTime convertStringDateToLocalDateTime(String date, String format) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    Date formatDate = sdf.parse(date);
    return LocalDateTime.ofInstant(formatDate.toInstant(), ZoneId.systemDefault());
  }

  /**
   * The method provides the conversion process from LocalDateTime to String instance.
   *
   * @param localDateTime The LocalDateTime instance.
   * @param format        The converted pattern you want.
   * @return The converted String date time.
   */
  public static String convertLocalDateTimeToString(LocalDateTime localDateTime, String format) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
    return localDateTime.format(formatter);
  }
}
