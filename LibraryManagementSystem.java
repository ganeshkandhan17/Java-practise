class Library{
    String title;
    String itemId;
    

}
class Book extends Library{
    String author;
    int page;
    Book(String title, String id, String auth, int page){
        this.title=title;
        this.itemId=id;
        this.author=auth;
        this.page=page;
    }
    void getbook(){
        System.out.println("Book");
        System.out.println("Title= "+title);
        System.out.println("Id="+itemId);
        System.out.println("Author= "+author);
        System.out.println("No of page= "+page);
        System.out.println();
    }
}
class Magazine extends Library{
    int issueno;
    String pubmonth;
    Magazine(String title, String id, int iss, String pub){
        this.title=title;
        this.itemId=id;
        this.issueno=iss;
        this.pubmonth=pub;
    }
    void getMagazine(){
        System.out.println("Magazine");
        System.out.println("Title= "+title);
        System.out.println("Id="+itemId);
        System.out.println("Issue No= "+issueno);
        System.out.println("Publication Month= "+pubmonth);
        System.out.println();
    }
   
}
class DVD extends Library{
    String director;
    int duration;
    DVD(String title, String id, String dir, int dur){
        this.title=title;
        this.itemId=id;
        this.director=dir;
        this.duration=dur;
    }
    void getdvd(){
        System.out.println("DVD");
        System.out.println("Title= "+title);
        System.out.println("Id="+itemId);
        System.out.println("Director= "+director);
        System.out.println("Duration= "+duration+ " Min");
        System.out.println();
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        System.out.println();
        Book book1=new Book("Great Gatsby","B001","F. Scott Fitzgerld",180);
        book1.getbook();
        Magazine mag1=new Magazine("National Geography", "M001", 100, "Jun 2024");
        mag1.getMagazine();
        DVD cd1=new DVD("Vettaikaran","D100","Nelson",90);
        cd1.getdvd();
    }
}
