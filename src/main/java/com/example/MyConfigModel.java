package com.example;

import io.wispforest.owo.config.annotation.Config;

@Config(name = "my-config", wrapperName = "MyConfig")
public class MyConfigModel {
    public int anIntOption = 16;
    public boolean aBooleanToggle = false;

    public Choices anEnumOption = Choices.ANOTHER_CHOICE;

    public enum Choices {
        A_CHOICE, ANOTHER_CHOICE;
    }
}