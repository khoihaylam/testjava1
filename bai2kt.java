import java.util.Scanner;
public class bai2kt {
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
        System.out.println("MOI NHAP SO DONG:");
        int row=scanner.nextInt();
        System.out.println("MOI NHAP SO COT:");
        int col=scanner.nextInt();
        int [][] number=new int[row][col];
        do {
            System.out.println();
            System.out.println("************************MENU**************************");
            System.out.println("1.Nhập giá trị các phần tử của mảng  ");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận ");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng ");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và đường chéo phụ ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng,thực hiện chèn vào mảng 2 chiều");
            System.out.println("9.Thoát");
            System.out.println("moi ban nhap chuc nang menu:");
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            System.out.printf("number[%d][%d]=",i,j);
                            number[i][j]=scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            System.out.printf("%d\t",number[i][j]);
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    int count=0;
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(number[i][j]%2==0&&number[i][j]%3==0){
                                count++;
                            }
                        }
                    }
                    System.out.println("số lượng các phần tử chia hết cho 2 và 3 trong mảng:"+count);
                    break;
                case 4:
                    int sum=0;
                    int sum1=0;
                    int sum2=0;
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(i==j){
                                sum=sum+number[i][j];
                            }
                        }
                    }
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(i==0||i==row-1||j==0||j==col-1){
                                sum1=sum1+number[i][j];
                            }
                        }
                    }
                    for(int i=0;i<row;i++) {
                        for (int j = 0; j < col; j++) {
                            if(row==col){
                                if(i+j==col-1||i+j==row-1){
                                    sum2=sum2+number[i][j];

                                }
                            }
                        }
                    }
                    System.out.println("tổng các phần tử nằm duong cheo chinh:"+sum);
                    System.out.println("tổng các phần tử nằm duong bien:"+sum1);
                    System.out.println("tổng các phần tử nằm duong cheo phụ:"+sum2);
                    break;
                case 5:
                    int temp;
                    int min;
                    for(int i=0;i<row-1;i++){
                        min=i;
                        for(int j=0;j<col;j++){
                           for(int k=i+1;k<row;k++){
                               if(number[min][j]>number[k][j]){
                                   temp=number[min][j];
                                   number[min][j]=number[k][j];
                                   number[k][j]=temp;
                               }
                           }
                        }
                    }
                    break;
                case 6:
                    for(int i=0;i<row;i++){
                        for(int j=0;j<col;j++){
                            if(checkprime(number[i][j])==1){
                                System.out.printf("%d\t",number[i][j]);

                            }
                        }
                    }
                    break;
                case 7:
                    break;
                case 8:
                    System.out.println("Nhap phan tu can chen:");
                    int addvalue=scanner.nextInt();
                    int [] addarray=new int[addvalue];
                    for(int i=0;i<addarray.length;i++){
                        System.out.printf("addarray[%d]=",i);
                        addarray[i]=scanner.nextInt();
                    }
                    int [] [] number01=new int[row+1][col];
                    System.out.println("chỉ số dòng muốn chèn:");
                    int addrow=scanner.nextInt();
                    if(addrow<0||addrow>=row){
                        System.out.println("K chen duoc phan tu:");
                    }
                    else{
                        for(int i=0;i<row+1;i++){
                            for(int j=0;j<col;j++){
                                if(i<addrow){
                                    number01[i][j]=number[i][j];
                                }
                                else if(i==addrow){
                                    number01[i][j]=addarray[j];

                                }
                                else{
                                    number01[i][j]=number[i-1][j];
                                }
                            }
                        }
                    }
                    for(int i=0;i<row+1;i++){
                        for(int j=0;j<col;j++){
                            System.out.printf("%d\t",number01[i][j]);
                        }
                        System.out.printf("\n");
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
