class Person {
    private int age;
    private String name;
    private String gender;

    public void setAge(int age) throws IllegalAgeException {
        if (age < 1 || age > 150) {
            throw new IllegalAgeException("年龄必须在1到150之间");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}