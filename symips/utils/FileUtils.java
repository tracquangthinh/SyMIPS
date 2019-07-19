package symips.utils;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {

    public static void write(String path, String message) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), StandardCharsets.UTF_8))) {
            bw.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isExist(String path) {
        return new File(path).exists();
    }

    public static boolean isDir(String path) {
        return new File(path).isDirectory();
    }

    public static boolean delete(String path) {
        return new File(path).delete();
    }

    public static byte[] readBytesFromFile(String path) {
        FileInputStream fileInputStream = null;
        byte[] bytesArray = null;
        try {
            File file = new File(path);
            bytesArray = new byte[(int) file.length()];
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bytesArray);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return bytesArray;
    }

    public static String readFile(String path){
        StringBuilder sb = new StringBuilder();
        try{
            List<String> lines = Files.readAllLines(Paths.get(path));
            return String.join("\n", lines);
        } catch (IOException e){
            System.out.println(e);
        };
        return null;
    }

    public static List<String> getResourceFiles(String path) throws IOException {
        List<String> filenames = new ArrayList<>();
        InputStream in = getResourceAsStream(path);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String resource;
        while ((resource = br.readLine()) != null) {
            filenames.add(resource);
        }
        return filenames;
    }

    public static InputStream getResourceAsStream(String resource) {
        final InputStream in
                = getContextClassLoader().getResourceAsStream(resource);
        return in == null ? FileUtils.class.getResourceAsStream(resource) : in;
    }

    public static ClassLoader getContextClassLoader() {
        return Thread.currentThread().getContextClassLoader();
    }

//    public static void readResource(String path, OnResult onResult) {
//        InputStream fileInputStream = ClassLoader.getSystemResourceAsStream(path);
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8))) {
//            String line;
//            while ((line = br.readLine()) != null) onResult.onSuccess(line);
//            br.close();
//            fileInputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
