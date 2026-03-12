package Day6;

public class GenericClass {
    public static void main(String[] args) {
        printElement(135315);
        Demo<Integer> demo = new Demo<>();
        demo.putv(8767);
        System.out.println(demo.getv());
    }

    //Generic Method
    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }
}
