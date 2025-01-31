package org.example;

import java.util.ArrayList;

public class SimpleStack implements Stack {

    private ArrayList<Item> pile = new ArrayList<>();

    private int taille = 0;

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        return taille == 0;
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return taille;
    }

    /**
     * Pushes an item onto the top of this stack.
     *
     * @param item an item of the stack
     * @throws NullPointerException if the item is null.
     */
    @Override
    public void push(Item item) {

        if (item == null) {
            throw new NullPointerException("The pushed item is must not be null");
        }

        pile.add(taille, item);
        taille++;
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item peek() throws EmptyStackException {

        if (taille == 0) {
            throw new EmptyStackException();
        }

        return pile.get(taille-1);
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {

        if (taille == 0) {
            throw new EmptyStackException();
        }

        taille--;
        return pile.remove(taille);
    }
}
