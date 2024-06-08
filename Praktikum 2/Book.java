public class Book {
    String title;
    String authorName;
    int publishedYear;
    int pagesAmount;
    int price;

    public Book(String tt, String nm, int yr, int pam, int pr) {
        title = tt;
        authorName = nm;
        publishedYear = yr;
        pagesAmount = pam;
        price = pr;
    }

    int size;
    int top;
    Book data[];

    public Book(int size) {
        this.size = size;
        data = new Book[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }

    public void push(Book book) {
        if (!isFull()) {
            top++;
            data[top] = book;
        } else {
            System.out.println("Stack is full");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Book removedBook = data[top];
            top--;
            System.out.println("Removed data: " + removedBook.title);
        } else {
            System.out.println("Stack is Empty");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Top Element: " + data[top].title);
        } else {
            System.out.println("Stack is Empty");
        }
    }

    public void print() {
        System.out.println("Stack content:");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].title);
        }
        System.out.println("");
    }

    public void clear() {
        if (isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack is now Empty");
        } else {
            System.out.println("Failed! Stack is still Empty");
        }
    }
}
