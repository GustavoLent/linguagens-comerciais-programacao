package JogoDaVelha.Models;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import JogoDaVelha.Enums.SpaceStatusEnum;

public class Board {
  private List<Row> rows = Arrays.asList(new Row(), new Row(), new Row());

  public List<Row> getRows() {
    return rows;
  }

  public void setRows(List<Row> rows) {
    this.rows = rows;
  }

  public Row getRow(int index) {
    return rows.get(index);
  }

  public Space getSpace(int rowIndex, int spaceIndex) {
    return rows.get(rowIndex).getSpace(spaceIndex);
  }

  public Player CheckIfHasAWinner(List<Player> players) {
    Player rowsResult = CheckIfHasAWinnerInRows(players);

    if (rowsResult != null) {
      return rowsResult;
    }

    Player columnResult = CheckIfHasAWinnerInColumns(players);

    if (columnResult != null) {
      return columnResult;
    }

    Player decrescentDiagonalResult = CheckIfHasAWinnerInDecrescentDiagonal(players);

    if (decrescentDiagonalResult != null) {
      return decrescentDiagonalResult;
    }

    Player crescentDiagonalResult = CheckIfHasAWinnerInCrescentDiagonal(players);

    if (crescentDiagonalResult != null) {
      return crescentDiagonalResult;
    }

    return null;
  }

  private Player CheckIfHasAWinnerInRows(List<Player> players) {
    for (Row row : this.rows) {
      SpaceStatusEnum firstStatus = row.getSpace(0).getStatus();
      if (firstStatus == SpaceStatusEnum.EMPTY) {
        continue;
      }

      boolean allEqual = true;
      for (int i = 1; i <= 2; i++) {
        SpaceStatusEnum status = row.getSpace(i).getStatus();

        if (status != firstStatus) {
          allEqual = false;
          break;
        }
      }

      if (allEqual) {
        return GetPlayerBySpaceStatus(players, firstStatus);
      }
    }

    return null;
  }

  private Player CheckIfHasAWinnerInColumns(List<Player> players) {
    int amountOfColuns = this.getRow(0).getSpaces().size();
    int amountOfLines = this.rows.size();

    for (int columnIndex = 0; columnIndex < amountOfColuns; columnIndex++) {
      int lineIndex = 0;
      SpaceStatusEnum firstStatus = this.rows.get(lineIndex).getSpace(columnIndex).getStatus();

      if (firstStatus == SpaceStatusEnum.EMPTY) {
        continue;
      }

      boolean allEqual = true;
      for (lineIndex = 1; lineIndex < amountOfLines; lineIndex++) {
        SpaceStatusEnum status = this.rows.get(lineIndex).getSpace(columnIndex).getStatus();

        if (status != firstStatus) {
          allEqual = false;
          break;
        }
      }

      if (allEqual) {
        return GetPlayerBySpaceStatus(players, firstStatus);
      }
    }

    return null;
  }

  private Player CheckIfHasAWinnerInDecrescentDiagonal(List<Player> players) {
    // 1x1, 2x2, 3x3
    SpaceStatusEnum firstStatus = this.rows.get(0).getSpace(0).getStatus();

    if (firstStatus == SpaceStatusEnum.EMPTY) {
      return null;
    }

    SpaceStatusEnum secondStatus = this.rows.get(1).getSpace(1).getStatus();
    if (firstStatus != secondStatus) {
      return null;
    }

    SpaceStatusEnum thirdStatus = this.rows.get(2).getSpace(2).getStatus();
    if (firstStatus != thirdStatus) {
      return null;
    }

    return GetPlayerBySpaceStatus(players, firstStatus);
  }

  private Player CheckIfHasAWinnerInCrescentDiagonal(List<Player> players) {
    // 2x1, 2x2, 1x3
    SpaceStatusEnum firstStatus = this.rows.get(2).getSpace(0).getStatus();

    if (firstStatus == SpaceStatusEnum.EMPTY) {
      return null;
    }

    SpaceStatusEnum secondStatus = this.rows.get(1).getSpace(1).getStatus();
    if (firstStatus != secondStatus) {
      return null;
    }

    SpaceStatusEnum thirdStatus = this.rows.get(0).getSpace(2).getStatus();
    if (firstStatus != thirdStatus) {
      return null;
    }

    return GetPlayerBySpaceStatus(players, firstStatus);
  }

  private Player GetPlayerBySpaceStatus(List<Player> players, SpaceStatusEnum status) {
    for (Player player : players) {
      if (player.getSpaceStatus() == status) {
        return player;
      }
    }

    return null;
  }

  @Override
  public String toString() {
    List<String> stringyfiedRows = this.rows.stream().map(x -> x.toString()).collect(Collectors.toList());

    return String.join("\n", stringyfiedRows);
  }
}
