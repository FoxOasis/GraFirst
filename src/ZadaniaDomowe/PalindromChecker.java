package ZadaniaDomowe;

public class PalindromChecker {


        public boolean isPalindrom(String ciag) {

            char[] zbior = ciag.toCharArray();

            for (int pozycja = 0; pozycja < zbior.length; pozycja++) {
                if (zbior[pozycja] != (zbior[zbior.length - 1 - pozycja])) {
                    return false;
                }
            }
            return true;
        }
    }





