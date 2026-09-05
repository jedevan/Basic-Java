import java.util.HashSet;

import java.util.Set;



public class OrganizationTracker {



    public static void main(String[] args) {

        HashSet<String> codeGeeks = new HashSet<>();
        HashSet<String> mafia = new HashSet<>();
        HashSet<String> csia = new HashSet<>();
        HashSet<String> gdg = new HashSet<>();

        codeGeeks.add("Anna");
        codeGeeks.add("Mark");
        codeGeeks.add("John");
        codeGeeks.add("Lisa");

        mafia.add("John");
        mafia.add("Paul");
        mafia.add("Kevin");
        mafia.add("Lisa");

        csia.add("Mark");
        csia.add("Brian");
        csia.add("Anna");
        csia.add("Chris");

        gdg.add("Kevin");
        gdg.add("Paul");
        gdg.add("Anna");
        gdg.add("Sarah");

        System.out.println("Code Geeks members: " + codeGeeks);
        System.out.println("Mafia members: " + mafia);
        System.out.println("CSIA members: " + csia);
        System.out.println("GDG members: " + gdg);



        

        codeGeeks.add("Alex");          
        csia.remove("Brian");           
        csia.add("Daniel");             
        mafia.remove("Lisa");           

        System.out.println("\nUpdated Code Geeks: " + codeGeeks);
        System.out.println("Updated Mafia: " + mafia);
        System.out.println("Updated CSIA: " + csia);

        System.out.println("\nIs John in Code Geeks? " + codeGeeks.contains("John"));
        System.out.println("Total Code Geek members: " + codeGeeks.size());
        System.out.println("Is Code Geeks empty? " + codeGeeks.isEmpty());

        Set<String> union = new HashSet<>(codeGeeks);
        union.addAll(mafia);

        Set<String> intersection = new HashSet<>(codeGeeks);
        intersection.retainAll(mafia);

        Set<String> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);

        System.out.println("\nUnion: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Symmetric Difference: " + symmetricDifference);

        System.out.println("\nCode Geeks Members:");
        for (String member : codeGeeks) {

            System.out.println(member);

        }



        System.out.println("\nMafia Members:");

        for (String member : mafia) {

            System.out.println(member);

        }

    }

}
