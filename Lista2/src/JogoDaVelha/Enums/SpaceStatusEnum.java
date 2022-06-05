package JogoDaVelha.Enums;

public enum SpaceStatusEnum {
  X, O, EMPTY;

  public String GetSpaceStatus() {
    switch (this) {
      case X:
        return "X";

      case O:
        return "O";

      default:
        return "_";
    }
  }
}