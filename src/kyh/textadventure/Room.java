package kyh.textadventure;

public class Room {

    // We have variables for name, description and other parameters since this is necessary to determine the players
    // current state in the world.

    private String name;
    private String description;

    public int numberOfDoors = 2;

    // Store the default values for name and description of a room.
    public Room(String inName, String inDescription) {
        name = inName;
        description = inDescription;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }
}
