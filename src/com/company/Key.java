package com.company;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Key {
    private String KeyName;
    private String ValueOfKey;

    public Key(String keyName, String valueOfKey) {
        KeyName = keyName;
        ValueOfKey = valueOfKey;
    }

    class KeyW {
        public void KeyWriter() {
            try (FileWriter keyWriter = new FileWriter("./key.json");) {
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void KeyReader() {
            try (
                    FileReader keyReader = new FileReader("./text.json");
                    Scanner sc = new Scanner(keyReader)) {
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        class ValueW {
            public void ValueWriter() {
                try (FileWriter valueWriter = new FileWriter("./text.json");) {

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            public void ValueReader() {
                try (
                        FileReader valueReader = new FileReader("./text.json");
                        Scanner scanner = new Scanner(valueReader)
                ) {

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
