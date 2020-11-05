package utils;

import formas.Forma;
import formas.FormaComponent;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
    private Stack stack = new Stack();

    public CompositeIterator(Iterator iterator) {
        this.stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.empty())
            return false;

        Iterator iterator = (Iterator) stack.peek();
        if (!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            Iterator iterator = (Iterator) stack.peek();
            FormaComponent component = (FormaComponent) iterator.next();
            if (component instanceof Forma)
                stack.push(component.createIterator());
            return component;
        }
        return null;
    }


    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

}
