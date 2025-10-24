package ru.oop.task3;

import java.util.List;

/**
 * <b>Задача 3:</b><br>
 * То же самое, что и задача 2, но добраться нужно с пересадками<br>
 * Можно определить транспортные средства списком:<br>
 * {@code List.of(new Car(person), new Bus("43", person),
 *        new Bus("50", person));}
 * <ul>
 *   <li>Код не должен превышать 12 строк</li>
 *   <li>Запрещено реализовывать конструкторы и методы, кроме moveTo(...)</li>
 *   <li>Запрещено добавлять новые методы в класс Main</li>
 *   <li>Разрешено создавать новые классы и интерфейсы</li>
 *   <li>Все добавленные интерфейсы, классы и методы должны иметь JavaDoc!</li>
 * </ul>
 *
 * @author vpyzhyanov
 * @since 21.10.2020
 */
public class MainTask3 {

    /**
     * Переехать из текущего места в заданную точку
     * на любом транспорте
     * <br>
     * Алгоритм:
     * <ol>
     *   <li>В цикле пройти по списку транспортных средств: дойти пешком до каждого транспорта и на нём доехать до пункта назначения.</li>
     *   <li>После завершения цикла дойти пешком до конечного пункта назначения.</li>
     * </ol>
     * @see Person
     * @see Position
     *
     * @param person       человек, который перемещается
     * @param destination  пункт назначения
     * @param vehicleList  список транспортных средств для перемещения
     */
    public void moveTo(Person person,
                       Position destination, List<Vehicle> vehicleList) {
        for (Vehicle vehicle : vehicleList) {
            person.walk(vehicle.getPosition());
            vehicle.moveTo(person, destination);
        }
        person.walk(destination);
        assert person.getPosition() == destination;

    }
}
