import java.util.Scanner;
 public class session1exercise6{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
        while(true){
            float width;
            float height;
            do {System.out.println("Hãy nhập vào chiều rộng của hình chữ nhật");
            width = sc.nextFloat();
            // kiểm tra số nhập vào có hợp lệ hay không//
        if(width<0) System.out.println("Hãy nhập vào chiều rộng hợp lệ, phải lớn hơn 0 ");
        } while(width<0);
          do {System.out.println("Hãy nhập vào chiều dài của hình chữ nhật");
             height= sc.nextFloat();
              // kiểm tra số nhập vào có hợp lệ hay không//
             if(height<0) System.out.println("Hãy nhập vào chiều dài hợp lệ, phải lớn hơn 0");
             }while(height<0);
    float area= width*height;
      float  circumference= (width+height)*2;
        System.out.printf("Diện tích của hình chữ nhật có chiều dài %f và chiều rộng %f là : %.2f %n",height,width,area);
        System.out.printf("Chu vi của hình chữ nhật có chiều dài %f và chiều rộng %f là : %.2f%n",height,width,circumference);
 }}}// không đóng sc.close() để kiểm tra các case trong đề bài,chạy vòng loop//