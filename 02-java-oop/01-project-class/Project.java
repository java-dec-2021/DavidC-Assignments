public class Project {
    private String name = new String();
    private String description = new String();
    private double initialCost = 0;
    
    //empty; constructor
    public Project(){
        Portfolio.projects.add(this);
    }

    //constructor with name only
    public Project(String name) {
        this.name = name;
        Portfolio.projects.add(this);
    }

    //constructor with name and description
    public Project(String name, String description) {
        this.name = name;
        this.description = description;
        Portfolio.projects.add(this);
    }

    //constructor with name, description, cost
    public Project(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.initialCost = cost;
        Portfolio.projects.add(this);
    }

    //setter for Project name
    public void setName(String name) {
        this.name = name;
    }

    //getter for Project name
    public String getName() {
        return this.name;
    }

    //setter for Project description
    public void setDesc(String description) {
        this.description = description;
    }

    //getter for Project description
    public String getDesc() {
        return this.description;
    }

    //setter for Project initialCost
    public void setCost(double initialCost) {
        this.initialCost = initialCost;
    }

    //getter for Project initialCost
    public double getCost() {
        return this.initialCost;
    }

    //method that will return the name and description separated by a colon
    public String elevatorPitch() {
        return this.name + "( $" + String.format("%.2f",initialCost) + " ) : " + this.description;
    }


}