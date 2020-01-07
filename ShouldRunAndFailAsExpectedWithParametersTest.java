import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;

public class ShouldRunAndFailAsExpectedWithParametersTest {

  @Parameterized.Parameters
  public static List<Object[]> nothing() {
    return Collections.singletonList(new Object[]{});
  }

  @Test
  public void test() {
    Assert.fail();
  }
}
