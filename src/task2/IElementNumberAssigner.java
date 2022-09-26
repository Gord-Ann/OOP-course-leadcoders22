package task2;

import java.util.List;

/**
 * Интерфейс механизма «умного» присвоения номеров элементам списка.
 */
public interface IElementNumberAssigner {

    /**
     * Метод выставляет номера {@link IElement#setupNumber(int)}
     * для элементов коллекции {@code elements}
     * в порядке следования элементов в коллекции.
     *
     * Изначально коллекция не содержит элементов, номера которых повторяются.
     *
     * При этом обеспечиваются следующие условия:<ul>
     *  <li>
     *      <p>метод работает только с существующими элементами (не создает новых),</p>
     *  </li>
     *  <li>
     *      <p>на протяжении всей работы метода обеспечивается уникальность номеров элементов:</p>
     *      <p>вызов {@code element.setNumber(i)} разрешен ⇔   ∀ e ∊ {@code elements} (e.number ≠ i),</p>
     *  </li>
     *  <li>
     *      <p>метод устойчив к передаче в него в качестве параметра {@link java.util.Collections#unmodifiableList(List)} и любой другой реализации immutable-list,</p>
     *  </li>
     *  <li>
     *      <p>метод должен работать за «приемлемое» время ({@link IElement#setupNumber(int)} - трудоемкая операция и пользоваться ей надо рационально)</p>
     *  </li>
     * </ul>
     *
     * @param elements элементы, которым нужно выставить номера
     */
    void assignNumbers(List<IElement> elements);

}