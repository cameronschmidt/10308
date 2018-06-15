package example;

public class HelloWorld {

  public int coveredByUnitTest() {
    System.out.println("coveredByUnitTest1");
    System.out.println("coveredByUnitTest2");
    // TODO: fix this line!
    System.out.println("coveredByUnitTest3");
    // TODO: also fix this line!
    System.out.println("coveredByUnitTest4");
    return 0;
  }

  public void coveredByIntegrationTest() {
    System.out.println("coveredByIntegrationTest1");
    System.out.println("coveredByIntegrationTest2");
    System.out.println("coveredByIntegrationTest3");
  }

  public void notCovered(String str) {
    System.out.println("notCovered");
  }

}
