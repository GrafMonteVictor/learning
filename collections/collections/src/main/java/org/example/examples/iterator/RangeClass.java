package org.example.examples.iterator;

import java.util.Iterator;

public class RangeClass {
    public static void main(String[] args) {
        for (int i: Range.fromTo(10, 100)) {
            System.out.println(i);
        }
    }

    public static class Range implements Iterable<Integer> {
        int start;
        int end;
        private Range(int from, int to) {
            this.start = from;
            this.end = to;
        }

        public static Range fromTo(int start, int end) {
            return new Range(start, end);
        }

        @Override
        public Iterator<Integer> iterator() {
            return new NewIterator(start);
        }

        public class NewIterator implements Iterator<Integer> {
            int current;

            public NewIterator(int current) {
                this.current = current;
            }

            @Override
            public boolean hasNext() {
                return current <= end;
            }

            @Override
            public Integer next() {
                return current++;
            }
        }
    }
}
