public class Pupper {

  private String mName;
  private String mBreed;
  private int mAge;
  private String mBio;

  public Pupper(String name, String breed, int age, String bio) {
    mName = name;
    mBreed = breed;
    mAge = age;
    mBio = bio;
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

  public String getBio() {
    return mBio;
  }
}
