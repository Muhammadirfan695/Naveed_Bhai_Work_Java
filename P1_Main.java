import java.util.Scanner;
public class P1_Main {
    public static void main(String[] args) {
             char r;
        do {

            System.out.println("**************Library1 Management System***************");
            System.out.println("Press 1 to add Book");
            System.out.println("Press 2 to issue Book");
            System.out.println("Press 3 to return Book");
            System.out.println("Press 4 print complete issue details");
            System.out.println("Press 5 to exit");
            Scanner obj1 = new Scanner(System.in);
            System.out.println("Enter anny Number");
            int a = obj1.nextInt();
            switch (a) {
                case 1:
                    Library aa1 = new Library();
                    aa1.add1();
                    break;
                case 2:
                    Library bb = new Library();
                    bb.issue();
                    break;
                case 3:
                    Library cc = new Library();
                    cc.ret();
                    break;
                case 4:
                    Library is = new Library();
                    is.detail();
                    break;
                case 5:
                    Library adds = new Library();
                    adds.exit();
                    break;
                default:
                    System.out.println("Invalid Number");
            }
            System.out.println("You Want to select next option Y/N");
            r = obj1.next().charAt(0);
        }
            while (r == 'y' || r == 'Y') ;
            if (r == 'n' || r == 'N') ;
            {
                Library z = new Library();
                z.exit();
            }
        }

}


    class Library {
        static String str, b, date;
        static int a, c;

        void add1() {
            System.out.println("Enter Book Name , Price And Book_No");
            Scanner obj2 = new Scanner(System.in);
            String str = obj2.nextLine();
            float price = obj2.nextInt();
            int bookno = obj2.nextInt();
            System.out.println("Your Book Details is" + str + price + bookno);
        }

        void issue() {
            Scanner obj3 = new Scanner(System.in);
            System.out.println("Book Name");
            str = obj3.nextLine();
            System.out.println("Book_Id");
            a = obj3.nextInt();
            obj3.nextLine();
            System.out.println("Issue Date");
            b = obj3.nextLine();
            obj3.nextLine();
            System.out.println("total number of book Issued");
            c = obj3.nextInt();
            obj3.nextLine();
            System.out.println("Return book date");
            date = obj3.nextLine();

        }

        int getid() {
            return a;
        }

        void ret() {
            System.out.println("Enter Student_name & book_id");
            Scanner c = new Scanner(System.in);
            String naem = c.nextLine();
            int bookid = c.nextInt();
            if (a == bookid) {
                System.out.println("Total Dtails");
                System.out.println("Book name ::" + Library.str);
                System.out.println("Book id : " + Library.a);
                System.out.println("issue date" + Library.b);
                System.out.println("Total Number of book Issued ::" + Library.c);
                System.out.println("Book  Return Date::" + Library.date);
            } else {
                System.out.println("Wrong id , pls Enter correct id");
            }
        }

        void detail() {
//        System.out.println("Total Dtails");
            System.out.println("Book name ::" + Library.str);
            System.out.println("Book id : " + Library.a);
            System.out.println("issue date" + Library.b);
            System.out.println("Total Number of book Issued ::" + Library.c);
            System.out.println("Book  Return Date::" + Library.date);
        }
        void exit(){
            System.out.println(0);
        }
    }
