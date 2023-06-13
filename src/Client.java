public class Client {
    public static void main(String[] args) {
        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of Data:\nMyra\nLucy\n");

        System.out.println(fileWriterUtil + "\n\n");

        // let's save the file
        caretaker.save(fileWriterUtil);

        // now write something else
        fileWriterUtil.write("Second set of data: \nCalebe\n");

        // checking file contents
        System.out.println(fileWriterUtil + "\n\n");

        // let's undo to last save
        caretaker.undo(fileWriterUtil);

        // checking the content again
        System.out.println(fileWriterUtil + "\n\n");

    }
}