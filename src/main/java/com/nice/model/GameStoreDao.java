package com.nice.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by Evegeny on 12/07/2017.
 */
@EnableJpaRepositories
public interface GameStoreDao extends JpaRepository<Game,Integer> {

    List<Game> findByPriceGreaterThan(@Param("price") int price);

    @RestResource(path = "prefix")
    List<Game> findBevakashaByNameStartsWith(@Param("prefix") String prefix);
}
