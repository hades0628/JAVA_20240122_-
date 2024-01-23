package ex05;

public class Array02 {

	public static void main(String[] args) {
		
		//int형 배열 생성후 랜덤(1~100)이용해서 배열 크기 10값 지정
		//그 배열의 총점과 평균 구하기
		
		int[] arrNum = new int[10];
		
		double avg;
		int total = 0;
		//1~100의 값을 랜덤하게 추출해서 저장
		for(int i=0; i<arrNum.length; i++) {
			int num = (int)(Math.random()*100)+1;
			arrNum[i] = num;
		}
		//배열 10개값 출력
		for(int i=0; i<arrNum.length; i++)
			System.out.println(arrNum[i] + " ");
		
		System.out.println("\n----------------------");
		
		
		for(int i=0; i<arrNum.length; i++) 
			total += arrNum[i];
		avg = (double)total/arrNum.length;
		System.out.println("총점 : " + total + " , 평균 : " + avg);
	}

}
