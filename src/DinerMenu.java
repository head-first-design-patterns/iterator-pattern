public class DinerMenu {
    static final int MAX_ITEMS = 6;
    MenuItem[] dinerMenuItems;

    public DinerMenu() {

        dinerMenuItems = new MenuItem[2];
        dinerMenuItems[0] = new MenuItem("pizza", 40);
        dinerMenuItems[1] = new MenuItem("sandwich", 80);
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(dinerMenuItems);
    }
}
