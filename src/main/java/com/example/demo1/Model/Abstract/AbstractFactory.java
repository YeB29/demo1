package com.example.demo1.Model.Abstract;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface AbstractFactory<T>{
    T create(String type) throws IOException;
}
