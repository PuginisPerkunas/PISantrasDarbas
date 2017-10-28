import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        //Rodiklis
        Rodiklis hemoglobinasR = new HemoglobinasR("Hemoglobinas","HGB","Anemija (kitaip mažakraujystė) – tai patologinė būklė, kuriai būdingas per mažas eritrocitų ir/ar hemoglobino kiekis kraujyje,\ndėl ko pablogėja deguonies transportas į audinius ir kyla audinių hipoksija. ","Mazakraujyste",120,150);
        Rodiklis liaukocitasR = new LiaukocitasR("Liaukocitas","LIAU","Kazkas","Baisi liga",10,35);
        //Tiremasis
        Tiremasis hemoglobinasT = new HemoglobinasT(125);
        Tiremasis liaukocitasT = new LiaukocitasT(34);
        hemoglobinasT.setVardas("Tomas");
        liaukocitasT.setVardas("Tomas");

        //Add RodiklisList
        List<Rodiklis> rodiklisList = new ArrayList<>();
        rodiklisList.add(hemoglobinasR);
        rodiklisList.add(liaukocitasR);

        //Add TiremasisList
        List<Tiremasis> tiremasesList = new ArrayList<>();
        tiremasesList.add(hemoglobinasT);
        tiremasesList.add(liaukocitasT);

        System.out.println("test");

        for (int i = 0; i < tiremasesList.size(); i++){
            if(tiremasesList.get(i).getRodiklioReiksme() < rodiklisList.get(i).getMin() ||
                        tiremasesList.get(i).getRodiklioReiksme() > rodiklisList.get(i).getMax()){
                    System.out.println(rodiklisList.get(i).getPavadinimas()+ " yra blogas pas tiremaji vardu: " + tiremasesList.get(i).getVardas() +
                    ".\nJis gali sirkti sia liga: " + rodiklisList.get(i).getGalimaLiga() +  "\nJos aprasymas: \n" + rodiklisList.get(i).getAprasymas());
                    System.out.println("\n");
                }else {
                    System.out.println(tiremasesList.get(i).getVardas() + " Sveikas nes " + rodiklisList.get(i).getKodas() + " nevirsija normu");
                    System.out.println("\n");
                }
        }

//        for(int i = 0; i < tiremasesList.size(); i++ ){
//            for (int j = 0; j < rodiklisList.size(); j++) {
//                if(tiremasesList.get(i).getRodiklioReiksme() < rodiklisList.get(j).getMin() ||
//                        tiremasesList.get(i).getRodiklioReiksme() > rodiklisList.get(j).getMax()){
//                    System.out.println(rodiklisList.get(i).getPavadinimas()+ " Yra blogas pas " + tiremasesList.get(j).getVardas() +
//                    " Jis gali sirkti sia liga: " + rodiklisList.get(i).getGalimaLiga() +  " jos aprasymas: \n" + rodiklisList.get(i).getAprasymas());
//                    System.out.println("\n");
//                    j++;
//                    break;
//                }else {
//                    System.out.println(tiremasesList.get(j).getVardas() + " Sveikas nes " + rodiklisList.get(i).getPavadinimas() + " yra tinkamas");
//                    System.out.println("\n");
//                    j++;
//                    break;
//                }
//            }
//        }

    }
}
