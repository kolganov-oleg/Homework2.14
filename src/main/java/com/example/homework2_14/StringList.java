package com.example.homework2_14;

public interface StringList {


    // Добавление элемента.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(String item);

    // Добавление элемента
    // на определенную позицию списка.
    // Если выходит за пределы фактического
    // количества элементов или массива,
    // выбросить исключение.
    // Вернуть добавленный элемент
    // в качестве результата выполнения.
    String add(int index, String item);

    // Установить элемент
    // на определенную позицию,
    // затерев существующий.
    // Выбросить исключение,
    // если индекс больше
    // фактического количества элементов
    // или выходит за пределы массива.
    String set(int index, String item);

    // Удаление элемента.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    String remove(String item);

    // Удаление элемента по индексу.
    // Вернуть удаленный элемент
    // или исключение, если подобный
    // элемент отсутствует в списке.
    String remove(int index);

    // Проверка на существование элемента.
    // Вернуть true/false;
    boolean contains(String item);

    // Поиск элемента.
    // Вернуть индекс элемента
    // или -1 в случае отсутствия.
    int indexOf(String item);

    boolean isEmpty();

    void clear();

    Object[] toArray();

    int lastIndexOf(String item);

    String get(int index);

    boolean equals(StringList otherList);

    int size();
}