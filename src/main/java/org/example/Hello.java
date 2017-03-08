package org.example;

public class Hello {
    public interface ChangeListener<T, V> {
        void changed(V newVal);
    }

    @FunctionalInterface
    public interface StringChangeListener<T>  extends ChangeListener<T, String> {
        void changed(String newVal);
    }

    public static class Attribute<T> {
        public void addStringListener(StringChangeListener<T> listener) {
        }
    }

    public static void main(String[] args) {
        new Attribute().addStringListener(newVal -> System.out.println("Hello, world!"));
    }
}
