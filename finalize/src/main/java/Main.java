import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){
        try (Finalize f = new Finalize()) {
            System.out.println("try文の中");
        } catch (Exception e) {
            e.printStackTrace();
        }

        String path = new File(".").getAbsoluteFile().getParent();

        try (Stream<String> stream = Files.lines(Paths.get(path+"/src/main/resources/test.txt"), StandardCharsets.UTF_8)) {
            stream.forEach(System.out::println);
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        MulutiValueMap<String, String> a = new MulutiValueMap<>();
        a.put("a", Arrays.asList("aaa", "bbb"));
        System.out.println(a.get("a"));
    }
}

class MulutiValueMap<K, V> extends HashMap<K, List<V>> {}