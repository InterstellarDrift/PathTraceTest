package hello;

import org.xguzm.pathfinding.finders.AStarFinder;
import org.xguzm.pathfinding.grid.GridCell;
import org.xguzm.pathfinding.grid.NavigationGrid;
import org.xguzm.pathfinding.grid.finders.AStarGridFinder;
import org.xguzm.pathfinding.grid.finders.GridFinderOptions;
import org.xguzm.pathfinding.grid.finders.ThetaStarGridFinder;

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
//    _cells[8][9].setWalkable(false);
//    for(int i=30; i<50; i++) {
//      for(int j=30; j<50;j++){
//        _cells[i][j].setWalkable(false);
//      }
//    }
//    _cells
    NavigationGrid<GridCell> _navGrid = new NavigationGrid(_cells);
    GridFinderOptions opt = new GridFinderOptions();
    opt.allowDiagonal = true;
    AStarGridFinder<GridCell> _finderA = new AStarGridFinder(GridCell.class, opt);
//    ThetaStarGridFinder<GridCell> _finderTheta = new ThetaStarGridFinder(GridCell.class, opt);
    List<GridCell> results = _finderA.findPath(_cells[0][0], _cells[50][90], _navGrid);
//    List<GridCell> resultstheta = _finderTheta.findPath(0,0,32,100,_navGrid);

    System.out.print(results);
    System.out.println();
//    System.out.print(resultstheta);
  }
}
