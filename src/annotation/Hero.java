package annotation;

public class Hero {
    String name;

    @SafeVarargs
    public static <T> T getFirstOne(T... elements) {
        return elements.length > 0 ? elements[0] : null;
    }
}