public class Pupper {

  private String mName;
  private String mBreed;
  private int mAge;

  public Pupper(String name, String breed, int age, String bio) {
    mName = name;
    mBreed = breed;
    mAge = age;
  }

  public String getName() {
    return mName;
  }

  public String getBreed() {
    return mBreed;
  }

  public int getAge() {
    return mAge;
  }
}
