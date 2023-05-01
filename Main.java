package BookSequencer;


import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books=new TreeSet<Book>(new OrderNameComparator());
        books.add(new Book("1984",352,"George Orwell",1949));
        books.add(new Book("Hayvan Çiftliği",152,"George Orwell",1945 ));
        books.add(new Book("Anna Karenina",1120,"Tolstoy",1877));
        books.add(new Book("Yer Altından Notlar",139,"Dostoyevski",1864));
        books.add(new Book("Burun",73,"Gogol",1836));

        for(Book book: books){
            System.out.println(book.getName());
        }




    }
}
