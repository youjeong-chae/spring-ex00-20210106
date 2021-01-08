package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor
@RequiredArgsConstructor
public class SampleHotel {

	@NonNull
	private Chef chef;
	
//	@Autowired
//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	우리가 사용하는 버전은 Autowired 생략해도 된다
//	}
}
