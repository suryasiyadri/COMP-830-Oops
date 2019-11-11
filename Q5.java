import java.util.ArrayList;
import java.util.List;

interface BakedGoods {
	public int getPrice();
	public String getDescription();
	public String getSellByDate();
} 
class Cookie implements BakedGoods {
	int price = 0;
	String description;
	String sellbydate;
	public void setCookie(int price, String description, String sellbydate)
	{
		this.price = price;
		this.description = description;
		this.sellbydate = sellbydate;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getSellByDate() {
		return sellbydate;
	} 
	
}
class CinnamonRoll implements BakedGoods {

	int price = 0;
	String description;
	String sellbydate;
	public void setCinnamonRoll(int price, String description, String sellbydate)
	{
		this.price = price;
		this.description = description;
		this.sellbydate = sellbydate;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getSellByDate() {
		return sellbydate;
	} 
}
class Brownie implements BakedGoods {
	int price = 0;
	String description;
	String sellbydate;
	public void setBrownie(int price, String description, String sellbydate)
	{
		this.price = price;
		this.description = description;
		this.sellbydate = sellbydate;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getSellByDate() {
		return sellbydate;
	} 
} 

public class ExamQ3Interface {
	public static void main(String[] args)
	{
		Brownie brown = new Brownie();
		Brownie brown1 = new Brownie();
		Brownie brown2 = new Brownie();
		Cookie cookie = new Cookie();
		Cookie cookie1 = new Cookie();
		Cookie cookie2 = new Cookie();
		CinnamonRoll cinnamroll = new CinnamonRoll();
		CinnamonRoll cinnamroll1 = new CinnamonRoll();
		CinnamonRoll cinnamroll2 = new CinnamonRoll();
		brown.setBrownie(10, "Brownie-chocolate", "11/12/2019");
		brown1.setBrownie(9, "Brownie-Butterscotch", "12/12/2019");
		brown2.setBrownie(8, "Brownie-Vanila", "13/12/2019");
		cookie.setCookie(10, "Cookie-chocolate", "11/12/2019");
		cookie1.setCookie(9, "Cookie-Butterscotch", "12/12/2019");
		cookie2.setCookie(8, "Cookie-Vanila", "13/12/2019");
		cinnamroll.setCinnamonRoll(10, "CinnamonRoll-chocolate", "11/12/2019");
		cinnamroll1.setCinnamonRoll(9, "CinnamonRoll-Butterscotch", "12/12/2019");
		cinnamroll2.setCinnamonRoll(8, "CinnamonRoll-Vanila", "13/12/2019");
		List<BakedGoods> object_array = new ArrayList<BakedGoods>();
		object_array.add(brown);
		object_array.add(brown1);
		object_array.add(brown2);
		object_array.add(cookie);
		object_array.add(cookie1);
		object_array.add(cookie2);
		object_array.add(cinnamroll);
		object_array.add(cinnamroll1);
		object_array.add(cinnamroll2);
		for(BakedGoods i: object_array) {
			System.out.println("Description " + i.getDescription());
			System.out.println("Sell By Date " + i.getSellByDate());
			System.out.println("Price " + i.getPrice());
		}
	 }
}
