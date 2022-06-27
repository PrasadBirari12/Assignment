package java8Assingment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//7. WAP to print only those price which are even from the given item list.

public class EvenPriceAss7 {
	String itemName;
	int itemPrice;

	public EvenPriceAss7(String itemName, int itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	class EvenPriceAss7Main {
		public static void main(String[] args) {
			List<EvenPriceAss7> ilist = new ArrayList<EvenPriceAss7>();
			ilist.add(new EvenPriceAss7("biskit", 20));
			ilist.add(new EvenPriceAss7("dairymilk", 40));
			ilist.add(new EvenPriceAss7("Chips", 55));
			ilist.add(new EvenPriceAss7("KinderJoy", 50));

			System.out.println("Item those price are Even");

			List<EvenPriceAss7> list = ilist.stream().filter(a -> a.itemPrice % 2 == 0).collect(Collectors.toList());

			for (EvenPriceAss7 p : list)
			{
				System.out.println("Item name =" + p.itemName + "\n" + "Item Price=" + p.itemPrice);
			}
		}
	}
}
