public class GroceryList {
    private String[] arr;
    private int count;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        this.arr = new String[10];
        this.count = 0;
    }

    // Adds an item to the grocery list
    public void add(String item) {
        this.arr[this.count]=item;
        this.count++;
        if(this.count ==9){
            remove(this.arr[0]);
        }
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        for(int i = 0;i<this.arr.length;i++){
            if(this.arr[i]!=null&&this.arr[i].equals(item)) {
                this.arr[i] = null;
                for(int j = i;j<this.arr.length-1;j++){
                    this.arr[j]=this.arr[j+1];
                }
                this.arr[this.arr.length-1]=null;
            }
        }
    }

    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        String list = "Grocery List: ";
        for (String s : this.arr) {
            if (s != null) {
                list += s + ", ";
            }
        }
        return list.substring(0,list.length()-2);
    }
}
