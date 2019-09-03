package zadania_0903.lambdas.collections;
/**
 * 6. Napisz program, który będzie pobierał od użytkownaika nazwę państwa,
 *  i będzie zwracał stolicę tego Państwa.
 *     * dodaj funkcjonalnoć dodawania pary pańctwo:stolica jeżeli nie mamy go zapisanego
 *     w pamięci programu
 *     * zapisz już znane pary do pliku tekstowego, (BufferedWriter)
 *     * po uruchomieniu program będzie pobierał dane z pliku (BufferedReader)
*/
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Task6 {

    private Scanner scanner = new Scanner(System.in);
    private Map<String, String> panstwa = new HashMap<>();
    private int points;

    public Task6() {
        wypełnij();
        odczytaj();
    }

    private void quiz(int iloscPytan) {
        Set<String> listaPanstw = panstwa.keySet();
        List<String> lista = new ArrayList<>();
        for (String s : listaPanstw) {
            lista.add(s);
        }

        System.out.println("Chcesz zgadywac Panstwa(1) czy Miasta(2): ");
        int wybor = scanner.nextInt();
        Random r = new Random();
        int wynik = 0;
        if (wybor == 1 && iloscPytan <= lista.size()) {
            for (int i = 0; i < iloscPytan; i++) {
                String losowePanstwo = lista.get(r.nextInt(iloscPytan) - 1).toLowerCase();
                System.out.println("Jakie miasto jest stolica " + losowePanstwo + ": ");
                String odpowiedz = scanner.next();
                if (losowePanstwo.equals(odpowiedz.toLowerCase())) {
                    wynik++;
                }
                listaPanstw.remove(losowePanstwo);
            }
        } else if (wybor == 2 && iloscPytan <= lista.size()) {

        } else {
            System.out.println("Zly wybór lub liczba pytan jest za duza");
        }
//        while (iloscPytan>0){
//            iloscPytan--;
//            int liczba=new Random().nextInt(panstwa.size()-1);
//            System.out.println("Podaj stolicę państwa: "+
//                    listaPanstw.);
//            String input=scanner.nextLine().toLowerCase().trim();
//            if (input.equals(panstwa.get(liczba))){
//                System.out.println("Brawo");
//                points++;
//            }
//        }
    }

    public void panstwa() {

        System.out.println("Podaj nazwę państwa");

        String panstwo = scanner.nextLine().toLowerCase().trim();
        if (!panstwa.containsKey(panstwo)) {
            System.out.println("Nie mam takiego państwa! Podaj stolicę to dodamy.");
            String stolica = scanner.nextLine().toLowerCase().trim();
            panstwa.put(panstwo, stolica);
        }
        zapiszDoPliku();
    }

    private void wypełnij() {
        panstwa.put("polska", "warszawa");
        panstwa.put("niemcy", "berlin");
        panstwa.put("japonia", "tokio");
        panstwa.put("węgry", "budapeszt");
    }

    private void zapiszDoPliku() {
        try {
            BufferedWriter zapisz = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("panstwa.txt")));
            for (Map.Entry para : panstwa.entrySet()) {
                zapisz.write(para.getKey() + ":" + para.getValue() + ";");
            }
            zapisz.close();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    private void odczytaj() {
        try {
            BufferedReader odczytaj = new BufferedReader(new InputStreamReader(new FileInputStream("panstwa.txt")));
            List<String> listaPar = Arrays.stream(odczytaj.readLine().split(";")).collect(Collectors.toList());
            for (String element : listaPar) {
                String[] para = element.split(":");
                panstwa.put(para[0], para[1]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
