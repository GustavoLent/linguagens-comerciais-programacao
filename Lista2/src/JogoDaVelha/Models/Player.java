package JogoDaVelha.Models;

import JogoDaVelha.Enums.SpaceStatusEnum;

public class Player {
  private String ID;
  private SpaceStatusEnum spaceStatus;

  public Player(String ID, SpaceStatusEnum spaceStatus) {
    this.ID = ID;
    this.spaceStatus = spaceStatus;
  }

  public SpaceStatusEnum getSpaceStatus() {
    return this.spaceStatus;
  }

  public String getID() {
    return this.ID;
  }
}
