package projectToyShop.model.toys;

import java.util.PriorityQueue;

import projectToyShop.model.goods.Toy;

/**
 * 2). Создаём класс ToyShop, который будет представлять собой магазин игрушек.
 * У класса должно быть следующее поле: очередь игрушек (тип PriorityQueue).
 */

public class ToyShop {

    private PriorityQueue<Toy> toys;

    public ToyShop() {

        toys = new PriorityQueue<>();

    }

    public void addToy(Toy toy) {

        toys.add(toy);

    }

    public Toy getToy() {

        return toys.poll();

    }

}
