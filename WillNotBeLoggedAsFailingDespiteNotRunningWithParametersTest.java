import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class WillNotBeLoggedAsFailingDespiteNotRunningWithParametersTest {
  @Parameterized.Parameters
  public static List<Object[]> throwException() {
    if (true) throw new RuntimeException();
    return Collections.singletonList(new Object[]{});
  }

  @Test
  public void willNotBeLoggedAsFailingDespiteNotRunning() {

  }
}
