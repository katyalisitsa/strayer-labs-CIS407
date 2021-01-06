public class Dog extends Pet {

    public Dog(String petName, int petAge, String dogBreed) {
        super(petName, petAge);
        this.dogBreed = dogBreed;
    }

    public Dog() {

    }


    public Dog(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    private String dogBreed;

    public void setBreed(String userBreed) {
        dogBreed = userBreed;
    }

    public String getBreed() {
        return dogBreed;
    }
}
