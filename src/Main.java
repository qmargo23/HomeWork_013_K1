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
         //System.out.println("whiteFang = " + whiteFang.getYear());
//        Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.

        System.out.println(markTwain);
        System.out.println(martinId);
// equals
        System.out.println("_______equals________ ");
        Author markTwain2 = new Author("Марк2","Твейн");
        if (markTwain2.equals(markTwain)) {
            System.out.println("Внимание есть дубликат книги!");
        } else System.out.println("Дубликаты книг не найдены.");
        // hashCode
        System.out.println("_______hashCode________ ");
        Author jackLondon2 = new Author("Джек","Лондон");

        System.out.println("jackLondon.hashCode() = " + jackLondon.hashCode());
        System.out.println("jackLondon2.hashCode() = " + jackLondon2.hashCode());

    }
}