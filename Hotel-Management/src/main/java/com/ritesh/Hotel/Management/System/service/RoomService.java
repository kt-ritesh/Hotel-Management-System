package com.ritesh.Hotel.Management.System.service;

import com.ritesh.Hotel.Management.System.model.HotelRoom;
import com.ritesh.Hotel.Management.System.model.Type;
import com.ritesh.Hotel.Management.System.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    IRoomRepo roomRepo;

    public String addRoom(HotelRoom room) {
        roomRepo.save(room);
        return "One Room added !";
    }

    public String addRooms(List<HotelRoom> rooms) {
        roomRepo.saveAll(rooms);
        return "Rooms added !";
    }

    public Optional<HotelRoom> getRoomById(Integer id) {
        return roomRepo.findById(id);
    }

    public Iterable<HotelRoom> getAllRoomsById(List<Integer> ids) {
        return roomRepo.findAllById(ids);
    }

    public Iterable<HotelRoom> getAllRooms() {
        return roomRepo.findAll();
    }

    public long getNoOfRooms() {
        return roomRepo.count();
    }

    public boolean roomExistsOrNot(Integer id) {
        return roomRepo.existsById(id);
    }

    public String deleteRoomById(Integer id) {
        roomRepo.deleteById(id);
        return "Room deleted !";
    }


    public String deleteAllRooms() {
        roomRepo.deleteAll();
        return "All rooms deleted";
    }

    public String UpdateRoomTypeById(Integer id, Type type) {
        Optional<HotelRoom> tmpHR = roomRepo.findById(id);
        HotelRoom hr;
        if(tmpHR.isPresent()){
            hr = tmpHR.get();
        }else {
            return "Id Not Found";
        }
        hr.setRoomType(type);
        roomRepo.save(hr);

        return "rooms type updated successfully";
    }

    public List<HotelRoom> getRoomByStatus(Boolean status) {
        return roomRepo.findByRoomStatus(status);
    }
}
