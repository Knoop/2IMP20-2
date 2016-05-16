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

        try(BufferedReader reader = new BufferedReader(new FileReader("Oberon-0/examples/simple.oberon0"))) {

            OberonScanner previewScanner = new OberonScanner(reader);

            Symbol token = previewScanner.nextToken();
            while (token.getId() != OberonParser.Terminals.EOF) {
                System.out.println(token.getId());
                token = previewScanner.nextToken();
            }
        } catch (beaver.Scanner.Exception e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("Oberon-0/examples/simple.oberon0"))) {
            OberonScanner scanner = new OberonScanner(reader);

            OberonParser parser = new OberonParser();

            parser.parse(scanner);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Parser.Exception e) {
            e.printStackTrace();
        }

    }

}
