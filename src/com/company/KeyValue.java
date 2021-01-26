package com.company;

public class KeyValue {
    private String KeyName;
    private String ValueOfKey;


    public KeyValue(String keyName, String valueOfKey) {
        KeyName = keyName;
        ValueOfKey = valueOfKey;
    }


    public String getKeyName() {
        return KeyName;
    }

    public void setKeyName(String keyName) {
        KeyName = keyName;
    }

    public String getValueOfKey() {
        return ValueOfKey;
    }

    public void setValueOfKey(String valueOfKey) {
        ValueOfKey = valueOfKey;
    }

}
