package by.it.tereshko.jd02_04.matlab;

import java.io.*;

public class MapVars {
    private static String getFilename() {
        String src = System.getProperty("user.dir") + "/src/by/it/tereshko/";
        return src + "jd02_04/matlab/vars.txt";
    }

    private MapVars() {
    } //запрет на создание экземпляра класса MapVars

    /** запись в текстовый файл */
    static void saveMapToFile() {
        try (PrintWriter out = new PrintWriter(new FileWriter(getFilename()))) {
            //Var.vars уже имеет анонимный класс с toString нужного формата (A=9 и т.д.)
            out.print(Var.vars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** чтение из текстового файла */
    static void loadMapFromFile() {
        File file = new File(getFilename());
        Parser parser = new Parser();
        if (file.exists())
            try (BufferedReader in = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = in.readLine()) != null) {
                    parser.calc(line);
                }
                in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}