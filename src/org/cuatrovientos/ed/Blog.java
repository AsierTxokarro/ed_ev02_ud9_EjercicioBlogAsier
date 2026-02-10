package org.cuatrovientos.ed;


import java.time.LocalDate;
import java.util.ArrayList;

public class Blog {
private String blogName;
private String creatorName;
private LocalDate createdDate;
private ArrayList<Slot> slots;





public Blog(String blogName, String creatorName) {
	super();
	this.blogName = blogName;
	this.creatorName = creatorName;
	this.createdDate = LocalDate.now();
	this.slots = new ArrayList<Slot>();
	initialize();
}



private static final int MAX_SIZE = 10;
public Blog() {
	this.slots = new ArrayList<Slot>();
	initialize();
}


private void initialize() {
	// Instanciar cada uno de los espacios que van en el BLog
	for (int i = 0; i < MAX_SIZE; i++) {
		// Ahorro el generar la variable sl, que no voy a volver a utilizar.
		// Slot sl = new Space(i, null);
		this.slots.add(new Slot(i, null));	
	}	
}


public boolean add(Post post) {
	if(slots.get(MAX_SIZE-1).getPost()== null ){
		for (Slot slot : slots) {
			if(slot.getPost() == null) {
				slot.setPost(post);
				break;
			}
		}	
		return true;
	}
	return false;
}

public boolean remove(String name) {
    for (Slot slot : slots) {
        if (slot.getPost() != null && slot.getPost().getName().equalsIgnoreCase(name)) {
            slot.setPost(null);
            return true;
        }
    }
    return false;
}

public Post showPostBySlotId(int slotId) {
    if (slotId < 0 || slotId >= MAX_SIZE) {
        return null;
    }
    return slots.get(slotId).getPost();
}




public String showAll() {
	String result = " ";
	for (Slot slot : slots) {
		if(slot.getPost() != null) {
			result += slot.getPost().toString();
		}
	}
	return result;
}
public int gerMaxSize() {
	return MAX_SIZE;
}

}
