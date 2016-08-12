/**
 * A node in the grid map
 */
public class Node {
    // node starting params
    public boolean walkable;
    public int x;
    public int y;
    public float price;

    // calculated values while finding path
    public int gCost;
    public int hCost;
    public Node parent;

    /**
     * Create the node
     * @param x X tile location in grid
     * @param y Y tile location in grid
     * @param price how much does it cost to pass this tile. less is better, but 0.0f is for non-walkable.
     */
    public Node(int x, int y, float price) {
        walkable = price != 0.0f;
        this.price = price;
        this.x = x;
        this.y = y;
    }

    public int getFCost() {
        return gCost + hCost;
    }
}
