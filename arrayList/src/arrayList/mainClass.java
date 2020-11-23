package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.MemberDto;

public class mainClass {

	public static void main(String[] args) {
		
		/*
		
		
		Collection : (object)수집.
		
		List : 	목록 + Array
				데이터의 관리를 유동적으로 할 수 있는 배열.
				
		ArrayList(== Vector)
				   배열처럼 사용할 수 있는 목록.
				   선형구조 0-0-0-0-0
				   검색속도가 빠르다.
				  index로 접근하고 관리된다.   0 ~ n-1 
				  
		LinkedList : 삽입과 삭제를 빈번하게 처리하는 경우 적합.
		
		
		*/
		
		//클래스로 생성한 것.
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		
		//인터페이스로 생성한 것.
		//List<Integer> list = new ArrayList<Integer>();
		
		
		//CRUD
		//객체 추가. (저장) (밑에 3가지 방법 모두 사용 가능) 
		
		
		
		arrlist.add(1001);
		
		
		arrlist.add(new Integer(1002)); // 원래는 이렇게 해야한다.
		
		Integer in = new Integer(1003);
		arrlist.add(in);
		
		//list size (저장된 총 객체의 수 얻기)
		
		int len = arrlist.size(); //사이즈로 받기
		System.out.println("len = " + len); //리스트의 개수 알수있다. = 3
		
		
		
		//1번 인덱스의 객체 얻기. (모든 데이터의 출력)
		Integer outVal = arrlist.get(1); //1002
		System.out.println("arrlist.get(1) = " + outVal);
		
		for (int i = 0; i < arrlist.size(); i++) { //데이터 사이즈만큼! 돌려라
			Integer n = arrlist.get(i);
			System.out.println(i+ "=" + n);
			
		}
		
		// foreach문으로 저장된 객체의 수만큼 루핑
		for (Integer i : arrlist) {
			System.out.println(i);
			
		}
		
		
		// 원하는 위치에 추가? (원래는 꼬리에 추가된다)
		// 1번지, 2번지 사이에 추가?
		
		
		Integer inum = new Integer(5002);
		arrlist.add(1, inum); //1번지에 추가.
		
		for (Integer i : arrlist) {
			System.out.println(i);
			
		}
		
		//삭제
		
		
		arrlist.remove(2); //1002가 들어있음 ->삭제
		
		for (int i = 0; i < arrlist.size(); i++) { //데이터 사이즈만큼! 돌려라
			Integer n = arrlist.get(i);
			System.out.println(i+ "=" + n);
		
		}
		
		//검색
		
		//1) 인덱스로 찾기.
		int index = arrlist.indexOf(1003);
		System.out.println("index = " + index); //1003의 인덱스넘버 = 2
		System.out.println(arrlist.get(index));
		
		//2) 값으로 찾기.	
		index = -1;
		for (int i = 0; i < arrlist.size(); i++) {
			Integer value = arrlist.get(i);
					
			if(value == 5002) {
				index = i;
				break;
			}
		}
		
		System.out.println("find index = " + index);
		
		//수정 // 5002 ->1002
		
		Integer udate = new Integer(1002); // 새로 들어갈 데이터
		arrlist.set(1, udate); // 바꿀 위치, 
		
		
		for (int i = 0; i < arrlist.size(); i++) { //데이터 사이즈만큼! 돌려라
			Integer n = arrlist.get(i);
			System.out.println(i+ "=" + n);
		
		}
		
		
		
		
		// String type
		
		ArrayList<String> list = new ArrayList<String>();
		
		//추가
		
		
		list.add("yuna");
		
		list.add(new String("nang"));
		
		String s = new String("yuri");
		list.add(s);
		
		
		//list size
		
		int len1 = list.size();
		System.out.println("리스트 사이즈 = " + len1);
		
		//데이터 산출
		
		String outY = list.get(1);
		System.out.println("첫번째 데이터 = " + outY);
		
		for (int i = 0; i < list.size(); i++) {
			String s1 = list.get(i);
			System.out.println(i + "=" + s1);
			
		}
		
		
		
		//추가 (원하는 위치에)
		
		String s3 = new String("Kwon");
		list.add(1, s3);
		
		for (String i : list) {
			
			System.out.println(i);
		}
		
		
		
		//삭제
		
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String s1 = list.get(i);
			System.out.println(i + "=" + s1);
			
		}
		
		
		//검색
		
		//1.인덱스로 찾기
		
		
		int index1 = list.indexOf("yuna");
		
		
		System.out.println("index = " + index1);
		System.out.println(list.get(index1));
		
		//수정
		
		index = -1;
		
		for (int i = 0; i < list.size(); i++) {
			
			String value = list.get(i);
			
			if(value == "yuna") {
				
				index = i;
				break;
			}
			
		}
		
		System.out.println("find index" + index);
		
		
		String udate2 = new String("yuyuna");
		list.set(0, udate2);
		
		for (int i = 0; i < arrlist.size(); i++) {
			String n = list.get(i);
			
			System.out.println(i + "=" + n);
			
			
		}
		
		
		
		
	
		//객체로 추가 및 삭제 수정 검색
		
		List<MemberDto> memlist = new ArrayList<MemberDto>();
		
		
		//추가 3명 , 삭제, 수정  
		
		
		MemberDto dto = new MemberDto(101,"홍길동",24);
		memlist.add(dto);
		
		dto = new MemberDto(102,"성춘향",16);
		memlist.add(dto);
		
		memlist.add(new MemberDto(103, "일지매", 18));

		for (int i = 0; i < memlist.size(); i++) {
			MemberDto m = memlist.get(i);
			
			System.out.println(m.toString());
			//System.out.println(memlist.get(i).toString());
		}
		
		//삭제
		
		
		
		
		//검색
		String name = "성춘향";
		int findindex = -1;
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto m = memlist.get(i);
			if(name.equals(m.getName())) {
				findindex = i;
				break;
			}
		}
		
		MemberDto m = memlist.get(findindex);
		System.out.println(m.toString());
		
		//나이 18세 이상 멤버
		
		List<MemberDto> findlist = new ArrayList<MemberDto>();
		
		for (int i = 0; i < memlist.size(); i++) {
			MemberDto mem = memlist.get(i);
			if(mem.getAge() >= 18) {
				
				findlist.add(mem);
				
			}
					
		}
		
		for (MemberDto mem: findlist) {
			System.out.println(mem.toString());
		}
		
		System.out.println();
		
		//수정 (일지매 -> 정수동)
		
		for (MemberDto mem: memlist) {
			System.out.println(mem.toString());
		
		}
		
		MemberDto uMem = new MemberDto(105,"정수동", 26);
		memlist.set(2, uMem);
		
		for (MemberDto mem: memlist) {
			System.out.println(mem.toString());
		}
		
		
		// 하나의 특정 데이터만 바꿀 때 (홍길동 -> 임꺽정)
		
		MemberDto upMem = memlist.get(0);
		upMem.setName("임꺽정"); // 하나의 데이터만 바꿀때.
		
		for (MemberDto mem: memlist) {
			System.out.println(mem.toString());
		}
		
		memlist.remove(0); //0번쨰 지우기
		
		for (MemberDto mem: memlist) {
			System.out.println(mem.toString());
		}
		
		
		//stacklist
		
		
		//queuelist
		
		
		

	}
	
}


