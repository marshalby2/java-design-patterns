package com.my.advance;

/**
 * @Description TODO
 * @Author marshal
 * @Date 17/4/20 11:25 AM
 */
public class Person {
    private  String name;
    private  String gender;
    private float height;
    private  int age;
    private String nation;

    // 私有化构造器
    private Person(Builder builder) {
        this.name = builder.name;
        this.gender = builder.gender;
        this.height = builder.height;
        this.age = builder.age;
        this.nation = builder.nation;
    }

    public static Person.Builder builder() {
        return new Person.Builder();
    }

    public static class Builder {
        private String name;
        private String gender;
        private float height;
        private int age;
        private String nation;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder height(float height) {
            this.height = height;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder nation(String nation) {
            this.nation = nation;
            return this;
        }

        public Person build() {
            // 将Builder对象传入Person构造器
            return new Person(this);
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", nation='" + nation + '\'' +
                '}';
    }
}