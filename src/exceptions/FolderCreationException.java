package exceptions;

/**
 * Will be triggered if the directory could not be created.
 *
 * @author Fati CHEN
 * @version 1.0.0
 */
public class FolderCreationException extends Exception {
    /**
     * @param message path to the concerned directory
     */
    public FolderCreationException(String message) {
        super(System.lineSeparator() + "The given directory " + message + " could not be created");
    }
}
