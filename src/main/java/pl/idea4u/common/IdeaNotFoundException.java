package pl.idea4u.common;

public class IdeaNotFoundException extends RuntimeException {
    public IdeaNotFoundException(Integer id) {
        super("Could not find idea " + id);
    }
}
