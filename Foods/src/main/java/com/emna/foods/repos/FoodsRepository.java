package com.emna.foods.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.emna.foods.entities.Foods;
import com.emna.foods.entities.Types;



@RepositoryRestResource(path = "rest")
public interface FoodsRepository extends JpaRepository<Foods,Long> {

	
	List<Foods> findByNomFoods(String nom);
	List<Foods> findByNomFoodsContains(String nom);
	  @Query("select p from Foods p where p.nomFoods like %:nom and p.prixFoods > :prix")
	 List<Foods> findByNomPrix(@Param("nom") String nom,@Param("prix") Double prix);
	 
	 
	  List<Foods> findByOrderByNomFoodsAsc();
		
		 @Query("select p from Foods p order by p.nomFoods ASC, p.prixFoods DESC")
		 List<Foods> trierFoodsNomsPrix ();
	
		  @Query("select p from Foods p where p.Types= ?1")
		   List<Foods> findByTypes(Types Types);
	  
		  
		  @Query("select p from Foods p where p.Types.idTypes= ?1")
	        List<Foods> findByTypesIdTypes(long l);

	   	 

	 
	


}
