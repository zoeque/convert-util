package zoeque.convertutil.application;

import java.text.ParseException;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LocalDateTimeConvertServiceTest {
  @Test
  public void givenLocalDateTime_attemptToConvert_createStringText() {
    String stringDateTime
            = LocalDateTimeConvertService
            .convertLocalDateTimeToString(LocalDateTime.of(2024, 2, 11, 0, 0), "yyyy/MM/dd");
    Assertions.assertEquals("2024/02/11", stringDateTime);
  }

  @Test
  public void givenStringDateTime_attemptToConvert_createLocalDateTimeInstance() throws ParseException {
    LocalDateTime localDateTime = LocalDateTimeConvertService.convertStringDateToLocalDateTime("2024/02/11", "yyyy/MM/dd");
    Assertions.assertEquals(LocalDateTime.of(2024, 2, 11, 0, 0), localDateTime);
  }
}
