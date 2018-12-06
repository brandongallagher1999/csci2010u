

public class TB{

  private String board;
  private static char player = 'o';
  protected TB next;
  private static int tabs = 0;

  public TB(String board){
    this.board = board;
    printTree();
  }

  private static void switchPlayer(){
    if (player == 'o'){
      player = 'x';
    }
    else{
      player = 'o';
    }
  }

  public static String makeMove(String old, int pos) {
    switchPlayer();
    String before = old.substring(0, pos);
    String after = old.substring(pos+1);
    return before + player + after;
  }

  private void printTree(){
    for (int i = 0; i < tabs; i++){
      System.out.print("   ");
    }
    System.out.println(this.board);
    tabs++;
    for (int i = 0; i < board.length(); i++){
      if (board.charAt(i) == ' '){
        next = new TB(makeMove(this.board, i));
        tabs = 1;
      }

    }
  }

}
