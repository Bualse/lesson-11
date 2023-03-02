package methodsObjects;

public class Main {
        private static Author Author;

        public static void main(String[] args) {
            Author fullName = new Author("Lev ", "Tolstoy");

            Author fullName1 = new Author("Michail ", "Bulgakov");

            Book warAndPeace = new Book(fullName, "War and Peace", 1_873);
            System.out.println("Автор: " + warAndPeace.getAuthor().getNameAuthor() + warAndPeace.getAuthor().getSecondNameAuthor() + ", книга: " + warAndPeace.getNameBook() + ", год: " + warAndPeace.getYearPublish());

            Book masterAndMargarita = new Book(fullName1, " Master and Margarita", 1_937);
            System.out.println("Автор: " + fullName1.getNameAuthor() + fullName1.getSecondNameAuthor() + ", книга: " + masterAndMargarita.getNameBook() + ", год: " + masterAndMargarita.getYearPublish());

            masterAndMargarita.setYearPublish(1_960);
            System.out.println("Изменился год: " + masterAndMargarita.getYearPublish());


            System.out.println(new Book(fullName, "Война и Мир", 1873));
            System.out.println(masterAndMargarita);


            System.out.println(new Author("Лев ", "Толстой"));
            System.out.println(fullName1);


        }


}
