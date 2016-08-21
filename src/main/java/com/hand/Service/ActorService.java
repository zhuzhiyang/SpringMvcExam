package com.hand.Service;

import java.util.List;



import com.hand.Model.Actor;
import com.hand.Model.Customer;
import com.hand.util.Page;

public interface ActorService {
	 List<Actor> selectActors(Integer startPos, Integer pageSize);
	 
}
