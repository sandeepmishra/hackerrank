package com.practice.designpattern;

public class BuilderDemo {

	public static void main(String[] args) {
		LunchOrder.Builder builder = new LunchOrder.Builder();
		builder.bread("klsjdf").drink("sdklfj").meat("ldskfj");
		LunchOrder order  = builder.build();
		
	}
}

class LunchOrder {

	private String bread;
	private String wheat;
	private String meat;
	private String drink;

	public static class Builder {
		private String bread;
		private String wheat;
		private String meat;
		private String drink;

		
		public LunchOrder build() {
			return new LunchOrder(this);
		}
		public Builder bread(String bread) {
			this.bread = bread;
			return this;
		}

		public Builder wheat(String wheat) {
			this.wheat = wheat;
			return this;
		}

		public Builder meat(String meat) {
			this.meat = meat;
			return this;
		}

		public Builder drink(String drink) {
			this.drink = drink;
			return this;
		}

	}
	
	private LunchOrder(Builder builder) {
		// TODO Auto-generated constructor stub
		this.bread=builder.bread;
		this.wheat = builder.wheat;
		this.meat=builder.wheat;
		this.drink=builder.drink;
	}

	public String getBread() {
		return bread;
	}

	public String getWheat() {
		return wheat;
	}

	public String getMeat() {
		return meat;
	}

	public String getDrink() {
		return drink;
	}
	
	

}
