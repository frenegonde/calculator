package lesson;

import java.util.Scanner;

public class Main {

    //Добавить локальный репозиторий к проекту:
    //VCS->import into version control->create git repository, выбираем корневую папку проекта-> ok

    //В файле .gitignore указываем все файлы, папки, которые нужно игнорировать

    //Добавить все файлы проекта в отслеживаемые:
    //Правый клик по проекту->GIT->add

    //Нужно создать README.md файл с описанием проекта
    //Примеры офомрмления README: https://github.com/GnuriaN/format-README


    //Чтобы сделать коммит, нажимаем на зеленую галочку сверху справа

    //Цвета файлов:
    //Красный - неотслеживаемые файлы
    //Зелено-коричневый - игнорируемые файлы
    //Зеленые - отслеживаемые файлы, которые при коммите будет сохранены
    //Белый - файлы закомичены
    //Синий - в закомиченных файлах есть незамоиченные изменения

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a");
        int a = scn.nextInt();
        System.out.println("Enter b");
        int b = scn.nextInt();
        System.out.println(calculator.sum(a,b));

    }
}
