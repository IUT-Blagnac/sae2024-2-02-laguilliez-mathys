package iut.sae.algoTest;
import iut.sae.algo.*;


public class sobriete60{
    public static String RLE(String in){
                    
        if (in.isEmpty()) return "";

        StringBuilder ChaineFini = new StringBuilder();
        char characterRepete = in.charAt(0);
        int nbchar = 1;
        char caractereCourant;

        for (int i = 1; i < in.length(); i++) {
            caractereCourant = in.charAt(i);
    
            if (caractereCourant == characterRepete && nbchar < 9) {
                nbchar++;
            } else {
                ChaineFini.append(nbchar).append(characterRepete);
                characterRepete = caractereCourant;
                nbchar = 1;
            }
        }
            
        ChaineFini.append(nbchar).append(characterRepete);
    
        return ChaineFini.toString();
    }


    public static String RLE(String in, int iteration) throws AlgoException{
        
        if (iteration <= 0) {
            throw new IllegalArgumentException(" Erreur : Le nombre d'iterations doit etre > 0 ");
        }
        
        StringBuilder ChaineFini = new StringBuilder(in);
        
        while (iteration > 0) {
            ChaineFini = new StringBuilder(RLE(ChaineFini.toString()));
            iteration--;  
        }
        
        return ChaineFini.toString();
    }

    public static String unRLE(String in) throws AlgoException {

        if (in.isEmpty()) {
            return "";
        }
    
        if (in.length() % 2 != 0) {
            throw new IllegalArgumentException(" Erreur : La longueur de la chaine doit etre paire. ");
        }
    
        StringBuilder ChaineFini = new StringBuilder();
        int index;
        char characterRepete;
    
        for (int i = 0; i < in.length(); i ++ ) {
            index = Character.getNumericValue(in.charAt(i));
            characterRepete = in.charAt(i + 1);
            ChaineFini.append(String.valueOf(characterRepete).repeat(index));

            i++;
        }
    
        return ChaineFini.toString();
    }


    public static String unRLE(String in, int iteration) throws AlgoException{

        if (iteration <= 0) {
            throw new IllegalArgumentException(" Erreur : Le nombre d'iterations doit etre > 0 ");
        }
        
        StringBuilder ChaineFini = new StringBuilder(in);
        
        while (iteration > 0) {
            ChaineFini = new StringBuilder(unRLE(ChaineFini.toString()));
            iteration--;  
        }
        
        return ChaineFini.toString();
    }
}

        
