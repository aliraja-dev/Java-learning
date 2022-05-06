public class App {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("The Lord of the Rings");
        book1.setAuthor("J.R.R. Tolkien");
        book1.setPublisher("Allen & Unwin");
        book1.setPages(1232);
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println(book1.getPages());
    }
}
