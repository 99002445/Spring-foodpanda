0package com.lts.autowiring;

import java.util.List;

import org.springframework.stereotype.Component;
@Component

public interface Menu {
	


List<String> itemsAvailable();
	

}
