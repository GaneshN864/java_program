public class stack1
{
    int [] arr= new int[10];
    int top=-1;
     
     void push(int va)
     {
        if(top>9)
        {
            System.out.println("STACK is full");
        }
        else
        {
        arr[++top]=va;
        }
     }

     int pop()
     {
        if(top<0)
        {
            System.out.println("STACK is empty");
            return -1;
        }
        else
        {
            return arr[top--];
        }
     }
}