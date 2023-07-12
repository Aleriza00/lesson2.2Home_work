public class Main {
    public static void main(String[] args) {

        Parrot parrot= new Parrot();
        parrot.setName("Jako");
        parrot.setAge(30);
        parrot.setInhabit("West Africa:Ghana ");
        parrot.setNutrition("fruits");
        parrot.setColor("gray");

        Parrot parrot2= new Parrot();
        parrot2.setName("Rio");
        parrot2.setAge(23);
        parrot2.setInhabit("West Africa: Guinea ");
        parrot2.setNutrition("leaves");
        parrot2.setColor("blue");
        System.out.println("Parrots");
        System.out.println("Name: "+parrot.getName()+"\nAge: "+parrot.getAge()+"\nInhabit: "+parrot.getInhabit()+"\nNutrition: "+parrot.getNutrition()+"\nColor: "+parrot.getColor());
        System.out.println(" ");
        System.out.println("Name: "+parrot2.getName()+"\nAge: "+parrot2.getAge()+"\nInhabit: "+parrot2.getInhabit()+"\nNutrition: "+parrot2.getNutrition()+"\nColor: "+parrot2.getColor());


        Cat cat= new Cat();
        cat.setName("Sofiya");
        cat.setAge(8);
        cat.setBabies(3);
        cat.setEats("milk");

        Cat cat2= new Cat();
        cat2.setName("Maya");
        cat2.setAge(10);
        cat2.setBabies(0);
        cat2.setEats("fish");
        System.out.println(" "+"\nCats");
        System.out.println("Name: "+cat.getName()+"\nAge: "+cat.getAge()+"\nBabies: "+cat.getBabies()+"\nEats: "+cat.getEats());
        System.out.println(" ");
        System.out.println("Name: "+cat2.getName()+"\nAge: "+cat2.getAge()+"\nBabies: "+cat2.getBabies()+"\nEats: "+cat2.getEats());

        Dog dog=  new Dog();
        dog.setName("Nik");
        dog.setAge(5);
        dog.setFeed("meal,fish,rice");
        dog.setFavoriteToy("Toy carrot");

        Dog dog2=  new Dog();
        dog2.setName("Nik");
        dog2.setAge(5);
        dog2.setFeed("meal,fish,rice");
        dog2.setFavoriteToy("Toy carrot");
        System.out.println(" "+"\nDogs");
        System.out.println("Name: "+dog.getName()+"\nAge: "+ dog.getAge()+"\nFeed: "+dog.getFeed()+"\nFavorite toys: "+dog.getFavoriteToy());
        System.out.println(" ");
        System.out.println("Name: "+dog2.getName()+"\nAge: "+ dog2.getAge()+"\nFeed: "+dog2.getFeed()+"\nFavorite toys: "+dog2.getFavoriteToy());



        Fish fish = new Fish();
        fish.setKind("Amphiprion ocellaris ");
        fish.setLive("Pacific Ocean,Indian Ocean");
        fish.setEat("Microscopic algae and zooplankton");
        fish.setColor("Deep purple to fiery orange, red and yellow");
        fish.setLength(10);
        System.out.println(" "+"\nFish");
        System.out.println("Kind: "+fish.getKind()+"\nLive: "+fish.getLive()+"\nEat: "+fish.getEat()+"\nColor: "+fish.getColor()+"\nLength: "+fish.getLength());
    }

}