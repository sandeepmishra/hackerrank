package com.practice.coding;


import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

public class AnnotationValMask {


    public static void main(String[] args) {
        Student student  = new Student();
        student.setRoleNumber(UUID.randomUUID().toString());

        System.out.println(student.getRoleNumber());
    }

    static class Student{

        @TestAnnotation
        public String roleNumber;

        public String getRoleNumber() {
            return roleNumber;
        }

        public void setRoleNumber(String roleNumber) {
            this.roleNumber = roleNumber;
        }


    }
}
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

@interface TestAnnotation{

}


class MaskFieldValue {

    public void maskFieldValue(String object) throws NoSuchFieldException {

//        Field field =  AnnotationValMask.Student.class.getField("roleNumber");// obtain method object
//        //Field field = new Field();
//        Annotation annotation = field.getAnnotation(TestAnnotation.class);
//
//        if(annotation instanceof TestAnnotation){
//            TestAnnotation myAnnotation = (TestAnnotation) annotation;
//
//        }

        Field[] fields = AnnotationValMask.Student.class.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(TestAnnotation.class)) {
                TestAnnotation fAnno = field.getAnnotation(TestAnnotation.class);
                System.out.println("Field: " + field.getName());
//                System.out.println("DoItLikeThat:" + fAnno.shouldDoItLikeThat());
//                for (String role : fAnno.roles()) {
//                    System.out.println("Role: " + role);
//                }
            }
        }
    }


}
