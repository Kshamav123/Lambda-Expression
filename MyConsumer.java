package com.lambdaexpression;

import java.util.function.Consumer;

 class MyConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println("Consumer implemented value : "+t);
	}

	
}


