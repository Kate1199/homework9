package academy.belhard;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIOUtil {

    public static void writePersons(String fileName, List<Person> people) {
        try (FileWriter file = new FileWriter(fileName)) {
            for (Person p : people) {
                file.write(p.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Person> readPersons(String fileName) throws IOException{
        String[] readStr;
        List<Person> people = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String read;
            while ((read = reader.readLine()) != null) {
                if(read == null)
                    throw  new EmptySourceFileException("File is empty");
                readStr = read.split(" ");
                people.add(new Person(readStr[1], readStr[0], new Address(readStr[2], readStr[3], Integer.parseInt(readStr[4]))));
            }
        } catch (EmptySourceFileException e) {
            e.printStackTrace();
        }
        return people;
    }
}


