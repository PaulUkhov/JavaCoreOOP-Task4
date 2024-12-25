package org.example;
import lombok.Getter;
/**
 * Класс, представляющий перечисление праздников.
 */
@Getter
public enum Holiday {
    /**
    * Перечисление
    * @params NEW_YEAR
    * @params INTERNATIONAL_WOMENS_DAY
    * @params DEFENDER_OF_THE_FATHERLAND_DAY
     */
    NEW_YEAR("31.12.2024"),

    INTERNATIONAL_WOMENS_DAY("08.03.25"),

    DEFENDER_OF_THE_FATHERLAND_DAY("23.02.2024");
    /**
     * Конструктор
     */
    String s;
    Holiday(String s) {
        this.s=s;
    }
}
