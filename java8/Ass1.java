package java8Assingment;

import java.text.Collator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Question No 16
//1. User will enter item name, price, date of manufacturing, date of expiring, category name.
public class Ass1 {

	String itemName;
	String category;
	double itemPrice;
	LocalDate dom;
	LocalDate dateOfExp;
	
	public Ass1(String itemName, String category, double itemPrice, LocalDate dom, LocalDate dateOfExp) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.itemPrice = itemPrice;
		this.dom = dom;
		this.dateOfExp = dateOfExp;
	}
}
	
 class Item_Ass1main
{
  public static void main(String[] args)
  {
	List<Ass1> ilist = new ArrayList<>();
	ilist.add(new Ass1("Laptop","electronics",3500, LocalDate.of(2021,01,10),null));
	ilist.add(new Ass1("Floor","food",40, LocalDate.of(2021,01,10),LocalDate.of(2022,01,11)));
	ilist.add(new Ass1("Shirt","cloths",600, LocalDate.of(2022,2,12),null));
	ilist.add(new Ass1("Magii","food",30, LocalDate.of(2022,05,11),LocalDate.of(2022,10,11)));

	System.out.println("Enter Category -");
	Scanner sc = new Scanner(System.in);
	String cat = sc.next();
	List<Ass1> itemlist = ilist.stream().filter(e->e.category.equals(cat)).collect(Collectors.toList()); 
	for(Ass1 itemlistObj: itemlist)
	{
               System.out.println("Itme Name- "+itemlistObj.itemName+"\n"+"Item Price- "+itemlistObj.itemPrice+"\n"+"Date of manifacture -"+itemlistObj.dom+"\n"+"Date Of Expiry- "+itemlistObj.dateOfExp);		
	}
    System.out.println("---------------------------------");	
	System.out.println("Enter Starting Letter of item");
    String start = sc.next();	
    List<Ass1> itemname = ilist.stream().filter(e->e.itemName.startsWith(start.toUpperCase())).collect(Collectors.toList());
    for(Ass1 str: itemname)
    {
    	System.out.println("Item Name- "+str.itemName+"\n"+"Item Price- "+str.itemPrice+"\n"+"Item category- "+str.category+"\n"+"Date of Manifacturing -"+str.dom+"\n"+"Date of Expiry- "+str.dateOfExp);
    }
	System.out.println("-------------------------------------");
	
	System.out.println("Enter price to cheack item is under the price");
	double startPrice = sc.nextDouble();
	double endPrice = sc.nextDouble();
	List<Ass1> list = ilist.stream().filter(i->i.itemPrice>=startPrice && i.itemPrice<=endPrice).collect(Collectors.toList());
	for(Ass1 itm : list)
	{
		System.out.println("item name -"+itm.itemName+"Item Price -"+itm.itemPrice+"Date of Manifacturing-"+itm.dom+"date of expiry -"+itm.dateOfExp);
	}

    
  }
}