package com.thinkxfactor.zomato.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Items;

public interface ItemsRepository extends JpaRepository<Items, Long> {

}
