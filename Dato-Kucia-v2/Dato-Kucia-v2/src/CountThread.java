import java.io.File;

public class CountThread extends Thread {
    @Override
    public void run() {
        while (true) {

        final String dir = System.getProperty("user.dir");
        File folder = new File(dir + "/BTU_DOCUMENT");
        File[] listOfFiles = folder.listFiles();
        System.out.println(listOfFiles.length);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    }
}
