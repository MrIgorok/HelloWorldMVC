package mvc;

/**
 * Class controls the dialog with the user.
 *
 * @see Controller
 *
 * @version 1.0 02 Apr 2019
 * @author  Igor Klapatnjuk
 */
public class ControllerImpl implements Controller {
    private Model model;
    private View view;
    private final String expectMessage1 = "Hello";
    private final String expectMessage2 = "world!";

    public ControllerImpl(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Perform dialog with the user.
     */
    public void perform() {
        String message1 = inputMessage(expectMessage1);
        String message2 = inputMessage(expectMessage2);

        model.gatherSentence(message1, message2);

        view.printMessage(view.getDialogValue(View.DialogValue.RESULT));
        view.printMessage(model.getMessage());
    }

    /**
     * Dialog with the user that allow only expected input.
     *
     * @param expectMessage expected message value.
     * @return user input that is equal to expectMessage.
     */
    private String inputMessage(String expectMessage) {
        String message;

        view.printMessage(view.getDialogValue(View.DialogValue.INPUT_SUGGESTION));
        message = view.readString();
        while (!message.equals(expectMessage)) {
            view.printMessage(view.getDialogValue(View.DialogValue.WRONG_INPUT));
            view.printMessage(view.getDialogValue(View.DialogValue.INPUT_SUGGESTION));
            message = view.readString();
        }

        return message;
    }
}
