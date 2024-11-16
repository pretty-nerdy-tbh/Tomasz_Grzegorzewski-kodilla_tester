public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(300, 3500, 2024);
        System.out.println("Notebook year: " + notebook.year + " " + "Notebook prcie: " + notebook.price);
        notebook.checkPriceAndYear();

        Notebook heavyNotebook = new Notebook(2000, 4000, 2018);
        System.out.println("Notebook year: " + heavyNotebook.year + " " + "Notebook prcie: " + heavyNotebook.price);
        heavyNotebook.checkPriceAndYear();

        Notebook oldNotebook = new Notebook(800, 3099, 2004);
        System.out.println("Notebook year: " + oldNotebook.year + " " + "Notebook prcie: " + oldNotebook.price);
        oldNotebook.checkPriceAndYear();

        Notebook notebook1 = new Notebook(300, 2000, 2024);
        System.out.println("Notebook year: " + notebook1.year + " " + "Notebook prcie: " + notebook1.price);
        notebook1.checkPriceAndYear();

        Notebook heavyNotebook1 = new Notebook(2000, 2800, 2018);
        System.out.println("Notebook year: " + heavyNotebook1.year + " " + "Notebook prcie: " + heavyNotebook1.price);
        heavyNotebook1.checkPriceAndYear();

        Notebook oldNotebook1 = new Notebook(800, 1200, 2004);
        System.out.println("Notebook year: " + oldNotebook1.year + " " + "Notebook prcie: " + oldNotebook1.price);
        oldNotebook1.checkPriceAndYear();

        Notebook notebook2 = new Notebook(300, 700, 2024);
        System.out.println("Notebook year: " + notebook2.year + " " + "Notebook prcie: " + notebook2.price);
        notebook2.checkPriceAndYear();

        Notebook heavyNotebook2 = new Notebook(2000, 999, 2018);
        System.out.println("Notebook year: " + heavyNotebook2.year + " " + "Notebook prcie: " + heavyNotebook2.price);
        heavyNotebook2.checkPriceAndYear();

        Notebook oldNotebook2 = new Notebook(800, 500, 2004);
        System.out.println("Notebook year: " + oldNotebook2.year + " " + "Notebook prcie: " + oldNotebook2.price);
        oldNotebook2.checkPriceAndYear();
        }
    }
