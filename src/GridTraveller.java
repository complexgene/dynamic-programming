import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class GridTraveller {
    static Map<D2DPoint, Long> gridWaysMap = new HashMap<>();
    public static void main(String[] args) {
        System.out.println(noOfWaysToTravel(2, 3));
        System.out.println(noOfWaysToTravel(18, 18));
    }

    static long noOfWaysToTravel(int rows, int columns) {
        if (rows == 1 || columns == 1) return 1;
        if (rows == 0 || columns == 0) return 0;
        D2DPoint point = new D2DPoint(rows, columns);
        if (gridWaysMap.containsKey(point)) {
            return gridWaysMap.get(point);
        }
        long result = noOfWaysToTravel(rows - 1, columns) + noOfWaysToTravel(rows, columns - 1);
        gridWaysMap.put(point, result);
        return gridWaysMap.get(point);
    }

    static class D2DPoint {
        int row, col;
        D2DPoint(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            D2DPoint d2DPoint = (D2DPoint) o;
            return row == d2DPoint.row && col == d2DPoint.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }
}
