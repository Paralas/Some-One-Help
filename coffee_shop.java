package tesr;
import java.util.Scanner;

public class Tesr {
    public static int H_Americano=0, HA=35;
    public static int C_Americano=0, CA=40;
    public static int latte=0, L=50;
    public static int capuchino=0, CC=50;
    public static int mocca=0, MC=60;
    public static int income=0;
    public static int total=0;
        
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       //parameter
       int condition;
       
       do{
       System.out.println("ยินดีตอนรับสู่ร้านกาแฟ อะเมซอนลิลลี่");
       System.out.println("กรุณาเลือก Menu เพื่อทำรายการ");
       System.out.println("1. ขายกาแฟ");
       System.out.println("2. ดูยอดขาย");
       System.out.println("3. ออกจากระบบ");
       System.out.print("เลือกเมนู : ");
       condition = input.nextInt();
       
       if(condition==1){
           coffee_sell(input);
       }else if(condition==2){
           sell_total();
       }else if(condition==3){
           logout();
       }else {
           System.out.println(" กรุณาระบุตัวเลขให้ถูกต้อง\n");
       }
       }while(condition!=3);
    }
    
    public static void coffee_sell(Scanner input){
        int menu;
        System.out.println(" กรุณาเลือกเมนูที่ต้องการ");
        System.out.println("1- อเมริกาโน่ร้อน "+HA+" บาท");
        System.out.println("2- อเมริกาโน่เย็น "+CA+" บาท");
        System.out.println("3- ลาเต้เย็น "+L+" บาท");
        System.out.println("4- คาปูชิโน่เย็น "+CC+" บาท");
        System.out.println("5- มอคค่าเย็น "+MC+" บาท");
        System.out.print("กรุณา ระบุเมนูที่ต้องการ : ");
        menu = input.nextInt();
        switch(menu){
            case 1:
                sell_hotamericano(input);
            break;
            case 2:
                sell_coolamericano(input);
            break;
            case 3:
                sell_latte(input);
            break;
            case 4:
                sell_capuchino(input);
            break;
            case 5:
                sell_coolmocca(input);
            break;
            default:
                System.out.println(" กรุณาระบุตัวเลขให้ถูกต้อง\n");
            break;
        }
    }
    
    public static void sell_hotamericano(Scanner input){
        int amount;
        int money;
        System.out.println(" คุณเลือก อเมริกาโน่ร้อน "+HA+" บาท");
        System.out.print("จำนวน : ");
        amount = input.nextInt();
        System.out.println("ราคา "+(amount*HA)+" บาท");
        System.out.print("รับเงินมา : ");
        money = input.nextInt();
            if(money>=(amount*HA)) {
                System.out.println("ทอนเงิน = "+(money-(amount*HA))+" บาท\n");
                H_Americano = H_Americano+amount;
                income = income + (amount*HA);
            } else {
                System.out.println(" คุณมีเงินไม่เพียงพอ");
            }
    }
    
    public static void sell_coolamericano(Scanner input){
        int amount;
        int money;
        System.out.println("คุณเลือกอเมริกาโน่เย็น "+CA+" บาท");
        System.out.print("จำนวน : ");
        amount = input.nextInt();
        System.out.println("ราคา "+(amount*CA)+" บาท");
        System.out.print("รับเงินมา : ");
        money = input.nextInt();
            if(money>=(amount*CA)) {
                System.out.println(" จำนวน"+(amount*CA));
                System.out.println("ทอนเงิน = "+(money-(amount*CA))+" บาท\n");
                C_Americano = C_Americano+amount;
                income = income + (amount*CA);
            } else {
                System.out.println(" คุณมีเงินไม่เพียงพอ");
            }
    }
    public static void sell_latte(Scanner input){
        int amount;
        int money;
        System.out.println("คุณเลือกลาเต้เย็น "+L+" บาท");
        System.out.print("จำนวน : ");
        amount = input.nextInt();
        System.out.println("ราคา "+(amount*L)+" บาท");
        System.out.print("รับเงินมา : ");
        money = input.nextInt();
            if(money>=(amount*L)) {
                System.out.println("ทอนเงิน = "+(money-(amount*L))+" บาท\n");
                latte = latte+amount;
                income = income + (amount*L);
            } else {
                System.out.println(" คุณมีเงินไม่เพียงพอ");
            }
    }
    public static void sell_capuchino(Scanner input){
        int amount;
        int money;
        System.out.println("คุณเลือกคาปูชิโน่เย็น "+CC+" บาท");
        System.out.print("จำนวน : ");
        amount = input.nextInt();
        System.out.println("ราคา "+(amount*CC)+" บาท");
        System.out.print("รับเงินมา : ");
        money = input.nextInt();
            if(money>=(amount*CC)) {
                System.out.println("ทอนเงิน = "+(money-(amount*CC))+" บาท\n");
                capuchino = capuchino+amount;
                income = income + (amount*CC);
            } else {
                System.out.println(" คุณมีเงินไม่เพียงพอ");
            }
    }
    public static void sell_coolmocca(Scanner input){
        int amount;
        int money;
        System.out.println("คุณเลือกมอคค่าเย็น "+MC+" บาท");
        System.out.print("จำนวน : ");
        amount = input.nextInt();
        System.out.println("ราคา "+(amount*MC)+" บาท");
        System.out.print("รับเงินมา : ");
        money = input.nextInt();
            if(money>=(amount*MC)) { 
                System.out.println("ทอนเงิน = "+(money-(amount*MC))+" บาท\n");
                mocca = mocca+amount;
                income = income + (amount*MC);
            } else {
                System.out.println(" คุณมีเงินไม่เพียงพอ");
            }
    }
    
    public static void sell_total(){
        System.out.println("\nยอดขายทั้งหมด");
        System.out.println("อเมริกาโน่ร้อน "+H_Americano+" แก้ว");
        System.out.println("อเมริกาโน่เย็น "+C_Americano+" แก้ว");
        System.out.println("ลาเต้เย็น "+latte+" แก้ว");
        System.out.println("คาปูชิโน่เย็น "+capuchino+" แก้ว");
        System.out.println("มอคค่าเย็น "+mocca+" แก้ว");
        total = H_Americano+C_Americano+latte+capuchino+mocca;
        System.out.println("\nรวมทั้งหมด "+total+" แก้ว");
        System.out.println("เป็นเงินทั้งสิ้น "+income+" บาท\n");
    }
    
    public static void logout(){
        System.out.println(" ออกจากระบบเสร็จสิ้น");
    }
}
