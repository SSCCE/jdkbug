package org.example;

public class SSCCE {
    public static class Attribute<T> {
        public interface ChangeListener<TT, V> {
            void changed(V newVal);
        }

        @FunctionalInterface
        public interface StringChangeListener<TT>  extends ChangeListener<TT, String> {
            void changed(String newVal);
        }

        public void addStringListener(StringChangeListener<T> listener) {
        }
    }

    public static abstract class Holder<T extends Holder<T>> {}

    public static class HolderImpl extends Holder<HolderImpl> {
        public HolderImpl() {
            new Attribute().addStringListener(newVal -> System.out.println(newVal));
        }
    }
}
