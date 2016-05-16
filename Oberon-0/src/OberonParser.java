import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import oberon0.parser.*;

/**
 * Created by Guus van Lankveld on 16-5-2016.
 */
public class OberonParser {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("Oberon-0/examples/ENBF-sec4-1-page-19.oberon0"))) {

            OberonLexer lexer = new OberonLexer(reader);
            String token = "";
            while ((token = lexer.yylex()) != null) {
                System.out.println(token);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
