package mvc;

/**
 * Message model.
 * Provides three methods for managing a message.
 *
 * @version 1.0 02 Apr 2019
 * @author  Igor Klapatnjuk
 */

public interface Model {
    /**
     * Gathers strings and save it as massage.
     *
     * @param parts array of {@link String} that will be gathered.
     */
    void gatherSentence(String ... parts);

    /**
     * Returns message that is manage.
     * @return managing message.
     */
    String getMessage();

    /**
     * Sets message that will be manage.
     * @param message message.
     */
    void setMessage(String message);
}
