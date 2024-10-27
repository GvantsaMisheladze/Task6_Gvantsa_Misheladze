public class Dog extends Mammal{
    private String breed;
    public Dog(String species, String diet, String breed){
        super(species, diet);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void details(){
        System.out.println("Species: " + getSpecies());
        System.out.println("Diet: " + getDiet());
        System.out.println("Breed: " + getBreed());
    }
}
