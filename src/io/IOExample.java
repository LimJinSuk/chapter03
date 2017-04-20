package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {
		byte[] src = {0,1,2,3,4,5};
		byte[] dest = null;
		System.out.println(Arrays.toString(dest));
		
		//빨대(스트림)꽂기
		ByteArrayInputStream bais = new ByteArrayInputStream(src);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data=-1;
		while((data=bais.read())!=-1){//데이터 존재
			baos.write(data);
		}
		dest = baos.toByteArray();//버퍼에 적은것을 배열로 바꿈
		//배열원소를 스트리으로 바꿔 출력
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}

}
