package collectionTest.arrayList;

import java.util.ArrayList;

public class ArrayListTask3 {
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1L, "컴퓨터", 800000, 20));
		products.add(new Product(2L, "책상", 150000, 100));
		products.add(new Product(3L, "마우스", 50000, 15));
		products.add(new Product(4L, "모니터", 300000, 150));
		products.add(new Product(5L, "키보드", 30000, 80));
		
		System.out.println(products);
		
//		재고가 100개 이상인 상품만 출력   //빠른 for문으로 해보기
		for(int i=0; i<5; i++) { 
			if(products.get(i).getStock() >= 100) {
				System.out.println(products.get(i));
			}
		}
		
//		2.마우스 가격 100000 변경
		for(int i=0; i<5; i++) {
			if(products.get(i).getName().equals("마우스")) {
				products.get(i).setPrice(100000);
				System.out.println(products.get(i));
			}
		}
//		Product foundProduct = null;
//	      for(Product product: products) {
//	         if(product.getId() == 3L) {
//	            foundProduct = product;
//	         }
//	      }
//	      foundProduct.setPrice(100000);
//	      
//	      try {
//	         if(products.contains(foundProduct)) {
//	            products.set(products.indexOf(foundProduct), foundProduct);
//	         }
//	      } catch (IndexOutOfBoundsException e) {
//	         System.out.println("ArrayListTask3 예외 발생");
//	         System.out.println("인덱스 똑바로 입력하세요.");
//	      } catch (Exception e) {
//	         System.out.println("ArrayListTask3 예외 발생");
//	         System.out.println("알 수 없는 예외 발생");
//	         e.printStackTrace();
//	      }
//	      
//	      System.out.println(products);
		
//		상품 재고가 100개 이하인 상품을 삭제
//		for (int i = 0; i < products.size(); i++) {
//		    if (products.get(i).getStock() <= 100) {
//		        products.remove(i);   
//		    }
//		}
//		 System.out.println(products);
//		 
////		 ArrayList<Product> newProducts = new ArrayList<Product>();
////		 
////		 for(Product product: products) {
////			 if(product.getStock() >= 100) {
////				 newProducts.add(product);
////			 }
////		 }
////		 products=newProducts;
////		 System.out.println(products);
		 
//		 상품이름이 마우스인 상품 삭제
		 for(int i=0; i<products.size(); i++) {
			 if(products.get(i).getName().equals("마우스")) {
				 products.remove(i);
			 }
		 }
		 System.out.println(products);
	}
}
