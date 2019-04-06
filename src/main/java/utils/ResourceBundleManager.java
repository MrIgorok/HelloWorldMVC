package utils;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

/**
 * Managing resources using resource file.
 *
 * @version 1.0 02 Apr 2019
 * @author  Igor Klapatnjuk
 */
public enum ResourceBundleManager implements ResourceManager {
    /**
     * Single instance that application uses for managing resources.
     */
    INSTANCE;

    private ResourceBundle resourceBundle;
    private final String resourceName = "values";

    ResourceBundleManager() {
        resourceBundle = PropertyResourceBundle.getBundle(resourceName, Locale.getDefault());
    }

    /**
     * Change resource locale.
     *
     * @param locale locale that will be used.
     */
    public void changeResource(Locale locale) {
        resourceBundle = PropertyResourceBundle.getBundle(resourceName, locale);
    }

    /**
     * Returns the key value.
     * @param key key witch value will be returned.
     * @return value.
     */
    public String getString(String key) {
        return resourceBundle.getString(key);
    }
}
