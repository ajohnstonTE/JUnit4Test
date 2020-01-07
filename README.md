# JUnit4Test

Compile and run with:

- Note: On Linux/MacOS, the `java -cp ...` commands should be `java -cp .:junit-4.12.jar...`, not `java -cp .;junit-4.12.jar...` (switch the leading semicolon to a colon). And on Windows, don't run these in powershell, just use cmd.

```
javac -cp junit-4.12.jar;hamcrest-core-1.3.jar ShouldRunAndPassAsExpectedNoParametersTest.java
javac -cp junit-4.12.jar;hamcrest-core-1.3.jar ShouldRunAndFailAsExpectedWithParametersTest.java
javac -cp junit-4.12.jar;hamcrest-core-1.3.jar WillNotBeLoggedAsFailingDespiteNotRunningWithParametersTest.java

java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore ShouldRunAndPassAsExpectedNoParametersTest
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore ShouldRunAndFailAsExpectedWithParametersTest
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore WillNotBeLoggedAsFailingDespiteNotRunningWithParametersTest
```

Alternately, you can run a single class that contains each (but also relies on more than the necessary parts) with:

```
javac -cp junit-4.12.jar;hamcrest-core-1.3.jar TestClass.java
java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestClass
```