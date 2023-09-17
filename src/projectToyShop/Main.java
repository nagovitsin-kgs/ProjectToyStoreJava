package projectToyShop;

import java.io.FileWriter;
import java.io.IOException;

import projectToyShop.model.goods.Toy;
import projectToyShop.model.toys.ToyShop;

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

        ToyShop toyShop = new ToyShop();

        // Принимаем строки id, название, частоты выпадения игрушек и заполняем массивыЖ

        String[] ids = { "1", "2", "3" };
        String[] names = { "игрушка 1", "игрушка 2", "игрушка 3" };
        String[] weirghts = { "2", "2", "6" };

        for (int i = 0; i < ids.length; i++) {

            int id = Integer.parseInt(ids[i]);
            String name = names[i];
            int weirght = Integer.parseInt(weirghts[i]);

            Toy toy = new Toy(id, name, weirght);

            toyShop.addToy(toy);

        }

        // Создаём файл для записи результатов:

        try {

            FileWriter fileWriter = new FileWriter("result.txt");

            // Вызываем метод getToy 10 раз и записываем результат в файл:

            for (int i = 0; i < 10; i++) {

                Toy toy = toyShop.getToy();

                // Записываем результат в файл:

                fileWriter.write(toy.getName());
                fileWriter.write("n");

            }

            fileWriter.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
