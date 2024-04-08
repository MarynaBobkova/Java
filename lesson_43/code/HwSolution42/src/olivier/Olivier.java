package olivier;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Olivier implements Iterable<String> {
    private final String[] ingredients;

    public Olivier(String[] ingredients) {
        this.ingredients = ingredients;
    }


    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int position = 0;


            public boolean hasNext() {
                return position < ingredients.length;
            }

            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Все ингредиенты нарезаны!");
                }
                String ingredient = ingredients[position];
                position++;
                return ingredient;
            }
        };
    }
}
