public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        String name = "mindaugas";
//        System.out.println(name);
//        System.out.println(name.length());
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,4));

//     1.  Sukurti du kintamuosius. Jiems priskirti savo mylimo aktoriaus vardą
//        ir pavardę kaip stringus (Jonas Jonaitis). Atspausdinti trumpesnį stringą.

        String name = "Ramis";
        String surname = "Malekas";

        if(name.length() > surname.length()){
            System.out.println(name);
        }
        if (name.length()< surname.length()){
            System.out.println(surname);
        }


        System.out.println("-----------2 uzduotis---------------" );

//     2.   Vardą atspausdinti tik didžiosiom raidėm,o pavardę tik mažosioms. (LEONARDO dicaprio)

        System.out.println(surname.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(surname.length());

        System.out.println("----------3 uzduotis--------------");


//     3.  Sukurti trečią kintamąjį ir jam priskirti stringą, sudarytą iš
//     pirmų vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.

        String firstLettter = name.substring(0,1) + surname.substring(0,1);
        System.out.println(firstLettter);

        System.out.println("-------4 uzduotis----------");

//  4. Sukurti trečią kintamąjį ir jam priskirti stringą,
//   sudarytą iš trijų paskutinių vardo ir pavardės kintamųjų raidžių. Jį atspausdinti.


        String lastThreeletters = name.substring(name.length() - 3 ) + surname.substring(surname.length() - 3 );

        System.out.println(lastThreeletters);

        System.out.println("----------5 uzduotis-------");



//   5. Sukurti kintamąjį su stringu: “An American in Paris”.
//   Jame visas “a” (didžiąsias ir mažąsias) pakeisti žvaigždutėm “*”.  Rezultatą atspausdinti.

        String text = "An American in Paris";
        System.out.println(text.replace("A" , "*"));

        System.out.println("---------------6 uzduotis------------");

//        Sukurti kintamąjį su stringu: “An American in Paris”. Jame ištrinti visas balses.
//        Rezultatą atspausdinti. Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
//        “2001: A Space Odyssey” ir “It's a Wonderful Life”.






















    }
}