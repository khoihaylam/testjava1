import java.util.Scanner;
public class bai1kt {
    public static int checkprime(int b){
        if(b<2){
            return -1;
        }
        for(int i=2;i<b;i++){
            if(b%i==0){
                return -1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("moi ban nhap n:");
        int n=scanner.nextInt();
        int[] numbers=new int[n];
        do {
            System.out.println();
            System.out.println("************************MENU**************************");
            System.out.println("1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím) ");
            System.out.println("2. In giá trị các phần tử trong mảng ");
            System.out.println("3. Tính trung bình các phần tử dương (>0) trong mảng ");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong" +
                    "mảng (k nhập từ bàn phím)");
            System.out.println("5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6. Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng\n" +
                    "dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,\n" +
                    "các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm\n" +
                    "dần) đúng vị trí ");
            System.out.println("9.Thoát");
            System.out.println("moi ban nhap chuc nang menu:");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i=0;i<numbers.length;i++){
                        System.out.printf("numbers[%d]=",i);
                        numbers[i]=scanner.nextInt();
                    }
                    break;
                case 2:
                    for(int i=0;i<numbers.length;i++){
                        System.out.printf("%d\t",numbers[i]);
                    }
                    break;
                case 3:
                    int avg=0;
                    int sum=0;
                    for(int i=0;i<numbers.length;i++){
                        if(numbers[i]>0){
                            sum=sum+numbers[i];
                            avg=sum/n;
                        }
                    }
                    System.out.println("trung bình các phần tử dương (>0) trong mảng:"+avg);
                    break;
                case 4:
                    System.out.println("moi ban nhap k:");
                    int k=scanner.nextInt();
                    for(int i=0;i<numbers.length;i++){
                        if(numbers[i]==k){
                            System.out.println("vị trí (chỉ số) các phần tử có giá trị bằng k trong mảng:"+i);
                        }
                    }
                    break;
                case 5:
                    int temp;
                    for(int i=0;i<numbers.length-1;i++){
                        for(int j=0;j<numbers.length-1-i;j++){
                            if(numbers[j]<numbers[j+1]){
                                temp=numbers[j];
                                numbers[j]=numbers[j+1];
                                numbers[j+1]=temp;

                            }
                        }
                    }
                    System.out.println("Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần:");
                    break;
                case 6:
                    int count=0;
                    for(int i=0;i<numbers.length;i++){
                       if(checkprime(numbers[i])==1){
                           count++;
                       }
                    }
                    System.out.println("số lượng các phần tử là số nguyên tố trong mảng:"+count);

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("moi ban nhap chi so phan tu");
                    int addindex=scanner.nextInt();
                    System.out.println("moi ban nhap  phan tu");
                    int addvalue=scanner.nextInt();
                    int[] numbers01=new int[numbers.length+1];
                    if(addindex<0||addindex>=numbers.length){
                        System.err.println("k chen phan tu duoc");
                    }
                    else{
                        for(int i=0;i<numbers01.length;i++){
                            if(i<addindex){
                                numbers01[i]=numbers[i];
                            }
                            else if(i==addindex){
                                numbers01[i]=addvalue;
                            }
                            else{
                                numbers01[i]=numbers[i-1];
                            }
                        }
                    }
                    int temp1;
                    for(int i=0;i<numbers01.length-1;i++){
                        for(int j=0;j<numbers01.length-1-i;j++){
                            if(numbers01[j]<numbers01[j+1]){
                                temp1=numbers01[j];
                                numbers01[j]=numbers01[j+1];
                                numbers01[j+1]=temp1;

                            }
                        }
                    }
                    for(int i=0;i<numbers01.length;i++){
                        System.out.printf("%d\t",numbers01[i]);
                    }
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.err.println("CHI NHAP TU 1-9");
            }



        }while (true);
    }
}

