public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        StringBuilder todo = new StringBuilder(todoText);
        String title = "My todo:\n";
        String do1 = " - Download games\n";
        String do2 = "\t - Diablo";

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo
        todo.insert(0, title);
        todo.append(do1);
        todo.append(do2);
        todoText = todo.toString();

        System.out.println(todoText);
    }
}