package lts.Test_jsoner;
import java.io.File;
import java.io.FileWriter;
import org.junit.Rule;
import org.junit.Test;
import lts.Jsoner;
import lts.Reporter_tests;


/** @see lts.files.Jsoner */
public class Test_jsoner_format {


    ////////// Variables //////////
    @Rule public Reporter_tests watchman = new Reporter_tests();
    private static final String RESOURCES = "src/test/resources/Test_jsoner/";


    ////////// Methods //////////
    @Test public void structuring() throws Exception {

        String path = RESOURCES + "unknown.json";
        String result = Jsoner.FORMAT._structuring(new File(path));

        // Writing the result to a file
        File un_structuring = new File(RESOURCES + "un_structuring.json");

        FileWriter writer = new FileWriter(un_structuring);
            writer.write(result);
            writer.close();

    }

    @Test public void unstructuring() throws Exception {

        String path = RESOURCES + "unknown.json";
        String result = Jsoner.FORMAT._unstructuring(new File(path));

        // Writing the result to a file
        File un_destructuring = new File(RESOURCES + "un_destructuring.json");

        FileWriter writer = new FileWriter(un_destructuring);
            writer.write(result);
            writer.close();

    }


}