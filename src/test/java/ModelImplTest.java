import mvc.ModelImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelImplTest {

    @Test
    void gatherSentence() {
        ModelImpl model = new ModelImpl();
        String [] strings = { "Hello", "world!" };

        model.gatherSentence(strings);

        assertEquals(model.getMessage(), "Hello world!");
    }
}