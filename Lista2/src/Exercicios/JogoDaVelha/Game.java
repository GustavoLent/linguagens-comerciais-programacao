package Exercicios.JogoDaVelha;

import java.util.Arrays;
import java.util.Scanner;

import Exercicios.JogoDaVelha.Enums.SpaceStatusEnum;
import Exercicios.JogoDaVelha.Exceptions.AlreadyUsedSpaceException;
import Exercicios.JogoDaVelha.Models.Board;
import Exercicios.JogoDaVelha.Models.Player;
import Exercicios.JogoDaVelha.Services.ScreenService;

public class Game {
  final Board board = new Board();

  public void Run() {
    Player Player1 = new Player("Jogador 1", SpaceStatusEnum.X);
    Player Player2 = new Player("Jogador 2", SpaceStatusEnum.O);

    Scanner entryScanner = new Scanner(System.in);

    boolean player1Turn = true;
    int turnCounter = 0;
    int tie = board.getRows().size() * board.getRow(0).getSpaces().size();
    String error = "";

    Player winner = null;

    while (winner == null && turnCounter <= tie) {
      ScreenService.clear();
      System.out.println(board.toString());

      Player currPlayer = player1Turn ? Player1 : Player2;

      try {
        if (!error.equals("")) {
          ScreenService.error(error);
          error = "";
        }

        ScreenService.neutral("Indique sua jogada no forma Linha x Coluna, com valores entre 1 e 3. Exemplo: 1x1");
        ScreenService.neutralSameLine(currPlayer.getID() + ": ");

        String entry = entryScanner.nextLine().toLowerCase().trim();
        Scanner lineScanner = new Scanner(entry).useDelimiter("\\s*x{1}\\s*");

        int lineOffset = Integer.parseInt(lineScanner.next()) - 1;
        int spaceOffset = Integer.parseInt(lineScanner.next()) - 1;

        board.getRow(lineOffset).setSpaceStatus(spaceOffset, currPlayer.getSpaceStatus());

        lineScanner.close();
        player1Turn = !player1Turn; // Turn ended successfully

        winner = board.CheckIfHasAWinner(Arrays.asList(Player1, Player2));
        turnCounter++;
      } catch (NumberFormatException NumberFormatException) {
        error = "Erro ao identificar jogada! Certifique-se de inserir Linha x Coluna com valores númericos!";

      } catch (java.lang.ArrayIndexOutOfBoundsException ArrayIndexOutOfBoundsException) {
        error = "Erro ao identificar jogada! Certifique-se de inserir linhas e colunas entre 1 e 3!";

      } catch (AlreadyUsedSpaceException AlreadyUsedSpaceExceptionJava) {
        error = AlreadyUsedSpaceExceptionJava.toString();
      }
    }

    System.out.println(board.toString());
    String result = winner != null ? "Parabéns " + winner.getID() + " você ganhou!" : "Empate!";
    ScreenService.success(result);
    entryScanner.close();
  }
}
