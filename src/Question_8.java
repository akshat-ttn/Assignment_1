public class Question_8 {
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("com.example.MissingClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
