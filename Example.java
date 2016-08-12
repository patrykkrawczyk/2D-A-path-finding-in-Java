import java.util.List;

/**
 * Original Code author: Sebastian Lague.
 * Modifications & API by: Ronen Ness.
 * Java port by: Patryk Krawczyk (capybaracreations)
 */
public class Example {

    public static void main(String[] args) {
        // Create an array holding price for visiting each of the tiles
        int width = 10;
        int height = 10;
        boolean[][] tiles = new boolean[width][height];

        // Fill it with values, false represents blocking tile
        for (int x = 0; x < 5; x++)
            for (int y = 0; y < 5; y++)
                tiles[x][y] = true;

        // Create a Grid instance
        Grid grid = new Grid(width, height, tiles);

        // Create endpoints
        Point start  = new Point(1, 1);
        Point target = new Point(3, 3);

        // Last argument will make this search be 4 directional
        List<Point> path = PathFinding.findPath(grid, start, target, false);

        // Print the path
        for (Point point : path) System.out.println(point);
    }

}
