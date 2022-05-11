package uz.epam.task.repository;

import uz.epam.task.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayRepository {
    private static final CustomArrayRepository instance = new CustomArrayRepository();
    private final List<CustomArray> customArrayList;

    private CustomArrayRepository() {
        customArrayList = new ArrayList<>();
    }

    public static CustomArrayRepository getInstance() {
        return instance;
    }

    public boolean save(CustomArray customArray) {
        if (customArray == null) {
            throw new NullPointerException();
        }
        return customArrayList.add(customArray);
    }
}
