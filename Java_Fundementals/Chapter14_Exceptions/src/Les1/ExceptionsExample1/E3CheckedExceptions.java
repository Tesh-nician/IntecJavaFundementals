package Les1.ExceptionsExample1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E3CheckedExceptions {
    public static void main(String[] args) {

        try {
            String a = "C:\\Users\\intec\\Desktop\\exceptionsDummy.docx";
            FileInputStream fis = new FileInputStream(a);
            System.out.println("Deze file bestaat");
        } catch (FileNotFoundException exception) {
            System.out.println("File not found");
            exception.printStackTrace();
        }
        System.out.println("Deze code werkt");
    }
}
