public class Artwork{
    // TODO: Declare private fields - title, yearCreated
    private String title;
    private int yearCreated;

    // TODO: Declare private field artist of type Artist
    private Artist artist;

    // TODO: Define default constructor

    public Artwork() {
    }


    // TODO: Define get methods: getTitle(), getYearCreated()

    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public Artist getArtist() {
        return artist;
    }


    // TODO: Define second constructor to initialize
    //       private fields (title, yearCreated, artist)

    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }


    // TODO: Define printInfo() method

    public void printInfo() {
        System.out.println("Title: " + getTitle() + ", " + getYearCreated());

    }

}

