package lesson2;

public class AppRun {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] arrayStringToInt = {{"1", "2", "3", "four"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        String[][] arrayOutSize = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "ten", "11", "12"}};
        String[][] arrayNormal = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};

        CheckException testarrays = new CheckException();
        testarrays.arrayChecking(arrayNormal);

        try {
            testarrays.arrayChecking(arrayOutSize);
        }catch (MyArraySizeException ex){
            System.out.println("Ошибка размера массива " + arrayOutSize.length);
        }
        try {
            testarrays.arrayChecking(arrayStringToInt);
        } catch (MyArrayDataException e) {
             System.out.println(e.getMessage());
        }
    }
}
