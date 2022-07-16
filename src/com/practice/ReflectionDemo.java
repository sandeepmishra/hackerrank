package com.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import java.security.PrivilegedAction;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class ReflectionDemo {
    private final Boolean APPSERVER_MODE=true;
    //private static final Boolean FALSE = false;
    public static void main(String[] args) throws Exception {
        //setPrivateProperty(ReflectionDemo.class, "APPSERVER_MODE", Boolean.FALSE);
        //System.out.println("Setting of value is done.");
        //setFinalStatic(Boolean.class, true);
        //System.out.println(UUID.randomUUID());
        System.out.println(getCurrentDate());
    }

    public static void setPrivateProperty(Class<?> clazz, String variable, Object value){
        try{
            Field f = clazz.getDeclaredField(variable);
            f.setAccessible(true);
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);
            modifiersField.setInt(f, f.getModifiers() & ~Modifier.FINAL);
            if(value!=null){
                f.set(null, value);
            }

        }catch (Exception e){
            throw new IllegalStateException("Error setting value");
        }

    }

    static void setFinalStatic(Class<Boolean> booleanClass, Object newValue) throws Exception {
        Field field = booleanClass.getClass().getDeclaredField("FALSE");
        field.setAccessible(true);

        Field modifiersField = Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);


        modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);

        field.set(null, newValue);
    }

    public static String getCurrentDate(){
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat= new SimpleDateFormat("yyyy-mm-dd");
        return dateFormat.format(calendar.getTime());
    }
}
