package lab4;

class Account {

	long accNum;
	double balance;
	Person accHolder;
	
	  public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;///
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	  public void deposit(double x) {
	    this.balance+=x;
	  }
	  public void withdraw(double x) {
		  this.balance-=x;
		  }
	}
class SavingsAccount extends Account{
	double minBalance=1000;

	@Override
	public void withdraw(double x) {
		if(balance-x >=minBalance)
		  {this.balance-=x;
		  System.out.println("Withdraw of "+x+" is successfull");
		  }
		  
		else
			System.out.println("Min balance of 1000 is required");
		  }
	
	
	
}
class CurrentAccount extends Account{
	double overDraftLimit;
	@Override
	public void withdraw(double x) {
		//if()
		  this.balance-=x;
		  }
}
	
	class Person{
		String name;
		float age;
		public Person(String name, float age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public float getAge() {
			return age;
		}
		public void setAge(float age) {
			this.age = age;
		}
		
	}

public class Exercise1 {
	public static void main(String[] args) {
		
		Account smith=new Account();
		Person SmithPerson=new Person("smith",22);
		smith.setAccHolder(SmithPerson);
		smith.setBalance(2000);
		Account kathy=new Account();
		kathy.setBalance(3000);
		
smith.deposit(2000);
kathy.withdraw(3000);
System.out.println(smith.getBalance());
System.out.println(kathy.getBalance());

	}

}
