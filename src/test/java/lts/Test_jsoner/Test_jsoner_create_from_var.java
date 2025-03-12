package lts.Test_jsoner;
import java.util.Iterator;
import java.util.Map.Entry;
import org.junit.Rule;
import org.junit.Test;
import lts.Jsoner;
import lts.Reporter_tests;


/** @see lts.files.Jsoner */
public class Test_jsoner_create_from_var {


    ////////// Variables //////////
    @Rule public Reporter_tests watchman = new Reporter_tests();


    ////////// Methods //////////
    @Test public void to_json() throws Exception {

        String json = "null";

        json = Jsoner.CREATE
                ._set("name", "bufferum")
                ._set("age", 20)
                ._set("IQ", 2999.9999)
            ._to_json();

        System.out.print(json);

    }

    @Test public void from_json() throws Exception {

        // to json
        String json = "null";

        json = Jsoner.CREATE
                ._set("name", "bufferum")
                ._set("age", 20)
                ._set("IQ", 2999.9999)
            ._to_json();

        System.out.print("to_json:\n" + json + "\n\n");

        // from json
        System.out.print("from_json:\n");
        Iterator<Entry<String, String>> iterator = Jsoner.CREATE._from_json((String) json);

        while(iterator.hasNext()) {

            Entry<String, String> entry = iterator.next();

            System.out.print(
                "key=" + entry.getKey() + " " +
                "value=" + entry.getValue() + "\n"
            );

        }

    }


}