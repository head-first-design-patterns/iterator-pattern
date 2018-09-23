import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList<MenuItem> pancakeHouseMenuItems;

    public PancakeHouseMenu() {
        pancakeHouseMenuItems = new ArrayList<MenuItem>();
        pancakeHouseMenuItems.add(new MenuItem("banana pancake", 10));
        pancakeHouseMenuItems.add(new MenuItem("chocolate pancake", 90));
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(pancakeHouseMenuItems);
    }
}