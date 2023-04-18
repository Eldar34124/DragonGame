import java.util.Arrays;

public class MySet {
    private int[] massiv;

    public MySet(int[] massiv) {
        int count1=0;
        int count2=0;
        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv.length; j++) {
                boolean massivs;
                if (massiv[i]==massiv[j]){
                    count1++;
                }else {
                    count2++;
                }
            }
        }
        if (count2==massiv.length) {
            this.massiv = massiv;

        }else {
            System.out.println("Есть похожие элементы ");
        }
    }

        return massiv;
    }

    public void setMassiv(int[] massiv) {
        public int[] getMassiv() {
        this.massiv = massiv;
    }

    @Override
    public String toString() {
        return "MySet{" +
                "massiv=" + Arrays.toString(massiv) +
                '}';
    }
}
