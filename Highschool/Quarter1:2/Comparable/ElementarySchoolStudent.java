class ElementarySchoolStudent implements Comparable
{
    private int workEthic;
    private String name;
   //Constructor with two parameters - workEthic and name
   public ElementarySchoolStudent(int w, String n)
   {
       workEthic=w;
       name=n;
   }

   //compareTo method - workEthic
   public int compareTo(Object other)
   {
       if(workEthic>((ElementarySchoolStudent)other).getWorkEthic())
            return 1;
       else if(workEthic<((ElementarySchoolStudent)other).getWorkEthic())
            return -1;
       return 0;
   }
    
   //toString Method - name and workEthic
   public String toString()
   {
       String string=(name+"\nWork Ethic: "+workEthic);
       return string;
   }
   
   public int getWorkEthic()
   {
       return workEthic;
   }
   
   public String getName()
   {
       return name;
   }
}