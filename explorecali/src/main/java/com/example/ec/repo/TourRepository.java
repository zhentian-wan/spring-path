package com.example.ec.repo;

import com.example.ec.domain.Difficulty;
import com.example.ec.domain.Region;
import com.example.ec.domain.Tour;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.*;


public interface TourRepository extends PagingAndSortingRepository<Tour, Integer> {
/*
    @Query("Select t from Tour t where t.tourPackage.code = ?1" +
            " and t.difficult = ?2 and t.region = ?3 and t.price <= ?4")
    List<Tour> lookupTour(String code, Difficulty difficulty, Region region, Integer maxPrice);

    List<Tour> findTourPackageCodeAndRegion(String code, Region region);

    List<Tour> findByRegionIn(List<Region> regions);

    List<Tour> findByPriceLessThan(Integer maxPrice);

    List<Tour> findByKeywordsContains(String keyword);

    List<Tour> findByTourPackageCodeAndBulletsLike(String code, String searchString);

    List<Tour> findByTourPackageCodeAndDifficultyAndRegionAndPriceLessThan(String code, Difficulty difficulty, Region region, Integer maxPrice);;

 */

    // without paging
    // /tours/search/findByTourPackageCode?code=CC
    List<Tour> findByTourPackageCode(@Param("code") String codee);

    // with paging and sorting
    // /tours/search/findByTourPackageCode?code=CC&size=3&sort=title,asc
    Page<Tour> findByTourPackageCode(@Param("code") String code, Pageable pageable);
}
