package com.ritesh.Hotel.Management.System.repository;

import com.ritesh.Hotel.Management.System.model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom, Integer> {

    List<HotelRoom> findByRoomStatus(Boolean roomStatus);

}
