import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Timer;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        final String dir = System.getProperty("user.dir");
        System.out.println(dir);
        File folder = new File(dir + "/BTU_DOCUMENT");
        File[] listOfFiles = folder.listFiles();
        String s;
        Scanner sc = new Scanner(System.in);


        CountThread countThread = new CountThread();
        countThread.start();
        while (true) {
            System.out.println("შემოიტანე საძიებო სიტყვა:");
            s = sc.nextLine();
            System.out.println("შემოტანილი სიტყვა :" + s);

            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    if (listOfFiles[i].getName().startsWith(s)) {
                        System.out.println("მოიძებნა " + listOfFiles[i].getName());

                    }
//
                }
            }
        }


    }
}
