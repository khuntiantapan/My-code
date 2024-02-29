abstract class Demo
{
abstract void sendmoney();
}
 

class Test extends Demo
{
@Override()
public void sendmoney()
{
System.out.println("money send from sbi");
}
public Static void main(String[] args)
{
Test t=new Test();
t.sendmoney();
}
}