package kyh.textadventure;

public class Room {

    // We have variables for name, description and other parameters since this is necessary to determine the players
    // current state in the world.

    private String name;
    private String description;
    private Item item;

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

    // Return the description of an item.
    public String getItemDescription() {
        // if item is not null (i.e. we have already stored an item in item.
        if(item != null) {
            return item.toString();
        } else {    // else if item is null. i.e. there is no item stored in item (by adding iten through the function setItem.
            return "No item found";
        }
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setDescription(String newDescription) {
        description = newDescription;
    }

    // Store a created item in the item variable in room.
    public void setItem(Item inItem) {
        item = inItem;
    }

    // Create a string representation of a room to show in the main game loop.
    @Override
    public String toString() {
        String roomString = getName() + "\n";                           // roomstring: "A hall"
        roomString = roomString + getDescription() + "\n";              // roomstring: "A hall" + "this is a description of a hall.
        roomString = roomString + "Items\n---------------\n";             // roomstring: "A hall" + "this is a ..." + "Items..."

        // We need ot make sure that there is an item in the room before we try to call
        // a function in that item.
        if(item != null) {
            roomString = roomString + item.getType();
        }

        return roomString;
    }
}
