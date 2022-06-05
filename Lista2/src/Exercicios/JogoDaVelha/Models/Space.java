package Exercicios.JogoDaVelha.Models;

import Exercicios.JogoDaVelha.Enums.SpaceStatusEnum;

public class Space {
  private SpaceStatusEnum status;

  public Space(SpaceStatusEnum status) {
    this.status = status;
  }

  public SpaceStatusEnum getStatus() {
    return status;
  }

  public void setStatus(SpaceStatusEnum status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return this.status.GetSpaceStatus();
  }
}
