public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice(){
        if (this.price < 600) {
            System.out.println("This notebook is cheap");
        } else if (this.price > 600 && this.price < 1000) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight(){
        if (this.weight < 400) {
            System.out.println("This notebook is light");
        } else if (this.weight > 400 && this.weight < 900) {
            System.out.println("The price is not very heavy");
        } else {
            System.out.println("This notebook is heavy.");
        }
    }

    public void checkPriceAndYear(){
        if (this.price > 3000) {
            if (this.year > 2020){
                System.out.println("This notebook is new and expensive");
            } else if (this.year > 2015) {
                System.out.println("This notebook is still good and expensive");
            } else {
                System.out.println("This notebook is old and expensive");
            }
        } else if (this.price > 1000) {
            if (this.year > 2020){
                System.out.println("This notebook is new and has a good price");
            } else if (this.year > 2015) {
                System.out.println("This notebook is still good and has a good price");
            } else {
                System.out.println("This notebook is old and has a good price");
            }
        } else if (this.year > 2020){
            System.out.println("This notebook is cheap and new");
        } else if (this.year > 2015) {
            System.out.println("This notebook is cheap and still good");
        } else {
            System.out.println("This notebook is cheap and old");
        }
    }
}