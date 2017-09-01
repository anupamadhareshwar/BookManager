import java.util.ArrayList;

/**
 * Created by anupamadhareshwar on 01/09/17.
 */

public class SimpleBookManager implements BookManagerInterface {

    ArrayList<Book> myLibrary= new ArrayList<Book>();
    @Override
    public int count() {
        return myLibrary.size();
    }

    @Override
    public Book getBook(int index) {
        return myLibrary.get(index);
    }

    @Override
    public Book createBook() {
        Book myBook= new Book();
        myLibrary.add(myBook);
        return null;
    }
    @Override
    public ArrayList<Book> getAllBooks() {
        return myLibrary;
    }

    @Override
    public void removeBook(Book book) {
        myLibrary.remove(book);

    }

    @Override
    public void moveBook(int from, int to) {


    }

    @Override
    public int getMinPrice() {
        int minPrice=myLibrary.get(0).getPrice();
        for (int i = 0; i < count(); i++) {
            int tempPrice=myLibrary.get(i).getPrice();
            if(tempPrice < minPrice) {
                minPrice = tempPrice;
            }
        }
        return minPrice;
    }

    @Override
    public int getMaxPrice() {
        int maxPrice = myLibrary.get(0).getPrice();
        for (int i = 0; i < count(); i++) {
            int tempPrice = myLibrary.get(i).getPrice();
            if(tempPrice > maxPrice) {
                maxPrice = tempPrice;
            }
        }
        return maxPrice;
    }

    @Override
    public float getMeanPrice() {

        return (float)getTotalCost()/count();
    }

    @Override
    public int getTotalCost() {
        int mySum=0;
        for (int i = 0; i < count(); i++) {
            mySum += myLibrary.get(i).getPrice();
        }
        return mySum;
    }

    @Override
    public void saveChanges() {

    }
}
