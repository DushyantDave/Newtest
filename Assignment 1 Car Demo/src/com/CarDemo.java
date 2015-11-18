package com;

public class CarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car one = new Car("Hundai", "santro", 5, 20000);
		Car two = new Car("Toyota", "cammery", 4, 22000 );
		Car three = new Car("Honda", "Accord", 4, 23000); 
		Car four = new Car("Nissan", "ALtima", 4,21000); 
		System.out.println("highest value car: " +
				getBestCar(one, two, three, four, 'p'));
	}
	public static String getBestCar(Car one, Car two, Car three, Car four, char ch)
	{
		
		Car st= one;
		if(ch == 'p')
		{
			if (st.getOnRoadPrice()>two.getOnRoadPrice())
				st = two;
			if (st.getOnRoadPrice()>three.getOnRoadPrice())
				st = three;
			if (st.getOnRoadPrice()>four.getOnRoadPrice())
				st = four;
		}
		if(ch == 'c') 
		{
			if (st.getpassengerCapacity()<two.getpassengerCapacity())
				st = two;
			if (st.getpassengerCapacity()<three.getpassengerCapacity())
				st = four;
			if (st.getpassengerCapacity()<four.getpassengerCapacity())
				st = four;
		}
		return st.getMake() + '-' + st.getModle(); 
	}

}
