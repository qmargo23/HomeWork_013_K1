import java.util.Objects;

public class Book {
    //класс Book, который содержит в себе данные о названии,
    // авторе и годе публикации книги. Типы полей должны быть String,
    // Author (его мы создадим в п. 2) и int.
    private String name;
    private Author author;
    private int year;
// конструкторы для Book, заполняющий все поля.
    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
//    Создайте геттеры для всех полей Book.
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
//Создайте сеттер для поля «Год публикации» у Book.
    public void setYear(int year) {
        this.year = year;
    }
//Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
//    Обратите внимание, что toString книги не должен дублировать код из toString автора,
//    а должен делегировать (вызывать) его версию метода.
// toString
    @Override
    public String toString() {
        return "Название книги - " + '\"' + name + '\"' +". " + author + ", год издания - " + year;
    }
// equals и hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
