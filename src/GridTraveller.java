import java.util.HashMap;
import java.util.Map;

public class GridTraveller {
    static Map<Integer, Long> gridWaysMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(noOfWaysToTravel(2, 3));
    }

    static int noOfWaysToTravel(int rows, int columns) {
        if (rows == 1 || columns == 1) return 1;
        if (rows == 0 || columns == 0) return 0;
        return noOfWaysToTravel(rows - 1, columns) + noOfWaysToTravel(rows, columns - 1);
    }
}
