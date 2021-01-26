package com.company;


import java.util.Scanner;

public class ScanKey  implements Connectable {
    boolean connection;
    KeyValue[] keyValue = JsonReader.ReadKeyAndValue();
    Scanner sc = new Scanner(System.in);


    @Override
    public void OpenConnection() {
        connection = true;
        System.out.println("Соединение открыто ");
    }

    @Override
    public void CloseConnection() {
        connection = false;
        System.out.println("Соединение закрыто ");
    }

    @Override
    public void CheckConnection() {
        if (connection= true){
            System.out.println("Проверка завершена. Соединеие открыто ");
        }
        else System.out.println("Проверка завершена. Соединение закрыто ");
    }

    @Override
    public void scanKey() {
        System.out.println("Введите название ключа ");
        String nameK = sc.nextLine();
    }

    @Override
    public void creatKey() {
        System.out.println("Введите название ключа ");
        String keyName = sc.nextLine();
        System.out.println("Введите значение  ключа ");
        String valueOfKey = sc.nextLine();
        KeyValue newKey = new KeyValue(keyName,valueOfKey);
        JsonReader.WriteKeyAndValue(newKey);
    }

    @Override
    public void scanIndex() {
        String index = sc.nextLine();
        try {
            int idnexInt = Integer.parseInt(index);
        }catch (NumberFormatException e ) {
            System.out.println("Не правильно ввели индекс");
        }
    }

    @Override
    public void scanValue() {
        System.out.println("Введите значение ключа ");
        String scan = sc.nextLine();

    }

    @Override
    public void getAmountOfKey() {
        for (int i = 0; i < keyValue.length; i++) {
            System.out.println(i);
        }
    }

    @Override
    public void AddKey() {
    }

    @Override
    public void resetIndex() {
    }

    @Override
    public void changValueOfKey() {
    }
}
