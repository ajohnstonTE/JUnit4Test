import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Enclosed.class)
public class TestClass {
  public static class ShouldRunAndPassAsExpectedNoParametersTest {
    @Test
    public void test() {

    }
  }

  @RunWith(Parameterized.class)
  public static class ShouldRunAndFailAsExpectedWithParametersTest {

    @Parameterized.Parameters
    public static List<Object[]> nothing() {
      return Collections.singletonList(new Object[]{});
    }

    @Test
    public void test() {
      Assert.fail();
    }
  }

  @RunWith(Parameterized.class)
  public static class WillNotBeLoggedAsFailingDespiteNotRunningWithParametersTest {
    @Parameterized.Parameters
    public static List<Object[]> throwException() {
      if (true) throw new RuntimeException();
      return Collections.singletonList(new Object[]{});
    }

    @Test
    public void willNotBeLoggedAsFailingDespiteNotRunning() {

    }
  }
}
