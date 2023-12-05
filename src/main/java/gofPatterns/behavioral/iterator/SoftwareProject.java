package gofPatterns.behavioral.iterator;

public class SoftwareProject implements Collection {
    String name;
    String[] stack;

    public SoftwareProject(String name, String[] stack) {
        this.name = name;
        this.stack = stack;
    }

    @Override
    public Iterator getIterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < stack.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return stack[index++];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getStack() {
        return stack;
    }

    public void setStack(String[] stack) {
        this.stack = stack;
    }
}
