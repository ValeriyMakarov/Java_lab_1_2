import java.util.Scanner;

public class main {
    public static void main(String[] args){
        final double g=9.8;
        Scanner scan = new Scanner(System.in);
        int temp=0, i=0, factorial=1;
        double number_one=0, number_two=0, hight=0;
        System.out.print("\n\tЛабораторная №1.1:\n\n" +
                         "Введите целое положительное число: ");
        temp = scan.nextInt();
        while (temp<0||temp>23){
            System.out.print("\nВведите от 0 до 24: ");
            temp = scan.nextInt();
        }
        System.out.print("\n\tСтепени двойки:\n");
        do{
            System.out.print("\t2^"+i+" = "+Math.pow(2,i)+"\n");
            i++;
        }while(i!=temp+1);
        //2
        System.out.print("\n\tЛабораторная №1.2:\n\n"+
                         "Введите целое положительное число до 10: ");
        temp = scan.nextInt();
        while (temp<0||temp>9){
            System.out.print("\nВведите от 0 до 10: ");
            temp = scan.nextInt();
        }
        for(i=1;i!=temp+1;i++){
            factorial *= i;
        }
        System.out.print("\n\tФакториал числа "+temp+" = "+factorial+"\n");
        //3
        System.out.print("\n\tЛабораторная №1.3:\n\n"+
                         "Введите число №1: ");
        number_one = scan.nextDouble();
        System.out.print("\nВведите число №2: ");
        number_two = scan.nextDouble();
        System.out.print("\n\tИх сумма будет -- "+(number_one+number_two)+
                         "\n\tПроизведение -- "+(number_one*number_two)+
                         "\n\tРазница -- ");
        if(number_one>number_two){
            System.out.print(number_one-number_two);
        }
        else{
            System.out.print(number_two-number_one);
        }
        //4
        System.out.print("\n\n\tЛабораторная №1.4:\n\n" +
                         "Введите значение высоты: ");
        hight = scan.nextDouble();
        while(hight<0||hight>100000){
            System.out.print("Высота не может быть отрицательной "
                             + "или более 100000. Введите снова: ");
            hight = scan.nextDouble();
        }
        System.out.print("\n\tМатериальное тело брошеное с высоты " +
                         hight+ " упадёт через время = " +
                         Math.sqrt(2*hight/g)+"\n");
        //5
        System.out.print("\n\n\tЛабораторная №1.5:\n\n" +
                         "Введите значение катета и гипотенузы: ");
        number_one=scan.nextDouble();
        number_two=scan.nextDouble();
        while(number_one>number_two||number_one>99999||number_one<0
              ||number_two>100000||number_two<0){
            System.out.print("\n\tГипотенуза не может быть меньше катета." +
                             " Длина катета должна быть от 0 до 100000, " +
                             "а длина гипотенузы - от 0 до 100000 " +
                             "включительно.\nВведите значение катета и " +
                             "гипотенузы: ");
            number_one=scan.nextDouble();
            number_two=scan.nextDouble();
        }
        System.out.print("\nВторой катет равен "+ Math.sqrt(Math.pow(number_two,2)
                         - Math.pow(number_one,2))+"\n");
        //1
        IO.print("\n\n\tЛабораторная №2.1:\n\nПри степени более 2 'с' из формулы "
                 + "a^n + b^n = c^n будет:\n");
        for(int n=3; n<5; n++){
            for(int a=1; a<15; a++){
                for(int b=1; b<15; b++){
                    IO.print(a+"^"+n+" + "+b+"^"+n+" = "+(Math.pow(a,n)+Math.pow(b,n))+
                            " ---- c = "+Math.pow((Math.pow(a,n)+Math.pow(b,n)),1f/n)+"\n");
                }
                IO.print("\n");
            }
        }
        IO.print("Но для степени 'n' = 2 есть натуральное решение:\n\n");
        {
            int n = 2;
            for (int a = 1; a < 15; a++) {
                for (int b = 1; b < 15; b++) {
                    IO.print(a + "^" + n + " + " + b + "^" + n + " = " + (Math.pow(a, n) + Math.pow(b, n)) +
                            " ---- c = " + Math.pow((Math.pow(a, n) + Math.pow(b, n)), 1f / n) + "\n");
                }
                IO.print("\n");
            }
        }
        IO.print("\n\n\tЛабораторная №2.1:\n\n");
        double res =1f;
        boolean symbol=false;
        for(int z=2; z<=10000; z++){
            if(symbol==false){res-=1f/z; symbol=true;}
            else {res+=1f/z; symbol=false;}
        }
        IO.print("\nРезультат = "+ res);
    }
}
