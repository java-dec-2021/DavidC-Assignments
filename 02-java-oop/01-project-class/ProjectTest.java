public class ProjectTest {
    public static void main(String[] args) {
        //empty costructor with setters and getters for all values
        Project project1 = new Project();
        project1.setName("No Dry Fabric");
        project1.setDesc("I represent a company that has devloped a new green technology for creating a cotton like fabric that dries completely while hanging for less than an hour saving consumers thousands on their electricity bills.");
        project1.setCost(233580.36);
        System.out.println(project1.elevatorPitch());
        

        //constructor with name only
        Project project2 = new Project("Self Tieing Trashbag");
        project2.setDesc("Due to breakthroughs in 3D printing technology and plastic engineering, a tiny motor and sensor has been developed at pennies on the dollar that can close and tie a drawstring trashbag when full.");
        project2.setCost(467673.45);
        System.out.println(project2.elevatorPitch());

        //Constructor with name and description
        Project project3 = new Project("Siamese Socks","Two tiny magnets with a very specific electronic signatures, only attracted to each other are fitted to a right and left sock. The consumer is given a small keychain sized dongle that activates/deactivates the the attraction, never losing only one sock to the abyss.");
        project3.setCost(2849075.27);
        System.out.println(project3.elevatorPitch());

        //constructor with all values filled
        Project project4 = new Project("iCloset","For those of a higher standard of fashion and luxury, new clothing items is automatically sent to a staging place in the motorized closet, photographed, and attached to an id in the hanger. New shoes added to a vending machine style shelving system are given the same treatment. A state of the art fashion algorithm mobile app shows potential outfits based on weather, location, time of day, or even an event and using the newest AR advances equipped in cellphones; display how the outfit will look. Ultimately pulling the items for the consumer to try on.",8572491.76);
        System.out.println(project4.elevatorPitch());



        Portfolio.showPortfolio();




    }
}