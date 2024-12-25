package org.example;
import lombok.Getter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
/**
 * Класс, представляющий сотрудника.
 */
@Getter
public class Employe {
    //Присваиваем значение
    private static final Gender FEMALE = Gender.valueOf("FEMALE");
    private static final Gender MALE = Gender.valueOf("MALE");
    List<Employe> employeList;
    private Gender gender;
    private String name;
    /**
     * Конструктор для создания нового сотрудника.
     * @param name имя сотрудника
     * @param gender пол сотрудника
     */
    public Employe(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    // Метод для поздравления
    public void congratulations(List<Employe> employeList, Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String formatDate = simpleDateFormat.format(date);
            //Если нет праздника,никого не поздравляем
        if (!formatDate.equals(Holiday.NEW_YEAR.getS()) &&
                !formatDate.equals(Holiday.INTERNATIONAL_WOMENS_DAY.getS()) &&
                !formatDate.equals(Holiday.DEFENDER_OF_THE_FATHERLAND_DAY.getS())) {
            System.out.println("Простой день без поздравлений ");
            return;
        }
            //Если Новый год
        if (formatDate.equals(Holiday.NEW_YEAR.getS())) {
            for (Employe employe : employeList) {
                System.out.println("Поздравляем с Новым Годом - " + employe.getName());
            }
            return;
        }
            //Если 8 Марта
        if (formatDate.equals(Holiday.INTERNATIONAL_WOMENS_DAY.getS())) {
            for (Employe employe : employeList) {
                if (employe.getGender() == Gender.FEMALE) {
                    System.out.println("Поздравляем c 8 Марта " + getName());
                }
            }
        }
            //Если 23 Февраля
        if (formatDate.equals(Holiday.DEFENDER_OF_THE_FATHERLAND_DAY.getS())) {
            for (Employe employe : employeList) {
                if (employe.getGender() == Gender.MALE) {
                    System.out.println("Поздравляем Защитников Отечества ! " + getName());
                }
            }
        }
    }
}
