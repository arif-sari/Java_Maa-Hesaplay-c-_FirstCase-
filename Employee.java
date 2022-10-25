package maasHesap;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;

	}

	double tax() {
		double _tax;
		if (this.salary < 1000) {
			_tax = 0;
		} else {
			_tax = this.salary * 0.03;
		}
		return (int) _tax;
	}

	double bonus() {
		double _bonus;
		if (this.workHours <= 40) {
			_bonus = 0;
		} else {
			_bonus = (this.workHours - 40) * 30;
		}
		return (double) _bonus;

	}

	int raiseSalary() {
		int time;
		double totalRaise = 0;
		time = 2021 - this.hireYear;
		if (time <= 9) {
			totalRaise = this.salary * 0.05;
		} else if (time >= 10 && time <= 19) {
			totalRaise = this.salary * 0.10;
		} else if (time >= 20) {
			totalRaise = this.salary * 0.15;
		}
		return (int) totalRaise;
	}

	public String toString() {
		System.out.println("Proje Çıktısı");
		double taxBonus = this.salary - this.tax() + this.bonus();
		double total = this.salary + this.bonus() + this.raiseSalary() - this.tax();
		System.out.println("Adı : " + this.name);
		System.out.println("Maaşı : " + this.salary + " TL");
		System.out.println("Çalışma saati : " + this.workHours + " saat");
		System.out.println("Başlangıç yılı : " + this.hireYear + " yıl");
		System.out.println("Vergi : " + this.tax() + " TL");
		System.out.println("Bonus : " + this.bonus() + " TL");
		System.out.println("Maaş Artışı : " + this.raiseSalary() + " TL");
		System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxBonus + " TL");
		System.out.println("Toplam maaş : " + total + " TL");
		return null;
	}

}
