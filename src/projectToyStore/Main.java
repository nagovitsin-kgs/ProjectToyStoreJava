package projectToyStore;

import projectToyStore.model.goods.Toy;
import projectToyStore.model.toys.ToyStore;

/**
 * 3). Создаём класс Main, в котором будет основной функцилнал программы.
 * 
 * В результате работы програмы, будет создан файл result.txt, в котором будут
 * записаны названия игрушек, полученных в результате 10 вызовов метода getToy.
 * Количество выпадения каждой игрушки будет зависеть от их частоты выпадения,
 * заданной весом во время создания игрушек.
 */
public class Main {
    public static void main(String[] args) {

        ToyStore toyStore = new ToyStore();

        Toy toy1 = new Toy("123", "Медвежонок Тедде", 3);

        Toy toy2 = new Toy("456", "Кукла", 2);

        Toy toy3 = new Toy("789", "Автомобиль дистанционного управления", 1);

        toyStore.addToy(toy1);

        toyStore.addToy(toy2);

        toyStore.addToy(toy3);

        for (int i = 0; i < 10; i++) {

            System.out.println("Попытка " + (i + 1));

            toyStore.get();

            System.out.println();

        }

    }
}
