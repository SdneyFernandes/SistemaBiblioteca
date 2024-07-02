package util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionsUtil {
    public static void printClassMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }

    public static void printClassFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }
}
