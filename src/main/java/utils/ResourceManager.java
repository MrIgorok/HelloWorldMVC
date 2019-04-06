package utils;


import java.util.Locale;

/**
 * Managing resources.
 *
 * @version 1.0 02 Apr 2019
 * @author  Igor Klapatnjuk
 */

public interface ResourceManager {
    /**
     * Changes resource locale.
     * @param locale locale that will be used.
     */
    void changeResource(Locale locale);

    /**
     * Returns the key value.
     * @param key key witch value will be returned.
     * @return value.
     */
    String getString(String key);
}
