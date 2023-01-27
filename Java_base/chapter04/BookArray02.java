package chapter04;

public class BookArray02 {

	public static void main(String[] args) {
       
	   //Book(); 5번 호출
       Book[] library=new Book[5]; 
       
       library[0]=new Book("데미안", "헤르만 헤세");
       library[1]=new Book("빨간머리앤", "몽고메리");
       library[2]=new Book("백설공주", "그림형제");
       library[3]=new Book("카산드라의 거울", "베르나르 베르베르");
       library[4]=new Book("어린 왕자", "생택쥐 페리");
       /*
       library[0].showBookinfo();
       library[1].showBookinfo();
       library[2].showBookinfo();
       library[3].showBookinfo();
       library[4].showBookinfo();
       */
       
       for(int i=0;i<library.length;i++) {
    	   library[i].showBookinfo();
    	   System.out.println();
       }
       
	}

}
