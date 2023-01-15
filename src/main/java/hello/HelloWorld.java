package hello;

import org.xguzm.pathfinding.grid.GridCell;
import org.xguzm.pathfinding.grid.NavigationGrid;
import org.xguzm.pathfinding.grid.finders.AStarGridFinder;
import org.xguzm.pathfinding.grid.finders.GridFinderOptions;

import java.util.List;

public class HelloWorld {





  public static void main(String[] args) {
    int x = 52;
    int y = 108;

    GridCell[][] _cells = new GridCell[x][y];
    for(int i = 0; i < x; i++) {
      for(int j = 0; j < y; j++) {
        _cells[i][j] = new GridCell(i,j);
      }
    }
    _cells[8][9].setWalkable(false);
//    _cells
    NavigationGrid<GridCell> _navGrid = new NavigationGrid(_cells);
    GridFinderOptions opt = new GridFinderOptions();
    opt.allowDiagonal = true;
    AStarGridFinder<GridCell> _finder = new AStarGridFinder(GridCell.class, opt);
    List<GridCell> results = _finder.findPath(0,0,32,100,_navGrid);
    System.out.print(results);
  }
}
