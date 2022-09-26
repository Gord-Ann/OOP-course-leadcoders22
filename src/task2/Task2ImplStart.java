package task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2ImplStart {
    private final ElementExampleImpl.Context context = new ElementExampleImpl.Context();

    public void testAssignNumbers() throws Exception {
        List<IElement> elems = new ArrayList<>();
        Collections.addAll(elems, new ElementExampleImpl(context, 1),
                new ElementExampleImpl(context, -1),new ElementExampleImpl(context, 3),new ElementExampleImpl(context, 0));
        Task2Impl.INSTANCE.assignNumbers(elems);
        System.out.println(elems);
    }
}
