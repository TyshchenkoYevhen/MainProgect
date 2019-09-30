package HomeWork4;

 class Printer {

     public int toner;
     public int pages;

     public Printer (int toner, int pages) {
         this.toner = toner;
         this.pages = pages;
     }

     public int fillToner() {
         int j;
         for (j = toner; j <= 100; j++) {
             if (j == 100) {
                 System.out.println("printer is filled on 100%");
             } else {
                 System.out.println("the printer is full on " + j + "%" );
             }
         }
             return j;
         }
     public int PrintPage() {
         int b = pages;
         b++;
             System.out.println("Printed page # " + b);
         return b;
     }
         public static void main (String[]args){
             Printer ton = new Printer(98, 100);
             int result = ton.fillToner();
             Printer prin = new Printer(100, 85);
             int result2 = prin.PrintPage();
         }
     }
