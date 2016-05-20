package picojava;

import beaver.Parser;
import picojava.lang.ast.Block;

import java.io.*;

/**
 * Created by Maurice on 16-5-2016.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        assert(test("given.picojava",false));
        assert(test("correct_1.picojava",false));
        assert(test("error_1.picojava",true));
        assert(test("error_2.picojava",true));
        assert(test("error_3.picojava",true));

    }

    private static boolean test(String filename, boolean fail){
        try {
            parse(new File("C:\\Users\\Maurice\\Documents\\Technische Universiteit\\2015-2016\\Uitwerkingen\\2IMP20 - Generic Language Technology\\Assignment 2\\PicoJava\\examples\\"+filename));
            return !fail;
        } catch (Parser.Exception e) {
            e.printStackTrace();
            return fail;
        } catch (IOException e) {
            return false;
        }
    }


    private static Block parse(File file) throws IOException, Parser.Exception {
        return (Block) new PicoJavaParser().parse(new PicoJavaScanner(new InputStreamReader(new FileInputStream(file))));
    }
}
