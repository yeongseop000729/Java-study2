package sec07;

/**
 * 다음은 서울의 월별 평균기온이다.
 * 연 평균 기온을 구하세요.
 */

public class Array17seoulTemp {

	public static void main(String[] args) {
		
		float[] monTemp = new float[] { -2.5f, -0.2f, 5.2f, 12.1f, 17.4f, 21.9f, 4.9f, 29.4f, 27.8f, 14.4f, 6.9f, 0.2f };
		
		float sum = 0.0f;
		double avg = 0.0;
		
		for (int i = 0; i< monTemp.length; i++) {
			sum = sum + monTemp[i];
		}
		
		avg = sum / monTemp.length;
		System.out.printf("연평균 기온 : %.2ff" , avg);
		
		System.out.println();
		
		float max = 0.0f;
		for (int i = 0; i < monTemp.length; i++) {
			if(monTemp[i] > max)
				max = monTemp[i];
		}
		System.out.println("가장 높은 기온은 : " + max + "입니다.");
		
		
			}
	}

