import mvc.*;
import utils.ResourceBundleManager;

/**
 * @version 1.0 02 Apr 2019
 * @author  Igor Klapatnjuk
 */
public class Main {

    public static void main(String [] args) {
        Model model = new ModelImpl();
        View view = new ViewImpl(System.in, System.out, ResourceBundleManager.INSTANCE);
        Controller controller = new ControllerImpl(model, view);

        controller.perform();
    }
}
