import model.Flat;
import model.Floor;
import model.House;
import model.Room;

import java.sql.Date;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Setting up rooms (6)
        Room roomNr1 = new Room();
        roomNr1.setHeight(3.00);
        roomNr1.setLightOn(false);

        Room roomNr2= new Room();
        roomNr2.setHeight(3.10);
        roomNr2.setLightOn(false);

        Room roomNr3= new Room();
        roomNr3.setHeight(2.90);
        roomNr3.setLightOn(true);

        Room roomNr4 = new Room();
        roomNr4.setHeight(9.00);
        roomNr4.setLightOn(false);

        Room roomNr5 = new Room();
        roomNr5.setHeight(9.00);
        roomNr5.setLightOn(true);

        Room roomNr6 = new Room();
        roomNr6.setHeight(7.00);
        roomNr6.setLightOn(false);

        //Setting up flats
        Flat flatNr1 = new Flat();
        flatNr1.setNr(1);
        flatNr1.setArea(64.14);
        flatNr1.setOwner("Kostik");

        List<Room> roomsIn1 = new ArrayList<>();
        roomsIn1.add(roomNr1);
        roomsIn1.add(roomNr2);

        flatNr1.setRooms(roomsIn1);
        //--------------------------------------------
        Flat flatNr2 = new Flat();
        flatNr2.setNr(2);
        flatNr2.setArea(34.14);
        flatNr2.setOwner("Kostik");

        List<Room> roomsIn2 = new ArrayList<>();
        roomsIn2.add(roomNr3);

        flatNr2.setRooms(roomsIn2);
//--------------------------------------------
        Flat flatNr3 = new Flat();
        flatNr3.setNr(3);
        flatNr3.setArea(64.14);
        flatNr3.setOwner("Kostik");

        List<Room> roomsIn3 = new ArrayList<>();
        roomsIn3.add(roomNr4);
        roomsIn3.add(roomNr5);

        flatNr3.setRooms(roomsIn3);
        //--------------------------------------------
        Flat flatNr4 = new Flat();
        flatNr4.setNr(4);
        flatNr4.setArea(34.14);
        flatNr4.setOwner("Kostik");

        List<Room> roomsIn4 = new ArrayList<>();
        roomsIn4.add(roomNr6);

        flatNr4.setRooms(roomsIn4);


        //Setting up floors
        Floor floorNr1 = new Floor();
        floorNr1.setNr(1);
        List<Flat> flats1 = new ArrayList<>();
        flats1.add(flatNr1);
        flats1.add(flatNr2);
        floorNr1.setFlats(flats1);


        //Setting up house

        House house = new House();
        house.setNr(221);
        house.setStreetName("Baker str.");

        List<Floor> floors = new ArrayList<>();
        floors.add(floorNr1);
        floors.add(new Floor());
        house.setFloors(floors);
        System.out.println(house.getFloors().get(0).getFlats().get(0).getRooms().get(0).getHeight());






////        System.out.println("Hello, world!");
//
//        SomeFunctions functions = new SomeFunctions();
////        String text = functions.getWelcomeText("Валера");
////        System.out.println(text);
//
// //       System.out.println(functions.getEurFromUsd(150.00, 0.8924));
// //       System.out.println(functions.getCalories(2, 1));
// //       Date test = new Date(120, 5, 28);
// //       System.out.println(functions.getMsFromDate(test));
//        String text ="Ранее 28 июня сообщалось, что кандидат от Демократической партии США на предстоящих президентских выборах Джо Байден призвал не приглашать Россию присоединиться к G7, если информация, опубликованная The New York Times о предположительном взаимодействии Москвы с афганскими боевиками, правдива. Он также обвинил Трампа в том, что тот несколько месяцев знал об этом опасном для Вашингтона взаимодействии и не ввел никаких санкций за грубейшее нарушение международного права.";
//
//        String[] words = text.split(" ");
//        System.out.println(words.length);
////        System.out.println(words[4]);
//        for (int i = 0; i < words.length; i++) {
//            System.out.println("The word with id " + i + " is: " + words[i]);
//        }
//
//        for (String word : words) {
//            System.out.println(word);
//        }
//
//        List<String> names = new ArrayList<>();
//        names.add("Валерий");
//        names.add("Константин лучший");
//        names.add("Максим");
//        names.add("Андрей");
//
//        System.out.println(names.get(1));
//
//        for (String word : words) {
//            names.add(word);
//        }
//
//        System.out.println(names.size());
//        for (String name : names) {
//            System.out.println(name);
//        }
//
//        HashMap<String, Integer> bookUniqueWords = new HashMap<>();
////        bookUniqueWords.put(names<0>, 1);
////        bookUniqueWords.put(names<1>, 1);
//        for (String name : names) {
//
//            bookUniqueWords.put(name, 1);
//        }
//
//        for (Map.Entry<String, Integer> entry : bookUniqueWords.entrySet()) {
//            System.out.println(entry.getValue() + " " + entry.getKey());
//        }
//        System.out.println(bookUniqueWords.containsKey("Байден"));




    }


}
