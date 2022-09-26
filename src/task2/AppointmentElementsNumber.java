package task2;

import java.util.List;
import java.util.Set;

public class AppointmentElementsNumber {
    private int freeNumber = 0;

    public void appointmentNumber(List<IElement> elements) {
        setFreeNumber();
        assignNumbersHelper(elements);
    }

    /**
     * Находим минимальный свободный номер в MEMORY
     */
    private void setFreeNumber() {
        int free = Integer.MIN_VALUE;
        Set<Integer> numbers = Task2Impl.MEMORY.keySet();

        while (numbers.contains(free)) {
            free++;
        }

        freeNumber = free;
    }

    /**
     * проверка на свободу номеров и присвоение новых
     * @param elements список элементов
     */
    private void assignNumbersHelper(List<IElement> elements) {
        int counter = 1;

        for (IElement current : elements) {
            int currentNum = current.getNumber();
            //Текущий элемент должен быть равен порядковому числу (counter)
            if (currentNum != counter) {
                //Пытаемся найти элемент, равный порядковому числу
                IElement element = findElementByNumber(counter);
                if (element != null) {
                    rearrangeNumbers(current, element);
                } else { // counter - свободный номер, присваиваем его элементу
                    setupNumberAndUpdateMemory(current, counter);
                }
            }

            counter++;
        }
    }

    /**
     * Ищем число в MEMORY
     *
     * @param number искомое число
     * @return null, если элемент не найден
     */
    private IElement findElementByNumber(int number) {
        return Task2Impl.MEMORY.get(number);
    }

    /**
     * Замена элемента на свободный номер
     *
     * @param setup элемент, который принимает номер второго аргумента
     * @param free  элемент, который нужно заменить на свободный
     */
    private void rearrangeNumbers(IElement setup, IElement free) {
        int setupNumber = freeElement(free);

        freeNumber = setup.getNumber();
        setupNumberAndUpdateMemory(setup, setupNumber);
    }

    /**
     * Присвоение нового номера элементу
     *
     * @param element элемент, номер которого будет изменен
     * @return номер, присваиваемый элементу
     */
    private int freeElement(IElement element) {
        int save = element.getNumber();
        Task2Impl.MEMORY.remove(save);

        element.setupNumber(freeNumber);
        Task2Impl.MEMORY.put(element.getNumber(), element);

        freeNumber = save;
        return save;
    }

    /**
     * Обновление MEMORY
     * @param element элемент, которому присвоили другой номер
     * @param newNumber новый номер
     */
    private void setupNumberAndUpdateMemory(IElement element, int newNumber) {
        Task2Impl.MEMORY.remove(element.getNumber());
        element.setupNumber(newNumber);
        Task2Impl.MEMORY.put(element.getNumber(), element);
    }
}
