package staticTest;

//필드
//회사의 돈(돈)
//이름(name), 나이(age), 수익(income)
//회사원들이 벌어온 수익을 모두 회사의 돈(돈)에 합치고,
//회사의 돈 출력
class Employee {
	String name;
    int age, income;
    // 회사의 총자금(모든 직원이 공유)
    static int companyMoney = 0;

    public Employee() {;}

    public Employee(String name, int age, int income) {
        this.name = name;
        this.age = age;
        this.income = income;
        companyMoney += income; // 직원이 벌어온 수익을 회사 돈에 합침
    }

    // 회사의 돈 출력
    static void printCompanyMoney() {
        System.out.println("회사의 돈: " + companyMoney);
    }
	
}

public class StaticTask1 {
	public static void main(String[] args) {
		
		
		Employee ct1 = new Employee("배승원", 20, 10);
		Employee ct2 = new Employee("배승", 10, 100);
		Employee ct3 = new Employee("배원", 50, 50);
		Employee ct4 = new Employee("승원", 40, 50);
		ct1.printCompanyMoney();
		ct2.printCompanyMoney();
		ct3.printCompanyMoney();
		ct4.printCompanyMoney();
		
		
	}
}
