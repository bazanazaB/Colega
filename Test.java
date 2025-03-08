import org.antlr.runtime.*;
public class Test {
 public static void main(String[] args) throws Exception {

 ANTLRInputStream input = new ANTLRInputStream(System.in);
 semanticaLexer lexer = new semanticaLexer(input);
 CommonTokenStream tokens = new CommonTokenStream(lexer);
 semanticaParser parser = new semanticaParser(tokens);
 parser.program();
 }
}
