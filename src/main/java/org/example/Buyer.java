package org.example;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * Класс, представляющий покупателя.
 */
@ToString
public class Buyer {
    @Getter
    @Setter

    String name;
    private Gender gender;
//    enum Gender {MALE, FEMALE}
    /**
     * Конструктор для создания нового сотрудника.
     *
     * @param name   имя покупателя
     * @param gender пол покупателя
     */
    public Buyer(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }
}
