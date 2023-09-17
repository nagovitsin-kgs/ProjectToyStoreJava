package projectToyShop.model.goods;

/**
 * 1). Создаём класс Toy, который будет представлять собой игрушку. У класса
 * должны быть следующие поля: id игрушки (тип int), название игрушки (тип
 * String), и частота выпадения игрушки (тип int).
 */

public class Toy {

    private int id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {

        this.id = id;
        this.name = name;
        this.weight = weight;

    }

    public int getId() {

        return id;

    }

    public String getName() {

        return name;

    }

    public int getWeight() {

        return weight;

    }

}
