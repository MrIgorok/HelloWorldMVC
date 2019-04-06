package mvc;

import utils.ResourceManager;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class controls what the user will be see.
 *
 * @see View
 *
 * @version 1.0 02 Apr 2019
 * @author Igor Klapatnjuk
 */
public class ViewImpl implements View {

    private Scanner scanner;
    private PrintStream printStream;
    private ResourceManager resources;

    public ViewImpl(InputStream inStream, OutputStream outStream, ResourceManager resources) {
        this.scanner = new Scanner(inStream);
        this.printStream = new PrintStream(outStream);
        this.resources = resources;
    }

    /**
     * Prints the message.
     * @param message the message that will be printed.
     */
    public void printMessage(String message) {
        printStream.println(message);
    }

    /**
     * Reads the string.
     * @return the read line.
     */
    public String readString() {
        return scanner.next();
    }

    /**
     * Gets standard dialog value.
     * @param value type of value that will be returned.
     * @param locale locale of the result string.
     * @return value associated with {@link DialogValue}.
     */
    public String getDialogValue(DialogValue value, Locale locale) {
        resources.changeResource(locale);
        return resources.getString(value.name());
    }

    /**
     * Gets standard dialog value.
     * @param value type of value that will be returned.
     * @return value associated with {@link DialogValue}.
     */
    public String getDialogValue(DialogValue value) {
        return resources.getString(value.name());
    }
}
