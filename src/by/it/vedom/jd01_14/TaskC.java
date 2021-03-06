package by.it.vedom.jd01_14;

import java.io.File;

public class TaskC {

    static void processFolder (String prefix, File object) {

        if(object.isFile())
            System.out.println("File: " +prefix +object.getName());
        else {
            System.out.println("File: " +prefix +object.getName());
            File dir[] = object.listFiles();
            if(dir.length > 0 && dir != null)
            for (File f: dir)
                processFolder(prefix+ " ", f);
        }
    }

    public static void main(String[] args) {
        String root = System.getProperty("user.dir");
        String path = root + "/src/by/it/vedom/jd01_14/";
        File file = new File(path);
        processFolder("", file);

    }

}
