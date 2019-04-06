package mvc;

/**
 * Class contains and manages the message.
 *
 * @see Model
 *
 * @version 1.0 02 Apr 2019
 * @author  Igor Klapatnjuk
 */

public class ModelImpl implements Model {
    /**
     * The delimer that used for gathering sentences.
     */
    public static final String delimer = " ".intern();
    private String message;

    /**
     * Gathers strings.
     *
     * @param parts array of {@link String} that will be gathered.
     */
    public void gatherSentence(String ... parts) {
        StringBuilder builder = new StringBuilder();
        int index = 0;

        for(; index < parts.length - 1; index++) {
            builder.append(parts[index]);
            builder.append(delimer);
        }
        builder.append(parts[index]);

        message = builder.toString();
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
