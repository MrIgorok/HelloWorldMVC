package mvc;

import java.util.Locale;

/**
 * Provides user interface.
 *
 * @version 1.0 02 Apr 2019
 * @author  Igor Klaptnjuk
 */
public interface View {
    /**
     * Values that uses in the dialog with the user.
     */
    enum DialogValue {
        /**
         * Suggest the user to enter the line.
         */
        INPUT_SUGGESTION,

        /**
         * Report the user about wrong input.
         */
        WRONG_INPUT,

        /**
         * Result string.
         */
        RESULT
    }

    /**
     * Shows the message for the user.
     * @param message message that will be showed.
     */
    void printMessage(String message);

    /**
     * Reads the user-entered line.
     * @return read string.
     */
    String readString();

    /**
     * Gets standard dialog value.
     * @param value type of value that will be returned.
     * @param locale locale of the result string.
     * @return value associated with {@link DialogValue}.
     */
    String getDialogValue(DialogValue value, Locale locale);

    /**
     * Gets standard dialog value.
     * @param value type of value that will be returned.
     * @return value associated with {@link DialogValue}.
     */
    String getDialogValue(DialogValue value);
}
