package com.example.demo.user;

public class UserDto {
    private String name;
    private String email;
    private int age;

    // 생성자
    public UserDto() {}

    // Getter/Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}