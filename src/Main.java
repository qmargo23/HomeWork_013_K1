public class Main {
    public static void main(String[] args) {
        System.out.println("Book and Author");
        System.out.println("____________________");
// В методе main создайте несколько объектов «Книга» (достаточно двух)
// и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их.
        Author markTwain = new Author("Марк","Твейн");
        Author jackLondon = new Author("Джек","Лондон");
// Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
//Метод main не должен находиться в классах Book и Author.
        Book whiteFang = new Book("Белый Клык", jackLondon, 1996 );
        Book martinId = new Book("Мартин Иден", jackLondon, 1909);
//В том же методе main измените год публикации одной из книг с помощью сеттера.
        whiteFang.setYear(1906);
// проверка
//        System.out.println("whiteFang = " + whiteFang.getYear());

    }
}