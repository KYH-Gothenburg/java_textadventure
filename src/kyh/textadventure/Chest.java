package kyh.textadventure;

import java.util.ArrayList;

// Chest that is able to contain other items.
public class Chest extends Item {
    ArrayList<Item> inventory = new ArrayList<Item>();
    int maxSize = 4;

    // Create a new chest with the same information as a default item.
    public Chest(String inType, String inDescription) {
        super(inType, inDescription);
    }

    // if the chest is not full, add another item to the chest.
    public void addItemsToChest(Item inItems) {
        if(inventory.size() < maxSize) {
            inventory.add(inItems);
        }
    }

    @Override
    public String toString() {
        String itemDescription = type + "\n";
        itemDescription = itemDescription + description;
        itemDescription = "Cest contains:\n";

        if(inventory.size()==0) {
            itemDescription = itemDescription + "The cest is empty";
        } else {
            for(int i=0;i<inventory.size();i++) {
                itemDescription = itemDescription + inventory.get(i).toString() + "\n";
            }
        }

        return itemDescription;
    }
}
