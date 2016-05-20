import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import beaver.Parser;
import beaver.Symbol;
import oberon0.parser.*;

/**
 * Created by Guus van Lankveld on 16-5-2016.
 */
public class OberonScannerParser {

    public static void main(String[] args) {

        try(BufferedReader reader = new BufferedReader(new FileReader("examples/given.oberon0"))) {

            OberonScanner previewScanner = new OberonScanner(reader);

            Symbol token = previewScanner.nextToken();
            while (token.getId() != OberonParser.Terminals.EOF) {
                //System.out.println(token.getId());
                token = previewScanner.nextToken();
            }
        } catch (beaver.Scanner.Exception e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done! ");

        String[] files = new String[]{"examples/error_1.oberon0", "examples/error_2.oberon0", "examples/error_3.oberon0", "examples/error_4.oberon0"};
        String[] expectedUnexpectedToken = new String[]{"32", "CONSTANT", "", ""};
        for(int i = 0 ; i  <  files.length; ++i){
            System.out.println("Testing: "+files[i]);
            try (BufferedReader reader = new BufferedReader(new FileReader(files[i]))) {
                OberonScanner scanner = new OberonScanner(reader);

                OberonParser parser = new OberonParser();

                parser.parse(scanner);

            } catch (Parser.Exception e) {
                System.out.println("Expected unexpected token: "+expectedUnexpectedToken[i]);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Tested: "+files[i]);
        }
    }

}
