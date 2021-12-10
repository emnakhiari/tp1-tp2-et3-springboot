package com.emna.foods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.emna.foods.entities.Foods;
import com.emna.foods.entities.Types;
import com.emna.foods.repos.*;




@Service
public class FoodsServiceImpl implements FoodsService {
	
	@Autowired
	FoodsRepository FoodsRepository ; 

	public Foods saveFoods(Foods p) {
	    return FoodsRepository.save(p);
	}

	
	public Foods updateFoods(Foods p) {
		// TODO Auto-generated method stub
		 return FoodsRepository.save(p);
	}

	
	public void deleteFoods(Foods p) {
		// TODO Auto-generated method stub
		 FoodsRepository.delete(p);
		
	}

	
	public void deleteFoodsById(Long id) {
		  FoodsRepository.deleteById(id);
		
	}

	
	public Foods getFoods(Long id) {
		// TODO Auto-generated method stub
		 return FoodsRepository.findById(id).get();
	}

	
	public List<Foods> getAllFoods() {
		// TODO Auto-generated method stub
		 return FoodsRepository.findAll(); 
	}
	
	 @Override
		public List<Foods> findByTypes(Types Types) {
			return FoodsRepository.findByTypes(Types);
	}


	@Override
	public List<Foods> findByNomFoods(String nom) {
		return FoodsRepository.findByNomFoods(nom);

	}


	@Override
	public List<Foods> findByNomFoodsContains(String nom) {
		return FoodsRepository.findByNomFoodsContains(nom);

	}


	@Override
	public List<Foods> findByNomPrix(String nom, Double prix) {
		return FoodsRepository.findByNomPrix(nom, prix);

	}

	
	
	


	@Override
	public List<Foods> findByOrderByNomFoodsAsc() {
		return FoodsRepository.findByOrderByNomFoodsAsc();
	}


	@Override
	public List<Foods> trierFoodsNomsPrix() {
		return FoodsRepository.trierFoodsNomsPrix();
	}


	@Override
	public List<Foods> findByTypesIdTypes(long l) {
		
		return  FoodsRepository.findByTypesIdTypes(l);
	}



	


}