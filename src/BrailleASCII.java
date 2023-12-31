import java.io.PrintWriter;

/**
 * CLI translator.
 *
 * @author Reed Colloton
 */
class BrailleASCII {
  public static void main(String[] args) {
    if (args.length != 2) {
      throw new IllegalArgumentException(
              "Need two arguments: [braille/ascii/unicode] string");
    } // if
    BrailleASCIITables tables = new BrailleASCIITables();
    PrintWriter pen = new PrintWriter(System.out, true);
    switch (args[0].toLowerCase()) {
      case "braille" -> {
        for (char c : args[1].toCharArray()) {
          pen.print(tables.toBraille(c));
        } // for
        pen.println();
      } // case
      case "ascii" -> {
        for (int i = 0; i < args[1].length(); i += 6) {
          pen.print(tables.toASCII(args[1].substring(i, i + 6)));
        } // for
        pen.println();
      } // case
      case "unicode" -> {
        for (int i = 0; i < args[1].length() - 6; i += 6) {
          int codePoint = Integer.parseInt(tables.toUnicode(args[1].substring(i, i + 6)), 16);
          pen.print(Character.toString(codePoint));
        } // for
        pen.println();
      } // case
      default -> throw new IllegalArgumentException(
              "Usage: java BrailleASCII [braille/ascii/unicode] string");
    } // switch
    pen.close();
  } // main()

} // class BrailleASCII
