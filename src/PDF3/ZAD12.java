package PDF3;

public class ZAD12 {
    public static void main(String[] args) {
double ciag=0;
double suma=0;

        for(int i=1, j=1 ;i<=30;i++,j++){
ciag =(double)(0+i)/(31-j);
            System.out.print(ciag + "\n ");
suma+=(double) ciag;
        }
        System.out.print("Suma to: "+suma + "\n ");
    }
}
