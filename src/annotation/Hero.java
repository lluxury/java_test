package annotation;

public class Hero {

    String name;

    @Deprecated
    public void hackMap(){

    }
    public static void main(String[] args) {
        new Hero().hackMap();
    }

}