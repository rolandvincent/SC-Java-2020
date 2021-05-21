package TugasNomor3;

public class farmerPet {
    public farmerPet(String Kata) {

        if (Kata == null || Kata.isBlank()) return;
        for (int clap = -1; clap < Kata.length(); clap++) {
            System.out.println("There was a farmer who had a dog,");
            System.out.println("And " + Kata + " was his name-o");
            for (int i = 0; i < 3; i++) {
                for (int c = 0; c < Kata.length() - 1; c++) {
                    if (clap >= c && clap >= 0)
                        System.out.print("(clap)-");
                    else
                        System.out.print(Kata.toUpperCase().charAt(c) + "-");
                }
                if (clap >= Kata.length() - 1)
                    System.out.println("(clap)");
                else
                    System.out.println(Kata.toUpperCase().charAt(Kata.length() - 1));
            }
            System.out.println("And " + Kata + " was his name-o");
            System.out.println();
        }
    }
}
