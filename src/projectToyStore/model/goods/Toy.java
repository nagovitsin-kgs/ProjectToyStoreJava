package projectToyStore.model.goods;

import java.util.Objects;

/**
 * 1). Создаём класс Toy, который будет представлять игрушку.
 */

public class Toy implements Comparable<Toy> {

    private String id;
    private String name;
    private int frequency;

    public Toy(String id, String name, int frequency) {

        this.id = id;
        this.name = name;
        this.frequency = frequency;

    }

    public String getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public int getFrequency() {

        return frequency;

    }

    @Override
    public int compareTo(Toy otherToy) {

        return Integer.compare(this.frequency, otherToy.frequency);

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Toy toy = (Toy) obj;

        return Objects.equals(id, toy.id) && Objects.equals(name, toy.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Toy [id=" + id + ", name=" + name + ", frequency=" + frequency + "]";
    }

}
