class cpu
{
   int price;
   cpu(int p)
   {
      this.price=p;
   }
   class Processor
   {
       int cores;
       String manufacture;
       Processor(int n,String m)
       {
          this.cores=n;
          this.manufacture=m;
       }
       void display()
       {
           System.out.println("no .of cores:"+this.cores);
           System.out.println("Processor manufactures:"+this.manufacture);
       }
   }
   static class Ram
   {
      int memory;
      String manufacture;
      Ram(int n,String m)
      {
         this.memory=n;
         this.manufacture=m;
      }
      void display()
      {
          System.out.println("memorysize:"+this.memory);
          System.out.println("memory manucfactures:"+this.manufacture);
      }
    }
    void display()
    {
       System.out.println("Price od CPU:"+this.price);
    }
    public static void main(String args[])
    {
      cpu intel=new cpu(23000);
      cpu.Processor i_processor=intel.new Processor(4,"intel");
      cpu.Ram i_Ram=new Ram(1024,"Asus");
      intel.display();
      i_processor.display();
      i_Ram.display();     
     }
}
