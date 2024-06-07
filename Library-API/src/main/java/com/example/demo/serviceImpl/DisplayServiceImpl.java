package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.example.demo.beans.Menu;
import com.example.demo.entity.Section;
import com.example.demo.repo.SectionRepo;
import com.example.demo.repo.VariableRepo;
import com.example.demo.service.DisplayService;
@Service
public class DisplayServiceImpl implements DisplayService {
	@Autowired
	SectionRepo sectionRepo;
	@Autowired
	VariableRepo variableRepo;
	

	@Override
	public Menu getDisplayData() {
		List<Menu> menu=new ArrayList<>();
		List<Section> section=sectionRepo.findAll();
		System.out.println("section :"+section);
		for(Section sec:section) {
			if(!CollectionUtils.isEmpty(menu)) {
				for(Menu menuobj:menu) {
					
					if (menuobj.getSectionId()==sec.getId()) {
						menu.getItems().add(sec.getSectionName();
					}
				}
			}
			else {
				Menu menuf=new Menu();
				menuf.setSectionId();
				menuf.setSectionName();
				List<Items> itemList=new ArrayList<>();
				Items item=new Items();
				int itemId;
				String ItemName;
				float itemPrice;
				item.setItemId(sec.getId());
				item.setItemName(sec.getSectionName);
				menuf.setItems(item)
			}
			
			
		}
		return null;
	}

}
