package projectToyStore.model.toys;

import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

import projectToyStore.model.goods.Toy;

/**
 * 2). Создаём класс ToyShop, который будет представлять собой магазин игрушек.
 * У класса должно быть следующее поле: очередь игрушек (тип PriorityQueue).
 */

public class ToyStore {

    private PriorityQueue<Toy> queue;

    public ToyStore() {

        this.queue = new PriorityQueue<>();

    }

    public void addToy(Toy toy) {

        queue.add(toy);

    }

    public void get() {

        Toy selectedToy = queue.poll();

        int randomNumber = (int) (Math.random() * 2) + 2; // Генерация случайного числа 2 или 3

        if (randomNumber <= selectedToy.getFrequency()) {

            System.out.println("Выбранная игрушка: " + selectedToy.getName());

            writeToFile("Выбранная игрушка: " + selectedToy.getName());

        } else {

            System.out.println("Выбранная игрушка: Никто");

            writeToFile("Выбранная игрушка: Никто");

        }
    }

    private void writeToFile(String content) {

        try (FileWriter fileWriter = new FileWriter("output.txt", true)) {

            fileWriter.write(content + "n");

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

    @Override
    public String toString() {

        return "ToyStore [queue=" + queue + "]";

    }

}
