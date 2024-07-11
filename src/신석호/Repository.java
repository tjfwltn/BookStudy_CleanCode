package 신석호;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Repository {
    public static void main(String[] args) {

    }

    public void asd() {
        try {
            FileInputStream fileInputStream = new FileInputStream("");
        } catch (FileNotFoundException e) {
            throw new RuntimeFileNotFoundException(e);
        }
    }
}
