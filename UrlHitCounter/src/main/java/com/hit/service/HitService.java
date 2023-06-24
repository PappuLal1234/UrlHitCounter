package com.hit.service;

import org.springframework.stereotype.Service;

@Service
public class HitService {
	private int hitCount=0;

	public int getHitCount() {
		hitCount++;
		return hitCount;
	}
	

}
