public class Person {
    public String personInfo(String name, String surname, String city, long phone){
        String personsName = name;
        String personsSurname = surname;
        String personsCity = city;
        long personsPhone = phone;

        String res = String.format("Зателефонувати громадянину %s %s із міста %s можна за номером %d",
                personsName, personsSurname, personsCity, personsPhone);
        return res;
    }
}
