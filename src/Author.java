public class Author {
//класс Author, который содержит в себе данные об имени и фамилии автора.
    private String name;
    private String lastName;
// конструкторы для Author, заполняющий все поля.
    public Author(String name, String lastName) {
      this.name = name;
      this.lastName = lastName;
    }
//    Создайте геттеры для всех полей Author
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }

}
