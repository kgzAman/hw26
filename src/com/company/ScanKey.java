package com.company;


import java.util.Scanner;

public class ScanKey  implements Connectable {
    boolean connection;
    KeyValue[] keyValue = JsonReader.ReadKeyAndValue();



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
        Scanner sc = new Scanner(System.in);
        String index = sc.nextLine();
        try {
            int idnexInt = Integer.parseInt(index);
        }catch (NumberFormatException e ) {
            System.out.println("Не правильно ввели индекс");
        }
        

    }

    @Override
    public void creatKey() {
    }

    @Override
    public void scanIndex() {
    }

    @Override
    public void scanValue() {
    }

    @Override
    public void getAmountOfKey() {
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
