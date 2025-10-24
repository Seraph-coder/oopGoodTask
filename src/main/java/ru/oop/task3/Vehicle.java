package ru.oop.task3;

import ru.oop.task1.Person;

/**
 * Интерфейс транспортного средства.
 * Расширяет Positioned, то есть знает своё местоположение и может его изменить,
 * а также может перемещаться к указанной позиции.
 */
public interface Vehicle extends Positioned {
    /**
     * Переместиться к указанной позиции
     */
    void moveTo(Person person, Position destanation);
}
