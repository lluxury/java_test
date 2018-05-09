package reflection;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import charactor.Hero;

public class TestReflection {
    public static void main(String[] args) throws InterruptedException {
        Hero h = getHero();
        System.out.println(h);
    }

    public static Hero getHero() {

        File f = new File("C:/cygwin64/home/yann/coding/java/j2se/java_test/hero.config");

        try (FileReader fr = new FileReader(f)) {
            String className = null;
            char[] all = new char[(int) f.length()];
            fr.read(all);
            className = new String(all);
            Class clazz=Class.forName(className);
            Constructor c= clazz.getConstructor();
            Hero h= (Hero) c.newInstance();
            return h;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}