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

}
