package Exercicios.JogoDaVelha.Models;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Exercicios.JogoDaVelha.Enums.SpaceStatusEnum;
import Exercicios.JogoDaVelha.Exceptions.AlreadyUsedSpaceException;

public class Row {
  final static SpaceStatusEnum INITIAL_SPACE_STATUS = SpaceStatusEnum.EMPTY;

  private List<Space> spaces = Arrays.asList(
      new Space(INITIAL_SPACE_STATUS),
      new Space(INITIAL_SPACE_STATUS),
      new Space(INITIAL_SPACE_STATUS));

  public List<Space> getSpaces() {
    return spaces;
  }

  public void setSpaces(List<Space> spaces) {
    this.spaces = spaces;
  }

  public Space getSpace(int index) {
    return this.spaces.get(index);
  }

  public void setSpaceStatus(int index, SpaceStatusEnum status) throws AlreadyUsedSpaceException {
    if (getSpace(index).getStatus() != INITIAL_SPACE_STATUS) {
      throw new AlreadyUsedSpaceException("Espaço não disponível!");
    }

    getSpace(index).setStatus(status);
  }

  @Override
  public String toString() {
    List<String> stringyfiedSpaces = this.spaces.stream().map(x -> x.toString()).collect(Collectors.toList());

    return String.join(" ", stringyfiedSpaces);
  }
}