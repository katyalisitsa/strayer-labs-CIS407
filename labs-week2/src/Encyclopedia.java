public class Encyclopedia extends Book {

    private String edition;
    private int numVolumes;


    // TODO: Define mutator methods -
    //       setEdition(), setNumVolumes()
    public void setEdition(String edition) {
        this.edition = edition;
    }

    public void setNumVolumes(int numVolumes) {
        this.numVolumes = numVolumes;
    }


    // TODO: Define accessor methods -
    //       getEdition(), getNumVolumes()

    public String getEdition() {
        return this.edition;
    }

    public int getNumVolumes() {
        return this.numVolumes;
    }


    // TODO: Define a printInfo() method that overrides
    //       the printInfo in Book class
    @Override
    public void printInfo() {
        System.out.println("Book Information: ");
        System.out.println("   Book Title: " + title);
        System.out.println("   Author: " + author);
        System.out.println("   Publisher: " + publisher);
        System.out.println("   Publication Date: " + publicationDate);
        System.out.println("   Edition: " + edition);
        System.out.println("   Number of Volumes: " + numVolumes);
    }

}