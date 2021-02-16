import java.io.*;
import org.antlr.v4.runtime.*;

public class main {

    public static void main(String args[]) throws Exception {
        mainLexer lexer = new mainLexer(new ANTLRFileStream("testErrors.lans"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mainParser p = new mainParser(tokens);
        p.inici();
        if(p.getNumberOfSyntaxErrors()==0){
            System.out.println("No errors");
        }
        else
            System.out.println("Errors");
    }
}