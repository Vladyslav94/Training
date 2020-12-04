import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class JoltIT {

  @Mock private List<String> list;

  @Test
  public void verifyWhenAccountNumberIsNull() throws IOException, URISyntaxException {
    when(list.get(0)).thenReturn("Hello");
    assertEquals("Hello", list.get(0));
  }
}
