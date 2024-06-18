package iut.sae.algo;

public class Algo {
    public static String RLE(String in) {
        if (in.isEmpty()) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        char NbPrecedent = in.charAt(0);
        int nbOccurence = 1;
        char actuel;

        for (int i = 1; i < in.length(); i++) {
            actuel = in.charAt(i);
            if (NbPrecedent == actuel) {
                nbOccurence++;
                if (nbOccurence == 10) {
                    res.append(9).append(NbPrecedent);
                    nbOccurence = 1;
                }
            } else {
                res.append(nbOccurence).append(NbPrecedent);
                nbOccurence = 1;
                NbPrecedent = actuel;
            }
        }
        res.append(nbOccurence).append(NbPrecedent);
        return res.toString();
    }

    public static String RLE(String in, int iteration) throws AlgoException {
        String res = in;
        for (int i = 0; i < iteration; i++) {
            res = RLE(res);
        }
        return res;
    }

    public static String unRLE(String in) throws AlgoException {
        StringBuilder res = new StringBuilder();
        char nombre;
        int nbLettre;
        for (int i = 1; i < in.length(); i += 2) {
            nombre = in.charAt(i - 1);
            nbLettre = Character.getNumericValue(nombre);
            for (int j = 0; j < nbLettre; j++) {
                res.append(in.charAt(i));
            }
        }
        return res.toString();
    }

    public static String unRLE(String in, int iteration) throws AlgoException {
        String res = in;
        for (int i = 0; i < iteration; i++) {
            res = unRLE(res);
        }
        return res;
    }
}
