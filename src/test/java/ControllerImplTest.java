import mvc.ControllerImpl;
import mvc.ModelImpl;
import mvc.ViewImpl;
import org.junit.jupiter.api.Test;
import utils.ResourceBundleManager;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class ControllerImplTest {
    private ControllerImpl controller;
    private ModelImpl model;

    @Test
    void performTest1() {
        setUp("Hello world!");

        controller.perform();

        assertEquals(model.getMessage(), "Hello world!");
    }

    @Test
    void performTest2() {
        setUp("Hello WRONG world!");

        controller.perform();

        assertEquals(model.getMessage(), "Hello world!");
    }

    private void setUp(String inputString) {
        model = new ModelImpl();
        InputStream inStream = new InputStream() {
            private byte [] elms = inputString.getBytes();
            private int pos = 0;

            @Override
            public int read() throws IOException {
                if (pos == elms.length) return -1;

                return elms[pos++];
            }
        };
        OutputStream outStream = new ByteArrayOutputStream();
        ViewImpl view = new ViewImpl(inStream, outStream, ResourceBundleManager.INSTANCE);
        controller = new ControllerImpl(model, view);
    }
}