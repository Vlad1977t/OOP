package ProjectOOP;

public class Prostitytki {//модификатор доступа , класс , название

    public int time_otsos , cost , weight;
    public String adres , color_hair;

    public Prostitytki(int _time_otsos ,int _cost ,int _weight, String _adres ,String _color_hair){
        setValues(_time_otsos, _cost, _weight, _adres, _color_hair);
        System.out.println("Характеристики проституток");

    } //создаем конструктор

    public void setValues(int time_otsos ,int cost ,int weight, String adres ,String color_hair){

        this.time_otsos = time_otsos;
        this.cost = cost;
        this.weight = weight;
        this.adres = adres;
        this.color_hair = color_hair;
    }

    public String getValues(){

        String info = "Время отсосса: " + time_otsos + " минут, " + "Цена: " + cost + "$, " + "Вес: " + weight + " кг, " + "Адрес: " + adres +". "+ "Цвет волос: " + color_hair ;
        return info;

    }



}








// модификаторы доступа :
// -public - если приписываем к чему либо (класс , метод итд), то он будет доступен из других файлов,классов итд.
// -private - если приписываем возле класса , поля или метода , то говорим что это будет закрытым
// и будет виден внутри самого класса итд
// -protected - говорит о том что :класс , переменная или функция , будут доступны только внутри самого этого класса
// или внутри классов наследников