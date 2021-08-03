public class ArrayCollection7
{
    private  Object[] elementData;
    private int size;
    public ArrayCollection7(int n)
    {
      elementData = new Object[n];
      size = 0;

    }
    public int size()
    {
      return size;
    }

    public void add (Object obj){
      elementData[size] = obj;
      size++;
    }

    public boolean isEmpty(){
      return size ==0;
    }

    public boolean contains(Object obj)
    { //Task5
      return search(obj) != -1;
    }

    public int search(Object obj)
    {//Task6
      for(int i=0; i<size; i++)
      {
         if(elementData[i].equals(obj))
         {
          return i;
         }
       }
       return -1;
     }

    public void remove (Object obj)
    { //Task7
      int n = search(obj);
      if(n == -1)
      {
        System.out.print("no such object");
      }
      else
      {
        for(int i=n+1; i<size; i++)
        {
          elementData[i-1] = elementData[i];
        }
        size--;
        elementData[size] = null;
      }
     }

     public String toString()
     {  //Task8
       String ans = "";
       for(int i=0; i<size; i++)
       {
         ans = ans + elementData[i] + ",";
       }
       return ans;
     }

}