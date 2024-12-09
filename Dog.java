public class Dog
{
    //ATTRIBUTES
    private String breed;
    private Double size;
    private String furColor;

    public Dog(String breed, double size, String furColor){
        this.breed = breed;
        this.size = size;
        this.furColor = furColor;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public void setSize(double newSize){
        size = newSize;
    }

    public void setFurColor(String newFurColor){
        furColor = newFurColor;
    }

    public String getBreed(){
        return breed;
    }




}
