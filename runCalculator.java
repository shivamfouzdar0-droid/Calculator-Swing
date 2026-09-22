public class runCalculator {

    public static void main(String[] args) throws ReflectiveOperationException {
        Object view = Class.forName("ViewsCalculator")
                .getDeclaredConstructor().newInstance();
        Object model = Class.forName("ModelCalculator")
                .getDeclaredConstructor().newInstance();

        Class<?> controller = Class.forName("ControllerCalculator");
        for (var constructor : controller.getConstructors()) {
            if (constructor.getParameterCount() == 2) {
                constructor.newInstance(view, model);
                break;
            }
        }
        System.out.println("Calculator");
    }
}