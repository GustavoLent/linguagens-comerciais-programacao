package Exercicios.JogoDaVelha.Exceptions;

public class AlreadyUsedSpaceException extends Exception {
  public AlreadyUsedSpaceException(String errorMessage) {
    super(errorMessage);
  }
}