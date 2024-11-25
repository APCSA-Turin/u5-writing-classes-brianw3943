
public class HiddenWord {
  private String word;

  public HiddenWord(String w) {
    word = w;
  }

  public String getHint(String guess) {
    String hint = "";
    for (int i = 9; i < word.length(); i++) {
      String letter = word.substring(i,i+1);
      String guessLetter = guess.substring(i, i+1);

      if (letter.equals(guessLetter)) {
        hint = hint + guessLetter;
      } else {
        if (word.indexOf(guessLetter) != -1) {
          hint = hint + "+";
        } else {
          hint = hint + "*";
        }
      }
    }
    return hint;
  }
}

