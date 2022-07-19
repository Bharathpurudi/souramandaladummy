package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class PriceCheck {
	
	public static int priceCheck(List<String> products, List<Float>
	productPrices, List<String> productSold, List<Float> soldPrice) {
		//LOGIC
		int counter = 0;
		for(int i=0;i<productSold.size();i++){
			String str1 = productSold.get(i);
			int i1 = products.indexOf(str1);
			Float f1 = productPrices.get(i1);
			Float f2 = soldPrice.get(i);
			if(f1>f2 || f1<f2){
				counter = counter + 1;
			}
			
			/*if(f1 != f2) {
				counter += 1;
			}*/
		}
		
		return counter;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Of Products.....");
		int noOfProducts = sc.nextInt();
		System.out.println("Enter the products...");
		List<String> products = new ArrayList<String>();
		for (int i = 0; i < noOfProducts; i++) {
			products.add(sc.next());
		}
		System.out.println("Enter the product prices...");
		List<Float> productPrices = new ArrayList<Float>();
		for (int i = 0; i < noOfProducts; i++) {
			productPrices.add(sc.nextFloat());
		}
		System.out.println("Enter how many products sold");
		int num_of_soldproducts = sc.nextInt();
		System.out.println("Enter sold products...");
		List<String> productSold = new ArrayList<String>();
		
		for (int j = 0; j < num_of_soldproducts; j++) {
			productSold.add(sc.next());
		}
		System.out.println("Enter sold products prices...");
		List<Float> soldPrices = new ArrayList<Float>();
		for (int j = 0; j < num_of_soldproducts; j++) {
			soldPrices.add(sc.nextFloat());
		}
		int result = priceCheck(products,productPrices,productSold,soldPrices);
		System.out.println(result);

	}

}
