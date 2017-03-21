public class Pupper {

  private String mName;
  private String mBreed;
  private String mAge;
  private String mBio;
  private String mImgDirectory;

  public Pupper(String name, String breed, String age, String bio, String directory) {
    mName = name;
    mBreed = breed;
    mAge = age;
    mBio = bio;
    mImgDirectory = directory;
  }

  public String getName() {
    return mName;
  }

  public String getBreed() {
    return mBreed;
  }

  public String getAge() {
    return mAge;
  }

  public String getBio() {
    return mBio;
  }

  public String getImgDirectory() {
    return mImgDirectory;
  }
}
