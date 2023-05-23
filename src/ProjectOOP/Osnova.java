package ProjectOOP;

public class Osnova {
    public static void main(String[] args){
        //Cоздаем объект
        Prostitytki Valeria = new Prostitytki(12,9000,50,"Поселок Ямантау, дом 1","Коричневые") ;// указываем класс на основе которого создаем объект , потом указываем название для объекта
        //Valeria.setValues(12,9000,50,"Поселок Ямантау, дом 1","Коричневые");
//        Valeria.weight = 50;
//        Valeria.color_hair = "Коричневые";
//        Valeria.adres = "Поселок Ямантау, дом 1";
//        Valeria.time_otsos = 15;

        String resV = Valeria.getValues();
        System.out.println(resV);

        Prostitytki Nastya = new Prostitytki(20,7000,55,"Поселок Бангладеш, дом 228","Блондинка") ;
        //Nastya.setValues( 20,7000,55,"Поселок Бангладеш, дом 228","Блондинка");
//        Nastya.weight = 55;
//        Nastya.color_hair = "Блондинка";
//        Nastya.adres = "Поселок Бангладеш, дом 228";
//        Nastya.time_otsos = 20;

        String resN = Nastya.getValues();
        System.out.println(resN);

        Prostitytki Sonya = new Prostitytki(30,3000,60,"Бункер номер 47, комната 3","Зеленые") ;
      //  Sonya.setValues(30,3000,60,"Бункер номер 47, комната 3","Зеленые");
//        Sonya.weight = 60;
//        Sonya.color_hair = "Зеленые";
//        Sonya.adres = "Бункер номер 47, комната 3";
//        Sonya.time_otsos = 30;

//        System.out.println("Цена Сони: " + Sonya.cost + "руб. | " + "Цена Насти: " + Nastya.cost + "руб. | " + "Цена Леры: " + Valeria.cost + "руб.");


        String resS = Sonya.getValues();
        System.out.println(resS);



    }
}
