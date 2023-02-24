public class Main {
    public static void main(String[] args) {
        Author author = new Author("Chyngyz Aytmatov","chyngyz.kgz@gmail.com",'M');
        Author author1 = new Author("Lev Tolstoy","lev.toltol.@gmail.com",'M');

        Book book1 = new Book("Kyiamat",author,1500,1);
        Book book2 = new Book("Jamila",author,2000,2);
        Book book3 = new Book("Svadba",author,1200,3);
        System.out.println("Avtoru: "+author.getName());
        Book[] books = new Book[]{book1,book2,book3};
        for (Book a: books) {
            System.out.println(a.toString());
        }
        Book book4 = new Book("Sladkiy",author1,3000,1);
        Book book5 = new Book("Koroleva",author1,850,2);
        Book book6 = new Book("Svadba",author1,1700,3);
        System.out.println("Avtoru: "+author1.getName());
        Book[] books1 = new Book[]{book4,book5,book6};
        for (Book s : books1) {
            System.out.println(s.toString());
        }
    }
}