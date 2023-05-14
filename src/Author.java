import java.util.Objects;

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
//Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//    Обратите внимание, что toString книги не должен дублировать код из toString автора,
//    а должен делегировать (вызывать) его версию метода.

    @Override
    public String toString() {
        return "Имя " + "автора книги - " + name + ", фамилия автора книги - " + lastName;
    }
    // equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName);
    }
}
