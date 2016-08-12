/**
 * A 2D point on the grid
 */
public class Point {

    public int x;
    public int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    @Override
    public boolean equals(Object object) {
        // Unlikely to compare incorrect type so removed for performance
        // if (!(obj.GetType() == typeof(PathFind.Point)))
        //     return false;
        Point point = (Point) object;

        if (point.equals(null)) return false;

        // Return true if the fields match:
        return (x == point.x) && (y == point.y);
    }

    public boolean equals(Point point) {
        if (point.equals(null)) return false;

        // Return true if the fields match:
        return (x == point.x) && (y == point.y);
    }

    public Point set(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    @Override
    public String toString() {
        return "Point = {" + x +", " + y +'}';
    }
}
