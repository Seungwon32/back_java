package castingTask4;
//2. 상품 등록
//- 상품 등록은 최대 5개까지만 할 수 있다.
//(즉, 6개를 전달해도 앞에 5개 상품만 등록된다)
//- 마트에 같은 이름의 상품은 등록할 수 없다.
public class Market {
	Product[] products = new Product[5]; 
    int count = 0;
    
    void register(Product p) {
        if (count >= 5) {
            System.out.println("상품은 최대 5개까지만 등록 가능합니다.");
            return;
        }
        for (int i = 0; i < count; i++) {
            if (products[i].name.equals(p.name)) {
                System.out.println("이미 등록된 상품입니다: " + p.name);
                return;
            }
        }
        products[count] = p;
        count++;
        System.out.println(p.name + " 등록 완료!");
        
    }
    
 // 상품 판매
    void sell(String productName, int quantity, Customer c) {
        // 1. 등록된 상품 찾기
        Product target = null;
        for (int i = 0; i < count; i++) {
            if (products[i].name.equals(productName)) {
                target = products[i];
                break;
            }
        }
        if (target == null) {
            System.out.println("등록되지 않은 상품입니다.");
            return;
        }
        
 // 2. 재고 확인
        if (target.stock < quantity) {
            System.out.println("재고 부족으로 판매 불가!");
            return;
        }
        
//      - 유저가 마다의 할인율이 적용된다.
//      1. 비회원 할인율 5% 적용
//      2. 멤버 할인율 30% 적용
        int total = target.price * quantity;
        int payAmount = (total * (100 - percent)) / 100;

}
}
